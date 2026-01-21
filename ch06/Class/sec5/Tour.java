package sec5;

// 싱글톤(singleton): 객체(인스턴스)를 하나만 생성 가능
public class Tour {
    private static Tour instance;       // 싱글톤 타입의 자기 자신 객체
    private String tourNo;
    private String tourName;
    private String tourLocation;
    private int tourPrice;

    // 생성자 private
    private Tour() { }

    // 특정 static getter를 호출하였을 경우 Tour의 객체를 생성하여 리턴
    public static Tour getInstance() {
        if(instance == null) {
            instance = new Tour();
        }
        return instance;
    }

    public String getTourNo() {
        return tourNo;
    }
    public void setTourNo(String tourNo) {
        this.tourNo = tourNo;
    }

    public String getTourName() {
        return tourName;
    }
    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public String getTourLocation() {
        return tourLocation;
    }
    public void setTourLocation(String tourLocation) {
        this.tourLocation = tourLocation;
    }

    public int getTourPrice() {
        return tourPrice;
    }
    public void setTourPrice(int tourPrice) {
        this.tourPrice = tourPrice;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "tourNo='" + tourNo + '\'' +
                ", tourName='" + tourName + '\'' +
                ", tourLocation='" + tourLocation + '\'' +
                ", tourPrice=" + tourPrice +
                '}';
    }
}
