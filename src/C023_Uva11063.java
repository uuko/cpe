import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//內容 ：
//https://sites.google.com/site/zsgititit/home/c-cheng-shi-she-ji/d123-acm-11063-b2-sequence
//        所謂「B2數列」係指一正整數數列 1<= b1 < b2 < b3 ...，其中所有的 bi + bj （i <= j）皆不相等。
//
//        您的任務是判別某一數列是否為「B2數列」。
//        輸入說明 ：
//        每筆測試資料有兩行，第一行代表該數列有 N 個數值（2 ≤ N ≤ 100），第二行則為該數列的N個數值。每個數值 bi 皆為整數，且 bi ≤ 10000。
//        輸出說明 ：
//        每筆測試資料以一行輸出，且每筆輸出資料後均需輸出一空白行。格式請參考輸出範例。
//        範例輸入 ：
//
//        4
//        1 2 4 8
//        4
//        3 7 10 14
//        5
//        13 14 15 16 17
//        範例輸出 ：
//
//        Case #1: It is a B2-Sequence.
//
//        Case #2: It is not a B2-Sequence.
//
//        Case #3: It is not a B2-Sequence.
public class C023_Uva11063 {
    public static void main(String[] args) {
//
        Scanner scanner=new Scanner(System.in);
        int count=1;
        while (scanner.hasNextInt()){
            int size=scanner.nextInt();
            int arr[]=new int[size];

            for (int i=0;i<size;i++){
                arr[i]=scanner.nextInt();
            }
            boolean flag=true;
            if(arr[0]<1) flag=false;
            for(int i=1;i<size;i++) if(arr[i-1]>arr[i]) flag=false;
            List<Integer> integerList=new ArrayList<>();

            for (int i=0;i<size;i++){
                if (!flag)break;
                for (int j=i;j<size;j++){
                    int temp=arr[i]+arr[j];
                    if (!integerList.contains(temp)){
                        integerList.add(temp);
                    }
                    else {
                        flag=false;
                        break;
                    }
                }
            }
            if(flag) System.out.println("Case #"+count+": It is a B2-Sequence.");
            else System.out.println("Case #"+count+": It is not a B2-Sequence.");
            System.out.println("");
            count++;
        }
    }
}
