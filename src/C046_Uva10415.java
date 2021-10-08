import java.util.Scanner;
//[翻譯][UVa][10415] Eb Alto Saxophone Player
//        十一月 12, 2009  翻譯, UVA/ACM  本文总阅读量次
//        你喜歡薩克斯風嗎？我有一個降 E 中音薩克斯風 (Eb Alto Saxophone)，如下圖 (圖略)。
//
//        當我在演奏某些手指必須動很快的曲子時，我忽然想到：到底我的手指頭按了幾下按鍵？假設每首曲子由某一個八度的 C、D、E、F、G、A、B 和高一個八度的 C、D、E、F、G、A、B 的音調 (note) 所組成，我們使用 c、d、e、f、g、a、b、C、D、E、F、G、A、B 來代表他們。每個音調的指法如下：
//        c: finger 2~4, 7~10
//        d: finger 2~4, 7~9
//        e: finger 2~4, 7, 8
//        f: finger 2~4, 7
//        g: finger 2~4
//        a: finger 2, 3
//        b: finger 2
//        C: finger 3
//        D: finger 1~4, 7~9
//        E: finger 1~4, 7, 8
//        F: finger 1~4, 7
//        G: finger 1~4
//        A: finger 1~3
//        B: finger 1~2
//        (假設每種不同的指法控制一種音調，而且一個手指頭按特定一個按鍵)
//
//        所以請寫出一支程式去計算每一根手指頭按了多少次按鍵。如果某一按鍵在下一音符時不會用到，那麼就會放開，否則就是維持按著的情況。
//
//        輸入
//        第一行有一個正整數 t (1≤t≤1000) ，代表有多少組測資。每組測資有一行包含許多音調，音調最多不超過 200 個。
//
//        輸出
//        對於每個測資，請輸出 10 根手指頭所按鍵的次數，數字間請空一格。
public class C046_Uva10415 {
//    範例輸入

//    3
//    cdefgab
//    BAGFEDC
//    CbCaDCbCbCCbCbabCCbCbabae
//            範例輸出

//        0 1 1 1 0 0 1 1 1 1
//        1 1 1 1 0 0 1 1 1 0
//        1 8 10 2 0 0 2 2 1 0


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        for (int i = 0; i < times; i++) {
            String input = scanner.next();
            String finger[] =
                    {"c0111001111", "d0111001110", "e0111001100", "f0111001000", "g0111000000", "a0110000000", "b0100000000", "C0010000000", "D1111001110", "E1111001100", "F1111001000", "G1111000000", "A1110000000", "B1100000000"};
            String last = "0000000000";
            int[] count = new int[10];
            for (int j = 0; j < input.length(); j++) {
                String temp = "";
                for (int x = 0; x < finger.length; x++) {
                    if (finger[x].charAt(0) == input.charAt(j)) {
                        temp = finger[x];
                        break;
                    }
                }
                temp = temp.substring(1);
                for (int z = 0; z < count.length; z++) {
                    if (temp.charAt(z) == '1'
                            && temp.charAt(z) != last.charAt(z)) {
                        count[z]++;
                    }
                }
                last=temp;

            }

            for(int y=0;y<count.length;y++){
                if(y!=9) System.out.print(count[y]+" ");
                else System.out.print(count[y]);
            }
            System.out.println("");
        }
    }
}
