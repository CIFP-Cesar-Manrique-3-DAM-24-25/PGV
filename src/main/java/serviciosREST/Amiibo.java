package serviciosREST;

import com.google.gson.annotations.*;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class Amiibo {

    @SerializedName("amiiboSeries")
    @Expose
    private String amiiboSeries;
    @SerializedName("character")
    @Expose
    private String character;
    @SerializedName("gameSeries")
    @Expose
    private String gameSeries;
    @SerializedName("head")
    @Expose
    private String head;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("release")
    @Expose
    private Release release;
    @SerializedName("tail")
    @Expose
    private String tail;
    @SerializedName("type")
    @Expose
    private String type;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Amiibo() {
    }

    public Amiibo(String amiiboSeries, String character, String gameSeries, String head, String image, String name, Release release, String tail, String type) {
        super();
        this.amiiboSeries = amiiboSeries;
        this.character = character;
        this.gameSeries = gameSeries;
        this.head = head;
        this.image = image;
        this.name = name;
        this.release = release;
        this.tail = tail;
        this.type = type;
    }

    public String getAmiiboSeries() {
        return amiiboSeries;
    }

    public void setAmiiboSeries(String amiiboSeries) {
        this.amiiboSeries = amiiboSeries;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getGameSeries() {
        return gameSeries;
    }

    public void setGameSeries(String gameSeries) {
        this.gameSeries = gameSeries;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Release getRelease() {
        return release;
    }

    public void setRelease(Release release) {
        this.release = release;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Amiibo{" +
                "amiiboSeries='" + amiiboSeries + '\'' +
                ", character='" + character + '\'' +
                ", gameSeries='" + gameSeries + '\'' +
                ", head='" + head + '\'' +
                ", image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", release=" + release +
                ", tail='" + tail + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
