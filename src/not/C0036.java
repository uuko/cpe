package not;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Scanner;

/***
 *
 * 內容
 * 給定一個字元矩形，您必須找出最大正方形的邊的長度。
 * 在其中正方形內的所有字元皆相同，並且正方形的中心(兩個對角線的交點)位於位置(r, c)。
 * 矩形的高度和寬度分別為M和N。矩形的左上角座標為(0, 0)，右下角座標為(M-1, N-1)。
 *
 * 比方說下面給出的字元矩形。給定中心位置(1, 2)，此最大正方形邊長為3。
 *
 * abbbaaaaaa
 * abbbaaaaaa
 * abbbaaaaaa
 * aaaaaaaaaa
 * aaaaaaaaaa
 * aaccaaaaaa
 * aaccaaaaaa
 *
 * 輸入說明
 * 輸入第一行為一個整數T (T < 21)，T代表有幾組測資。
 * 每組測資的第一行包含三個整數M，N (1 <= M, N <= 100)，Q (Q < 21)。
 * 其中M，N表示矩形的高度和寬度，Q代表詢問的數量。
 * 接下來M行每行N個字元，代表輸入的字元矩形。
 * 接下來Q行，每行包含兩個整數r和c。
 *
 * 輸出說明
 * 對於每組測資。
 * 第一行輸出M，N，Q值，以空格分開。
 * 接下來Q行，輸出以(r, c)當中心所對應的最大正方形邊長。
 *
 * 範例輸入 #1
 * 1
 * 7 10 4
 * abbbaaaaaa
 * abbbaaaaaa
 * abbbaaaaaa
 * aaaaaaaaaa
 * aaaaaaaaaa
 * aaccaaaaaa
 * aaccaaaaaa
 * 1 2
 * 2 4
 * 4 6
 * 5 2
 * 範例輸出 #1
 * 7 10 4
 * 3
 * 1
 * 5
 * 1
 *
 */

public class C0036 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();
        for (int CaseCount = 0; CaseCount < cases; CaseCount++) {
            int m = sc.nextInt(), n = sc.nextInt(), q = sc.nextInt();
            char grid[][] = new char[m][n]; //存放字元。
            for (int i = 0; i < m; i++) {
                String temp = sc.next();
                for (int j = 0; j < n; j++) {
                    grid[i][j] = temp.charAt(j);
                }
            }

            //Output
            System.out.println(m + " " + n + " " + q);
            while ((q--) > 0) {
                int m2 = sc.nextInt(), n2 = sc.nextInt();
                char cmp = grid[m2][n2]; //需要比較的字元(原點)。

                //以原點為中心，比較四周是否跟原點相同。
                int i;
                for (i = 0; i < m; i++) {
                    boolean flag = true;
                    for (int j = m2 - i; j <= m2 + i && flag; j++) {
                        for (int k = n2 - i; k <= n2 + i; k++) {
                            if (j < 0 || k < 0 || j >= m || k >= n || cmp != grid[j][k]) {
                                flag = false;
                                break;
                            }
                        }
                    }
                    if (!flag) break;
                }
                System.out.println(i * 2 - 1);
            }
        }
    }
}
