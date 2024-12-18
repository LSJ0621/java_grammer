package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;

public class C0208RecursiveBasic {
    public static void main(String[] args) {
//        for문으로 1~10까지 누적합계
//        int num =0;
//        for(int i=1; i<=10; i++){
//            num+=i;
//        }
//        System.out.println(num);
//
////        재귀함수로 1~10까지 누적합계
//        System.out.println(sumAcc(10));
//
////        factorial 값 구하기
////        factorial(5) -> 1*2*3*4*5
//        System.out.println(factorial(10));

//        피보나치 수열 구현 : 10번째
//        1 1 2 3 5 8 13 ....
//        List<Integer> myList = new ArrayList<>();
//        for(int i=0; i<11;i++){
//            if(i==0){
//                myList.add(1);
//            } else if (i==1) {
//                myList.add(0+myList.get(0));
//            } else{
//                int a = myList.get(i-1)+myList.get(i-2);
//                myList.add(a);
//            }
//        }
//        System.out.println(myList);

//        피보나치 재귀함수 구현
        System.out.println(fibonacci(10));

    }
    public static int fibonacci(int n){
        if(n<=2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static int sumAcc(int n){
        if(n==1){
            return 1;
        }
        return n+sumAcc(n-1);
    }

    public static  int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
