package not;

import java.util.Scanner;
/*
*題目概要：

計算出題目規定範圍內的GCD所有總和。

解題方向：

使用輾轉相除法求出GCD，並全部加總即是答案。
* 範例輸入 #1
10
100
500
0
範例輸出 #1
67
13015
442011
*
*
* */
public class C0035 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int num;
        while((num=sc.nextInt())!=0){
            int ans=0;
            for(int i=1;i<num;i++){
                //是 <= num
                for(int j=i+1;j<=num;j++){
                    
                    ans+=gcd(i,j);
                }
            }

            System.out.println(ans);
        }
    }
    public static int gcd(int a,int b){
        //是 &&
        while(a!=0 && b%a!=0){
            int temp=b;

            b=a;
            a=temp%a;
        }

        return a;
    }
}
