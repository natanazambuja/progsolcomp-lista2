/* Nome do Aluno:Natan Azambuja
* RA: 12923113102
* Nome do Programa: Um determinado gás duplica seu volume a cada segundo.
Dada um volume inicial, em centímetros cúbicos, digitado pelo
usuário faça um programa que determine o tempo necessário para
que esse volume se torne maior que 1000 centímetros cúbicos.
(utilize while)
* Data: 19/04/2023
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
      
            Scanner teclado = new Scanner(System.in);
            
            System.out.print("determine o volume inicial em centímetros cúbicos: ");
            int volumeInicial = teclado.nextInt();
            
            int volumeAtual = volumeInicial;
            int tempo = 0;
            
            teclado.close();
             
            while (volumeAtual <= 1000) {
                volumeAtual *= 2;
                tempo++;
            }
            
            System.out.println("O volume excedeu 1000 cm³ em " + tempo + " segundos.");
        }
    }