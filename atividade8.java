/*
 * A importancia de R$ 780.000, 00 sera dividida entre tres ganhadores de um concurso.
 *  Sendo que da quantia total: O primeiro ganhador recebera 46%; O segundo receber a 
 * 32%; O terceiro receber a o restante; Calcule e imprima a quantia ganha por cada 
 * um dos ganhadores.
 */
import java.util.*;
public class atividade8{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        //declarando variáveis
        double dinheiro = 780000;
        double primeiro, segundo, terceiro;

        //calculando o valor que cada ganhador vai receber
        primeiro = 46 *dinheiro / 100; 
        segundo = 32 * dinheiro / 100;
        terceiro = dinheiro - (primeiro + segundo);

        //saída de dados monstrando na tela o valor final
        System.out.println("O primeiro ganhador vai ganhar: " +primeiro);
        System.out.println("O segundo ganhador vai ganhar: " +segundo);
        System.out.println("O terceiro ganhador vai ganhar: " +terceiro);

        System.out.println("-------O programa foi finalizado------");
    
        sc.close();
    }
    
}
