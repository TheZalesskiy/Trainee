package trainee_evgeniy_zalesskiy.prospektdev.com.trainee;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import trainee_evgeniy_zalesskiy.prospektdev.com.trainee.api.UmoriliApi;

public class App extends Application {

    private static UmoriliApi umoriliApi;
    private Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();

        retrofit = new Retrofit.Builder()
                .baseUrl("https://umorili.herokuapp.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        umoriliApi = retrofit.create(UmoriliApi.class);
    }

    public static UmoriliApi getApi() {
        return umoriliApi;
    }
}
