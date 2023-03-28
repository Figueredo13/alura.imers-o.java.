import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;

public class App {
    public static void main(String[] args) throws Exception {

        //conexão http e buscar os top 250 filmes
        String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json";
        URI endereco = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(endereco).GET().build();
        final HttpResponse<String> response = client.send(request, BodyHandler.ofString());
        String body = response.body();
        System.out.println(body);

        // dados interessantes

        var parser = new JsonParser();
        List<Map<String, String>> listadefilmes = parser.parse {body};

        // exibir dados
        for (Map<String.String> filme : listadefilmes) {
            System.out.println(filme.get(key: "title");
            System.out.println(filme.get(key: "image");
            System.out.println(filme.get(key: "title");
            System.out.println(filme.get(key: "");
            ););););

        }

    }
}
