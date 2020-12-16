package singleton.after;

public class FirstPage {

    // SecondPage와 같은 Settings
    private Settings settings = Settings.getSettings();

    public void setAndPringtSettings() {
        settings.setDarkMode(true);
        settings.setFontSize(15);

        System.out.println(settings.getDarkMode() + " " + settings.getFontSize());
    }
}