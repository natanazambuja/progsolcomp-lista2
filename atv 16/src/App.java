/* Nome do Aluno:Natan Azambuja
* RA: 12923113102
* Nome do Programa: Faça um programa que solicite ao usuário que digite um
número até que ele digite um número menor que 0 (utilize
while)
* Data: 17/04/2023
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int numero;
        
        do {
            System.out.print("Digite um número (digite um número negativo para encerrar programa): ");
            numero = teclado.nextInt();
        } while (numero >= 0);
        
      
        System.out.println("Programa finalizado.");
    
          teclado.close();    
    } 
}
 