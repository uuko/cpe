import java.util.Scanner;

/**
 * https://zerojudge.tw/ShowProblem?problemid=e513
 * 內容
 * 現在給你一個正方形矩陣M。
 * M矩陣的元素為Mij：{0 < i < n，0 < j < n}。
 * 在這個問題中，您必須找出給定的矩陣是否對稱(symmetric)。
 *
 * 定義：對稱矩陣所有元素都是非負的並且相對於該矩陣的中心對稱。
 * 任何其他矩陣都被認為是非對稱的。
 *
 * 你要做的就是判斷這個矩陣是否對稱。
 * 矩陣內的元素範圍為-2^32 <= Mij <= 2^32  且 0 < n <= 100。
 *
 * 輸入說明
 * 輸入的第一行包含一個數字T (T <= 300)，代表測資的數量。
 * 每組測試資料的第一行包含兩個字元一個整數n，n代表這個正方矩陣的維度。
 * 接下來的n行即為這個矩陣內的元素數值。
 * 每一列i有n個數字，第i列的第j個數字即是Mij。
 *
 * 輸出說明
 * 對每一筆測試資料輸出一行"Test #t: S"，t為第幾筆測試資料的編號，S為答案字串。
 * 如果輸入的矩陣是對稱矩陣，S = "Symmetric"。
 * 如果輸入的矩陣不是對稱矩陣，S = "Non-symmetric"。
 *
 * 範例輸入 #1
 * 2
 * N = 3
 * 5 1 3
 * 2 0 2
 * 3 1 5
 * N = 3
 * 5 1 3
 * 2 0 2
 * 0 1 5
 * 範例輸出 #1
 * Test #1: Symmetric.
 * Test #2: Non-symmetric.
 */
public class C021_Uva11349 {
    public static void main(String[] args) {
//        2
//N = 3
//5 1 3
//2 0 2
//3 1 5
        //5 1 3 2 0 2 3 1 5
//N = 3
//5 1 3
//2 0 2
//0 1 5
//範例輸出 #1
//Test #1: Symmetric.
//Test #2: Non-symmetric.
        Scanner scanner=new Scanner(System.in);
        int cases=scanner.nextInt();
        for (int z=0;z<cases;z++){
            String temp1=scanner.next(),temp2=scanner.next();
            int size=scanner.nextInt();
            long arr[]=new long[size*size];
            for (int j=0;j<size*size;j++){
                arr[j]=Long.parseLong(scanner.next());
            }
            boolean flag=true;
            for (int i=0;i<size*size;i++){
                if(arr[i]<0 || (arr[i]!=arr[size*size-1-i])){
                    flag=false;
                    break;
                }
            }
            //結果輸出。
            if(flag) System.out.println("Test #"+(z+1)+": Symmetric.");
            else System.out.println("Test #"+(z+1)+": Non-symmetric.");
        }

    }
}
