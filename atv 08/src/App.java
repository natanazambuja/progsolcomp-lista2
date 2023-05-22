/* Nome do Aluno:Natan Azambuja
* RA: 12923113102
* Nome do Programa: Crie um programa que lê um número entre 1 e 12, correspondendo
a um dos meses do ano onde o mês 1 é Janeiro e 12 é dezembro.
Ao final, o programa deve imprimir uma mensagem identificando,
com base no número digitado, o nome do mês e a estação
* Data: 15/04/2023
*/



import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número entre 1 e 12: ");
        int numero = teclado.nextInt();
         


      teclado.close();  
                
        String nomeMes;
        String estacao;
    
        switch (numero) {
            case 1:
                nomeMes = "Janeiro";
                estacao = "Verão";
                break;
            case 2:
                nomeMes = "Fevereiro";
                estacao = "Verão";
                break;
            case 3:
                nomeMes = "Março";
                estacao = "Outono";
                break;
            case 4:
                nomeMes = "Abril";
                estacao = "Outono";
                break;
            case 5:
                nomeMes = "Maio";
                estacao = "Outono";
                break;
            case 6:
                nomeMes = "Junho";
                estacao = "Inverno";
                break;
            case 7:
                nomeMes = "Julho";
                estacao = "Inverno";
                break;
            case 8:
                nomeMes = "Agosto";
                estacao = "Inverno";
                break;
            case 9:
                nomeMes = "Setembro";
                estacao = "Primavera";
                break;
            case 10:
                nomeMes = "Outubro";
                estacao = "Primavera";
                break;
            case 11:
                nomeMes = "Novembro";
                estacao = "Primavera";
                break;
            case 12:
                nomeMes = "Dezembro";
                estacao = "Verão";
                break;
            default:
                nomeMes = "Mês nao identificado";
                estacao = "Estação nao reconhecida";
                break;
        }

        System.out.println("Mês: " + nomeMes + " - Estação: " + estacao);
    }
}