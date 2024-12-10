package C01Basic;

import java.util.*;

public class C09Map {
    public static void main(String[] args) {
//        map은 index 요소가 없으므로, 순서가 무의미
//        key 값은 중복되지 않고, 만약에 동일한 key 값으로 다른 value를 덮어쓰기함.
//        Map<String,String> sports = new HashMap<>();
//        sports.put("basketball","농구");
//        sports.put("soccer", "축구");
//        sports.put("baseball", "야구");
//        System.out.println(sports);
//
////        map은 key를 통해 value를 get
////        map에서 key값을 통한 복잡도는 0(1)
//        System.out.println(sports.get("baseball"));
//
////        map의 전체 데이터 조회
////        keySet() : map의 key 목록을 리턴하는 메서드
////        values() : map의 value 목록을 리턴하는 메서드
//        for(String key: sports.keySet()){
//            System.out.println("sport의 value값은" + sports.get(key));
//        }
////        remove : 키를 통해 삭제
//        sports.remove("baseball");
//        System.out.println(sports);
//
////        putIfAbsent : key 값이 없는 경우에만 put
//        sports.put("soccer","운동");
//        sports.putIfAbsent("baseball","야구");
//        sports.putIfAbsent("baseball","축구");
//        System.out.println(sports.get("soccer"));
////        getOrDefault : key가 없으면 default 값으로 return
//        System.out.println(sports.get("pingpong"));
//        System.out.println(sports.getOrDefault("pingpong", "그런키 없음"));
//        System.out.println(sports.getOrDefault("baseball", "그런키 없음"));
//
////        containsKey: 키가 있으면 true, 없으면 false
//        System.out.println(sports.containsKey("baseball"));
//        System.out.println(sports.containsKey("pingpong"));

//        String[] arr = {"농구", "축구", "농구", "야구","축구"};
////        농구:2, 축구:2, 야구:1
//        Map<String,Integer> sports = new HashMap<>();
////        for(int i=0; i<arr.length;i++){
////            if(sports.containsKey(arr[i])){
////                sports.put(arr[i],sports.get(arr[i])+1);
////            }
////            sports.putIfAbsent(arr[i],1);
////        }
////        강사님 풀이
//        for(int i=0; i<arr.length;i++){
//           sports.put(arr[i],sports.getOrDefault(arr[i],0)+1);
//        }

//        완주하지 못한 선수
//        내 풀이
//        String[] participant = {"leo", "kiki", "eden"};
//        String[] completion = {"eden", "kiki"};
//        String[] total = new String[participant.length+ completion.length];
//        Map<String,Integer > myMap = new HashMap<>();
//        String answer = "";
//        for(int i=0;i<participant.length;i++){
//            total[i] = participant[i];
//        }
//        for(int i=0; i<completion.length;i++){
//            total[participant.length+i] = completion[i];
//        }
//        for(int i=0; i< total.length;i++){
//            myMap.put(total[i],myMap.getOrDefault(total[i],0)+1);
//        }
//        for(String a : myMap.keySet()){
//            if(myMap.get(a)%2==1){
//                answer = a;
//            }
//        }
//        System.out.println(myMap);
//        System.out.println(answer);

//        의상 - 프로그래머스
//        String[][] clothes = {{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}};
//        Map<String,Integer> myMap = new HashMap<>();
//        List<Integer>myList = new ArrayList<>();
//        int answer = 1;
//        for (int i=0; i<clothes.length; i++){
//            if(myMap.containsKey(clothes[i][1])){
//                myMap.put(clothes[i][1], myMap.get(clothes[i][1])+1);
//            }
//            myMap.putIfAbsent(clothes[i][1],2);
//        }
//        for(int a : myMap.values()){
//            myList.add(a);
//        }
//        for(int i=0; i<myList.size(); i++){
//            answer = answer*myList.get(i);
//        }
//        answer=answer-1;

//        LinkedHashMap : 데이터 삽입순서를 보장(유지)
//        Map<String,Integer> linkedMap = new LinkedHashMap<>();
//        linkedMap.put("hello5",1);
//        linkedMap.put("hello4",2);
//        linkedMap.put("hello3",3);
//        linkedMap.put("hello2",4);
//        linkedMap.put("hello1",5);
//        for (String l : linkedMap.keySet()){
//            System.out.println("Key 값은 "+l );
//        }
//        TreeMap : key를 통해 데이터를 정렬
//        Map<String,Integer> treeMap = new TreeMap<>();
//        treeMap.put("hello5",1);
//        treeMap.put("hello4",2);
//        treeMap.put("hello3",3);
//        treeMap.put("hello2",4);
//        treeMap.put("hello1",5);
//        for (String l : treeMap.keySet()){
//            System.out.println("Key 값은 "+l );
//        }

//        Hash맵을 사용해서 key으로 정렬
//        Map<String,Integer> myMap = new HashMap<>();
//        myMap.put("hello5",1);
//        myMap.put("hello4",2);
//        myMap.put("hello3",3);
//        myMap.put("hello2",4);
//        myMap.put("hello1",5);
//        List<String> myList = new ArrayList<>();
//        for(String a : myMap.keySet()){
//            myList.add(a);
//        }
//        Collections.sort(myList);
//        for (String l : myList){
//            System.out.println("Key 값은 "+l );
//            System.out.println("VALUE  값은" + myMap.get(l));
//        }
//        Collections.sort(myList, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return myMap.get(o1)-myMap.get(o2);
//            }
//        });
//        System.out.println(myList);

//        hashmap 출력방법 2가지 : 1. 강화된  for문 2.iterator
        Map<String,String> myMap = new HashMap<>();
        myMap.put("bascketball", "농구");
        myMap.put("soccer", "축구");
        myMap.put("baseball", "야구");
//        for(String a: myMap.keySet()){
//            System.out.println(a);
//        }
        Iterator<String> myIters = myMap.keySet().iterator();
//        next 메서드는 데이터를 하나씩 소모시키면서 값을 반환
        System.out.println(myIters.next());
//        hashNext는 iterator 안에 그 다음 값이 있는지 없는지 boolean return
        while (myIters.hasNext()){
            System.out.println(myIters.next());
        }
    }
}
