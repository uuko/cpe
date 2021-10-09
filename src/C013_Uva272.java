import java.util.Scanner;

/**
 * https://zerojudge.tw/ShowProblem?problemid=c007
 * 輸入說明
 * 輸入是若干列的文字，其中有偶數個雙引號（ " ），以 end-of-file 做結束。輸出的文字必須和輸入的一模一樣，除了：
 * * 每一組雙引號的第一個 " 必須用兩個 ` 字元（就是 `` ）來代替
 * * 每一組雙引號的第二個 " 必須用兩個 ' 字元（ 就是 ''）來代替。
 *
 * 輸出說明
 * 同上
 *
 * 範例輸入 #1
 * "To be or not to be," quoth the Bard, "that
 * is the question".
 * The programming contestant replied: "I must disagree.
 * To `C' or not to `C', that is The Question!"
 * 範例輸出 #1
 * ``To be or not to be,'' quoth the Bard, ``that
 * is the question''.
 * The programming contestant replied: ``I must disagree.
 * To `C' or not to `C', that is The Question!''
 */
public class C013_Uva272 {
    public static void main(String[] args) {
//        範例輸入 #1
//"To be or not to be," quoth the Bard, "that
//is the question".
//The programming contestant replied: "I must disagree.
//To `C' or not to `C', that is The Question!"
//範例輸出 #1
//``To be or not to be,'' quoth the Bard, ``that
//is the question''.
//The programming contestant replied: ``I must disagree.
//To `C' or not to `C', that is The Question!''

        Scanner scanner=new Scanner(System.in);
        int count=1;
        while (scanner.hasNextLine()){
            String input=scanner.nextLine();
            for (int i=0;i<input.length();i++){
                if (input.charAt(i)=='"'
                && count%2==1){
                    System.out.print("``");
                    count++;
                }
                else if (input.charAt(i)=='"'
                  && count%2==0
                ){
                    System.out.print("''");
                    count++;
                }
                else System.out.print(input.charAt(i));
            }
            System.out.println();
        }

    }
}
