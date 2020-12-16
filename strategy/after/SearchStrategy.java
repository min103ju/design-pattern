package strategy.after;

interface SearchStrategy {
    public void search();
}

class SearchStrategyAll implements SearchStrategy {
    public void search() {
        // 전체 검색 코드
        System.out.println("전체 검색 코드 After");
    }
}

class SearchStrategyImage implements SearchStrategy {
    public void search() {
        // 이미지 검색 코드
        System.out.println("이미지 검색 코드 After");
    }
}

class SearchStrategyNews implements SearchStrategy {
    public void search() {
        // 뉴스 검색 코드
        System.out.println("뉴스 검색 코드 After");
    }
}


class SearchStrategyMap implements SearchStrategy {
    public void search() {
        // 지도 검색 코드
        System.out.println("지도 검색 코드 After");
    }
}

