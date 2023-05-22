
/* Nome do Aluno:Natan Azambuja
* RA: 12923113102
* Nome do Programa: Construa um programa que receba como entrada três valores A, B
e C e os imprima em ordem crescente. 
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

        System.out.print("Digite o valor de C: ");
        int c = teclado.nextInt();
          
            teclado.close();


        if (a <= b && a <= c) {
            if (b <= c) {
                System.out.println("Ordem crescente: " + a + ", " + b + ", " + c);
            } else {
                System.out.println("Ordem crescente: " + a + ", " + c + ", " + b);
            }
        } else if (b <= a && b <= c) {
            if (a <= c) {
                System.out.println("Ordem crescente: " + b + ", " + a + ", " + c);
            } else {
                System.out.println("Ordem crescente: " + b + ", " + c + ", " + a);
            }
        } else {
            if (a <= b) {
                System.out.println("Ordem crescente: " + c + ", " + a + ", " + b);
            } else {
                System.out.println("Ordem crescente: " + c + ", " + b + ", " + a);
            }
        }
    }
}
