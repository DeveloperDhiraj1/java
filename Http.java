
import java.io.*;
import java.net.*;

public class Http {

    public static void sendGet() throws IOException {
        URL url = new URL("https://httpbin.org/get");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        con.setRequestMethod("GET");

        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            System.out.println("GET Response: " + response.toString());
        } else {
            System.out.println("GET request failed.");
        }
    }

    public static void sendPost() throws IOException {
        URL url = new URL("https://httpbin.org/post");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        con.setRequestMethod("POST");
        con.setDoOutput(true);
        con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

        String postData = "name=Dhiraj&age=20";

        try (OutputStream os = con.getOutputStream()) {
            byte[] input = postData.getBytes("utf-8");
            os.write(input, 0, input.length);
        }

        int responseCode = con.getResponseCode();
        System.out.println("POST Response Code :: " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK || responseCode == HttpURLConnection.HTTP_CREATED) {
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine.trim());
            }
            in.close();

            System.out.println("POST Response: " + response.toString());
        } else {
            System.out.println("POST request failed.");
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("Sending GET request:");
            sendGet();

            System.out.println("\nSending POST request:");
            sendPost();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
