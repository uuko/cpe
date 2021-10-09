import java.util.*;
/*https://zerojudge.tw/ShowProblem?problemid=d235
* 內容
你的任務是，給你一個正整數 N，判定它是否是 11 的倍數。

輸入說明
每列資料有一個正整數N，N 最大可能到 1000 位數。

若 N = 0 代表輸入結束

輸出說明
對每個輸入的數，輸出是否為 11 的倍數。輸出格式請參考 Sample Output。

範例輸入 #1
112233
30800
2937
323455693
5038297
112234
0
範例輸出 #1
112233 is a multiple of 11.
30800 is a multiple of 11.
2937 is a multiple of 11.
323455693 is a multiple of 11.
5038297 is a multiple of 11.
112234 is not a multiple of 11.
*
* */
public class C005_Uva10929 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String input=scanner.nextLine();

            if (input.equals("0"))break;

            int odd=0; int even=0;

            for (int i=0;i<input.length();i++){
                if (i%2==0)even=even+input.charAt(i)-'0';
                else  odd=odd+input.charAt(i)-48;
            }

            if((odd-even)%11==0)
                System.out.println(input+" is a multiple of 11.");
            else
                System.out.println(input+" is not a multiple of 11.");
        }
    }
}
