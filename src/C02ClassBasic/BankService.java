package C02ClassBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        프로그램은 항상 실행될 수 있도록 전체코드를 while(true)처리
//        서비스 번호를 입력하세요. 1.개설, 2.조회, 3.입금, 4.출금, 5.송금
//        1. 개설 : 계좌번호와 현재가지고 계신 돈을 입력하세요.
        
//        2. 조회 : 계좌 조회 서비스입니다. 계좌번호를 입력해주세요. ->잔고출력

//        3. 입금 : 계좌 입금서비스입니다. 계좌번호와 입금금액을 입력해주세요.

//        4. 출금 : 계좌 출금서비스입니다. 계좌번호와 출금금액을 입력해주세요.

//        5. 송금 : 송금서비스입니다. user1과 user2의 계좌번호와 송금금액을 입력해주세요.
        Map<String,BankAccount> map = new HashMap<>();
        while (true) {
            System.out.println("서비스 번호를 입력하세요");
            int service = Integer.parseInt(br.readLine());
            if(service==1){
                System.out.println("계좌번호와 현재가지고 계신 돈을 입력하세요.");
                String str[] = br.readLine().split(" ");
                if(map.containsKey(str[0])){
                    System.out.println("등록되어 있는 계좌입니다.");
                }else{
                    BankAccount ba = new BankAccount(str[0], Integer.parseInt(str[1]));
                    map.put(ba.getAcNumber(), ba);
                }
            }
            if(service==2){
                System.out.println("계좌 조회 서비스입니다. 계좌번호를 입력해주세요.");
                String str = br.readLine();
                for(BankAccount a : BankAccount.myList){
                    if(a.getAcNumber()==str){
                        System.out.println(a.getBalance());
                    }else{
                        System.out.println("다시 입력해주세요");
                    }
                }
//                if(map.containsKey(str)){
//                    System.out.println(map.get(str).getBalance());
//                }else{
//                    System.out.println("등록되어 있지 않은 계좌입니다.");
//                }
            }
            if(service==3){
                System.out.println("계좌 입금서비스입니다. 계좌번호와 입금금액을 입력해주세요.");
                String[] str = br.readLine().split(" ");
//                if(map.containsKey(str[0])){
//                    BankAccount myAccount = map.get(str[0]);
//                    myAccount.setBalance(myAccount.getBalance()+Integer.parseInt(str[1]));
//                    System.out.println(myAccount.getBalance());
//                }else{
//                    System.out.println("계좌번호를 다시 입력해주십시오.");
//                }
                BankAccount ba = map.get(str[0]);
                ba.deposit(Integer.parseInt(str[1]));
            }

            if(service==4){
                System.out.println("계좌 출금서비스입니다. 계좌번호와 출금금액을 입력해주세요.");
                String[] str = br.readLine().split(" ");
                int money = Integer.parseInt(str[1]);
//                if(map.containsKey(str[0])){
//                    BankAccount myAccount = map.get(str[0]);
//                    if(myAccount.getBalance()>=money){
//                        myAccount.setBalance(myAccount.getBalance()-money);
//                        System.out.println(myAccount.getBalance());
//                    }else{
//                        System.out.println("예금 금액보다 많습니다.");
//                    }
//                }
                BankAccount ba = map.get(str[0]);
                ba.withdrawer(money);
            }
            
            if(service==5){
                System.out.println("송금서비스입니다. user1과 user2의 계좌번호와 송금금액을 입력해주세요.");
                String[] str = br.readLine().split(" ");
                String user1_Account = str[0];
                String user2_Account = str[1];
                int money = Integer.parseInt(str[2]);
                int user1_balance = map.get(user1_Account).getBalance();
                int user2_balance = map.get(user2_Account).getBalance();
//                if(user1_balance>=money){
//                    map.get(user1_Account).setBalance(user1_balance-money);
//                    map.get(user2_Account).setBalance(user2_balance+money);
//                    System.out.println(map.get(user1_Account).getBalance());
//                    System.out.println(map.get(user2_Account).getBalance());
//                } else if (user1_balance<money) {
//                    System.out.println("잔액이 부족합니다");
//                } else if (!map.containsKey(user1_Account)) {
//                    System.out.println("user1 계좌정보가 없습니다");
//                } else if (!map.containsKey(user2_Account)) {
//                    System.out.println("user2 계좌정보가 없습니다");
//                }
                BankAccount ba1 = map.get(user1_Account);
                BankAccount ba2 = map.get(user2_Account);
                ba1.transfer(ba2,money);

            }
            if(service==0){
                break;
            }
            if(!(service==0 || service>0&&service<6)){
                System.out.println("잘못된 입력입니다. 다시 입력해주세요");
            }
        }
    }
}
// Account 객체 : 자체 ID(자동 increment), 계좌번호, 잔액 변수로 구성
class BankAccount{
    private String acNumber;
    private  int balance;
    static int id = 1;
    static public List<BankAccount> myList = new ArrayList<>();

    public BankAccount(String acNumber, int balance) {
        this.acNumber = acNumber;
        this.balance = balance;
        int user_id = id;
        id++;
        myList.add(this);
    }

    public void deposit(int money){
        this.balance +=money;
    }

    public void transfer(BankAccount yourBankacount,int money){
        if(!this.withdrawer(money)){
            return;
        }
        yourBankacount.deposit(money);
    }

    public boolean withdrawer(int money){
        if(this.balance<money){
            System.out.println("잔액부족입니다.");
            return false;
        }else{
            this.balance-=money;
            return true;
        }
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public String getAcNumber() {
        return acNumber;
    }
}


//강사님 코드
//public class BankService {
//    public static void main(String[] args) {
////        프로그램은 항상 실행될수 있도록 전체코드를 while(true)처리
////        서비스번호를 입력하세요. 1.개설 2.조회 3.입금 4.출금 5.송금
////        1.개설 : 계좌번호와 현재가지고 계신돈을 입력하세요.
////        2.조회 : 계좌조회서비스입니다. 계좌번호를 입력해주세요. -> 잔고출력
////        3.입금 : 계좌입금서비스입니다. 계좌번호와 입금금액을 입력해주세요.
////        4.출금 : 계좌출금서비스입니다. 계좌번호와 출금금액을 입력해주세요.(잔액검증)
////        5.송금 : 송금서비스입니다. user1과 user2의 송금금액을 입력해주세요.(잔액검증)
//        Map<String, BankAccount> map = new HashMap<>();
//        while (true){
//            Scanner sc = new Scanner(System.in);
//            System.out.println("서비스 번호를 입력해주세요. 1.개설 2.조회 3.입금 4.출금 5.송금");
//            String input = sc.nextLine();
//            if(input.equals("1")){
//                System.out.println("계좌번호를 입력해주세요");
//                String accountNumber = sc.nextLine();
//                System.out.println("계좌금액을 입력해주세요");
//                int money = Integer.parseInt(sc.nextLine());
//                BankAccount ba = new BankAccount(accountNumber, money);
//                map.put(accountNumber, ba);
//            }else if(input.equals("2")){
//                System.out.println("조회입니다. 계좌번호를 입력해주세요");
//                String accountNumber = sc.nextLine();
//                BankAccount ba = map.get(accountNumber);
//                System.out.println("현재 잔고는 "+ba.getBalance());
//            }else if(input.equals("3")){
//                System.out.println("입금입니다. 계좌번호를 입력해주세요");
//                String accountNumber = sc.nextLine();
//                System.out.println("입금금액을 입력해주세요");
//                int money = Integer.parseInt(sc.nextLine());
//                BankAccount ba = map.get(accountNumber);
//                ba.deposit(money);
//            }else if(input.equals("4")){
//                System.out.println("출금입니다. 계좌번호를 입력해주세요");
//                String accountNumber = sc.nextLine();
//                System.out.println("출금금액을 입력해주세요");
//                int money = Integer.parseInt(sc.nextLine());
//                BankAccount ba = map.get(accountNumber);
//                ba.withdraw(money);
//            }else if(input.equals("5")){
//                System.out.println("송금입니다. 본인계좌번호를 입력해주세요");
//                String accountNumber1 = sc.nextLine();
//                System.out.println("상대방계좌번호를 입력해주세요");
//                String accountNumber2 = sc.nextLine();
//                System.out.println("송금금액을 입력해주세요");
//                int money = Integer.parseInt(sc.nextLine());
//                BankAccount ba1 = map.get(accountNumber1);
//                BankAccount ba2 = map.get(accountNumber2);
//                ba1.transfer(ba2, money);
//            }else {
//                System.out.println("잘못 입력하셨습니다.");
//            }
//        }
//    }
//}
////Account객체 : 자체ID값(자동 increment), 계좌번호, 잔액 변수로 구성
//class BankAccount{
//    static long static_id = 0L;
//    private long id;
//    private String accountNumber;
//    private int balance;
//
//    public BankAccount(String accountNumber, int balance) {
//        static_id++;
//        this.id = static_id;
//        this.accountNumber = accountNumber;
//        this.balance = balance;
//    }
//    public void transfer(BankAccount yourBankacount, int money){
//        if(!this.withdraw(money)){
////            void에서 return을 만나면 메서드는 강제 종료
//            return;
//        };
//        yourBankacount.deposit(money);
//    }
//    public void deposit(int money){
//        this.balance += money;
//    }
//    public boolean withdraw(int money){
//        if(this.balance < money){
//            System.out.println("잔액 부족입니다");
//            return false;
//        }else {
//            this.balance -= money;
//            return true;
//        }
//    }
//    public long getId() {
//        return id;
//    }
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//    public int getBalance() {
//        return balance;
//    }
//}