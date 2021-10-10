import java.util.Scanner;
/**https://zerojudge.tw/ShowProblem?problemid=a741
 * 內容
 * Bangla numbers normally use 'kuti' (10000000), 'lakh' (100000), 'hajar' (1000), 'shata' (100) while expanding and converting to text. You are going to write a program to convert a given number to text with them.
 * 輸入說明
 * The input file may contain several test cases. Each case will contain a non-negative number <= 999999999999999.
 * 輸出說明
 * For each case of input, you have to output a line starting with the case number with four digits adjustment followed by the converted text.
 * 範例輸入 #1
 * 23764
 * 45897458973958
 * 範例輸出 #1
 *    1. 23 hajar 7 shata 64
 *    2. 45 lakh 89 hajar 7 shata 45 kuti 89 lakh 73 hajar 9 shata 58
* */
public class C006_Uva10101 {
    public static void main(String[] args) {

//        Sample Input
//        23764
//        45897458973958
//        Sample Output
//        1. 23 hajar 7 shata 64
//        2. 45 lakh 89 hajar 7 shata 45 kuti 89 lakh 73 hajar 9 shata 58
        //kuti代替10000000、 lakh代替100000、hajar代替1000、shata代替100，換算所輸入的值

        Scanner scanner=new Scanner(System.in);
        int count=0;
        while (scanner.hasNext()){
            count++;
            long num=scanner.nextLong();
            System.out.printf("%4d.", count);
            if (num!=0){
                calculate(num);
            }
            else System.out.print(" 0");
            System.out.println();

        }
    }

    public static void calculate(long num){
        if (num==0)return;
        if (num>=10000000){
            calculate(num/10000000);
            System.out.print(" kuti");
            calculate(num%10000000);
        }
        else if (num >= 100000) {
            System.out.print(" " + num/100000 + " lakh");
            calculate(num%100000);
        }

        else if (num >= 1000) {
            System.out.print(" " + num/1000 + " hajar");
            calculate(num%1000);
        }

        else if (num >= 100) {
            System.out.print(" " + num/100 + " shata");
            calculate(num%100);
        }

        else if (num % 100 != 0)
            System.out.print(" " + num);

    }
}
