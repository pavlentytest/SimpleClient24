import com.google.gson.Gson;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final String BASE_URL = "https://dictionary.yandex.net/api/v1/dicservice.json/lookup";
    public static final String LANG = "ru-ru";
    public static final String KEY = "dict.1.1.20240410T141548Z.fa8bba8bdfdd8572.172156c1eaedc46488d904983f4e0f9bfc4a2a2b";

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        String url_request = BASE_URL+"?key="+KEY+"&lang="+LANG+"&text="+word;

        URL url = new URL(url_request);
        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        // http response codes
        // 404, 500, 200

        StringBuilder stringBuilder = new StringBuilder();
        if(connection.getResponseCode() == 200) {
            System.out.println(200);
            scanner = new Scanner(connection.getInputStream());
            while(scanner.hasNext()) {
                stringBuilder.append(scanner.nextLine());
            }
            // System.out.println(stringBuilder);
        }
        // GSON - библиотека, которая умеет сериализовывать и обратный процесс
        var gson = new Gson();
        Answer answer = gson.fromJson(stringBuilder.toString(),Answer.class);
        List<Def> list = answer.getDef();
        if(list.size()>0) {
            // обработка
        } else {
            List<Tr> list_translates = list.get(0).getTr();
            for (Tr tr : list_translates) {
                System.out.println(tr.getText());
            }
        }
    }
}