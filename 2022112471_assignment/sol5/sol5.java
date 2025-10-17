//2022112471 이병현
public class sol5 {
    int x = 100;//전역변수
    void funcA(){
        int x = 50;//로컬변수
        System.out.println("funcA 실행, x : "+x);
    }
    void funcB(){
        x = 200;//전역변수 변경
        System.out.println("funcB 실행, x : "+x);
    }
    public static void main(String[] args) {
        sol5 obj = new sol5();//sol5 클래스 객체 생성
        System.out.println("전역변수 x : " + obj.x);
        obj.funcA();
        System.out.println("전역변수 x : " + obj.x);
        obj.funcB();
        System.out.println("전역변수 x : " + obj.x);//변경된 x 값 확인
    }
}