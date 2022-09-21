/*
 * Leia um numero real e imprima a quinta parte deste numero.
 */
import java.util.*;
public class atividade4 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        //declarando variáveis
        float numero, quinta;
        
        //entrada de dados e armazenando o que o usuário informou
        System.out.println("Insira um número aleatório:");
        numero = sc.nextFloat();

        //calculando a quinta parte do número informado
        quinta = numero / 5;

        //saída de dados mostrando na tela o valor final
        System.out.println("A quinta parte do número informado ao sistema é:" +quinta);

        System.out.println("-------O programa foi finalizado------");

     sc.close();
    }
}
