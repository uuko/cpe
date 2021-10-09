import java.util.Scanner;
//內容
//完全平方數就是平方根為整數的整數。例如 1, 4, 81 就是完全平方數。給你兩個整數 a 和 b，請你求出 a 與 b 之間 (含) 有幾個完全平方數。
//輸入說明
//輸入檔最多有 201 行的輸入。每行有兩個整數 a 和 b (0<a≤b≤100000)。輸入以含有兩個 0 的一行作為結束，請勿對這行做任何輸出。
//輸出說明
//對於每行輸入，請產生一行輸出，這行含有一個整數，代表 a 與 b 之間 (含) 有多少個完全平方數。
//範例輸入 #1
//1 4
//1 10
//0 0
//範例輸出 #1
//2
//3
public class C022_Uva11461 {
    public static void main(String[] args) {
//範例輸入 #1
//1 4
//1 10
//0 0
//範例輸出 #1
//2
//3

        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextInt()){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            if (a==0&&b==0)break;
            int count=0;
            for (int i=a;i<=b;i++){
                double c=Math.sqrt(i);
                if (i%c==0)count++;
            }
            System.out.println(count);
        }
    }
}
