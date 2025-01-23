
package serviciosREST.hpDario;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class Links__1 {

    @SerializedName("self")
    @Expose
    private String self;
    @SerializedName("current")
    @Expose
    private String current;
    @SerializedName("next")
    @Expose
    private String next;
    @SerializedName("last")
    @Expose
    private String last;

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

}
