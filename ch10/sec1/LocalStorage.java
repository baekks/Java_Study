package sec1;

// 자식클래스 extends 부모클래스
// 자식클래스 implements 인터페이스
// 자식인터페이스 extends 부모인터페이스
// implements: 구현하다, 구체화하다. => 동작 내용을 기술하라.
public class LocalStorage  implements FileStorage {

    // byte[] => String
    @Override
    public void save(String filename, byte[] data) {
        System.out.println("로컬 디스크에 파일 저장: "+filename);
        System.out.print("\n파일 내용 ");
        for (byte d:data) {
            System.out.print(d);
        }
        System.out.println();
    }
}
