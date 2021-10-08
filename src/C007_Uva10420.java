import java.lang.reflect.Array;
import java.util.*;
//https://vjudge.net/problem/UVA-10420
public class C007_Uva10420 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        List<Nation> countryList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String country = scanner.next();

            boolean isExist = false;
            int index = 0;
            for (int j = 0; j < countryList.size(); j++) {
                if (countryList.get(j).getName().equals(country)) {
                    isExist = true;
                    index = j;
                    break;
                }
            }
            if (isExist) {
                countryList.get(index).setCount(countryList.get(index).getCount() + 1);
            } else {
                countryList.add(new Nation(country, 1));
            }
            scanner.nextLine();
        }


        Collections.sort(countryList, (o1, o2) -> -(o1.getCount() - o2.getCount()));
        Collections.sort(countryList, Comparator.comparing(Nation::getName));
        for (int i = 0; i < countryList.size(); i++) {
            System.out.println(countryList.get(i).getName() + " " + countryList.get(i).getCount());
            //Output

        }
    }

    static class Nation {

        private String _name = "";
        private int _count = 0;

        public Nation(String name, int i) {

            _name = name;
            _count = i;
        }

        public String getName() {
            return _name;
        }

        public void setName(String arg) {
            _name = arg;
        }

        public int getCount() {
            return _count;
        }

        public void setCount(int arg) {
            _count = arg;
        }
    }
}
