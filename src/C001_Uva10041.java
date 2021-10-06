import java.util.Arrays;
import java.util.Scanner;

//問題
//        世界聞名的黑社會老大Vito Deadstone要搬到紐約來了。在那裡他有一個大家族，並且他們都住在Lamafia大道上。因為Vito時常要拜訪所有的親戚，他想要找一間離他們最近的房子，也就是說他希望從他的家到所有的親戚的家的距離的和為最小。
//
//        他恐嚇你寫一個程式來幫助幫助他解決這個問題。
//
//        * 中文翻譯：Lucky 貓
//
//
//        Input
//        輸入的第一列有一個整數代表以下有多少組測試資料。
//        每組測試資料一列，第一個整數 r（0 < r < 500），代表他親戚的數目。接下來的r個整數s1,s2,......sr為這些親戚房子的門牌號碼（0 < si <30000）。
//
//        Output
//        對每一組測試資料，輸出從他的新家到所有的親戚的家的距離的和為最小為多少。2個門牌號碼si、sj的距離為si-sj的絕對值。
//
//
//        Sample Input
//        2
//        2 2 4
//        3 2 4 6
//
//        Sample Output
//        2
//        4
public class C001_Uva10041 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int times=scanner.nextInt();
        while (times-->0){
            int allsize=scanner.nextInt();
            System.out.println("a:  "+allsize);
            int[] sizes=new int[allsize];
            for (int i=0;i<allsize;i++){
                sizes[i]=scanner.nextInt();
                System.out.println("sizes:  "+sizes[i]);
            }
            Arrays.sort(sizes);
            int ans=0;
            for (int i=0;i<allsize;i++){
                ans=ans+Math.abs(sizes[i]-sizes[i/2]);
            }
            System.out.println(ans);
        }
    }
}
