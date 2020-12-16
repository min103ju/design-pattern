package singleton.after;

public class SecondPage {

    // SecondPage와 같은 Settings
    private Settings settings = Settings.getSettings();

    public void printSettings() {
        System.out.println(settings.getDarkMode() + " " + settings.getFontSize());
    }

}