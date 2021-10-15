package not;

import java.util.Scanner;
/*
*整數 n 的「同位元」定義為：其二進位表示法中每位元的和再除以 2 的餘數。例如：21 = 101012 的二進位有三個 1，因此它的同位元為 3 (mod 2)，或 1。

在此，你要計算一個整數 1 ≤ I ≤ 2147483647 的同位元。

輸入說明
輸入的每一行有一個整數 I，而 I = 0 表示輸入結束，該行無需處理。
輸出說明
對於輸入中的每個整 I，你要印一行 The parity of B is P (mod 2).，其中 B 是 I 的二進位表示法。
範例輸入 #1
1
2
10
21
0
範例輸出 #1
The parity of 1 is 1 (mod 2).
The parity of 10 is 1 (mod 2).
The parity of 1010 is 2 (mod 2).
The parity of 10101 is 3 (mod 2).
* 題目概要：

把所輸入的數字轉成2進位，並計算有多少個1。

解題方向：

Solution1: 直接使用Java提供的API(Integer.toBinaryString)，因為它回傳String，所以可以直接解析字串，並計算有幾個1。再依題目需求印出答案即可。

Solution2: 讀入數字後，自己寫一個短除法的式子，用字串儲存餘數(binary)，計算有幾個1。再依題目需求印出答案即可。*/
public class C028 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int num;
        while(sc.hasNext() && (num=sc.nextInt())!=0){
            String st=Integer.toBinaryString(num);

            //計算有多少1
            int count=0;
            for(int i=0;i<st.length();i++){
                if(st.charAt(i)=='1') count++;
            }

            //結果輸出
            System.out.println("The parity of "+st+" is "+count+" (mod 2).");
        }
    }


    /*
    * public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		int num;
		while((num=sc.nextInt())!=0){

			//短除法，自生成binary
			String st="";
			while(true){
				if(num==1){
					st="1"+st;
					break;
				}
				st=(char)num%2+st;
				num=num/2;
			}

			//計算有幾個1
			int count=0;
			for(int i=0;i<st.length();i++){
				if(st.charAt(i)=='1') count++;
			}

			//答案輸出
			System.out.println("The parity of "+st+" is "+count+" (mod 2).");
		}
	}*/
}
