package strategy.after;

public class MyProgram {

    public SearchButton searchButton = new SearchButton(this);


    // 전체 검색
    public void setModeAll () {
        searchButton.setSearchStrategy(new SearchStrategyAll());    
    }

    // 이미지 검색
    public void setModeImage () {
        searchButton.setSearchStrategy(new SearchStrategyImage());    
    }

    // 뉴스 검색
    public void setModeNews () {
        searchButton.setSearchStrategy(new SearchStrategyNews());    
    }

    // 지도 검색
    public void setModeMap () { 
        searchButton.setSearchStrategy(new SearchStrategyMap());    
    }

    public void test() {
        searchButton.onClick(); // 전체 검색
        setModeImage();
        searchButton.onClick(); // 이미지 검색
        setModeNews();
        searchButton.onClick(); // 뉴스 검색
        setModeMap();
        searchButton.onClick(); // 지도 검색
    }

}