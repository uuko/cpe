package not;

import java.util.Arrays;
import java.util.Scanner;

/***
 * 給你兩個整數 N (0<N<=10000), M (0<M<=10000)，你要依照某些規則排序N個整數。先利用每個數字除以M的餘數由小到大排，若排序中比較的兩數為一奇一偶且兩數除以M 的餘數相等，則奇數要排在偶數前面。若兩奇數除以M餘數大小相等，則原本數值較大的奇數排在前面。同樣的，若兩偶數除以M餘數大小相等，則較小的偶數排在前面。至於負數的餘數計算和 C 語言裡的定義相同，即負數的餘數絕對不會大於零。例如 -100 MOD 3 = -1, -100 MOD 4 = 0 依此類推。
 * 輸入說明
 * 輸入測資檔包含 20 筆的輸入測資。每組測資一開始包含兩個整數 N, M。接下來的 N 行裡每一行只包含一個整數。這些整數保證都可以被存在 32-bit 有號整數裡。輸入以 N=0, M=0代表結束。
 * 輸出說明
 * 對於每一組輸入請輸出 N+1 行整數。第一行為兩個整數 N, M。接下來的 N 行都包含一個整數、及上述的數字按上述規則排列後的結果。對於輸入測資尾端的兩個 0, 0 請也輸出兩個空白分隔的 0, 0。
 * 範例輸入 #1
 * 15 3
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 * 11
 * 12
 * 13
 * 14
 * 15
 * 0 0
 * 範例輸出 #1
 * 15 3
 * 15
 * 9
 * 3
 * 6
 * 12
 * 13
 * 7
 * 1
 * 4
 * 10
 * 11
 * 5
 * 2
 * 8
 * 14
 * 0 0
 *
 * */
public class C0050 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt())
        {
            int num = sc.nextInt();
            int m = sc.nextInt();
            System.out.printf("%d %d\r\n", num, m);
            if(num == 0&& m == 0)
                break;
            Data[] datas = new Data[num];
            for(int i = 0; i < num; i++)
            {
                int n = sc.nextInt();
                datas[i] = new Data(n, n % m, n % 2 == 0);
            }
            Arrays.sort(datas);
            for(int i = 0; i < num; i++)
            {
                System.out.println(datas[i].toString());
            }
        }
    }
    static class Data implements Comparable<Data>
    {
        int n;
        int r;
        boolean even;
        Data(int n, int r, boolean even)
        {
            this.n = n;
            this.r = r;
            this.even = even;
        }

        public String toString()
        {
            return Integer.toString(this.n);
        }


        // 重點 一定要用even 去判斷 雖然不知道為啥 ㄏㄏ
        @Override
        public int compareTo(Data other) {
            if(this.r != other.r)
                return this.r < other.r ? -1 : 1;
            else
            {
                if(this.even != other.even)
                    return !this.even ? -1 : 1;
                else if(this.even && other.even)
                    return this.n < other.n ? -1 : 1;
                else
                    return this. n < other.n ? 1 : -1;
            }
        }
    }

}

