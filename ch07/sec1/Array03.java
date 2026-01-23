package sec1;

import java.util.Scanner;

// 스캐너와 배열객체를 활용한 은행의 간단한 입출금 시스템을 구현하라
// 키보드로 작업 번호를 입력받아
// 1. 가입
// 2. 입금
// 3. 출금
// 4. 잔액조회
// 5. 종료
public class Array03 {
    public static void main(String[] args) {
        // 계좌 생성
        Account[] acc = {
                new Account("국민 1004-1004-1234", "김기태", 3000),
                new Account("농협 123-432-123456", "고문식", 50000000),
                new Account("기업 432-123-98765", "백경서", 100000000),
                new Account("신한 110-56473-192837", "김진수", 10000000)
        };
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 회원 번호 입력[0-3]: ");
        int no = sc.nextInt();
        if(no<acc.length){
            while (run) {
                System.out.println("--------- 은행 입출금 시스템 ---------");
                System.out.println("1. 조회");
                System.out.println("2. 입금");
                System.out.println("3. 출금");
                System.out.println("4-9. 종료");
                System.out.println("--------- 은행 입출금 시스템 ---------");

                int menu = sc.nextInt();
                int money = 0;

                switch (menu) {
                    case 1:         // 조회
                        System.out.println(acc[no].toString());
                        break;
                    case 2:         // 입금
                        money = sc.nextInt();
                        acc[no].deposit(money);
                        break;
                    case 3:         // 출금
                        money = sc.nextInt();
                        acc[no].withdraw(money);
                        break;
                    default:        // 종료
                        run = false;
                        System.out.println("종료합니다.");
                }
                //sc.close();
            }
        } else {
            System.out.println("존재하지 않는 계좌입니다.");
        }
    }
}
class Account {
    private String no;  // 가입
    private String owner;
    private int balance;

    public Account(String no, String owner, int balance) {
        this.no = no;
        this.owner = owner;
        this.balance = balance;
    }

    public String getNo() {
        return no;
    }
    public String getOwner() {
        return owner;
    }
    public int getBalance() {
        return balance;
    }

    public void setNo(String no) {
        this.no = no;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    // 입금
    public void deposit(int money) {
        if (money <= 0) {
            System.out.println("입금 금액은 0보다 커야 합니다.");
            return;
        }
        balance += money;
        System.out.println(money+"원이 입금되었습니다.");
    }
    // 출금
    public void withdraw(int money) {
        if (money <= 0) {
            System.out.println("출금 금액은 0보다 커야 합니다.");
            return;
        }
        if (balance < money) {
            System.out.println("잔액 부족");
            return;
        }
        balance -= money;
        System.out.println(money+"원이 출금되었습니다.");
    }

    @Override
    public String toString() {
        return "계좌정보 \n" +
                "계좌번호: " + no +
                "\n예금주: " + owner +
                "\n잔액:" + balance;
    }
}
