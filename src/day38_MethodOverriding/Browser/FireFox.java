package day38_MethodOverriding.Browser;

public class FireFox extends Browser{

    public FireFox(String browser) {
        super("FireFox");
    }

    @Override
    public void openBrowser() {
        System.out.println("opening firefox "+ browser);
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing fire fox "+browser);
    }
}
