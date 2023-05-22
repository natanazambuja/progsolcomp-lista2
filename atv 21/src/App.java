
/* Nome do Aluno:Natan Azambuja
* RA: 12923113102
* Nome do Programa:Escreva um programa que, dado um número positivo digitado
pelo o usuário mostre a tabuada de todos os números de 1 até o
número digitado. (utilize for)
* Data: 20/04/2023
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        
            Scanner teclado = new Scanner(System.in);
    
            System.out.print("Digite um número positivo: ");
            int numero = teclado.nextInt();
    
            if (numero <= 0) {
                System.out.println("número invalido. programa finalizado.");
            } else {
                for (int i = 1; i <= numero; i++) {
                    System.out.println("Tabuada do " + i + ":");
                    for (int j = 1; j <= 10; j++) {
                        System.out.println(i + " x " + j + " = " + (i * j));
                    }
                    System.out.println();
                }
            }
    
            teclado.close();
        }
    }