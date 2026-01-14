package homework;

/*
    5층 건물이 있습니다. 1층은 약국, 2층은 정형외과, 3층은 피부과, 4층은 치과, 5층은 헬스 클럽인다.
    건물의 층을 누르면 그 층이 어떤 곳인지 알려 주는 엘리베이터가 있다고 할 때, 104쪽 예제를 참고해서 switch-case문으로 구현해 보세요
    (5인 경우 '5층 헬스 클럽입니다'라고 출력
 */
public class Q4_10 {
    public static void main(String[] args) {
        String floor = "5층";

        String message = switch(floor) {
            case "1층" -> "약국";
            case "2층" -> "정형외과";
            case "3층" -> "피부과";
            case "4층" -> "치과";
            case "5층" -> "헬스클럽";
            default -> "없는 층";
        };
        System.out.println(message+"입니다.");
    }    
}
