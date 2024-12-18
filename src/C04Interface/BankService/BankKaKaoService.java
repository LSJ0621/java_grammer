package C04Interface.BankService;

public class BankKaKaoService implements BankService{
    @Override
    public void deposit(int money, BankAccount ba) {
        int updateBalance = ba.getBalance()+money;
        ba.updateBalance(updateBalance);
        System.out.println(money+"원 카카오페이로 입금되었습니다.");
        System.out.println("현재 잔액은 "+updateBalance+"원 입니다.");
    }

    @Override
    public void withdraw(int money, BankAccount ba) {
        int updateBalance = ba.getBalance()-money;
        ba.updateBalance(updateBalance);
        System.out.println(money+"원 카카오페이로 출금되었습니다.");
        System.out.println("현재 잔액은 "+updateBalance+"원 입니다.");
    }
}
