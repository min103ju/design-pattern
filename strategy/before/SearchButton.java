package strategy.before;

public class SearchButton {
    
    private MyProgram myProgram;

    public SearchButton (MyProgram _myProgram) {
        myProgram = _myProgram;
    }

    public void onClick () {

        if(myProgram.mode == Mode.ALL){
            // 전체 검색
            System.out.println("전체 검색 코드 Before");
        }

        else if(myProgram.mode == Mode.IMAGE){
            // 이미지 검색
            System.out.println("이미지 검색 코드 Before");
        }

        else if(myProgram.mode == Mode.NEWS){
            // 뉴스 검색
            System.out.println("뉴스 검색 코드 Before");
        }

        else if(myProgram.mode == Mode.MAP){
            // 지도 검색
            System.out.println("지도 검색 코드 Before");
        }
        
    }
}