package serviciosREST.hpDario;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


import java.util.List;

public class LauncherDarioHP {

    public static void main(String[] args) {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.potterdb.com/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build();

        HPDarioInterfaz servicioDario = retrofit.create(HPDarioInterfaz.class);
        Call<Raiz> llamada = servicioDario.obtenerPersonajes();

        llamada.enqueue(new Callback<Raiz>() {
            @Override
            public void onResponse(Call<Raiz> call, Response<Raiz> response) {
                int codigo = response.code(); // 200, 201...
                Raiz respuesta = response.body();
                List<Datum> listaPersonajes = respuesta.getData();
                for (Datum datum : listaPersonajes) {
                    System.out.println(datum.getAttributes().getName());
                }
            }

            @Override
            public void onFailure(Call<Raiz> call, Throwable throwable) {
                    throwable.printStackTrace();
            }
        });





    }
}
