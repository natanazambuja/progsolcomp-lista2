/* Nome do Aluno:Natan Azambuja
* RA: 12923113102
* Nome do Programa: Faça um programa que leia o nome, o sobrenome, a idade, em
anos, e a naturalidade (cidade de nascimento) de uma pessoa.
Depois, o programa deve dar a seguinte opção “Deseja
visualizar dados completos?”. Se o caractere digitado pelo
usuário for ‘S’ o programa deve imprimir na tela Nome,
Sobrenome, idade e naturalidade. Se o caractere digitado pelo
usuário for ‘N’ o programa deve imprimir o Nome e a idade. Se
o caractere não for nenhuma das outras opções acima o programa
deve imprimir “Digitação errada. Tente Novamente”
* Data: 12/04/2023
*/



import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = teclado.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Digite a naturalidade: ");
        String naturalidade = teclado.nextLine();

        System.out.print("Deseja visualizar dados completos? (S/N): ");
        char opcao = teclado.next().charAt(0);

            teclado.close();

        if (opcao == 'S' || opcao == 's') {
            System.out.println("Nome: " + nome + " " + sobrenome);
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Naturalidade: " + naturalidade);
        } else if (opcao == 'N' || opcao == 'n') {
            System.out.println("Nome: " + nome + " " + sobrenome);
            System.out.println("Idade: " + idade + " anos");
        } else {
            System.out.println("Digitação errada. Tente Novamente");
        }
    }
}