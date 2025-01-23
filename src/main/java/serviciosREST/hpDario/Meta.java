
package serviciosREST.hpDario;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class Meta {

    @SerializedName("pagination")
    @Expose
    private Pagination pagination;
    @SerializedName("copyright")
    @Expose
    private String copyright;
    @SerializedName("generated_at")
    @Expose
    private String generatedAt;

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getGeneratedAt() {
        return generatedAt;
    }

    public void setGeneratedAt(String generatedAt) {
        this.generatedAt = generatedAt;
    }

}
