package C01Basic;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;

public class C06String {
    public static void main(String[] args) {
//        참조자료형 : 기본 자료형을 제외한 모든 자료형. 클래스 기반
//        WrapperClass : 기본형 타입을 Wrapping한 클래스
//        int a =10;
//        Integer b = new Integer(10);
////        오토 언박싱 : WrapperClass -> 기본자료형
//        int c = b;
//        오토 박싱 : 기본자료형 -> WrapperClass 형변환
//        Integer d =a;

//        String과 int의 형변환
//        String st1 =Integer.toString(a);
//        String st2 = String.valueOf(a);

//        String -> int
//        int b = Integer.parseInt(st1);

//        배열에는 원시타입 자료형 세팅
//        int [] arr1 = {10, 20, 30};

//        리스트에는 참조자료형 세팅
//        참조 자료형에 원시 자료형을 담을때는 Wrapper클래스를 써야함
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(10);
//        list1.add(20);
//        list1.add(30);
//
//
//        String st1 = new String("hello1");
////        리터럴 방식 허용 : 권장되는 방식 (문자pool을 통해 성능향상)
//        String st2 = "hello1";
//        String st3 = "hello1";
////        참조 자료형이므로, == 비교는 메모리 주소가 되고, 값을 비교할때에는 .equals 사용
//        System.out.println(st1.equals(st2));
//        System.out.println(st2 == st3);
//        char ch1 = '가';
//        char ch2 = '가';
//        System.out.println(ch1 == ch2);

//        equals 중에 대소문자 무시
//        String st1 = "hello1";
//        String st2 = "hello1";
//        String st3 = "HeLLo1";
//        System.out.println(st1.equals(st2));
//        System.out.println(st2.equals(st3));
//        System.out.println(st2.equalsIgnoreCase(st3));

//        문자열의 길이 : length()
//        String st1 = "hello1 java1 world2";
//        System.out.println(st1.length());
////        charAt : 특정 index의 문자(char) 값을 리턴
////        소문자 알파벳의 개수 구하기
//        int count = 0;
//        for (int i = 0; i<st1.length();i++){
//            if(st1.charAt(i)>=97 && st1.charAt(i)<=122){
//                count++;
//            }
//        }
//        System.out.println(count);
//
//        String st2 = "abcdefabaadf";
////        a의 개수가 몇개인지 출력
//        int count =0;
//        for (int i=0; i<st2.length();i++){
//            if(st2.charAt(i)=='a'){
//                count++;
//            }
//        }
//        System.out.println(count);

//        toCharArray() : String 문자열을 char 배열로 리턴
//        char[] chArr = st2.toCharArray();
//        for(int i=0; i < st2.length(); i++){
//            if(chArr[i] == 'a') {
//                count++;
//            }
//        }
//        for(char ch:chArr){
//            if(ch == 'a'){
//                count++;
//            }
//        }
//        System.out.println(count);
//        String st1 = "hello java java";
////        indexof : 특정 문자열의 위치 반환, 가장 먼저 나오는 문자열의 위치
//        System.out.println(st1.indexOf("java"));
//
////        cntains : 특정 문자열이 있는지 여부를 boolean
//        System.out.println(st1.contains("hello"));
//        System.out.println(st1.contains("world"));
    }
}
