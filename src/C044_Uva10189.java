import java.util.Scanner;
//輸入說明
//        輸入將包含多組測資。
//        每組測資第一行包含兩個整數n和m (0 < n, m ≤ 100)，代表地圖大小。
//        如果n = m = 0代表輸入結束。
//        接下來的n行，每行m個字元，代表整張地圖。
//        每個安全方塊用"."字元表示，每個地雷方塊用"*"字元表示。
//
//        輸出說明
//        對於每組測資。
//        輸出第一行為"Field #k:"，k代表測資編號。
//        接下來輸出題示後的遊戲地圖。
//        每筆測資間請用空白行分隔。


public class C044_Uva10189 {
    public static void main(String[] args) {
        // 4 4
        // *...
        //....
        //.*..
        //....

        // Field #1:
        //*100
        //2210
        //1*10
        //1110


        Scanner scanner = new Scanner(System.in);
        int field = 0, h = 0, w = 0;
        while (scanner.hasNextInt() && (h = scanner.nextInt()) != 0 && (w = scanner.nextInt()) != 0) {
            char arr[][] = new char[h][w];

            for (int i = 0; i < h; i++) {
                String s=scanner.next();
                for (int j=0;j<w;j++){
                    arr[i][j]=s.charAt(j);
                }
            }
            System.out.println("Field #"+(++field)+":");
            for (int i = 0; i < h; i++) {
                for (int j=0;j<w;j++){
                    int ans=0;

                    if (j-1>=0 && arr[i][j-1]=='*')ans++;
                    if (j+1<w && arr[i][j+1]=='*')ans++;
                    if (i-1>=0 && arr[i-1][j]=='*')ans++;
                    if (i+1<h && arr[i][i+1]=='*')ans++;

                    if((j+1<w && i+1<h) && arr[i+1][j+1]=='*') ans++;
                    if((j+1<w && i-1>=0) && arr[i-1][j+1]=='*') ans++;
                    if((j-1>=0 && i+1<h) && arr[i+1][j-1]=='*') ans++;
                    if((j-1>=0 && i-1>=0) && arr[i-1][j-1]=='*') ans++;

                    if (arr[i][j]=='*')System.out.print("*");
                    else System.out.print(ans);
                }
                System.out.println("");
            }


        }
    }
}
