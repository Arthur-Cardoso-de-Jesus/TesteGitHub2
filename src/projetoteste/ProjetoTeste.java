
package projetoteste;

import java.util.Scanner;

/**
 *
 * @author baung
 */
public class ProjetoTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ano, idade;
        String nome;
        Scanner ler = new Scanner (System.in);
        
        
        System.out.println("Qual seu nome?");
        nome = ler.nextLine();
        System.out.println("Informe o ano de nascimento:");
        ano = ler.nextInt();
        
        
        idade = 2021 - ano;
        
        System.out.println("OI "+nome+" Você tem "+idade);
        
    }
    
}
