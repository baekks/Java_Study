package QnA;

public class Q5_6  {
    public static void main(String[] args) {
        MyDate date = new MyDate();
        date.month = 2;
        date.day = 31;
        date.year = 2018;

        MyDate d1 = new MyDate(30, 2, 2000);
        System.out.println(d1  + d1.isValid());
        MyDate d2 = new MyDate(2, 10, 2006);
        System.out.println(d2 + d2.isValid());
    }
}
class MyDate {
    public int day;
    public int month;
    public int year;

    public MyDate() {
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    public String isValid() {
        if (this.month>=1 && this.month<=12 && this.day >=1 && this.day <= 31) {
            return "유효한 날짜입니다.";
        } else {
            return "유요하지 않은 날짜입니다.";
        }
    }
}
