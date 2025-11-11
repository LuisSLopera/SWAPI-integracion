import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.loperals.swapi.modelos.Pelicula;
import com.loperals.swapi.modelos.PeliculaAPI;

import java.io.File;
import java.io.FileWriter;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class LlamadoAPI {
    public static void ConsultaUsuario(int numeroEpisodioUsuario, boolean estadoConsulta) {
        Gson gson=new GsonBuilder()
                .create();


        if (estadoConsulta){
            try {
                FileWriter archivo= new FileWriter("Peliculas.txt");
                HttpClient client = HttpClient.newHttpClient();

                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("https://swapi.dev/api/films/"+numeroEpisodioUsuario+"/"))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json= response.body();


                //System.out.println(response.body());

                PeliculaAPI pelicula= gson.fromJson(json,PeliculaAPI.class);

                Pelicula peliFinal= new Pelicula(pelicula);

                System.out.println(peliFinal);
                archivo.write(peliFinal.toString());
                archivo.close();


            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }


    }
}
