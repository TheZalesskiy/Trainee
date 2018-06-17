package trainee_evgeniy_zalesskiy.prospektdev.com.trainee;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostModel {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("desc")
    @Expose
    private String desc;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("elementPureHtml")
    @Expose
    private String elementPureHtml;


    public String getName() {
        return name;
    }

    /**
     * @param name Site name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Site description
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc Site description
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return The link
     */
    public String getLink() {
        return link;
    }

    /**
     * @param link The link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * @return The elementPureHtml
     */
    public String getElementPureHtml() {
        return elementPureHtml;
    }

    /**
     * @param elementPureHtml The elementPureHtml
     */
    public void setElementPureHtml(String elementPureHtml) {
        this.elementPureHtml = elementPureHtml;
    }

}
