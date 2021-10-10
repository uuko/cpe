import java.util.Scanner;
/**
 * https://zerojudge.tw/ShowProblem?problemid=c813
 * 內容
 * 對於所有正整數 n ，我們定義一函數 f(n) 為 n  的每一個十進位數字的總和，若再把 f(n) 代入函數中可得最到 n,f(n),f(f(n)),f(f(f(n)))… 最後得到僅有一位數字的值，並定義該值為 g(n) 。
 *
 * 例如，當  n=1234567892 ，則：
 *
 *  f(n)=1+2+3+4+5+6+7+8+9+2=47
 *  f(f(n))=4+7=11
 *  f(f(f(n)))=1+1=2
 *
 *
 * 所以， g(1234567892)=2 。
 *
 *
 *
 * 輸入說明
 * 輸入的每一行會有一個正整數 n ，其值最大到 2×109 ，你必須輸出 g(n) 。輸入是以 0 值做為結束，該值不需要輸出。
 *
 * 輸出說明
 * 如輸入所述。
 *
 * 範例輸入 #1
 * 2
 * 11
 * 47
 * 1234567892
 * 0
 * 範例輸出 #1
 * 2
 * 2
 * 2
 * 2
 *
 *
 * */
public class C010_Uva11332 {
    public static void main(String[] args) {
        /**
         * 範例輸入 #1
         * 2
         * 11
         * 47
         * 1234567892
         * 0
         * 範例輸出 #1
         * 2
         * 2
         * 2
         * 2
         */

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.next();
            if (input.equals("0")) break;
            int num = 0;
            while (input.length() != 1) {
                for (int i = 0; i < input.length(); i++) {
                    num = input.charAt(i)-'0' + num;
                }
                input = String.valueOf(num);
                num = 0;
            }
            System.out.println(input);
        }
    }
}
