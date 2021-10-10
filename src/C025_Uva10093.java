import java.util.Scanner;

/**
* https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=24&page=show_problem&problem=1034
*
* */
public class C025_Uva10093 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String st;

        while (scanner.hasNextLine()){
            st=scanner.nextLine();
            char cTemp[]=st.toCharArray();
            int sum=0;
            int max=1;

            for (char temp:cTemp){
                int tR=0;
                if (temp>='0' && temp<='9'){
                    tR=temp-'0';
                }
                else if (temp>='A'&&temp<='Z'){
                    tR=temp-'A'+10;
                }
                else if (temp>='a' && temp<='z'){
                    tR=temp-'a'+26+10;
                }

                sum=sum+tR;
                if (tR>max)max=tR;
            }

            for (int i=max;i<=62;i++){
                if(i==62){
                    System.out.println("such number is impossible!");
                    break;
                }
                if(sum%i==0){
                    System.out.println(i+1);
                    break;
                }
            }
        }

    }
}
