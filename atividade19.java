/*
 * Leia o salario de um funcionario. Calcule e imprima o valor do novo salario, 
 * sabendo que ele recebeu um aumento de 25%.
 */
import java.util.*;
public class atividade19 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        //declarando variáveis
        float salario, aumento, salariofinal;

        //entrada de dados e armazenando o que o usuário informou
        System.out.println("Informe o valor referente ao seu salário: ");
        salario = sc.nextFloat();

        //calculando o aumento e o salario 
        aumento = salario * 25 / 100;
        salariofinal = salario + aumento;

        //saída de dados monstrando na tela o valor final
        System.out.println("O salário deste funcionário com o aumento será: " +salariofinal);
        System.out.println("O aumento foi de: " +aumento);

        System.out.println("-------O programa foi finalizado------");

        sc.close();
    }
}
