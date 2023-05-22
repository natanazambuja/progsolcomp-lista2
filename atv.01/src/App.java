/* Nome do Aluno:Natan Azambuja
* RA: 12923113102
* Nome do Programa:  Faça um programa que leia dois números A e B e imprima o maior 
deles.
* Data: 11/04/2023
*/




import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("digite o numero A:");

        double numeroA = teclado.nextDouble();

        System.out.print ("digite numero B:");

        double numeroB = teclado.nextDouble();
        
        teclado.close();

        if (numeroA > numeroB) {
            System.out.println("O maior número é: " + numeroA);
        } else if (numeroB > numeroA) {
            System.out.println("O maior número é: " + numeroB);
        } else {
            System.out.println("Os números são identicos.");
        }
    }
}
