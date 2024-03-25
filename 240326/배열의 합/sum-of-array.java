import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 4;
        int tmp = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                tmp = tmp + sc.nextInt();
            }
            System.out.println(tmp);
            tmp = 0;
        }
    }
}