/*Faça um programa para informar oa usário se o ano informado é um ano bissexto ou
 * um não bissexto
 */
import java.util.*;
public class anobissexto{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
       
        //declaração de variáveis
        int ano;

        //entrada e armazenamento de dados que o usuário vai informar ao sistema
        System.out.println("Informe um ano para saber se é bissesto ou não bissexto:");
        ano = sc.nextInt();

        //saída de dados informando para o usuário com as operações do número informado
        if(ano % 400 == 0){
            System.out.println(" O ano informado ao sistema é ano bissexto");
        } else if((ano % 4 == 0) && (ano % 100 != 0)){
            System.out.println(" O ano informado ao sistema é ano bissexto");
        } else{
            System.out.println(" O ano informado ao sistema não é ano bissexto");
        }
        
        System.out.println("-------O programa foi finalizado------");

        sc.close();
    }
}



