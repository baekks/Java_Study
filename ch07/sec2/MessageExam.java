package sec2;

public class MessageExam {
    public static void main(String[] args) {
        // 메세지 배열 3건
        Message[] sms1 = new Message[3];
        sms1[0] = new Message("김기태", "흡연자들", "콧바람??");
        sms1[1] = new Message("최동윤", "고문식", "점심 머드실래요??");
        sms1[2] = new Message("전보경", "백경서", "커피 마실래요??");

        // 향상된 for문으로 출력
        for(Message m:sms1) {
            System.out.println(m.info());
        }

//        Message[] copySms1 = new Message[2];
//        copySms1 = sms1;                          // overflow가 발생 한당!

        Message[] copySms1 = new Message[3];
        copySms1 = sms1;                            // 얕은 복제

        Message[] shallow = new Message[3];
        System.arraycopy(sms1, 0, shallow, 0, 3);
        // 복제된 내용
        System.out.println("원본 주소: " + sms1);
        System.out.println("복제 주소: " + shallow);
        for(Message m:shallow) {
            System.out.println(m.info());
        }

        // 깊은 복제
        Message[] deep = new Message[sms1.length];
        for (int i=0;i<3; i++) {
            // deep[i] = sms1[i];  // 단일 객체의 주소를 단일 객체에 전달
            deep[i] = new Message(sms1[1]);
        }
        System.out.println("깊은 복제본2");
        for (Message m:deep) {
            System.out.println(m.info());
        }
    }
    // 복제:  얕은 복제
    //        깊은 복제
    // 복제:  주소 전달 (객체배열 = 객체배열)
    // 복사객체배열 = 원본객체.clone();
    // System.arraycopy(원본객체배열, 원본시작인덱스, 복사객체배열, 복사시작인덱스, 개수)
}
