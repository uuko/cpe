import java.util.Scanner;
//現在，要求您編寫一個模擬骰子滾動的程式。
//為簡單起見，我們假設骰子既不滑動也不跳躍，而只是在四個方向(東，南，西，北)上滾動。
//在每局遊戲開始時，主持人將骰子放在桌子的中央並調整其方向，以便分別在頂面、北面、西面上看到數字1、2、3。
//對於其他三個面，我們沒有明確指定任何內容，但會告訴您一條黃金法則：任何一對相對的面的數字總和始終為7。
//
//您的程式應接受一系列指令，指令為東"east"，南"south"，西"west"，北"north"。
//例如"north"指令將骰子向下滾動到北，即頂面變為新的北，北變為新的底，依此類推。
//其他指令也會根據自己的方向滾動骰子。
//執行順序中的指令後，您的程式應計算最終顯示在頂部的數字。
//請注意，桌子足夠大，骰子在遊戲中不會掉落或損壞。
//輸入第一行包含一個正整數n (n <= 1024)，代表指令序列的數量。
//        如果n = 0代表輸入結束。
//        每個指令只包含東"east"、"south"、"west"、"north"。
//輸出說明
//對於每個指令序列，在遊戲結束時輸出頂面上的數字。
public class C045_Uva10409 {
    public static void main(String[] args) {
        //範例輸入 #1
        //1
        //north
        //3
        //north
        //east
        //south
        //0
        //範例輸出 #1
        //5
        //1
        int times = 0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt() && (times = scanner.nextInt()) != 0) {
            //初始化。
            int currPost = 1;
            int N = 2, W = 3, S = 5, E = 4;

            for (int i = 0; i < times; i++) {
                String turn = scanner.next();
                if (turn.equals("north")) {
                    N = currPost;
                    currPost = S;
                    S = 7 - N;
                } else if (turn.equals("south")) {
                    S = currPost;
                    currPost = N;
                    N = 7 - S;
                } else if (turn.equals("east")) {
                    E = currPost;
                    currPost = W;
                    W = 7 - E;
                } else if (turn.equals("west")) {
                    W = currPost;
                    currPost = E;
                    E = 7 - W;
                }

            }
            System.out.println(currPost);
        }


    }
}
