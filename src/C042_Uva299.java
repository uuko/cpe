import java.util.Scanner;
//內容
//在老舊的火車站，您也許會遇到少數僅存的"車箱置換員"。
//"車箱置換員"是鐵路部門的員工，主要工作就是重新排列火車車廂。
//一旦以最佳順序排列了車廂，所有火車司機要做的就是將車廂逐一卸下即可。
//"車箱置換員"源自在鐵路橋附近的車站中執行此任務的第一人。
//這座橋並不會垂直打開，而是繞著河中央的一根支柱旋轉。將橋旋轉90度後，船隻就能向左或向右駛過。
//第一位"車箱置換員"發現，這座橋最多可以在其上運行兩個車廂，通過將橋旋轉180度，車廂就能切換位置。
//(缺點是車廂面向相反的方向，但是火車車廂可以以任何一種方式移動，所以沒差）。
//現在幾乎所有的"車箱置換員"都已經淘汰了，鐵路公司希望將其操作自動化。
//你的任務就是寫一個程式，該程式要計算最少需要交換幾次兩個相鄰車廂，才能將所有車廂依序排好。
//
//輸入說明
//輸入的第一行包含一個整數N，N代表測資數量。
//每組測資的第一行包含一個整數L (0 ≤ L ≤ 50)，L代表火車的長度。
//第二行包含數字1到L的排列，表示火車車廂的當前順序。
//需要將火車車廂依照編號1到L的順序排好。
//
//輸出說明
//對於每組測資，請輸出：
//"Optimal train swapping takes S swaps."，S代表最少交換次數。
//
//範例輸入 #1
//3
//3
//1 3 2
//4
//4 3 2 1
//2
//2 1
public class C042_Uva299 {
    public static void main(String[] args) {
/**        範例輸入 #1
        3
        3
        1 3 2
        4
        4 3 2 1
        2
        2 1
//        範例輸出 #1
//        Optimal train swapping takes 1 swaps.
//                Optimal train swapping takes 6 swaps.
//                Optimal train swapping takes 1 swaps.
**/
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        while (--c >= 0) {
            int size = scanner.nextInt();
            int arr[] = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }

            int count = 0;
//            1 3 2
            for (int i = 0; i < arr.length-1; i++) {
                for (int j = 0; j < arr.length-1; j++) {
                    if (arr[j+1] < arr[j]) {
                        int temp = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j] = temp;
                        count++;
                    }
                }
            }
//            for (int i = 0; i < arr.length; i++) {
//                for (int j = i+1; j < arr.length; j++) {
//                    if (arr[i] > arr[j]) {
//                        int temp = arr[i];
//                        arr[i] = arr[j];
//                        arr[j] = temp;
//                        count++;
//                    }
//                }
//            }
//            for (int i = 0; i < arr.length; i++){
//                System.out.print(arr[i]+" ");
//            }
            System.out.println("Optimal train swapping takes "+count+" swaps.");
        }
    }
}
