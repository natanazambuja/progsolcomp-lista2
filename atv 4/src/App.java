/* Nome do Aluno:Natan Azambuja
* RA: 12923113102
* Nome do Programa: Faça um programa que leia um número inteiro e mostre uma
mensagem indicando se este número é par ou ímpar e se é
positivo ou negativo.
* Data: 12/04/2023
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
            Scanner teclado = new Scanner(System.in);
    
            System.out.print("Digite um número inteiro: ");
            int numero = teclado.nextInt();
           
            teclado.close();

            if (numero % 2 == 0) {
                System.out.println("O número é par.");
            } else {
                System.out.println("O número é ímpar.");
            }
    
            if (numero > 0) {
                System.out.println("O número é positivo.");
            } else if (numero < 0) {
                System.out.println("O número é negativo.");
            } else {
                System.out.println("O número é zero.");
            
            }
        }
    }
    