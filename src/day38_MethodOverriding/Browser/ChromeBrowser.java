package day38_MethodOverriding.Browser;

public class ChromeBrowser extends Browser {


    public ChromeBrowser(String browser) {
        super("chrome");
    }

    @Override
    public void openBrowser() {
        super.openBrowser();
    }

    @Override
    public void closeBrowser() {
        super.closeBrowser();
    }
}
