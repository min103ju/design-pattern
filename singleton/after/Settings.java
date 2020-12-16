package singleton.after;

public class Settings {

    /*
    단순 정적 변수가 아닌 싱글턴 패턴을 사용하는 이유는
    interface의 사용, lazy loading 등 싱글턴으로 할 수 있는것이 많기 때문
    현재 작성한 예제의 경우 Multi Thread의 이슈가 있기 때문에 해결이 필요하다.
    */

    // private으로 기본 생성자를 추가 -> 다른 곳에서 new로 동적으로 인스턴스를 생성하지 못한다.
    private Settings () {}; 
    private static Settings settings = null;

    public static Settings getSettings() {
        if(settings == null){
            settings = new Settings();
        }
        return settings;
    }

    private boolean darkMode = false;
    private int fontSize = 13;

    public boolean getDarkMode() {
        return darkMode;
    }

    public void setDarkMode(boolean _darkMode) {
        this.darkMode = _darkMode;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int _fontSize) {
        this.fontSize = _fontSize;
    }
}