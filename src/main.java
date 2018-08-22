import org.apache.http.client.fluent.Request;

public class main {
    public static void main(String[] args) {
        try {
            String response = Request.Get("http://www.google.com").execute().returnContent().asString();
            System.out.println(response);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
