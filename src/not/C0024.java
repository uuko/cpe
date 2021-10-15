package not;

import java.util.Scanner;

public class C0024 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        while(sc.hasNext()){
            int v=sc.nextInt();
            int t=sc.nextInt();

            System.out.println(v*t*2);
        }
    }
}
