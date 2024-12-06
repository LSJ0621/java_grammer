package C01Basic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C07Array {
    public static void main(String[] args) {
//        배열표현식1. 리터럴 방식
//        int[] intArr1 = {1,3,5,7,9};
//
////        배열표현식2. 배열 선언 후 할당 방식
//        int [] intArr2 = new int[5];
//        intArr2[0] = 1;
//        intArr2[1] = 3;
//        intArr2[2] = 5;
//        intArr2[3] = 7;
//        System.out.println(intArr2[4]); //0으로 초기화
//
////        참조자료형의 배열은 기본적으로b null 초기화
//        String[] stArr = new String[5];
//        stArr[0] = "hello1";
//        stArr[1] = "hello2";
//        stArr[2] = "hello3";
////        아래 코드는 nullpointexeption 발생
//        for(int i=0; i<stArr.length;i++){
//            if(stArr[i].equals("hello10")){
//                System.out.println("hello 10이 있습니다.");
//            }
//        }
////        표현식3
//        int [] intArr3 = new int[] {1,3,5,7,9};
//        List<int[]> list1 = new ArrayList<>();
//        list1.add(new int[]{1,2,3,4,5});
//
////        표현힉 4 :불가 ->배열의 길이가 사전 지정되어야함
//        int[] intArr4 = new int[];

//        String[] stArr = new String[5];
//        for(int i=0; i<stArr.length;i++){
//            stArr[i] = "";
//        }
//        Arrays.fill(stArr, "hello");
//        System.out.println(Arrays.toString(stArr));

//        85,65,90 int 배열을 선언하고, 총합 평균을 구하자.
//        int[] arr = {85,65,90};
//        int total = 0;
//        for(int i=0; i<arr.length;i++){
//            total = total +arr[i];
//        }
//        int avg = total /arr.length;
//        System.out.println(total);
//        System.out.println(avg);

//        배열의 최대값, 최소값
//        int [] arr2 = {10,20,30,12,8,17};
//        int max=Integer.MIN_VALUE;
//        int min=arr2[0];
//        for(int i=0; i<arr2.length;i++){
//            if(arr2[i]>max){
//                max = arr2[i];
//            }
//            if(arr2[i]<min){
//                min = arr2[i];
//            }
//        }
//        System.out.println(max);

//        배열의 자리바꾸기
//        int[] arr = {20,10,30};
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;
//
//        int[] arr2 = {10,20,30,40,50};
//        for(int i=0; i<arr2.length-1; i++){
//            int temp = arr2[i+1];
//            arr2[i+1] = arr2[i];
//            arr2[i] = temp;
//        }
//        System.out.println(Arrays.toString(arr2));

//        배열뒤집기 : 새로운 배열을 선언하며, arr을 뒤집을 배열 생성
//        int[] arr = {10,20,30,40,50};
//        int[] arr2 = new int[arr.length];
//        for (int i=0; i<arr.length; i++){
//            arr2[i] = arr[arr.length-1-i];
//        }
//        System.out.println(Arrays.toString(arr2));

//        배열의 정렬
//        int[] arr = {17, 12, 20, 10, 25};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        선택정렬 알고리즘 구현
//        for(int i=0; i<arr.length;i++){
//            for(int j=i+1; j<arr.length-1;j++){
//                if(arr[j]<arr[i]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//
//        int[] arr = {17, 12, 20, 10, 25};
//        for (int i = 0; i < arr.length - 1; i++) {
//            int min = arr[i];
//            int minIndex = i;
//            for (int j = i+1; j < arr.length; j++) {
//                if (min > arr[j]) {
//                    min  = arr[j];
//                    minIndex = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[minIndex];
//            arr[minIndex] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

//        문자정렬
//        아스키코드(unicode)기준으로 정렬
//        String[] fruits = {"banana", "apple","cherry"};
////        오름차순
//        Arrays.sort(fruits);
//        System.out.println(Arrays.toString(fruits));

//        String[] fruits2 = {"apple","applee","applef","b"};
//        Arrays.sort(fruits2);
//        System.out.println(Arrays.toString(fruits2));
//        내림차순 : 기본형타입은 Comparator로 처리불가
//        Arrays.sort(fruits, Comparator.reverseOrder());
//        int[] arr = {5,1,2,3,6};
////        Arrays.sort(arr, Comparator.reverseOrder());
//        System.out.println(Arrays.toString(fruits));

//        K번째수 프로그래머스
//        int[] array, int[][] commands
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length;i++){
            for(int j=0; j<commands[0].length;i++){
                int[]temp = new int[commands[i][1]-commands[i][0]+1];
                for(int j=0; j<)
                    commands[i][2]
            }
        }
    }
}
