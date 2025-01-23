package serviciosREST.harryPotterClase;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

public class LauncherHP {

    public static void main(String[] args) {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://hp-api.onrender.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build();

        HPAPIInterfaz service = retrofit.create(HPAPIInterfaz.class);
        Call<List<Personaje>> callAsync = service.obtenerTodosLosHP();

        callAsync.enqueue(new Callback<List<Personaje>>() {
            @Override
            public void onResponse(Call<List<Personaje>> call, Response<List<Personaje>> response) {
                List<Personaje> listaP = response.body();

                for (Personaje personaje : listaP) {
                    System.out.println(personaje);
                }


            }

            @Override
            public void onFailure(Call<List<Personaje>> call, Throwable throwable) {

            }
        });


    }

}
