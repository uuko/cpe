package not;

import java.util.Scanner;
/**
 *那麼你曾經把質數倒轉過來嗎？對大部分的質數來說，
 * 你將會得到一個組合數（例如：43 變成 34）現在，
 * 我們要定義 Emirp（就是把 Prime 反過來拼）
 * ：如果你把一個質數反過來之後，他仍然是一個質數，
 * 並且和原來那個質數不同，那我們就稱這個數為 emirp number。
 * 例如：17 是一個emirp，因為 17 和 71 都是質數。在這個問題中，你必須要決定某一個整數 N 是非質數，質數，或 emirp。你可以假設 1<N<1000000。
 *輸入說明
 * 輸入的每一行測試資料有 1 個整數 N
 * 輸出說明
 * 對每一輸入 N，輸出以下的訊息：
 *
 * 1. "N is not prime."，如果 N 不是一個質數
 *
 * 2. "N is prime."，如果 N 是一個質數，但是不是一個 Emirp
 *
 * 3. "N is emirp."，如果 N 是一個 emirp
 *
 * 範例輸入 #1
 * 17
 * 18
 * 19
 * 179
 * 199
 * 131
 * 範例輸出 #1
 * 17 is emirp.
 * 18 is not prime.
 * 19 is prime.
 * 179 is emirp.
 * 199 is emirp.
 * 131 is prime.
 *
 * */
public class C033 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String n=sc.next(); //讀入數字
            String r="";  //反轉後的數字

            //數字反轉
            for(int i=n.length()-1;i>=0;i--){
                r=r+n.charAt(i);
            }
            //
            if(isPrime(Integer.parseInt(n)) && isPrime(Integer.parseInt(r)) && !n.equals(r)) System.out.println(n+" is emirp."); //r,n皆為質，且r!=n
            else if(isPrime(Integer.parseInt(n))) System.out.println(n+" is prime."); // n為質數
            else System.out.println(n+" is not prime."); //都不是

        }
    }
    //質數判斷
    public static boolean isPrime(int n){
        boolean flag=true;
        //最多判斷到n/2就可以停止。
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        return flag;
    }
}
