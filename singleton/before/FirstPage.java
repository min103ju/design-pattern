package singleton.before;

public class FirstPage {

    // SecondPage의 Settings와는 다른 인스턴스
    private Settings settings = new Settings(); 

    public void setAndPringtSettings() {
        settings.setDarkMode(true);
        settings.setFontSize(15);

        System.out.println(settings.getDarkMode() + " " + settings.getFontSize());
    }
}