package desafioum;

import java.io.IOException;
import java.util.Scanner;

public class AreaEsquerda {
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

        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i ; j++) {
                //if (entrada.equals('S')) soma += M[i][j];
                soma += M[i][j];
                //System.out.println("Loop de cima: i[" + i + "] j[" + j + "]");
            }
        }

        for (int i = 6; i < 11; i++) {
            for (int j = 0; j < (11-i) ; j++) {
                //System.out.println("Loop de baixo: i[" + i + "] j[" + j + "]");
                soma += M[i][j];
            }
        }

        //if (entrada.equals('M')) soma /= (double) ((M.length * M.length) - 12) / 2; // 66
        if (entrada.equals('M')) soma /= 30;
        System.out.println(String.format("%.1f", soma));
    }
}
