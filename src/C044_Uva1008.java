import java.util.Scanner;
/**
*輸入的第1列有一個正整數n
* ，代表以下有多少列需要作分析的密文。
*  接下來的n列，每列含有0或多個字元（可能包含空白字元）
*
*每列包含一個大寫字元（A~Z）和一個正整數
* 。這個正整數代表該字元在輸入中出現的次數。輸入中大小寫（例如：A及a）視為相同的字元。
* 輸出時請按照字元出現的次數由大到小排列
* ，如果有2個以上的字元出現次數相同的話
* ，則按照字元的大小（例如：A在H之前）由小到大排列。
*  請注意：如果某一字元未出現在輸入中，那他也不應出現在輸出中。
*
* 3
*This is a test.
*Count me 1 2 3 4 5.
*Wow!!!! Is this question easy?
 * S 7
 * T 6
 * I 5
 * E 4
 * O 3
 * A 2
 * H 2
 * N 2
 * U 2
 * W 2
 * C 1
 * M 1
 * Q 1
 * Y 1
* */
public class C044_Uva1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();

        //65 90
        int N = 0;
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) >= 48 && temp.charAt(i) <= 56) N = N * 10 + temp.charAt(i) - 48;
        }
        System.out.println(N);
        int[] engArray = new int[26];
        for (int i = 0; i < 26; i++) {
            engArray[i] = 0;
        }


        for (int i = 0; i < N; i++) {
            String nt = scanner.nextLine();
            for (int j = 0; j < nt.length(); j++) {
                if (nt.charAt(j) >= 'A' && nt.charAt(j) <= 'Z') {
                    engArray[nt.charAt(j) - 'A']++;
                } else if (nt.charAt(j) >= 'a' && nt.charAt(j) <= 'z') {
                    engArray[nt.charAt(j) - 'a']++;
                }
            }
        }

        int max = 0;
        for (int i=0;i<engArray.length;i++){
            if (engArray[i]>max)max=engArray[i];
        }

        for (int x=max;x>=1;x--){
            for (int i=0;i<engArray.length;i++){
                if (x==engArray[i]){
                    System.out.println((char) (i+'A')+" "+engArray[i]);
                }
            }
        }
    }
}
