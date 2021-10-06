import java.util.Scanner;

public class C014_UVa10035 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int firstInput=scanner.nextInt();
            int secondInput=scanner.nextInt();

            if (firstInput==0 && secondInput==0)break;
            int next=0;
            int carry=0;
            while (firstInput!=0 && secondInput!=0){
                if (firstInput%10 + secondInput%10 +next>=10){
                    next=1;
                    carry++;
                }
                else {
                    next=0;
                }
                firstInput=firstInput/10;
                secondInput=secondInput/10;
            }

            if (carry==0){
                System.out.println("No carry operation.");
            }
            else {
                if (carry == 1)
                    System.out.println("1 carry operation.");
                else
                    System.out.println(carry + " carry operations.");
            }
        }




    }
}
