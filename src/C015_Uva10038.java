import java.util.Arrays;
import java.util.Scanner;
//http://zerojudge.tw/ShowProblem?problemid=d097
//內容 ：
//
//        有n個整數的序列我們稱為jolly jumper，如果相鄰的2個數其差的絕對值恰好為1到n-1。例如：
//
//        1 4 2 3
//
//        就是jolly jumper（n=4）。因為相鄰2數的差的絕對值為3,2,1，就是1到n-1。但是
//
//        1 4 2 -1 6
//
//        不是jolly jumper（n=5）。因為相鄰2數的差的絕對值為3,2,3,7，並非1到n-1。
//
//        你的任務是寫一個程式來判斷一個整數序列是否為jolly jumper。
//
//        輸入說明 ：
//        每組測試資料一列，第一個正整數為 n（n < 3000），代表此整數序列的長度。接下來有n個整數，代表此整數序列。請參考Sample Input。
//        輸出說明 ：
//        對每一組測試資料，輸出此整數序列是否為jolly jumper。請參考Sample Output。
//        範例輸入 ：
//
//        4 1 4 2 3
//        5 1 4 2 -1 6
//        範例輸出 ：
//
//        Jolly
//        Not jolly
public class C015_Uva10038 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextInt()){
            int count=scanner.nextInt();
            int [] arr=new  int[count];
            for (int i=0;i<count;i++){
                arr[i]=scanner.nextInt();
            }
            int cut[]=new int[arr.length-1];
            for (int j=0;j<arr.length-1;j++){
                cut[j]=Math.abs(arr[j]-arr[j+1]);
            }
            Arrays.sort(cut);
            boolean jully=true;
            for (int z=0;z<cut.length;z++){
                if (cut[z]!=z+1){
                    jully=false;
                    break;
                }
            }
            if(jully) System.out.println("Jolly");
            else System.out.println("Not jolly");
        }
    }
}
