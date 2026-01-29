package sec1;

public class StorageExam {
    public static void main(String[] args) {
        FileStorage localStorage = new LocalStorage();
        FileStorage cloudStorage = new CloudStorage();

        localStorage = new CloudStorage();
        cloudStorage = new LocalStorage();

        byte[] data =  {65, 70, 79};

        localStorage.save("Report.txt", data);
        System.out.println();
        cloudStorage.save("Report.pdf", data);
    }
}
