import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 4;
        int y = 2;

        double[][] input = new double[y][x];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < y; i++) {
            for(int j = 0; j < x; j++) {
                input[i][j] = sc.nextDouble();
            }
        }

        double[][] result = new double[3][4];

        for(int i = 0; i < y; i++) {
            double tmp = 0;
            for(int j = 0; j < x; j++) {
                tmp += input[i][j];
            }
            result[0][i] = tmp/x;
            System.out.printf("%.1f ", result[0][i]);
        }

        System.out.println("");

        for(int i = 0; i < x; i++) {
            double tmp = 0;
            for(int j = 0; j < y; j++) {
                tmp += input[j][i];
            }
            result[1][i] = tmp/y;
            System.out.printf("%.1f ", result[1][i]);
        }

        System.out.println("");

        double tmp = 0;
        for(int i = 0; i < y; i++) {
            for(int j = 0; j < x; j++) {
                tmp += input[i][j];
            }
        }

        result[2][0] = tmp/(x*y);
        System.out.printf("%.1f ", result[2][0]);
    }
}