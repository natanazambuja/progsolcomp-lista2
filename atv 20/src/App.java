/* Nome do Aluno:Natan Azambuja
* RA: 12923113102
* Nome do Programa: Escreva um programa que, dada a carga máxima de um
elevador e a quantidade máxima de pessoas digitadas pelo
usuário, leia o peso de cada pessoa, também digitada pelo
usuário, que entra no elevador até que a carga máxima seja
atingida ou o número máximo de pessoas seja atingido (utilize
do /while).

* Data: 19/04/2023
*/



     import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a carga máxima do elevador em quilogramas: ");
        int cargaMaxima = teclado.nextInt();

        System.out.print("Digite a quantidade máxima de pessoas no elevador: ");
        int quantidadeMaximaPessoas = teclado.nextInt();

        int pesoTotal = 0;
        int numeroPessoas = 0;
    

        do {
            System.out.print("Digite o peso da pessoa em quilogramas: ");
            int pesoPessoa = teclado.nextInt();

            if (pesoTotal + pesoPessoa > cargaMaxima) {
                System.out.println("Carga máxima do elevador atingida. Não é possível adicionar mais pessoas.");
                break;
            }

            if (numeroPessoas >= quantidadeMaximaPessoas) {
                System.out.println("Número máximo de pessoas no elevador atingido. Não é possível adicionar mais pessoas.");
                break;
            }

            pesoTotal += pesoPessoa;
            numeroPessoas++;
        } while (true);

        System.out.println("Total de pessoas no elevador: " + numeroPessoas);
        System.out.println("Peso total no elevador: " + pesoTotal + " quilogramas");

    }

}