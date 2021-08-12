package desafioum;

import java.io.IOException;
import java.util.Scanner;

public class DiagonalSecundaria {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        Character entrada = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j=0; j < 12; j++) {
                M[i][j] = leitor.nextDouble();
            }
        }

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < (11 - i); j++) {
                //if (entrada.equals('S')) soma += M[i][j];
                soma += M[i][j];
            }
        }

        if (entrada.equals('M')) soma /= (double) ((M.length * M.length) - 12) / 2; // 66
        System.out.println(String.format("%.1f", soma));
    }
}
