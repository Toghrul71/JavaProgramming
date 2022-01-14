package day38_MethodOverriding.Browser;

public class TogetherBrowsers {
    public static void main(String[] args) {

        ChromeBrowser chromeBrowser=new ChromeBrowser("chrome");
        chromeBrowser.closeBrowser();

        FireFox fireFox=new FireFox("FireFox");
        fireFox.openBrowser();
        System.out.println(fireFox);

    }
}
