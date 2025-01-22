package serviciosREST;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;
import java.util.List;

@Generated("jsonschema2pojo")
public class Raiz {

    @SerializedName("amiibo")
    @Expose
    private List<Amiibo> amiibo;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Raiz() {
    }

    public Raiz(List<Amiibo> amiibo) {
        super();
        this.amiibo = amiibo;
    }

    public List<Amiibo> getAmiibo() {
        return amiibo;
    }

    public void setAmiibo(List<Amiibo> amiibo) {
        this.amiibo = amiibo;
    }

}
