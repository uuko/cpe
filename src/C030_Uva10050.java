import java.util.Scanner;
//https://zerojudge.tw/ShowProblem?problemid=e579
// 以下範例為您說明：
//        考慮現在有三個政黨。假設h1 = 3，h2 = 4，h3 = 8，其中hi是第i方的罷會參數。
//        現在，我們將模擬這三個方在N = 14天的罷會行為。
//        模擬的起始天一定是星期天，並假設在每週的假日(星期五和星期六)不會有任何罷會情形。
//
//
//
//        Days	1	2	3	4	5	6	7	8	9	10	11	12	13	14
//        Su	Mo	Tu	We	Th	Fr	Sa	Su	Mo	Tu	We	Th	Fr	Sa
//        Party 1	 	 	x	 	 	x	 	 	x	 	 	x
//        Party 2	 	 	 	x	 	 	 	x	 	 	 	x
//        Party 3	 	 	 	 	 	 	 	x
//        Hartals	 	 	1	2	 	 	 	3	4	 	 	5
//
//
//        上面的模擬顯示，在14天內將會罷會5天(分別在第3、4、8、9和12天)。
//        第6天沒有罷會，因為它屬於假日(星期五)。由此可知我們在2週內損失了5個工作天。
//
//        在這個問題中，考慮到多個政黨的罷會參數和天數N，您的工作是計算出這N天內我們因為罷會損失多少工作天。
//
//        輸入說明
//        輸入第一行有一個整數T，代表有T組測資。
//        每組測資第一行包含一個整數N (7 ≤ N ≤ 3650)，N代表模擬的天數。
//        下一行包含一個整數P (1 ≤ P ≤ 100)，表示有幾個政黨。
//        接下來的P行，第i行包含一個正整數hi(永遠不會是7的倍數)，代表第i個政黨的罷會參數。
//
//        輸出說明
//        對於每組測資，輸出這N天內因為罷會損失多少工作天。
public class C030_Uva10050 {

    public static void main(String[] args) {
        //    範例輸入 #1
//            2
//            14
//            3
//            3
//            4
//            8
//            100
//            4
//            12
//            15
//            25
//            40
//    範例輸出 #1
//            5
//            15

        Scanner scanner=new Scanner(System.in);
        int cases=scanner.nextInt();
        while (--cases>=0){
            int d=scanner.nextInt();
            int policy=scanner.nextInt();
            int[] partyDay=new int[policy];
            for (int i=0;i<partyDay.length;i++){
                partyDay[i]=scanner.nextInt();
            }
            int [] days=new int[d+1];

            for (int i=0;i<policy;i++){
                for (int j=1;j<d+1;j++){
                    if (partyDay[i]*j<d+1){
                        days[partyDay[i]*j]=1;
                    }
                }
            }

            int count=0;
            for(int i=0;i<d+1;i++) if(i%7!=6 && i%7!=0 && days[i]==1) count++; //星期五、星期六不須計算。
            //Output
            System.out.println(count);
        }

    }
}
