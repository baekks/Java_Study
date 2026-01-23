package sec1;
//배열(Array): 기억장소(변수)에 하나만 기억하는 독립기억장소가 아닌 여러 개를 저장할 목적으로 사용하는 복수 개의 저장소
public class Array01 {
    public static void main(String[] args){
        int su1=90, su2=100, su3=80, su4=70;  //1~100(Primitive Type)
        //int hap = su1 + su2 + su3 + su4 ....... +su100
        int tot = 0, cnt = 0;

        //참조형(Reference Type)
        int[] su = {90, 100, 80, 70};   //선언과 초기화 동시에
        //       su[0] su[1] su[2] su[3]
        for(int i=0;i<4;i++){
            //tot+=su?;  독립기억장소는 반복처리가 불가
            cnt++;
            tot+=su[i];     //0~3
        }
        System.out.println(su);
        System.out.println("개수: "+cnt);
        System.out.println("개수2: "+su.length);
        System.out.println("합계: "+tot); //tot에 340이 bound되었다.

        int no[] = new int[10]; //no[0]~no[9]  선언 및 할당;
        //int[] no = new int[10];
        //int[] no = { 100,.....,90 };

        int[] num;      //선언
        num = new int[10];  //할당 num[0] ~ num[9] => index:0~9
        //num[10] = 100;  //요소 추가 num[10] => size mismatch 발생 => Index out of bounds

        int[] ara;      //선언
        ara = new int[] {10,20,30}; //가변 할당 및 초기화
        //ara[3] = 100;   //요소 추가 - Index out of Memory
    }
}