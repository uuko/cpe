import java.util.Scanner;
/**
 * Input
 * The input file will contain only one test case i.e. the encoded message.
 * The test case consists of one or more words.
 * Output
 * For the given test case, print a line containing the decoded words. However, it is not so hard task to
 * replace each letter or punctuation symbol by the two immediately to its left alphabet on your standard
 * keyboard.
 * Sample Input
 * k[r dyt I[o
 * Sample Output
 * how are you
 *
 *
 *
 * **/
public class C009_Uva10222 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st="`1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./"; //建立對照的表
        while(sc.hasNextLine()){
            String s=sc.nextLine().toLowerCase();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==' '){
                    System.out.print(" ");
                }else{
                    for(int j=0;j<st.length();j++){
                        if(s.charAt(i)==st.charAt(j)){
                            if(j-2>0) System.out.print(st.charAt(j-2));
                            else System.out.print(s.charAt(i));
                            break;
                        }
                    }
                }
            }
            System.out.println("");
        }
    }
}
