import java.util.Scanner;

public class Tesoro{
    public static void main(String[] args) {
        int n;
        Scanner miescaner = new Scanner(System.in);
        n = miescaner.nextInt();
        for (int i = 0; i < n; i++) {
            int piedrasNegras = miescaner.nextInt() * 2;
            int piedrasBlancas = miescaner.nextInt();
            System.out.println(piedrasBlancas+piedrasNegras);
        }
    }
}