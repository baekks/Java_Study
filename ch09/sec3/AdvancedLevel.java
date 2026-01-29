package sec3;

public class AdvancedLevel extends PlayerLevel {
    @Override
    protected void run() {
        System.out.println("달리기 속도 30");
    }

    @Override
    protected void jump() {
        System.out.println("점프 성공 50%");
    }

    @Override
    protected void turn() {
        System.out.println("턴 성공 50%");
    }

    @Override
    protected void showLevelMessage() {
        System.out.println("나는 고여감");
    }
}
