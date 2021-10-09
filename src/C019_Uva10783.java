import java.util.Scanner;
/**
 * https://zerojudge.tw/ShowProblem?problemid=c022
 * 內容
 * 給你一個範圍 a 到 b ，請你找出 a 與 b 之間所有奇數的和。
 *
 * 例如：範圍 [3, 9] 中所有奇數的和就是 3 + 5 + 7 + 9 = 24 。
 *
 * 輸入說明
 * 輸入的第一列有一個整數 T （1≦T≦100），代表以下有多少組測試資料。 每組測試資料為兩列，包含兩個數 a 與 b （0≦a≦b≦100）。
 * 輸出說明
 * 每組測試資料輸出一列，內容為 a 及 b 間所有奇數的和。
 * 範例輸入 #1
 * 2
 * 1
 * 5
 * 3
 * 5
 * 範例輸出 #1
 * Case 1: 9
 * Case 2: 8
 *
 *
 *
 * */
public class C019_Uva10783 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        for (int i=0;i<size;i++){
            int a=scanner.nextInt();
            int b=scanner.nextInt();

            int sum=0;
            for (int j=a;j<=b;j++){
                if (j%2==1)sum=sum+j;
            }
            System.out.println("Case "+(i+1)+": "+sum);
        }
    }
}
