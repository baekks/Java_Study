package question;

public class Q7 {
    public static void main(String[] args) {
        CardCompany com1 = CardCompany.getCompany();
        com1.setCardName("삼성");
        com1.setName("김기태");

        CardCompany com2 = CardCompany.getCompany();
        com2.setCardName("신한");
        com2.setName("안민수");

        com1.info();
        com2.info();
        if(com1==com2) {
            System.out.println("같은 객체입니다.");
        } else {
            System.out.println("다른 객체입니다.");
        }
    }
}
class CardCompany {
    private static CardCompany company;
    private static int no = 0;
    private int cardNo;
    private String cardName;
    private String name;

    private CardCompany() {
        no++;
        this.cardNo = no;
    }

    public static CardCompany getCompany() {
        if(company==null) {
            company = new CardCompany();
        }
        return company;
    }

    public static void setCompany(CardCompany company) {
        CardCompany.company = company;
    }

    public int getCardNo() {
        return cardNo;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void info(){
        System.out.println(name+"님의 "+cardName+"카드의 번호는 "+cardNo+"입니다.");
    }
}