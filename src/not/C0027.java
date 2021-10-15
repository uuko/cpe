package not;

import java.util.Scanner;
/*
*
* 範例輸入 #1
3
265
111
1234
範例輸出 #1
3 5
6 3
5 5
* 題目概要：

給定一數字，將此數字以10進位來看，並找出轉2進位後共有多少個1，以及16進位來看，轉2進位後共有多少個1。

解題方向：

依計概所教的方法去求出2進位，並計算有多少個1。
* */
public class C0027 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int cases=sc.nextInt(); //多少case需要被處理。

        while((cases--)>0){
            int n=sc.nextInt();
            //Output。
            System.out.println(base10(n)+" "+base16(n));
        }
    }
    //10進位轉2進位，並回傳有多少個1。
    public static int base10(int n){
        int count=0;
        while(n>0){
            if(n%2==1) count++;
            n/=2;
        }
        return count;
    }
    //16進位轉2進位，並回傳有多少個1。
    public static int base16(int n){
        int count=0;
        while(n>0){
            int temp=n%10;
            n/=10;
            while(temp>0){
                if(temp%2==1) count++;
                temp/=2;
            }
        }
        return count;
    }
}
