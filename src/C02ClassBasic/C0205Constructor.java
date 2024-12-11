package C02ClassBasic;

public class C0205Constructor {
    public static void main(String[] args) {
//        캘린더 객체 생성후 연도 ,월 ,일 세팅(setter 사용)
        Calender c = new Calender(2024,12,11);
//        데이터에 안정성을 위해 일반적으로 setter를 사용하지 않음
//        c.setYear(2024);
//        c.setMonth(12);
//        c.setDay(11);
//        캘린더 객체출력 : "오늘은 xxx연도, xx월, xx일 입니다."(getter사용)
        String result = "오늘은 "+c.getYear()+"연도 " + c.getMonth()+"월 "+c.getDay()+"일 입니다.";
        System.out.println(result);
    }
}

//year,month,day 변수값 존재하는 클래스 , getter/setter 추가
class Calender{
    private int year;
    private int month;
    private int day;

//    생성자는 메서드의 일종으로 클래스명과 동일한 이름을 갖는 메서드
//    생성자를 통해 객체변수값들을 객체가 만들어지는 시점에 초기화(세팅)
    public Calender(int year, int month,int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

//    별도의 생성자를 만들경우, 초기(기본) 생성자는 더이상 사용할 수 없으므로 별도추가 필요
    public Calender() {

    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

}