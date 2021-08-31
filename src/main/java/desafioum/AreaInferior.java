package desafioum;

import java.io.IOException;
import java.util.Scanner;

public class AreaInferior {
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

        int cont_esquerdo = 0;
        for (int i = 7; i <= 11; i++) {
            for (int j = (5 - cont_esquerdo); j <= 5 ; j++) {
                soma += M[i][j];
                //System.out.println("Loop de esquerda: i[" + i + "] j[" + j + "]");
            }
            cont_esquerdo++;

            for (int j = 6; j < i ; j++) {
                //System.out.println("Loop de direita: i[" + i + "] j[" + j + "]");
                soma += M[i][j];
            }
        }

        if (entrada.equals('M')) soma /= 30;
        System.out.println(String.format("%.1f", soma));
    }
}
