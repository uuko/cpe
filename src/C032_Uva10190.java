import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C032_Uva10190 {
    public static void main(String[] args) {
//        範例輸入 #1
//        125 5
//        30 3
//        80 2
//        81 3
//        範例輸出 #1
//        125 25 5 1
//        Boring!
//                Boring!
//                81 27 9 3 1

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLong()) {
            long n = scanner.nextLong();
            long m = scanner.nextLong();
            //要用flag去做
            boolean flag = true;
            if (m==1 || n==0 || m==0)flag=false;
            List list = new ArrayList<>();
            while (flag) {
                //要先加
                list.add(n);
                //是 1 就break
                if (n == 1) break;
                if (n % m == 0) n = n / m;
                else {
                    flag = false;
                    break;
                }
            }

            if (flag) {

                for (int i = 0; i < list.size(); i++) {
                    System.out.print(list.get(i));
                    if (i != list.size() - 1)
                        System.out.print(" ");
                }
            } else
                System.out.println("Boring!");

            System.out.println();
        }

    }
}
