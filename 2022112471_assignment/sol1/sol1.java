//2022112471 이병현
import java.util.Scanner;

class Student {
    private String name;//이름
    private int scores[];//점수 저장할 배열

    public Student(String name, int[] scores) {//생성자
        this.name = name;
        this.scores = scores;
    }

    public String getName(){ return name; }//이름 반환 메서드
    public double getAvgScore() {//평균점수 계산 메서드
        int length = this.scores.length;
        double sum = 0;
        for(int score : this.scores)
            sum+=score;
        return sum/length;
    }
}

public class sol1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int numOfSubject = 3;//과목 개수 상수, 3개라고 가정
        Student[] students = new Student[3]; //객체배열 생성
        for(int i=0; i<3; i++){
            System.out.print((i+1)+"번째 학생 이름 : ");
            String name = in.next();//이름 입력
            
            int[] scores = new int[numOfSubject];
            for(int j=0; j<numOfSubject; j++){ //점수 배열에 점수들 입력받기
                System.out.print((i+1)+"번째 학생 과목 "+(j+1)+" 점수 : ");
                scores[j] = in.nextInt();
            }
            students[i] = new Student(name, scores);//각 객체 생성
        }
        for(int i=0; i<3; i++){//각 객체 이름과 평균 출력
            System.out.println("이름 : "+students[i].getName()+
            " | 성적 평균 : "+students[i].getAvgScore());
        }
    }
}