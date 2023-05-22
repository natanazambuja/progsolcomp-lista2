/* Nome do Aluno:Natan Azambuja
* RA: 12923113102
* Nome do Programa:Faça um programa para imprimir o conceito de um aluno. O
conceito é calculado em função da nota do aluno que varia de 0
a 100. As faixas da correlação são mostradas abaixo:
Nota Conceito
0 a 49 Insuficiente
50 a 64 Regular
65 a 84 Bom
85 100 Ótimo
* Data: 15/04/2023
*/



import java.util.Scanner;






public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        int nota = teclado.nextInt();
           

        String conceito;
         
         teclado.close();

        if (nota >= 0 && nota <= 49) {
            conceito = "Insuficiente";
        } else if (nota >= 50 && nota <= 64) {
            conceito = "Regular";
        } else if (nota >= 65 && nota <= 84) {
            conceito = "Bom";
        } else if (nota >= 85 && nota <= 100) {
            conceito = "Ótimo";
        } else {
            conceito = "Nota inválida";
        }

        System.out.println("Conceito do aluno: " + conceito);
    }
}