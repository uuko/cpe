import java.util.Scanner;
/**
 * https://zerojudge.tw/ShowProblem?problemid=e555
 * 內容
 * HaluaRuti市有一家奇怪的酒店，房間無限。
 * 來這家酒店的團體，請遵循以下規則：
 * a）同時，只有能有一個旅行團可以租用酒店。
 * b）每個旅行團在入住日的早晨到達，並在退房日的晚上離開酒店。
 * c）後入住的旅行團需要在前一團退房後的隔天早晨，才能入住
 * d）除了第一團，其他旅行團人數都比前一團多一人
 * e）有n名成員的旅行團則會在酒店停留n天。
 * 例如：
 * 如果一組四個成員的旅行團在8月1日早晨到達，則它將在8月4日晚上離開酒店
 * 下一組五個成員將在8月5日早晨入住並且停留五天，依此類推。
 * 現在給定第一組旅行團人數，您必須回答在指定日期入住的旅行團人數。
 *
 * 輸入說明
 * 輸入每一行包含數字S (1 ≤ S ≤ 10000)和D (1 ≤ D < 10^15)。
 * S表示第一組旅行團人數，D表示必須在第D天(從1開始)查找入住酒店的旅行團人數。
 *
 * 輸出說明
 * 對於每行輸入，輸出在第D天入住的旅行團人數。
 *
 * 範例輸入 #1
 * 1 6
 * 3 10
 * 3 14
 * 範例輸出 #1
 * 3
 * 5
 * 6
 *
 * */
public class C017_Uva10170 {
    public static void main(String[] args) {
//        範例輸入 #1
//1 6
//3 10
//3 14
//範例輸出 #1
//3
//5
//6
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            long come=scanner.nextLong();
            long day=scanner.nextLong();
            long temp=come;
            long count=come;
            while (temp<day){
                count++;
                temp=temp+count;
            }

            System.out.println(count);
        }
    }
}
