package C05AnonymousLambda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class C0503ComparableComparator {
    public static void main(String[] args) throws IOException {
//        자바에서는 비교를 위한 인터페이스 대표적으로 2개를 제공
//        comparable 인터페이스는 compareTo메서드 선언
//        Comparator 인터페이스는 compare 메서드 선언

//        String클래스에 compareTo 메서드 내장
//        String 클래스 외에 java의 많은 클래스에서 compareTo를 구현(Comparable 인터페이스 구현)
//        String a = "hello";
//        String b = "world";
////        두 문자열의 각 자리를 순차적으로 비교. 비교결과는 유니코드값의 차이를 반환
//        System.out.println(a.compareTo(b));
//
//        List<String> myList = new ArrayList<>();
//        myList.add("java");
//        myList.add("python");
//        myList.add("javaScript");
//        Collections.sort(myList);
//        myList.sort(Comparator.naturalOrder());

        List<Student> myList = new ArrayList<>();
        myList.add(new Student("kim",24));
        myList.add(new Student("lee",23));
        myList.add(new Student("park",31));
        myList.add(new Student("choi",40));
        myList.add(new Student("kim",50));
//        방법1. Student 객체에서 Comparable 구현한 방식
////        myList요소인 Student 객체안에 comparable 인터페이스를 구현한 compareTo 메서드가 있어야함.
////        Collections.sort(myList);
////        System.out.println(myList.toString());
//
//        방법2. Comparator를 구현한 익명객체를 sort에 매개변수로 주입
//        myList.sort();
//        myList.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge()-o2.getAge(); // 나이를 기준으로 오름차순 정렬
//                return o2.getAge()-o1.getAge(); //나이를 기준으로 내림차순 정렬
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
////        Comparator를 람다함수 활용하여 myList 정렬 : 이름을 기준으로 내림차순
//        myList.sort((a,b)->{
//            if(a.getName().compareTo(b.getName())==0){
//                return a.getAge()-b.getAge();
//            }else{
//                return b.getName().compareTo(a.getName());
//            }
//        });
//        System.out.println(myList);

//        String[] stArr = {"hello","java","C++","world2"};
//        Arrays.sort(stArr);
////        글자 길이를 기준으로 내림차순으로 정렬해라.
//        Arrays.sort(stArr, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length()-o1.length();
//            }
//        });
//        System.out.println(Arrays.toString(stArr));
//
//        Queue<String> pq = new PriorityQueue<>(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length()-o1.length();
//            }
//        });
//        for(String a:stArr){
//            pq.add(a);
//        }
//        while(!pq.isEmpty()){
//            System.out.println(pq.poll());
//        }

//        백준:절대값 힙
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        Queue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if(Math.abs(o1)!=Math.abs(o2)){
//                    return Math.abs(o1) - Math.abs(o2);
//                }else{
//                    return o1-o2;
//                }
//            };
//        });
//        for(int i=0;i<N;i++){
//            int x = Integer.parseInt(br.readLine());
//            if(x!=0){
//                pq.add(x);
//            }else {
//                if(!pq.isEmpty()){
//                    System.out.println(pq);
//                    System.out.println(pq.poll());
//                }else{
//                    System.out.println(0);
//                }
//            }
//        }
//        [4,5],[1,2],[5,0],[3,1]
//        List<int[]> myList = new ArrayList<>();
////        myList.add (new int[]{4,5}) 가능
//        int[] a = {4,5};
//        int[] b = {1,2};
//        int[] c = {5,0};
//        int[] d = {3,1};
//        myList.add(a);
//        myList.add(b);
//        myList.add(c);
//        myList.add(d);
////        정렬조건 : 리스트 안의 배열에 index 1번째 값을 기준으로 오름차순 정렬
//        myList.sort(new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[1]-o2[1];
//            }
//        });
//        for(int[] k: myList){
//            System.out.println(Arrays.toString(k));
//        }

//        가장 큰 수 - 프로그래머스
        int[] numbers = {3, 30,34, 5, 9};
        String[] arr = new String[numbers.length];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return  (o2 + o1).compareTo(o1 + o2);
            }
        });
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        String answer = String.valueOf(sb);
        if(arr[0].equals("0")){
            answer = "0";
        }

    }
}

//class Student implements Comparable<Student>{
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

//    정렬은 결국 2개의 값을 비교하는 것이므로, a와 b 대상 2개만 있으면 충분.
//    두 수 (또는 문자)의 비교의 경우 음수,0,양수 세값중에 하나만 return 되게 하고, 이를통해 정렬이 이루어짐.
//    기준이 되는 A(this)가 앞에 있을땐 오름차순, 뒤에있으면 내림차순으로 내부적으로 정렬로직이 동작
//    @Override
//    public int compareTo(Student o) {
//        return this.getName().compareTo(o.getName());
//    }

//    객체 호출시에 자동으로 메모리 주소가 아닌 내용이 출력되게 하려면 toString 메서드를 구현
//    자바의 모든 클래스는 조상클래스인 Object 클래스를 상속하고, 아래의 override는 Object 클래스의 toString메서드를 구현한것
    @Override
    public String toString(){
      return "이름은 "+this.name+" 나이는 "+ this.age;
    }

}
