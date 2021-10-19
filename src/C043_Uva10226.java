import javafx.application.Application;
import javafx.stage.Stage;

import java.util.*;
//內容
//https://zerojudge.tw/ShowProblem?problemid=d492
//美國國家資源局使用衛星影像技術來調查森林中的樹種，你的任務就是根據輸入的樹木名稱，計算各樹種所佔的百分比。
//
//輸入說明
//輸入的第1列有一個正整數n，代表以下有多少組測試資料。空一列之後才是測試資料。
//
//每組測試資料含有一或多列（不會超過1000000列），每列有一樹木的名稱（最多30個字元）。測試資料間有一空白列。請參考Sample input
//
//輸出說明
//對每一組測試資料，輸出各樹種名稱（樹種不會超過10000種，按數種名稱字典順序排列）及所佔的比例（到小數點後4位）。測試資料間亦請空一列。參考Sample Output
//範例輸入 #1
//2
//
//Red Alder
//Ash
//Aspen
//Basswood
//Ash
//Beech
//Yellow Birch
//Ash
//Cherry
//Cottonwood
//Ash
//Cypress
//Red Elm
//Gum
//Hackberry
//White Oak
//Hickory
//Pecan
//Hard Maple
//White Oak
//Soft Maple
//Red Oak
//Red Oak
//White Oak
//Poplan
//Sassafras
//Sycamore
//Black Walnut
//Willow
//
//Red Alder
//Ash
//Ash
//Aspen
//範例輸出 #1
//Ash 13.7931
//Aspen 3.4483
//Basswood 3.4483
//Beech 3.4483
//Black Walnut 3.4483
//Cherry 3.4483
//Cottonwood 3.4483
//Cypress 3.4483
//Gum 3.4483
//Hackberry 3.4483
//Hard Maple 3.4483
//Hickory 3.4483
//Pecan 3.4483
//Poplan 3.4483
//Red Alder 3.4483
//Red Elm 3.4483
//Red Oak 6.8966
//Sassafras 3.4483
//Soft Maple 3.4483
//Sycamore 3.4483
//White Oak 10.3448
//Willow 3.4483
//Yellow Birch 3.4483
//
//Ash 50.0000
//Aspen 25.0000
//Red Alder 25.0000
public class C043_Uva10226 {

    public static void main(String[] args) {
//        2
//
//        Red Alder
//        Ash

//        範例輸出 #1
//        Ash 13.7931
//        Aspen 3.4483

        Scanner scanner = new Scanner(System.in);

        int sizes = scanner.nextInt();
        // 因為會有狗幹空格 所以用for迴圈無用 直接抓
        while (scanner.hasNextLine()) {
            Map<String, Integer> map = new HashMap<>();
            List<String> sortList = new ArrayList<>();
            int count = 0;
            String input; 
            //空格不抓繼續往下 然後整理資料 為第一筆測資 是equals ""
            while (scanner.hasNextLine()
                    && !(input = scanner.nextLine()).equals("")) {

                if (!map.containsKey(input)) {
                    map.put(input, 1);
                    sortList.add(input);
                } else {
                    map.put(input, map.get(input) + 1);
                }
                count++;
                Collections.sort(sortList);
            }
            for (String s : sortList) {
                System.out.printf("%s %.4f", s, (float) map.get(s) / count * 100);
                System.out.println();
            }
            //這裡要判斷測資中間空格 所以用size-- 
            if(map.size()!=0 && (--sizes)>0)System.out.println("");
        }


    }
}
