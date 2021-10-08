import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
//他需要找到一個整數A(此A為密碼)，使得能夠得到以下式子的最小值。
//
//(|X1 − A| + |X2 − A| + . . . + |Xn − A|)
//
//輸入說明
//輸入包含多組測資。
//每組測資第一行為數字n (0 < n ≤ 1000000)，表示他在夢中看到了多少個數字。
//接下來有n個數字，所有數字都小於65536。
//
//輸出說明
//對於每組測資，輸出三個整數。
//第一個數字是能得到該算式最小值的A。
//第二個數字是|Xi − A|為最小值的數量。
//第三行數字是可能有幾種最小值。
public class C040_Uva10057 {
    public static void main(String[] args) {
//        範例輸入 #1
//        2
//        10
//        10
//        4
//        1
//        2
//        2
//        4
//        範例輸出 #1
//        10 2 1
//        2 2 1
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            Arrays.sort(arr);
            ;
            int a1 = 0;
            int a2 = 0;
            a1 = arr[(arr.length - 1) / 2];
            a2 = arr[(arr.length) / 2];

            int miniCount=0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] ==a1 || arr[j]==a2){
                    miniCount++;
                }
            }

            int c=a2-a1+1;

            System.out.println(a1+" "+miniCount+" "+c);
        }

    }
}
