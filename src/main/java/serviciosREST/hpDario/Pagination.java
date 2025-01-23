
package serviciosREST.hpDario;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class Pagination {

    @SerializedName("current")
    @Expose
    private Integer current;
    @SerializedName("next")
    @Expose
    private Integer next;
    @SerializedName("last")
    @Expose
    private Integer last;
    @SerializedName("records")
    @Expose
    private Integer records;

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public Integer getNext() {
        return next;
    }

    public void setNext(Integer next) {
        this.next = next;
    }

    public Integer getLast() {
        return last;
    }

    public void setLast(Integer last) {
        this.last = last;
    }

    public Integer getRecords() {
        return records;
    }

    public void setRecords(Integer records) {
        this.records = records;
    }

}
