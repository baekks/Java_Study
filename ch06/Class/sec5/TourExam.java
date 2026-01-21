package sec5;

public class TourExam {
    public static void main(String[] args) {
        // Tour tour1 = new Tour();
        Tour tour1 = Tour.getInstance();
        tour1.setTourNo("Y001");
        tour1.setTourName("북유럽 8박 9일");
        tour1.setTourLocation("스웨덴, 핀란드, 덴마크, 그린란드");
        tour1.setTourPrice(8900000);
        System.out.println(tour1);

        Tour tour2 = Tour.getInstance();
        System.out.println(tour2);
        Tour tour3 = Tour.getInstance();
        System.out.println(tour3);
    }
}
