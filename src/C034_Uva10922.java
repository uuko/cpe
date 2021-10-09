import java.util.Scanner;

/**
 * https://zerojudge.tw/ShowProblem?problemid=d672
 * 內容
 * 我們知道要怎麼確定一個整數是不是 9 的倍數－如果它每位數的總和是9的倍數，那它就是9的倍數。這種檢驗的方法其實是一種遞迴的方法，而且我們把這種方法遞迴的深度稱作 N 的 9-degree 。
 *
 * 你的工作就是，給你一個正整數N，判斷他是不是9的倍數，而且如果他是9的倍數你還需要判斷它的 9-degree。
 *
 * 輸入說明
 * 輸入含有多組測試資料。每組測試資料一列包含一個正數 N。
 *
 * 當 N=0 時代表輸入結束；輸入的數最大可以到1000位數。
 *
 * 輸出說明
 * 對於每一組測試資料，請輸出它是否是 9 的倍數及它的 9-degree。輸出格式請參考Sample Output。
 *
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
public class C034_Uva10922 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();

            if(input.equals("0"))break;

            int degree = 0;
            String temp = input;
            while (true) {
                int sum = 0;
                int arr[] = new int[temp.length()];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = temp.charAt(i);
                }
                for (int j = 0; j < arr.length; j++) {
                    sum = sum + (arr[j] - '0');
                }
                if (sum % 9 == 0) {
                    degree++;
                    if (sum == 9) break;
                    else temp = Integer.toString(sum);
                }
                else {
                    break;
                }
            }

            //結果輸出。
            if (degree != 0) System.out.println(input + " is a multiple of 9 and has 9-degree " + degree + ".");
            else System.out.println(input + " is not a multiple of 9.");
        }
    }
}
