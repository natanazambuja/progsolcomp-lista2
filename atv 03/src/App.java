
/* Nome do Aluno:Natan Azambuja
* RA: 12923113102
* Nome do Programa: Elabore um programa que lê dois valores A e B e os escreve com
a mensagem: “São múltiplos” ou “Não são múltiplos”.
* Data: 11/04/2023
*/




import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = teclado.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = teclado.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }
    }
}