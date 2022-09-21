/*
 * Uma empresa contrata um encanador a R$ 30, 00 por dia. Faca um programa que solicite 
 * o numero de dias trabalhados pelo encanador e imprima a quantia lıquida que devera ser
 * paga, sabendo-se que sao descontados 8% para imposto de renda.
 */
import java.util.*;
public class atividade9{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        //declarando variáveis
        double dia = 30;
        double diastrabalhado, valorbruto, valorliquido, desconto;

        //entrada de dados e armazenando o que o usuário informou
        System.out.println("Informe a quantidade de dias trabalhado: ");
        diastrabalhado = sc.nextDouble();

         
        //calculando o valor bruto, o valor qu será descontado e o salário final
        valorbruto = dia * diastrabalhado;
        desconto = valorbruto * 8 / 100;
        valorliquido = valorbruto - desconto;

        //saída de dados monstrando na tela o valor final
        System.out.println("O valor bruto que o trabalhador vai receber é: " +valorbruto);
        System.out.println("8% da taxa que foi descontado do salário: " +desconto);
        System.out.println("O valor liquido que o trabalhador vai receber com 8% de desconto é: " +valorliquido);

        System.out.println("-------O programa foi finalizado------");
    
        sc.close();
    }
}