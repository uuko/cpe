package not;

import java.util.Scanner;
/*
*
* 題目概要：

輸入4個座標，其中有2個座標相同，請找平形四邊形的第4個座標。

解題方向：

利用對角線相加的原理下去解即可。
*
*
* */
public class C0039 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextDouble()){
            double point[][]=new double[4][2];
            double same[]=new double[2];
            for(int i=0;i<point.length;i++){
                for(int j=0;j<point[i].length;j++){
                    point[i][j]=sc.nextDouble(); //儲存座標
                }
                //找出輸入中相同的座標
                for(int j=0;j<i;j++){
                    if(point[j][0]==point[i][0] && point[j][1]==point[i][1]){
                        same[0]=point[i][0];
                        same[1]=point[i][1];
                    }
                }
            }

            //兩對角線相加答案皆一樣的想法去解
            double x=0,y=0;
            for(int i=0;i<point.length;i++){
                if(!(point[i][0]==same[0] && point[i][1]==same[1])){
                    x+=point[i][0];
                    y+=point[i][1];
                }
            }
            System.out.printf("%.3f %.3f",x-same[0],y-same[1]);
            System.out.println("");
        }
    }
}
