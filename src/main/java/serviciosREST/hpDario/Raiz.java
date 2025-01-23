
package serviciosREST.hpDario;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class Raiz {

    @SerializedName("data")
    @Expose
    private List<Datum> data;
    @SerializedName("meta")
    @Expose
    private Meta meta;
    @SerializedName("links")
    @Expose
    private Links__1 links;

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Links__1 getLinks() {
        return links;
    }

    public void setLinks(Links__1 links) {
        this.links = links;
    }

}
