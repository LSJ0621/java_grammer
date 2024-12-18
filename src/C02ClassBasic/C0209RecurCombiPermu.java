package C02ClassBasic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class C0209RecurCombiPermu {
    public static void main(String[] args) {
//        숫자가 1,2,3,4가 있을때
//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);
////        myList로 만들수 있는 2개짜리 숫자조합을 출력 이중 리스트에 담아서 출력
//        List<List<Integer>> answer = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//
////        1,2,1,3,1,4,2,3,2,4,3,4
////        다시한번 보자!
//
//        for(int i=0;i<myList.size();i++){
//            temp.add(myList.get(i));
//            for (int j=i+1;j<myList.size();j++){
//                temp.add(myList.get(j));
//                answer.add(new ArrayList<>(temp));
//                temp.remove(temp.size()-1);
//            }
//            temp.remove(temp.size()-1);
//        }
//        System.out.println(answer);

//        재귀함수 호출을 통한 조합리스트 만들기
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
//combi(answer,temp,myList,3,0);
        permu(answer,temp,myList,2,new boolean[myList.size()]);
        System.out.println(answer);
    }
//    N과 M(1) :백준
//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    String[] str = br.readLine().split(" ");
//    int N = Integer.parseInt(str[0]);
//    int M = Integer.parseInt(str[1]);
//
//    List<Integer> myList = new ArrayList<>();
//    List<List<Integer>> answer = new ArrayList<>();
//    List<Integer> temp = new ArrayList<>();
//
//        for(int i =1;i<=N;i++){
//        myList.add(i);
//    }
//
//    boolean[] visited = new boolean[myList.size()];
//    permu(answer,temp,myList,M,visited);
//
//        for(int i=0;i<answer.size();i++){
//        if(M==1){
//            for(int j=0;j<answer.get(i).size();j++){
//                System.out.println(answer.get(i).get(j));
//            }
//        }else{
//            String answerStr = "";
//            for(int k=0;k<answer.get(i).size();k++){
//                if(k!=answer.get(i).size()-1){
//                    answerStr = answerStr+answer.get(i).get(k)+" ";
//                }else {
//                    answerStr = answerStr+answer.get(i).get(k)+",";
//                }
//            }
//            String[] answerArray = answerStr.split(",");
//            for(int j=0;j<answerArray.length;j++){
//                System.out.println(answerArray[j]);
//            }
//        }
//    }
//}
//
//public static void permu(List<List<Integer>>answer, List<Integer>temp,List<Integer>myList,int M, boolean[] visited){
//    if(temp.size()==M){
//        answer.add(new ArrayList<>(temp));
//        return;
//    }
//    for (int i=0;i<myList.size();i++){
//        if(visited[i]==false){
//            visited[i] = true;
//            temp.add(myList.get(i));
//            permu(answer, temp, myList, M,visited);
//            temp.remove(temp.size()-1);
//            visited[i] = false;
//        }
//    }
//    로또(6603) : 백준
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int count = 6;
//        while (true){
//            List<List<Integer>> answer = new ArrayList<>();
//            List<Integer> temp = new ArrayList<>();
//            List<Integer> myList = new ArrayList<>();
//            String[] str = br.readLine().split(" ");
//            if(Integer.parseInt(str[0])==0){
//                break;
//            }
//            int k = Integer.parseInt(str[0]);
//            for (int i =1;i< str.length;i++){
//                myList.add(Integer.parseInt(str[i]));
//            }
//            combi(answer,temp,myList,count,0);
//            for(int i=0; i< answer.size();i++){
//                String answerStr = "";
//                for(int j=0;j<answer.get(i).size();j++){
//                    if(j!=answer.get(i).size()-1){
//                        answerStr = answerStr+answer.get(i).get(j)+" ";
//                    }else{
//                        answerStr = answerStr+answer.get(i).get(j);
//                    }
//                }
//                System.out.println(answerStr);
//                answerStr = "";
//            }
//            System.out.println();
//        }
//    }
//    public static void combi(List<List<Integer>>answer, List<Integer>temp,List<Integer>myList, int count, int num){
//        if(temp.size()==count){
//            answer.add(new ArrayList<>(temp));
//            return;
//        }
//        for (int i=num;i<myList.size();i++){
//            temp.add(myList.get(i));
//            combi(answer, temp, myList, count,i+1);
//            temp.remove(temp.size()-1);
//        }
//    }

//    강사님 풀이
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        while(true){
//            String[] temp = br.readLine().split(" ");
//            if(temp[0].equals("0"))break;
//            int[] arr = new int[temp.length-1];
//            for(int i=1; i<temp.length; i++){
//                arr[i-1] = Integer.parseInt(temp[i]);
//            }
//            combi(arr, 0, 0, new int[6]);
//            System.out.println();
//        }
//    }
//    public static void combi(int[]arr, int depth, int start, int[] answer){
//        if(depth==6){
//            StringBuilder sb = new StringBuilder();
//            for(int a : answer){
//                sb.append(a);
//                sb.append(" ");
//            }
//            sb.deleteCharAt(sb.length()-1);
//            System.out.println(sb);
//            return;
//        }
//        for(int i=start; i<arr.length; i++){
//            answer[depth] = arr[i];
//            combi(arr, depth+1, i+1, answer);
//        }
//    }
//
//}

    public static void combi(List<List<Integer>>answer, List<Integer>temp,List<Integer>myList, int count, int num){
        if(temp.size()==count){
            answer.add(new ArrayList<>(temp));
            return;
        }
        for (int i=num;i<myList.size();i++){
            temp.add(myList.get(i));
            combi(answer, temp, myList, count,i+1);
            temp.remove(temp.size()-1);
        }
    }

    public static void permu(List<List<Integer>>answer, List<Integer>temp,List<Integer>myList, int count, boolean[] visited){
        if(temp.size()==count){
            answer.add(new ArrayList<>(temp));
            return;
        }
        for (int i=0;i<myList.size();i++){
            if(visited[i]==false){
                visited[i]=true;
                temp.add(myList.get(i));
                permu(answer, temp, myList, count,visited);
                temp.remove(temp.size()-1);
                visited[i] = false;
            }
        }
    }
}
