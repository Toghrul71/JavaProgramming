package day38_MethodOverriding.Browser;

public class Browser {
    public String browser;

    public Browser(String browser) {
        this.browser = browser;
    }

    public void openBrowser(){
        System.out.println("opening chrome browser");
    }
    public void closeBrowser(){
        System.out.println("closing chrome browser");
    }

    @Override
    public String toString() {
        return "Browser{" +
                "browser='" + browser + '\'' +
                '}';
    }
}
