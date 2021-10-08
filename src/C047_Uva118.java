import java.util.Scanner;

public class C047_Uva118 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edgeX = scanner.nextInt();
        int edgeY = scanner.nextInt();
        boolean out[][] = new boolean[51][51];

        while (scanner.hasNextInt()) {
            int orgX = scanner.nextInt();
            int orgY = scanner.nextInt();
            char position = scanner.next().charAt(0);
            String cmd = scanner.next();
            for (int i = 0; i < cmd.length(); i++) {
                if (cmd.charAt(i)=='F'){
                    int tempX = orgX;
                    int tempY = orgY;
                    if (position == 'N') {
                        tempY++;
                    } else if (position == 'S') {
                        tempY--;
                    } else if (position == 'W') {
                        tempX--;
                    } else tempX++;


                    if (tempX > edgeX || tempY > edgeY
                            || tempX < 0 || tempY < 0) {
                        if (!out[orgX][orgY]) {
                            out[orgX][orgY] = true;
                            System.out.println(orgX + " " + orgY + " " + position + " LOST");
                            break;
                        }
                    } else {
                        orgX = tempX;
                        orgY = tempY;
                    }
                }
                else {
                    position=findP(position,cmd.charAt(i));
                }


                if(i==cmd.length()-1) System.out.println(orgX+" "+orgY+" "+position);
            }


        }


    }

    public static char findP(char p, char cmd) {
        switch (cmd) {
            case 'R':
                switch (p) {
                    case 'N':
                        p = 'E';
                        break;
                    case 'S':
                        p = 'W';
                        break;
                    case 'W':
                        p = 'N';
                        break;
                    case 'E':
                        p = 'S';
                        break;
                }
                break;
            case 'L':
                switch (p) {
                    case 'N':
                        p = 'W';
                        break;
                    case 'S':
                        p = 'E';
                        break;
                    case 'W':
                        p = 'S';
                        break;
                    case 'E':
                        p = 'N';
                        break;
                }
                break;
        }
        return p;
    }

}
