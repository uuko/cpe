import java.util.Scanner;
//內容
//        Hashmat是一個勇敢的將領，他帶著年輕的士兵從這個城市移動到另一個城市與敵人對抗。在打仗之前他會計算己方與敵方士兵的數目差距，來決定是要開打或不開打。Hashmat的士兵數絕不會比敵人的士兵數大。
//
//        輸入說明
//        每組測試資料1列，有2個整數，代表Hashmat及敵人的士兵數或反之。這些數不會超過263。
//
//        輸出說明
//        對每組測試資料請輸出Hashmat與敵人士兵數目的差（正數）。
//
//        範例輸入 #1
//        10 12
//        14 10
//        範例輸出 #1
//        2
//        4
public class C002_Uva10055 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            long a=scanner.nextLong();
            long b=scanner.nextLong();

            System.out.print(Math.abs(a-b));
        }
    }
}
