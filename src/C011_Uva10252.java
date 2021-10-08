import java.util.Arrays;
import java.util.Scanner;
//內容
//https://zerojudge.tw/ShowProblem?problemid=e507
//給定兩個由小寫字母組成的字串a和b。
//
//印出最長的小寫字串x，使得x經過重新排列後為a的子序列，且x經過重新排列後為b的子序列。
//
//輸入說明
//輸入包含多行輸入。
//
//連續的兩行為一組，第一行為字串a，第二行為字串b
//
//1~2行為一組輸入，3~4行為一組輸入，依此類推。
//
//每個字串最多包涵1000個小寫字母。
//
//輸出說明
//對於每組輸入，輸出本題要求a和b的x
//
//如果有多組符合的x
//
//請印出字母順序由小到大排列的那一個。
//
//範例輸入 #1
//pretty
//women
//walking
//down
//the
//street
//範例輸出 #1
//e
//nw
//et
public class C011_Uva10252 {
    public static void main(String[] args) {
//        範例輸入 #1
//pretty
//women
//walking
//down

//範例輸出 #1
//e
//nw
//et

        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextLine()){
            String st1=scanner.nextLine();
            String st2=scanner.nextLine();

            //存放2字串字母出現頻率
            int table1[]=new int[26];
            int table2[]=new int[26];

            //初始化陣列
            Arrays.fill(table1,0);
            Arrays.fill(table2,0);

            //開始讀取字母出現頻率
            for(int i=0;i<st1.length();i++){
                char temp=st1.charAt(i);
                if(temp>='a' && temp<='z') table1[temp-'a']++;

            }
            for(int i=0;i<st2.length();i++){
                char temp=st2.charAt(i);
                if(temp>='a' && temp<='z') table2[temp-'a']++;

            }


            for(int i=0;i<26;i++){
                int min=Math.min(table1[i],table2[i]);
                for(int j=0;j<min;j++){
                    System.out.print((char)(i+97));
                }
            }
            System.out.println();
        }
    }
}
