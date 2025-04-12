public class CheckUtils {
    //判斷是否為偶數
    public static boolean isEven(int num){
        return num%2 == 0;

    }

    //判斷是否已經成年了 (18歲以上成年)
    public static boolean isAdult(int Age) {
        return Age >= 18;
    
    }
    public static void main(String[] args) {
        System.out.println("8是偶數嗎: "+isEven(8));
        System.out.println("15是偶數嗎: "+ isEven(15));
        System.out.println("21是成人嗎: "+ isEven(21));
        System.out.println("12是成人嗎: "+ isEven(12));
    }


    
}
