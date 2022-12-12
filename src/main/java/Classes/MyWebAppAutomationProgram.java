package Classes;

import static Classes.Constants.URL_YT;
import static Classes.Methods.YouTubeSearch;
import static Classes.Methods.goToURL;

public class MyWebAppAutomationProgram {
    public static void main(String[] args) throws InterruptedException {
        YouTubeSearch(URL_YT);
        //Thread.sleep(20000);
        //TwitterSearch();
    }

}
/*static Constants constants= new Constants();
    static Drivers drivers= new Drivers();
    static Methods methods= new Methods();
    static WebElements webElements= new WebElements();
    public static void main(String[] args) throws InterruptedException {
        YouTubeSearch(constants.URL_YT);
        Thread.sleep(4000);
        TwitterSearch(constants.URL_TW);
    }*/