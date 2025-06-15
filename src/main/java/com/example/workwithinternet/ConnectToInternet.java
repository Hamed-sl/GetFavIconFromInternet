import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class ConnectToInternet {

    public boolean canConnectToInternet(){
        boolean isConnect = false;
        try {
            String siteName = "http://www.google.com";
            URL url = new URL(siteName);
            URLConnection connection = url.openConnection();
            connection.connect();
            isConnect = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return isConnect;
    }
    public boolean canConnectToIntranet(){
        boolean isConnect = false;
        try {
            String siteName = "https://www.iribnews.ir/";
            URL url = new URL(siteName);
            URLConnection connection = url.openConnection();
            connection.connect();
            isConnect = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return isConnect;
    }

}
