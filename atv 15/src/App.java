/* Nome do Aluno:Natan Azambuja
* RA: 12923113102
* Nome do Programa:Faça um programa que preencha com zeros todas as posições
de uma matriz com 10 linha e 10 colunas
* Data: 17/04/2023
*/


public class App {
    public static void main(String[] args) throws Exception {
        int[][] matriz = new int[10][10];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 0;
            }
        }
        
       
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}