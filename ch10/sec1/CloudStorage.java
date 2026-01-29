package sec1;

public class CloudStorage implements FileStorage {

    @Override
    public void save(String filename, byte[] data) {
        System.out.println("클라우드 스토리지 파일 이름: "+filename);
        System.out.print("\n파일 내용");
        for (byte a:data) {
            System.out.print(a);
        }
        System.out.println();
    }
}
