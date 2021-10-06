import java.util.Arrays;
import java.util.Scanner;
/**題目內容
        有n個整數的序列我們稱為jolly jumper，如果相鄰的2個數其差的絕對值恰好為1到n-1。例如：
        1 4 2 3
        就是jolly jumper（n=4）。因為相鄰2數的差的絕對值為3,2,1，就是1到n-1。但是
        1 4 2 -1 6
        不是jolly jumper（n=5）。因為相鄰2數的差的絕對值為3,2,3,7，並非1到n-1。

        你的任務是寫一個程式來判斷一個整數序列是否為jolly jumper。


        輸入說明:
        每組測試資料一列，第一個正整數為 n（n < 3000），代表此整數序列的長度。接下來有n個整數，代表此整數序列。請參考Sample Input。

        輸出說明:
        對每一組測試資料，輸出此整數序列是否為jolly jumper。請參考Sample Output。

        Sample Input
        4 1 4 2 3
        5 1 4 2 -1 6
        Sample Output
        Jolly
        Not jolly
 **/
public class CPE015_Uva10038 {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            //4
            int size=scanner.nextInt();

            //1 4 2 3
            int arr[]=new int[size];
            for (int i=0;i<size;i++){
                arr[i]=scanner.nextInt();
            }
            //3 2 1
            int arrX[]=new int[size-1];
            for (int i=0;i<arr.length-1;i++){
                arrX[i]=Math.abs(arr[i]-arr[i+1]);
            }

            Arrays.sort(arrX);
            boolean answer=true;
            //3
            for (int i=0;i<arrX.length;i++){
                if (arrX[i]!=i+1){answer=false; break;}
            }

            if (answer)System.out.println("Jolly");
            else System.out.println("Not jolly");
        }
    }
}
