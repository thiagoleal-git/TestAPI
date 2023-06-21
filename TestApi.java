import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class TestApi {
    public static void main(String[] args) {
        //métodos de cada uma das chamadas
        buscarStatusAplicacao();
        buscarUsuarioParaAutenticacao();
        criacaoTokenParaAutenticacao();
        buscarProdutosComAutenticacao("YOUR_TOKEN_HERE");
        criacaoDeProduto();
        buscarTodosOsProdutos();
        buscarApenasUmProdutoPorId(1);
    }

    public static void buscarStatusAplicacao() {
        // Define a URL para a qual a solicitação GET será enviada
        String urlString = "https://dummyjson.com/test";
        try {
            // Cria um objeto URL a partir da string da URL
            URL url = new URL(urlString);
            // Abre uma conexão com a URL especificada
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            // Define o método da solicitação como GET
            con.setRequestMethod("GET");
            // Obtém o código de resposta da solicitação
            int responseCode = con.getResponseCode();
            System.out.println("Response Code : " + responseCode);
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Se o código de resposta for 200 (OK), lê a resposta
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                // Imprime a resposta JSON
                System.out.println(response.toString());
            } else {
                System.out.println("GET request not worked");
            }
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL: " + urlString);
        } catch (IOException e) {
            System.out.println("Error connecting to URL: " + urlString);
        }
    }

    public static void buscarUsuarioParaAutenticacao() {
        // Define a URL para a qual a solicitação GET será enviada
        String urlString = "https://dummyjson.com/users";
        try {
            // Cria um objeto URL a partir da string da URL
            URL url = new URL(urlString);
            // Abre uma conexão com a URL especificada
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            // Define o método da solicitação como GET
            con.setRequestMethod("GET");
            // Obtém o código de resposta da solicitação
            int responseCode = con.getResponseCode();
            System.out.println("Response Code : " + responseCode);
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Se o código de resposta for 200 (OK), lê a resposta
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                // Imprime a resposta JSON
                System.out.println(response.toString());
            } else {
                System.out.println("GET request not worked");
            }
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL: " + urlString);
        } catch (IOException e) {
            System.out.println("Error connecting to URL: " + urlString);
        }
    }

    public static void criacaoTokenParaAutenticacao() {
        // Define a URL para a qual a solicitação POST será enviada
        String urlString = "https://dummyjson.com/auth/login";
        // Define o corpo da solicitação como uma string JSON
        String requestBody = "{\"username\": \"kminchelle\",\"password\": \"0lelplR\"}";
        try {
            // Cria um objeto URL a partir da string da URL
            URL url = new URL(urlString);
            // Abre uma conexão com a URL especificada
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            // Define o método da solicitação como POST
            con.setRequestMethod("POST");
            // Define o tipo de conteúdo da solicitação como JSON
            con.setRequestProperty("Content-Type", "application/json; utf-8");
            // Habilita a escrita do corpo da solicitação
            con.setDoOutput(true);
            // Escreve o corpo da solicitação na conexão
            try (OutputStream os = con.getOutputStream()) {
                byte[] input = requestBody.getBytes("utf-8");
                os.write(input, 0, input.length);
            }
            // Obtém o código de resposta da solicitação
            int responseCode = con.getResponseCode();
            System.out.println("Response Code : " + responseCode);
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Se o código de resposta for 200 (OK), lê a resposta
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                // Imprime a resposta JSON
                System.out.println(response.toString());
            } else {
                System.out.println("POST request not worked");
            }
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL: " + urlString);
        } catch (IOException e) {
            System.out.println("Error connecting to URL: " + urlString);
        }
    }

    public static void buscarProdutosComAutenticacao(String token) {
        // Define a URL para a qual a solicitação GET será enviada
        String urlString = "https://dummyjson.com/auth/products";
        try {
            // Cria um objeto URL a partir da string da URL
            URL url = new URL(urlString);
            // Abre uma conexão com a URL especificada
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            // Define o método da solicitação como GET
            con.setRequestMethod("GET");
            // Define o tipo de conteúdo da solicitação como JSON
            con.setRequestProperty("Content-Type", "application/json; utf-8");
            // Adiciona o cabeçalho de autorização com o token de autenticação
            con.setRequestProperty("Authorization", "Bearer " + token);
            // Obtém o código de resposta da solicitação
            int responseCode = con.getResponseCode();
            System.out.println("Response Code : " + responseCode);
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Se o código de resposta for 200 (OK), lê a resposta
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                // Imprime a resposta JSON
                System.out.println(response.toString());
            } else {
                System.out.println("GET request not worked");
            }
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL: " + urlString); } catch (IOException e) { System.out.println("Error connecting to URL: " + urlString); } }
    public static void criacaoDeProduto() {
        // Define a URL para a qual a solicitação POST será enviada
        String urlString = "https://dummyjson.com/products/add";
        // Define o corpo da solicitação como uma string JSON
        String requestBody = "{\"title\": \"Perfume Oil\",\"description\": \"Mega Discount, Impression of A...\",\"price\": 13,\"discountPercentage\": 8.4,\"rating\": 4.26,\"stock\": 65,\"brand\": \"Impression of Acqua Di Gio\",\"category\": \"fragrances\",\"thumbnail\": \"https://i.dummyjson.com/data/products/11/thumnail.jpg\"}";
        try {
            // Cria um objeto URL a partir da string da URL
            URL url = new URL(urlString);
            // Abre uma conexão com a URL especificada
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            // Define o método da solicitação como POST
            con.setRequestMethod("POST");
            // Define o tipo de conteúdo da solicitação como JSON
            con.setRequestProperty("Content-Type", "application/json; utf-8");
            // Habilita a escrita do corpo da solicitação
            con.setDoOutput(true);
            // Escreve o corpo da solicitação na conexão
            try (OutputStream os = con.getOutputStream()) {
                byte[] input = requestBody.getBytes("utf-8");
                os.write(input, 0, input.length);
            }
            // Obtém o código de resposta da solicitação
            int responseCode = con.getResponseCode();
            System.out.println("Response Code : " + responseCode);
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Se o código de resposta for 200 (OK), lê a resposta
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                // Imprime a resposta JSON
                System.out.println(response.toString());
            } else {
                System.out.println("POST request not worked");
            }
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL: " + urlString);
        } catch (IOException e) {
            System.out.println("Error connecting to URL: " + urlString);
        }
    }

    public static void buscarTodosOsProdutos() {
        // Define a URL para a qual a solicitação GET será enviada
        String urlString = "https://dummyjson.com/products";
        try {
            // Cria um objeto URL a partir da string da URL
            URL url = new URL(urlString);
            // Abre uma conexão com a URL especificada
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            // Define o método da solicitação como GET
            con.setRequestMethod("GET");
            // Obtém o código de resposta da solicitação
            int responseCode = con.getResponseCode();
            System.out.println("Response Code : " + responseCode);
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Se o código de resposta for 200 (OK), lê a resposta
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                // Imprime a resposta JSON
                System.out.println(response.toString());
            } else {
                System.out.println("GET request not worked");
            }
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL: " + urlString); } catch (IOException e) { System.out.println("Error connecting to URL: " + urlString); } }
    public static void buscarApenasUmProdutoPorId(int productId) {
        // Define a URL para a qual a solicitação GET será enviada
        String urlString = "https://dummyjson.com/products/" + productId;
        try {
            // Cria um objeto URL a partir da string da URL
            URL url = new URL(urlString);
            // Abre uma conexão com a URL especificada
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            // Define o método da solicitação como GET
            con.setRequestMethod("GET");
            // Obtém o código de resposta da solicitação
            int responseCode = con.getResponseCode();
            System.out.println("Response Code : " + responseCode);
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Se o código de resposta for 200 (OK), lê a resposta
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                // Imprime a resposta JSON
                System.out.println(response.toString());
            } else {
                System.out.println("GET request not worked");
            }
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL: " + urlString);
        } catch (IOException e) {
            System.out.println("Error connecting to URL: " + urlString);
        }
    }
}