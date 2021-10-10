import java.util.Scanner;

/**
 * 輸入說明
 * 輸入的第一行含有一個數字 N，代表以下有幾個數字 ( 1 ≤ N ≤ 500)。
 *
 * 接下來有 N 行，每行有一個小於 100 000 000 的正整數。數字不一定按順序出現。
 *
 * 輸出說明
 * 對於 N 個整數中的每一個整數要用下列格式輸出一行，"DEC_BASE = FIB_BASE (fib)"。DEC_BASE 原始的十進位數字而 FIB_BASE 則是它的費氏進位表示法。詳情參閱範例輸出。
 *
 * 題目概要：
 *
 * 找出某數的費氏數列，並表示成2進位。Ex 17=(100101)
 *
 * Ex 17=13+3+1
 *
 * 13	8 	5 	3 	2 	1
 * 1	0	0	1	0 	1
 * 範例輸入 #1
 * 10
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 * 範例輸出 #1
 * 1 = 1 (fib)
 * 2 = 10 (fib)
 * 3 = 100 (fib)
 * 4 = 101 (fib)
 * 5 = 1000 (fib)
 * 6 = 1001 (fib)
 * 7 = 1010 (fib)
 * 8 = 10000 (fib)
 * 9 = 10001 (fib)
 * 10 = 10010 (fib)
 */
public class C026_Uva948 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int time=scanner.nextInt();

        int fay[]=new int[50];
        int a=0;
        fay[0]=1;
        fay[1]=2;
        int realsize=0;
        for (int i=2;i<fay.length-2;i++){
            if (fay[i-2]>0 &&fay[i-1]>0){
                fay[i]=fay[i-1]+fay[i-2];
                if (fay[i]>0)realsize=i;

            }

        }

        while (--time>=0){
            a=scanner.nextInt();
            StringBuilder builder=new StringBuilder(a+" = ");
            int i=realsize;
            while (a<fay[i]){
                i--;
            }

            while (i>=0){
                if (a>=fay[i]){
                    a=a-fay[i];
                    builder.append("1");
                }
                else
                    builder.append("0");
                i--;

            }
            builder.append(" (fib)");
            System.out.println(builder.toString());
        }
    }
}
