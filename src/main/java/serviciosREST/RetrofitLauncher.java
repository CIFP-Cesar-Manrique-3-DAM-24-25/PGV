package serviciosREST;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

public class RetrofitLauncher {

    public static void main(String[] args) {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.amiiboapi.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build();

        AmiiboAPIInterfaz service = retrofit.create(AmiiboAPIInterfaz.class);
        Call<Raiz> callAsync = service.getAmiibos(null,null);

        callAsync.enqueue(new Callback<Raiz>() {
            @Override
            public void onResponse(Call<Raiz> call, Response<Raiz> response) {
                Raiz listita = response.body();

                List<Amiibo> listaLeida = listita.getAmiibo();

                for(Amiibo a : listaLeida) {
                    System.out.println(a);
                }

            }

            @Override
            public void onFailure(Call<Raiz> call, Throwable throwable) {
                System.out.println(throwable);
            }
        });


    }
}
