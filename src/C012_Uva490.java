import java.util.Scanner;
/**
*https://zerojudge.tw/ShowProblem?problemid=c045
* 在這個問題中你必須將數列文字往順時針方向旋轉90度。也就是說將原本由左到右，由上到下的句子輸出成由上到下，由右到左。
 *
 * 輸入說明
 * 輸入最多不會超過100列，每列最多不會超過100個字元。 合法的字元包括：換行，空白，所有的標點符號，數字，以及大小寫字母。（注意：Tabs並不算是合法字元。） 最後一列輸入必須垂直輸出在最左邊一行，輸入的第一列必須垂直輸出在最右邊一行。 請參考sample intput/output。
 *
 * 輸出說明
 * 範例輸入 #1
 * Rene Decartes once said,
 * "I think, therefore I am."
 * 範例輸出 #1
 * "R
 * Ie
 *  n
 * te
 * h
 * iD
 * ne
 * kc
 * ,a
 *  r
 * tt
 * he
 * es
 * r
 * eo
 * fn
 * oc
 * re
 * e
 *  s
 * Ia
 *  i
 * ad
 * m,
 * .
 * "
*
*
*
* */
public class C012_Uva490 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char arr[][]=new char[101][101];
        int lineCount=0,max = 0;;
        while (scanner.hasNextLine()){
            String input=scanner.nextLine();
            if (input.length()>max) max=input.length();
            for (int i=0;i<input.length();i++){
                arr[lineCount][i]=input.charAt(i);
            }
            lineCount++;
        }

        for (int j=0;j<max;j++){
            for (int k = lineCount - 1; k >= 0; k--) {
                if (arr[k][j] == '\0') {
                    System.out.print(" ");
                } else
                    System.out.print(arr[k][j]);
            }
            System.out.println();
        }

    }
}
