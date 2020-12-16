package singleton.before;

public class SecondPage {

    // FirstPage의 Settings와는 다른 인스턴스
    private Settings settings = new Settings();

    public void printSettings() {
        System.out.println(settings.getDarkMode() + " " + settings.getFontSize());
    }

}