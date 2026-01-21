package question;

public class Q6 {
    public static void main(String[] args) {
        Card card1 = new Card("삼성", "김기태");
        Card card2 = new Card("신한", "박재웅");

        card1.info();
        card2.info();
    }
}
class Card {
    private static int no = 0;
    private int cardNo;
    private String cardName;
    private String name;

    public Card(String cardName, String name) {
        no++;
        this.cardNo = no;
        this.cardName = cardName;
        this.name = name;
    }

    public static int getNo() {
        return no;
    }

    public int getCardNo() {
        return cardNo;
    }

    public String getCardName() {
        return cardName;
    }

    public String getName() {
        return name;
    }

    public void info() {
        System.out.println(name+"님의 "+cardName+"카드의 번호는 "+cardNo+"입니다.");
    }
}