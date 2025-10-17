//2022112471 이병현
import java.util.Scanner;

class Book{
    private String title;
    private String author;
    private int price;

    public Book(String title, String author, int price) {//생성자
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void applyDiscount(double percent){//할인계산 메서드
        this.price = (int)(this.price * (1 - percent));
    }

    public void getInfo() {//정보출력메서드
        System.out.println("제목 : "+this.title);
        System.out.println("저자 : "+this.author);
        System.out.println("가격 : "+this.price);
    }

}

public class sol3{
    public static void main(String[] args) {
        Book[] books = new Book[3];//객체 배열 생성
        Scanner in = new Scanner(System.in);
        for(int i=0; i<3; i++){
            System.out.print((i+1)+"번째 책 제목 : ");
            String title = in.nextLine();
            System.out.print("저자 : ");
            String author = in.nextLine();
            System.out.print("가격 : ");
            int price = in.nextInt();
            in.nextLine(); //입력버퍼 삭제
            books[i] = new Book(title, author, price);//입력값 토대로 객체 생성
        }

        System.out.print("책 할인율 : ");
        double percent = in.nextDouble();

        for(int i=0; i<3; i++){
            books[i].applyDiscount(percent);//할인율 계산하여 가격 업데이트
        }
        System.out.println("-----------------");
        for(int i=0; i<3; i++){
            System.out.println((i+1)+"번째 책 정보");
            books[i].getInfo();//각 책 정보 출력
        }
    }
}