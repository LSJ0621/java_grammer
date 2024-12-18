package C01Basic;
import java.util.*;
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
//        Arrays.sort(arr, Comparator.reverseOrder());
//        System.out.println(Arrays.toString(fruits));

//        K번째수 프로그래머스
//        int[] array, int[][] commands
//        int[] array = {1,5,2,6,3,7,4};
//        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
//        int[] answer = new int[commands.length];
//        for(int i=0; i<commands.length; i++){
//            int[] temp = new int[commands[i][1]-commands[i][0]+1];
//            int number=0;
//            for(int j=commands[i][0]-1; j<commands[i][1];j++){
//                temp[number] = array[j];
//                number++;
//            }
//            Arrays.sort(temp);
//            answer[i] = temp[commands[i][2]-1];
//        }
//        숫자 조합의 합
//        모두 각기 다른 숫자의 배열이 있을때, 만들어질 수 있는 2개의 조합의 합을 출력
//        int[] intArr = {10,20,30,40,50,60};
//        int length = 0;
//        int index = 0;
//        for (int k=1; k<intArr.length; k++){
//            length=length+k;
//        }
//        int [] intArr2 = new int[length];
//        for (int i=0;i<intArr.length-1;i++){
//            for(int j=i+1; j<intArr.length;j++){
//                intArr2[index] = intArr[i]+intArr[j];
//                index++;
//            }
//        }
//        Arrays.sort(intArr2);
//        int[] answer = new int[intArr2.length];
//        int count = 0;
//        for (int k=0; k<intArr2.length; k++){
//            if(k ==intArr2.length-1||intArr2[k]!=intArr2[k+1]){
//                answer[count] = intArr2[k];
//                count ++;
//            }
//        }
//        System.out.println(Arrays.toString(answer));
//
////        배열의 복사
////        copyOf(배열명,length), copyOfRange(배열명, start,end)
//        int[] answer1 = Arrays.copyOf(answer,count);
//        int[] answer2 = Arrays.copyOfRange(answer,0,count);
//        System.out.println(Arrays.toString(answer1));
//        System.out.println(Arrays.toString(answer2));

//        두 개 뽑아서 더하기 - 프로그래머스
//        int[] numbers = {2,1,3,4,1};
//        int length = 0;
//
//        for(int i=1; i<numbers.length;i++){
//            length=length+i;
//        }
//
//        int[] sum = new int[length];
//        int index = 0;
//        for(int i=0; i<numbers.length-1;i++){
//            for(int j=i+1; j<numbers.length;j++){
//                sum[index] = numbers[i]+numbers[j];
//                index++;
//            }
//        }
//        Arrays.sort(sum);
//        int[] answer1 = new int[sum.length];
//        int count = 0;
//        for (int i=0; i<sum.length;i++){
//            if(i==sum.length-1 || sum[i]!=sum[i+1]){
//                answer1[count] = sum[i];
//                count++;
//            }
//        }
//        int[] answer = Arrays.copyOf(answer1,count);
//        System.out.println(Arrays.toString(answer));

//        배열의 검색
//        int[] arr = {5,3,1,8,7};
//        int target = 8;
//        int answer = 0;
//        for (int i=0; i<arr.length; i++){
//            if(arr[i] == target){
//                answer = i;
//                break;
//            }
//        }
//        System.out.println(answer);
//
//    이진검색(binary search) - 이분탐색
//    사전에 오름차순 정렬이 되어있어야 이진검색 가능
//        int[] arr = {1, 3, 6, 8, 9, 11, 15};
//        System.out.println(Arrays.binarySearch(arr, 15));
//
////        배열간 비교
//        int[] arr1 = {10,20,30};
//        int[] arr2 = {10,20,30};
//        System.out.println(arr1 == arr2);
//
////        Arrays.equals : 값과 순서까지 동일해야 true
//        System.out.println(Arrays.equals(arr1, arr2));

//        2차원 배열의 선언과 할당
//        int[][] arr1 = new int [2][3];
//        arr1[0][0] = 10;
//        arr1[0][1] = 20;
//        arr1[0][2] = 30;
//        arr1[1][0] = 40;
//        arr1[1][1] = 50;
//        arr1[1][2] = 60;
//        int[][] arr2 = {{10,20,30},{40,50,60}};

//        가변배열 선언 후 할당
//        int [][] arr1 = new int[2][];
//        arr1[0] = new int[2];
//        arr1[1] = new int[3];
//        arr1[0][0] = 10;
//        arr1[0][1] = 20;
//        arr1[1][0] = 30;
//        arr1[1][1] = 40;
//        arr1[1][2] = 50;
//        System.out.println(Arrays.deepToString(arr1));
////        가변배열 리터럴 방식
//        int [][]arr2 = {{10,20}, {30,40,50}};

//        [3][4] 사이즈 배열 선언하고
//        1~12까지 숫자값을 각 배열에 순차적으로 할당
//        {1,2,3,4},{5,6,7,8}
//        int[][] arr1 = new int [3][4];
//        int count = 1;
//        for(int i=0; i< arr1.length; i++){
//            for(int k=0;k<arr1[i].length;k++){
//                arr1[i][k] = count;
//                count++;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr1));

//        행렬의 덧셈 - 프로그래머스
        int[][] arr1 = {{1,2},{2,3}};
        int[][] arr2 = {{3,4},{5,6}};
        int[][] answer = new int[arr1.length][arr1[0].length];
        for(int i=0; i< arr1.length;i++){
            for(int j=0; j<arr1[i].length;j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(answer));
    }
}
