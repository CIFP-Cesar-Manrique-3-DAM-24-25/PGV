package serviciosREST.hpDario;

import retrofit2.Call;
import retrofit2.http.GET;

public interface HPDarioInterfaz {

    @GET("characters")
    Call<Raiz> obtenerPersonajes();
}
