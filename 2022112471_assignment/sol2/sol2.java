//2022112471 이병현
class Animal{
    void speak(){
        System.out.println("Animal Speak");
    }
}

class Cat extends Animal{
    @Override
    void speak(){//메서드 오버라이딩
        System.out.println("Meow");
    }
}

class Dog extends Animal{
    @Override
    void speak(){//메서드 오버라이딩
        System.out.println("Woof");
    }
}

public class sol2 {
    public static void main(String[] args){
        Animal[] animals = new Animal[3];//Animal 배열 생성
        animals[0] = new Cat();//Cat객체 생성
        animals[1] = new Dog();//Dog객체 생성
        animals[2] = new Animal();//Animal객체 생성

        for(int i=0; i<3; i++){
            animals[i].speak();//speak 메서드 호출
        }
    }
}
