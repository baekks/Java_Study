package sec2;

public class MiddleSchool extends ElementarySchool{
    private int partNum;
    private String uniform;


    public int getPartNum() {
        return partNum;
    }

    public void setPartNum(int partNum) {
        this.partNum = partNum;
    }

    public String getUniform() {
        return uniform;
    }

    public void setUniform(String uniform) {
        this.uniform = uniform;
    }

    @Override
    public String toString() {
        return "MiddleSchool{" +
                "과목수=" + partNum +
                ", 교복='" + uniform + '\'' +
                '}';
    }
}
