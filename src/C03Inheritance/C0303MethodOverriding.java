package C03Inheritance;

public class C0303MethodOverriding {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();
        d1.sound2();

//        상속관계일때 부모클래스의 타입을 자식클래스 객체의 타입으로 지정가능
//        animal 클래스에 정의된 메서드만 사용가능하도록 타입의 제약 발생
        Animal d2 = new Dog(); //Animal에 있는 함수만 사용하도록 제한을 둔 것
        d2.sound();
//        d2.sound2(); 사용 불가
    }
}

class Animal{
    void sound(){
        System.out.println("동물이 소리를 냅니다");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("멍멍");
    }

    void sound2(){
        System.out.println("멍멍멍");
    }
}

class Cat extends Animal{

}