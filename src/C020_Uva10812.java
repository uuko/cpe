import java.util.Scanner;
//輸入說明
//https://zerojudge.tw/ShowProblem?problemid=c004
//輸入的第一列有一個整數，代表以下有多少組測試資料。 每組測試資料一列，有2個大於等於 0 的整數 s, d，s 代表比賽結束時2隊分數的總和， d 代表比賽結束時2隊分數差的絕對值。
//
//輸出說明
//對每組測試資料輸出一列，包含2個整數代表比賽結束時這2隊的分數，分數大的在前。如果沒有這樣的分數，請輸出「 impossible」。 請記得：美式足球的分數一定是大於等於 0 的整數。
public class C020_Uva10812 {
//    4
//            40 20
//            20 40
//            5 1
//            100 1
//    範例輸出 #1
//            30 10
//    impossible
//3 2
//    impossible


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        while (--size>=0){
            long  a=scanner.nextLong();
            long  b=scanner.nextLong();
            long sum=a+b;
            long cut=a-b;
            if(sum<0 || cut<0 ||
                    (sum%2!=0 || cut%2!=0)) System.out.println("impossible");
            else System.out.println(sum/2+" "+cut/2);

        }
    }
}
