package trainee_evgeniy_zalesskiy.prospektdev.com.trainee.api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import trainee_evgeniy_zalesskiy.prospektdev.com.trainee.PostModel;

public interface UmoriliApi {

    @GET("/api/get")
    Call<List<PostModel>> getData(@Query("name") String resourceName, @Query("num") int count);
}
