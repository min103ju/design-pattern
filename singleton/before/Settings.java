package singleton.before;

public class Settings {

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