/* Nome do Aluno:Natan Azambuja
* RA: 12923113102
* Nome do Programa: Faça um programa que receba o valor da venda, escolha a
condição de pagamento no menu e mostre o total da venda final
conforme condições a seguir:
Venda a Vista - desconto de 10%
Venda a Prazo 30 dias - desconto de 5%
Venda a Prazo 60 dias - mesmo preço
Venda a Prazo 90 dias - acréscimo de 5%
Venda com cartão de débito - desconto de 8%
Venda com cartão de crédito - desconto de 7%
* Data: 15/04/2023
*/



import java.util.Scanner;

public class App{
    public static void main(String[] args) throws Exception {
      

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor da venda: R$ ");
        double valorVenda = teclado.nextDouble();

        System.out.println("Selecione a condição de pagamento:");
        System.out.println("1 - Venda à vista");
        System.out.println("2 - Venda a prazo 30 dias");
        System.out.println("3 - Venda a prazo 60 dias");
        System.out.println("4 - Venda a prazo 90 dias");
        System.out.println("5 - Venda com cartão de débito");
        System.out.println("6 - Venda com cartão de crédito");
        System.out.print("Opção: ");
        int opcao = teclado.nextInt();

        double totalVenda = 0.0;
          
        teclado.close();
         
        if (opcao == 1) {
            totalVenda = valorVenda - (valorVenda * 0.1); // desconto de 10% para venda à vista
        } else if (opcao == 2) {
            totalVenda = valorVenda * 0.95; // desconto de 5% para venda a prazo 30 dias
        } else if (opcao == 3) {
            totalVenda = valorVenda * 1.1; // acréscimo de 10% para venda a prazo 60 dias
        } else if (opcao == 4) {
            totalVenda = valorVenda * 1.2; // acréscimo de 20% para venda a prazo 90 dias
        } else if (opcao == 5) {
            totalVenda = valorVenda - (valorVenda * 0.08); // desconto de 8% para venda com cartão de débito
        } else if (opcao == 6) {
            totalVenda = valorVenda - (valorVenda * 0.07); // desconto de 7% para venda com cartão de crédito
        } else {
            System.out.println("Opção inválida.");
            return;
        }

        System.out.println("Total da venda: R$ " + totalVenda);
    }
}