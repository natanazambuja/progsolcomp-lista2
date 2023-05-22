/* Nome do Aluno:Natan Azambuja
* RA: 12923113102
* Nome do Programa: FFaça um programa calcula o total de uma hospedagem em um
hotel. Ele cobra R$ 60.00 a diária e mais uma taxa de serviço:
R$ 5.50 por diária, se o número de diárias for maior que 15;
R$ 6.00 por diária, se o número de diárias for igual a 15;
R$ 8.00 por diária, se o número de diárias for menor que 15.
* Data: 15/04/2023
*/



import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número de diárias: ");
        int numeroDiarias = teclado.nextInt();

        double valorDiaria = 60.00;
        double taxaServico;

        if (numeroDiarias > 15) {
            taxaServico = 5.50;
        } else if (numeroDiarias == 15) {
            taxaServico = 6.00;
        } else {
            taxaServico = 8.00;
        }

        double total = (valorDiaria + taxaServico) * numeroDiarias;

        System.out.println("Total da hospedagem: R$ " + total);
    }
}