import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
//對每一列輸入，請輸出各字元的ASCII值及其出現的次數。請根據出現的次數由小到大輸出。如果有2個以上的字元有相同的次數，則ASCII值較大的先輸出。 測試資料間請空一列，參考Sample Output
//
//        範例輸入 #1
//        AAABBC
//        122333
//        範例輸出 #1
//        67 1
//        66 2
//        65 3
//
//        49 1
//        50 2
//        51 3
public class C041_Uva10062 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String input=scanner.nextLine();
            int[] engArray =new int[127];
            for (int i=0;i<input.length();i++){
                engArray[input.charAt(i)]++;
            }

            int max=0;
            for (int j=0;j<engArray.length;j++){
                if (engArray[j]>max)max=engArray[j];
            }

            for (int i=1;i<=max;i++){
                for (int k=engArray.length-1;k>=0;k--){
                    if (engArray[k]==i)System.out.println(k+" "+engArray[k]);
                }
            }

        }
    }
}
