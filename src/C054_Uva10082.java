import java.util.Map;
import java.util.Scanner;
//
//打字時一個常見的錯誤就是沒有把手放在正確位置
// ，而是偏右邊一個位置。所以會發生Q被打成W
// ，J被打成K等等的情況。你的任務就是要把打錯的字修正回來。
//
//        輸入說明
//        輸入包含許多列，每列可能包含有數字，空白字元，大寫英文字母（Q、A、Z除外），標點符號（`除外）。
//範例輸入 #1
//        O S, GOMR YPFSU/
//        URD. ,U [JPMR MI,NRT OD 8346333
//        範例輸出 #1
//        I AM FINE TODAY.
//        YES, MY PHONE NUMBER IS 7235222
public class C054_Uva10082 {
    public static void main(String[] args) {
        //12+11+10+9 43
        Scanner scanner = new Scanner(System.in);
        String table = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
//                    System.out.print(" ");
                    ans.append(" ");
                }
                for (int j = 0; j < table.length(); j++) {
                    if (input.charAt(i) == table.charAt(j)) {
                        ans.append(table.charAt(j-1));
//                        System.out.print(table.charAt(j-1));
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
