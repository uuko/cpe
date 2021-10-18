import java.util.Scanner;
/*
IBM (International Beautiful Machines)公司發明了一種小玩意兒叫做「愛的算命機」。這台機器會回答你是否非常渴望愛情。這機器運作的情形是：請你輸入一僅含0和1的字串（稱為S）
，機器自己則定義一僅含0和1的字串（稱為L，Love的意思）。
然後機器不斷的用S去減L（當然是2進位的減法），如果最後可以得到S=L，代表S是用Love做成的。如果最後L>S，代表S不是用Love做成的。

舉例說明：假設S="11011"，L="11"。如果我們不斷的從S減去L，我們可以得到：11011、11000、10101、10010、1111、1100、1001、110、11
。所以我們得到L了，也就是S是用Love做的。由於愛的算命機的某些限制，字串不可以有以0為開頭的，
也就是說"0010101"、"01110101"、"011111"這些字串都是不合法的
。另外，只有一個位元的字串也是不合法的。

*/
public class C031_Uva10193 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();


        for (int z = 0; z < size; z++) {

            String input = scanner.next();
            String input2 = scanner.next();
            System.out.println("input: " + input + " input2: " + input2);
            int st1N=0;
            int st2N=0;
            //注意 拿倒數的第一個數字 * 總長-1-目前位置  ex 11011   第五個1 * 5-1-4 * 2
            for(int j=input.length()-1;j>=0;j--){
                if(input.charAt(j)!='0') st1N=st1N+(int)Math.pow(2,input.length()-1-j);
            }
            for(int j=input2.length()-1;j>=0;j--){
                if(input2.charAt(j)!='0') st2N=st2N+(int)Math.pow(2,input2.length()-1-j);
            }
//20 8
            System.out.println("n1: " + st1N +"n2: "+st2N);
            //是否互質 看最後的1
            while (st2N != 0) {
                int temp = st2N;
                st2N = st1N % st2N;
                st1N = temp;
            }
            if (st1N != 1&& st2N==0) System.out.println("Pair #" + (z + 1) + ": All you need is love!");
            else System.out.println("Pair #" + (z + 1) + ": Love is not all you need!");

        }
    }

}

