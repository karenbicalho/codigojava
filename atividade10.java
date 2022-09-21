/*
 *  Faca um programa que leia o valor da hora de trabalho (em reais) e numero de
 *  horas trabalhadas no mes. Imprima o valor a ser pago ao funcionario, adicionando 
 *  10% sobre o valor calculado.
 */
import java.util.*;
public class atividade10 {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);

        //declarando variáveis
        float valorhoras, horasmes, salario, aumento, salariofinal;

        //entrada de dados e armazenando o que o usuário informou
        System.out.println("Quanto você cobra por hora de trabalho? ");
        valorhoras = sc.nextFloat();
        System.out.println("Qual a quantidade de horas de trabalho no mês? ");
        horasmes = sc.nextFloat();

        //calculando o salário com 10% de aumento
        salario = valorhoras * horasmes;
        aumento = salario * 10 /100;
        salariofinal = salario + aumento;

        //saída de dados monstrando na tela o valor final
        System.out.println("O valor que o trabalhador vai receber ao final do mês é: " +salariofinal);

        System.out.println("-------O programa foi finalizado------");

        sc.close();
    }

}
