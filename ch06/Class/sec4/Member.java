package sec4;

public class Member {
    // 멤버 변수, static 변수, 매게 변수, 지역 변수
    // static 변수 = 회원수
    private static int memberCount = 0;

    // 멤버 변수(인스턴스 변수) - 회원아이디, 회원명, 나이
    private String memberId;
    private String memberName;
    private int memberAge;

    // 생성자 - static 변수를 제외한 풀 생성자하되 객체가 생성될 때마다 회원수 증가
    public Member(String memberId, String memberName, int memberAge) {
        // 매개변수는 유효 범위가 함수나 메서드 내부
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberAge = memberAge;
        memberCount++;
    }

    // 모든 멤버 변수와 static 변수의 게터
    public static int getMemberCount() {
        return memberCount;
    }
    public String getMemberId() {
        return memberId;
    }
    public String getMemberName() {
        return memberName;
    }
    public int getMemberAge() {
        return memberAge;
    }

    // 회원 정보 출력 (toString)
    public void toString1() {
        // 지역 변수: info - 해당 함수 또는 메서드 내부에서만 유효함
        String info = "회원아이디: " + this.memberId
                + "\n회원이름: " + this.memberName
                + "\n회원나이: " + this.memberAge;
        System.out.println(info);
    }
}
