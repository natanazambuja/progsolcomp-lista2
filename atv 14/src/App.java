/* Nome do Aluno:Natan Azambuja
* RA: 12923113102
* Nome do Programa: Faça um programa que preencha com zeros todas as posições
de um vetor de tamanho 50
* Data: 17/04/2023
*/

public class App {
    public static void main(String[] args) throws Exception {
        
        int[] vetor = new int[50];
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 0;
        }
        
       
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}