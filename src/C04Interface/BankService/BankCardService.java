package C04Interface.BankService;

public class BankCardService implements BankService{
    @Override
    public void deposit(int money, BankAccount ba) {
        int updateBalance = ba.getBalance()+money;
        ba.updateBalance(updateBalance);
        System.out.println(money+"원 카드로 입금되었습니다.");
        System.out.println("현재 잔액은 "+updateBalance+"원 입니다.");
    }

    @Override
    public void withdraw(int money, BankAccount ba) {
        if(ba.getBalance()<money){
            System.out.println("잔액 부족입니다");
        }else{
            int updateBalance = ba.getBalance()-money;
            ba.updateBalance(updateBalance);
            System.out.println(money+"원 카드로 출금되었습니다.");
            System.out.println("현재 잔액은 "+updateBalance+"원 입니다.");
        }
    }

}
