package not;

import java.util.Scanner;

/**
 * 題目概要：
 * <p>
 * 如果是9的倍數，請找出degree為多少。
 * <p>
 * 解題方向：
 * <p>
 * 1. 輸入的數字有1000位數，所以無法用數字處理，需要用字串。
 * <p>
 * 2. 設輸入數字為999，則degree為2。
 * <p>
 * (1)9+9+9=27
 * <p>
 * (2)2+7=9
 * <p>
 * 內容
 * 我們知道要怎麼確定一個整數是不是 9 的倍數－如果它每位數的總和是9的倍數，那它就是9的倍數。這種檢驗的方法其實是一種遞迴的方法，而且我們把這種方法遞迴的深度稱作 N 的 9-degree 。
 * <p>
 * 你的工作就是，給你一個正整數N，判斷他是不是9的倍數，而且如果他是9的倍數你還需要判斷它的 9-degree。
 * <p>
 * 輸入說明
 * 輸入含有多組測試資料。每組測試資料一列包含一個正數 N。
 * <p>
 * 當 N=0 時代表輸入結束；輸入的數最大可以到1000位數。
 * <p>
 * 輸出說明
 * 對於每一組測試資料，請輸出它是否是 9 的倍數及它的 9-degree。輸出格式請參考Sample Output。
 * <p>
 * 範例輸入 #1
 * 999999999999999999999
 * 9
 * 9999999999999999999999999999998
 * 837
 * 0
 * 範例輸出 #1
 * 999999999999999999999 is a multiple of 9 and has 9-degree 3.
 * 9 is a multiple of 9 and has 9-degree 1.
 * 9999999999999999999999999999998 is not a multiple of 9.
 * 837 is a multiple of 9 and has 9-degree 2.
 */

public class C0034 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String st = sc.next();

            //當輸入為0時終止程式。
            if (st.equals("0")) break;

			/*
			計算有多少degree(9倍數判斷方法：全部數字相加為9倍數)。
			Ex 999 degree=2
			1. 9+9+9=27
			2. 2+7=9
			*/
            int count = 0;
            String temp = st;
            while (true) {
                int total = 0;
                for (int i = 0; i < temp.length(); i++) {
                    total = total + temp.charAt(i) - 48;
                }

                if (total % 9 == 0) {
                    count++;
                    if (total == 9) break;
                    else temp = Integer.toString(total);

                } else {
                    break;
                }
            }

            //結果輸出。
            if (count != 0) System.out.println(st + " is a multiple of 9 and has 9-degree " + count + ".");
            else System.out.println(st + " is not a multiple of 9.");

        }
    }
}
