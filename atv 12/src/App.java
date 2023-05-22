/* Nome do Aluno:Natan Azambuja
* RA: 12923113102
* Nome do Programa: Faça um programa que exiba todos os números pares a
partir de 0 até que encontre um múltiplo de 7 (utilize
do/while)
* Data: 15/04/2023
*/


public class App {
    public static void main(String[] args) throws Exception {
       
        int numero =0;

        do {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++;
        } while (numero % 7 != 0);
    }
}