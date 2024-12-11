package C01Basic;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C11QueStackDeque {
    public static void main(String[] args) {
//        Queue 인터페이스를 LinkedList가 구현한 방식을 가장 많이 사용
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);

//        myQue에 데이터를 삭제하면서 반환
//        System.out.println(myQue.poll());
//        System.out.println(myQue);

////        myQue에 데이터를 삭제하지는 않고, 가장 앞의 데이터를 반환
//        System.out.println(myQue.peek());

//        LinkedList와 Arraylist 성능비교
//        중간 위치에 데이터 add테스트
//        LinkedList<Integer> list1 = new LinkedList<>();
//        long startTime = System.currentTimeMillis();
//        for (int i=0; i<100000;i++){
//            list1.add(0,10);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("linkedlist 삽입속도 "+(endTime-startTime));
//        ArrayList<Integer> list2 = new ArrayList<>();
//        long startTime2 = System.currentTimeMillis();
//        for (int i=0; i<100000;i++){
//            list2.add(0,10);
//        }
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("ArrayList 삽입속도 " + (endTime2-startTime2));
//
////        조회속도 차이
//        long startTime3 = System.currentTimeMillis();
//        for(int i=0;i<100000;i++){
//            list1.get(i);
//        }
//        long endTime3 = System.currentTimeMillis();
//        System.out.println("linkedlist 조회속도 "+(endTime3-startTime3));
//
//        long startTime4 = System.currentTimeMillis();
//        for(int i=0;i<100000;i++){
//            list2.get(i);
//        }
//        long endTime4 = System.currentTimeMillis();
//        System.out.println("Arraylist 조회속도 "+(endTime4-startTime4));

//        Queue<String> myQue = new LinkedList<>();
//        myQue.add("문서1");
//        myQue.add("문서2");
//        myQue.add("문서3");
//        while(!myQue.isEmpty()){
//            System.out.println(myQue.poll());
//        }
//
////        길이제한큐 : ArrayBlockingQueue
//        Queue<String> blockingQueue = new ArrayBlockingQueue<>(3);
////        blockingQueue.add("문서1");
////        blockingQueue.add("문서2");
////        blockingQueue.add("문서3");
////        blockingQueue.add("문서4");
////        Queue 에 여유 공간이 있을때만 add
//        blockingQueue.offer("문서1");
//        blockingQueue.offer("문서2");
//        blockingQueue.offer("문서3");
//        blockingQueue.offer("문서4");
//        System.out.println(blockingQueue);

//        우선순위큐: 데이터를 꺼낼때 정렬된 데이터 pop
//        전체 정렬이 아닌, poll할때마다 최소값을 보장
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        System.out.println(pq);
//        while (!pq.isEmpty()){
//            System.out.println(pq.poll());
//        }
//        최소 힙 문제풀이
//        int N = Integer.parseInt(br.readLine());
//        Queue<Integer> pq = new PriorityQueue<>();
//        for(int i =0; i<N;i++){
//            String str = br.readLine();
//            int number = Integer.parseInt(str);
//            if(number ==0 && !pq.isEmpty()){
//                System.out.println(pq.poll());
//            } else if (number!=0) {
//                pq.add(number);
//            } else{
//                System.out.println(0);
//            }
//        }
//        최대힙인경우
//        Queue<Integer> maxPq = new PriorityQueue<>(Comparator.reverseOrder());
//        maxPq.add(30);
//        maxPq.add(10);
//        maxPq.add(20);
//        System.out.println(maxPq.poll());

//        더 맵게 -프로그래머스
//        int [] scoville = {1, 2, 3, 9, 10, 12};
//        int K = 7;
//        int answer = 0;
//        Queue<Integer> pq = new PriorityQueue<>();
//        for(int i=0; i<scoville.length; i++){
//            if(scoville[i]<7){
//                pq.add(scoville[i]);
//            }
//        }
//        while(true){
//            if(pq.isEmpty()){
//                break;
//            }
//            int a = pq.poll()+pq.poll()*2;
//            if(a<K){
//                pq.add(a);
//                answer++;
//            }else {
//                answer++;
//                break;
//            }
//        }
//        System.out.println(answer);

//        강사님 풀이
//        int answer = 0;
//        int K =7;
//        Queue<Integer> pq = new PriorityQueue<>();
//        for(int s:scoville){
//            pq.add(s);
//        }
//        while(pq.peek()<K){
//            if(pq.size()<=1){
//                answer=-1;
//                break;
//            }
//            int temp1 = pq.poll();
//            int temp2 = pq.poll();
//            pq.add(temp1 + temp2*2);
//            answer++;
//        }

//        stack
//        Stack<Integer> st = new Stack<>();
//        st.push(10);
//        st.push(20);
//        st.push(30);
//        System.out.println(st.pop());
//        System.out.println(st.peek());
//        System.out.println(st.size());
//        System.out.println(st.isEmpty());
//
//        while(!st.isEmpty()){
//            System.out.println(st.pop());
//        }


//        같은 숫자는 싫어 - 프로그래머스
//        int[] arr = {1,1,3,3,0,1,1};
//        Stack<Integer> st = new Stack<>();
//        st.push(arr[0]);
//        for(int i=1; i< arr.length;i++){
//            if(st.peek()!=arr[i]){
//                st.push(arr[i]);
//            }
//        }
//        int[] answer = new int[st.size()];
//        for(int i=0;i< answer.length;i++){
//            answer[i] = st.get(i);
//        }

//        강사님 풀이
//        int []arr = {1,1,3,3,0,1,1};
//        Stack<Integer> st = new Stack<>();
//        for(int a : arr){
//            if(st.isEmpty()){
//                st.push(a);
//            }else {
//                if(st.peek() != a){
//                    st.push(a);
//                }
//            }
//        }
//        int[] answer = new int[st.size()];
//        for(int i=answer.length-1; i>=0 ;i--){
//            answer[i] = st.pop();
//        }
//        System.out.println(Arrays.toString(answer));

//        Deque : addFirst, addLast, pollFirst, pollLast
//        Deque<Integer> d1 = new ArrayDeque<>();
//        d1.addLast(10);
//        d1.addLast(20);
//        System.out.println(d1);
//        d1.addFirst(30);
//        System.out.println(d1);
//        System.out.println(d1.peekFirst());//30
//        System.out.println(d1.peekLast());//20
//        System.out.println(d1.pollLast());
//        System.out.println(d1.pollFirst());
//        System.out.println(d1);

//        올바를 괄호 - 프로그래머스
//        String s = "(())()";
//        Deque<Integer> d1 = new ArrayDeque<>();
//        String[] myStr = s.split("");
//        int[] myInt = new int[myStr.length];
//        boolean answer = false;
//        for(int i=0;i<s.length();i++){
//            if(myStr[i].equals("(")){
//                myInt[i] = 0;
//            } else if (myStr[i].equals(")")) {
//                myInt[i] = 1;
//            }
//        }
//        if(myInt[0]==1 || myInt[myInt.length-1]==0){
//            answer=false;
//        }else{
//            for(int i=0; i<myInt.length;i++){
//                d1.add(myInt[i]);
//                if(myInt[i]==1){
//                    d1.poll();
//                    d1.poll();
//                }
//            }
//            if(d1.isEmpty()){
//                answer = true;
//            }else  answer = false;
//        }
//        System.out.println(answer);

//        강사님 풀이
//        String s = "()((()";
//        char[] arr=s.toCharArray();
//        int cnt = 0;
//        for(char c: arr){
//            cnt = c=='(' ? cnt+1 : cnt-1;
//            if(cnt<0) System.out.println(false);;
//        }
//        System.out.println(cnt==0);;
    }
}
