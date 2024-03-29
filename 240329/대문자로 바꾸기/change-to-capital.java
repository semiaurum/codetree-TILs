import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;

        char[][] input = new char[y][x];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < y; i++) {
            for(int j = 0; j < x; j++) {
                String tmp = sc.next();
                input[i][j]  = Character.toUpperCase(tmp.charAt(0));
            }
        }

        for(int i = 0; i < y; i++) {
            for(int j = 0; j < x; j++) {
                System.out.print(input[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}