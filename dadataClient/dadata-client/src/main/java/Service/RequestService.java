package Service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;


public class RequestService {
    public String findAdressByKladrId() throws IOException {
        String url = "https://dadata.ru/";
        URLConnection connection = new URL(url).openConnection();
        return "";
    }
}
