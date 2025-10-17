//2022112471 이병현
import java.util.Scanner;

class Student {
    private String name;
    private int scores[];

    public Student(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    public String getName(){ return name; }
    public double getAvgScore() {//평균점수
        int length = this.scores.length;
        double sum = 0;
        for(int score : this.scores)
            sum+=score;
        return sum/length;
    }
    public int getHighScore(){//최고점수
        int max = this.scores[0];
        for(int score : this.scores)
            if(score>max)
                max = score;
        return max;
    }
}

public class sol6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int numOfSubject = 3;//과목 개수가 3개라고 가정
        Student[] students = new Student[5]; //객체배열 생성
        for(int i=0; i<5; i++){
            System.out.print((i+1)+"번째 학생 이름 : ");
            String name = in.next();
            
            int[] scores = new int[numOfSubject];
            for(int j=0; j<numOfSubject; j++){ //점수 배열에 점수들 입력받기
                System.out.print((i+1)+"번째 학생 과목 "+(j+1)+" 점수 : ");
                scores[j] = in.nextInt();
            }
            students[i] = new Student(name, scores);//각 객체 생성
        }
        for(int i=0; i<5; i++){
            System.out.println("이름 : "+students[i].getName()+
            " | 최고 점수 : "+students[i].getHighScore()+
            " | 성적 평균 : "+students[i].getAvgScore());
        }
    }
}