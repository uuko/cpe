import java.util.Scanner;

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
            for(int j=input.length()-1;j>=0;j--){
                if(input.charAt(j)!='0') st1N=st1N+(int)Math.pow(2,input.length()-1-j);
            }
            for(int j=input2.length()-1;j>=0;j--){
                if(input2.charAt(j)!='0') st2N=st2N+(int)Math.pow(2,input2.length()-1-j);
            }
//20 8
            System.out.println("n1: " + st1N +"n2: "+st2N);
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

