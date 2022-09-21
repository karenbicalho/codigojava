/*
  *   Receba o salario-base de um funcionario. Calcule e imprima o salario a receber, 
  *   sabendo-se que esse funcionario tem uma gratificacao de 5% sobre o salario-base. 
  *   Alem disso, ele paga 7% de imposto sobre o salario-base. 
 */
import java.util.*;
public class atividade11{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);

        //declarando variáveis
        float salariobase, gratificacao, imposto, salarioreceber;
        
        //entrada de dados e armazenando o que o usuário informou
        System.out.println("Favor informar o seu salário base");
        salariobase = sc.nextFloat();

        //calculando a gratificação o imposto  o salário total
        gratificacao = salariobase * 5 /100;
        imposto = salariobase * 7 / 100;
        salarioreceber = (salariobase + gratificacao) - imposto;

        //saída de dados monstrando na tela o valor final
        System.out.println("O salário a receber com gratificação e com desconto do imposto é:" +salarioreceber);
         
        System.out.println("-------O programa foi finalizado------");

        sc.close();
    }
}