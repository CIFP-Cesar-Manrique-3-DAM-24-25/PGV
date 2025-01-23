package serviciosREST.harryPotterClase;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface HPAPIInterfaz {

    @GET("characters")
    Call<List<Personaje>> obtenerTodosLosHP();
}
