package C01Basic;

import java.util.Arrays;
import java.util.Scanner;

public class C05WhileStatements {
    public static void main(String[] args) {
//        int a =0;
//        while(a<10){
//            System.out.println("hello world");
//            a++;
//        }

//        2~10까지 출력하는 while문 예제
//        int a= 1;
//        while(a<10){
//            a++;
//            System.out.println(a);
//        }


//        입력한 숫자의 구구단 단수 출력
//        System.out.println("원하는 구구단 단수를 입력해주세요");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = 0;
//        while(b<9){
//            b++;
//            int result = a*b;
//            System.out.println(a + " X " + b + " = "+ result);
//        }
//        int answer = 1234;
//        int a = 0;
//        while(a<5){
//           Scanner sc = new Scanner(System.in);
//           int input = sc.nextInt();
//           if(answer == input){
//               System.out.println("문이 열렸습니다.");
////               break 키워드는 가장 가까이에 있는 반복문을 종료
//               break;
//           }else {
//               System.out.println("비밀번호가 틀렸습니다.");
//           }
//           a++;
//           if(a==5){
//               System.out.println("5회 이상 초과");
//               break;
//           }
//        }

//        do while문 : 무조건 1번은 실행되는 while문
//        int a = 100;
//        do{
//            System.out.println(a);
//        }
//        while (a<10);
//        for문 : 초기식, 조건식, 증감식이 모두 포함돼 있는 반복문
//        int b = 0;
//        while(b<11){
//            System.out.println(b);
//            b++;
//        }
//        for(int a = 2; a<11; a++){
//            System.out.println(a);
//        }
//        for문은 사용했던 변수명을 for문 끝난 이후 다음 라인에서 재선언이 가능

//        1~10중에 홀수만 출력하기
//        for (int i=1; i<=10;i++){
//            if(i%2==1){
//                System.out.println(i);
//            }
//            1~20까지 수 중에 짝수를 모두 더한값
//        int total = 0;
//        for (int i =1; i<21; i++){
//            if(i%2==0){
//                total= total+i;
//            }
//        }
//        System.out.println(total);

//        두 수의 최대 공약수 찾기
//        int a = 24;
//        int b = 36;
//        int min = a<b ? a : b ;
//        int max = 0;
//        for (int i=1; i<min; i++){
//            if(a%i ==0 && b%i==0){
//                max =i;
//            }
//        }
//        System.out.println(max);

//        소수 구하기 : 1과 자신을 제외한 숫자로 나누어지지 않는 수
//        사용자가 입력한 숫자 n이 소수인지 아닌지 판별
//        내 풀이
//        System.out.println("숫자를 입력해주세요");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int count = 0;
//        for(int i=1; i<=num; i++){
//            if(num%i==0){
//                count++;
//            }
//        }
//        if(count>2){
//            System.out.println("소수가 아닙니다");
//        }else {
//            System.out.println("소수입니다");
//        }
//        강사님 풀이
//        System.out.println("숫자를 입력해주세요");
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        boolean answer = false;
//        for (int i=2; i*i<=input;i++){
//            if(input%i==0){
//                answer = true;
//                break;
//            }
//        }
//        if(answer==true){
//            System.out.println("소수가 아닙니다");
//        }else {
//            System.out.println("소수입니다");
//        }

//        continue : 반복문의 조건식으로 이동
//        for(int i=1;i<11;i++){
//            if(i%2 !=0){
//                continue;
//            }
//            System.out.println(i);
//        }
//
//        배열과 enhanced for문(향사된 for문 - for each문)
//        int[] arr = {1,3,5,7};
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//
////        일반 for문으로 배열 접근
//        for(int i=0; i<4;i++){
//            System.out.println(arr[i]);
//        }
////        향상된 for 문으로 배열 접근 : a에 arr의 값이 하나씩 담기고, 값의 개수만큼 반복횟수가 결정
//        for(int a : arr){
//            System.out.println(a);
//        }
//        일반 for문을 통해 arr의 지정된 값 변경
//        int[] arr = {1,3,5,7};
//        for(int i=0; i<4;i++){
//            arr[i]+=10;
//        }
//        System.out.println(Arrays.toString(arr));
////        향상된 for문을 arr값 변경 시도
//        for(int a : arr){
//            a +=100;
//        }
//        System.out.println(Arrays.toString(arr));
//
////        자바 변수의 유효범위 : {}
//        int num = 10;
//        if(num>1){
//            int abc=20;
//            num =20;
//        }
////        abc=30; //if문 총괄호 밖에서는 abc 변수의 존재를 모름
//        System.out.println(num);

//        다중 반복문
//        2~9단까지 출력
//        for(int i = 2; i<10; i++ ){
//            System.out.println(i+"단입니다.");
//            for(int j=1; j<10;j++){
//                System.out.println( i+" X "+j+" = "+ (i*j));
//            }
//        }
//
////        라벨문 : 반복문에 이름을 붙이는 것.
//        boolean end = false;
//        for(int i=0; i<5; i++){
//            for (int j=0;j<5;j++){
//                System.out.println("hello world");
//                if(j==2){
//                    end = true;
//                    break;
//                }
//            }
//            if(end==true){
//                break;
//            }
//        }
//
//        int[][] arr = {{1,2,3},{4,5,11},{7,8,9},{10,11,12}};
//        숫자 8을 찾아서 2,1에 있다고 출력
//        숫자 11을 찾되, 가장 먼저 찾아지는 11의 위치만 출력
//        for(int i=0;i<4;i++){
//            for(int j=0; j<3;j++){
//                if(arr[i][j]==8){
//                    System.out.println("8은 "+"("+i+","+j+")에 있습니다");
//                    break;
//                }
//            }
//        }
//        loop1:
//        for(int i=0;i<4;i++){
//            boolean a = false;
//            loop2:
//            for(int j=0; j<3;j++){
//                if(arr[i][j]==11) {
//                    System.out.println("11은 " + "(" + i + "," + j + ")에 있습니다");
//                    a = true;
//                    break loop1;
//                }
//            }
//        }
//        100~200까지 수 중에서 가장 작은 소수를 출력

        for(int input = 100; input<=200; input++){
            boolean answer = false;
            for(int i=2; i*i <=input;i++){
                if( input%i ==0){
                    answer =true;
                    break;
                }
            }
            if(!answer){
                System.out.println(input);
                break;
            }
        }


//        1~24까지 수 중에서 소수인 수를 출력
//        1,2,3,5,7 ...


    }
}
