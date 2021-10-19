import java.util.Scanner;
//在小學時我們都做過加法的運算，就是把2個整數靠右對齊然後，由右至左一位一位相加。
// 如果相加的結果大於等於10就有進位（carry）的情況出現。你的任務就是要判斷2個整數相加時產生了幾次進位的情況。這將幫助小學老師分析加法題目的難度。
//
//        輸入說明
//        每一列測試資料有2個正整數，長度均小於10位。最後一列有2個0代表輸入結束。
//
//        輸出說明
//        每列測試資料輸出該2數相加時產生多少次進位，請參考Sample Output。注意進位超過1次時operation有加s
//
//        範例輸入 #1
//        123 456
//        555 555
//        123 594
//        0 0
//        範例輸出 #1
//        No carry operation.
//        3 carry operations.
//        1 carry operation.
public class C003_UVa10035 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int firstInput=scanner.nextInt();
            int secondInput=scanner.nextInt();

            if (firstInput==0 && secondInput==0)break;
            int next=0;
            int carry=0;
            //用OR考慮最高位
            while (firstInput!=0 || secondInput!=0){
                if (firstInput%10 + secondInput%10 +next>=10){
                    next=1;
                    carry++;
                }
                else {
                    next=0;
                }
                firstInput=firstInput/10;
                secondInput=secondInput/10;
            }

            if (carry==0){
                System.out.println("No carry operation.");
            }
            else {
                if (carry == 1)
                    System.out.println("1 carry operation.");
                else
                    System.out.println(carry + " carry operations.");
            }
        }




    }
}
