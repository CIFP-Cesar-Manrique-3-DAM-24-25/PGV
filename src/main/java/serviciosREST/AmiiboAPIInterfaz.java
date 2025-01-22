package serviciosREST;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface AmiiboAPIInterfaz {

    @GET("amiibo")
    public Call<Raiz> getAmiibos(
            @Query("name") String nombre,
            @Query("type") String tipo);

}
