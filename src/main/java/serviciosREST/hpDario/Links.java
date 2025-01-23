
package serviciosREST.hpDario;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class Links {

    @SerializedName("self")
    @Expose
    private String self;

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

}
