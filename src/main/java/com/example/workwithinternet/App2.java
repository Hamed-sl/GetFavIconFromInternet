public class App2 {

    public static void main(String[] args) {

        ConnectToInternet cTi = new ConnectToInternet();
        boolean isInternetConnect = cTi.canConnectToInternet();
        boolean isIntranetConnect = cTi.canConnectToIntranet();
        System.out.println("Connect to internet is "+isInternetConnect); //e
        System.out.println("Connect to intranet is "+isIntranetConnect); //a

    }

}
