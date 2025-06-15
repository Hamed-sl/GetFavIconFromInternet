
import java.io.*;
import java.net.URL;

public class favIcon {

    public void saveImage(String siteUrl){

        String path = "https://www.google.com/s2/favicons?sz=64&domain_url="+siteUrl;
        String path2 = "https://f1.allesedv.com/64/"+siteUrl;
        String path3 = "http://logo.clearbit.com/"+siteUrl+"?size=64";

        try {
            URL url = new URL(path3);
            InputStream is = url.openStream();
            OutputStream os = new FileOutputStream
                    ("src/main/resources/favicon/"+siteUrl+".jpg");

            byte[] b = new byte[1024];
            int length;

            while ((length = is.read(b)) != -1) {
                os.write(b, 0, length);
            }

            is.close();
            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
