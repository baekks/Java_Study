package sec4;

import static java.security.spec.MGF1ParameterSpec.SHA256;

// 파이널 클래스: 상속 X
public final class PasswordEncryptor {
    private PasswordEncryptor() { }

    // 암호화 => 공유 변수: 객체 생성 X
    public static String encrypt(String rawPassword) {
        String encPassword = SHA256.toString(rawPassword);
        return "ENC: [" + rawPassword + "]";
    }
}
