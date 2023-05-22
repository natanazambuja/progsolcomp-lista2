/* Nome do Aluno:Natan Azambuja
* RA: 12923113102
* Nome do Programa: Faça um programa que some os números de 1 a 100 e imprima
somente o valor total da soma (utilize while).
* Data: 15/04/2023
*/

public class App {
    public static void main(String[] args) throws Exception {
   
        int numero = 1;
        int soma = 0;
        
        while (numero <= 100) {
            soma += numero;
            numero++;
        }
        
        System.out.println("O valor da respectiva soma:" + soma);
    }
}