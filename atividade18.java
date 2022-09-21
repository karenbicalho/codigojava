/*
 * Faca um programa que leia o valor de um produto e imprima o valor com desconto,
 *  tendo em vista que o desconto foi de 12%.
 */
import java.util.*;
public class atividade18 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        //declarando variáveis
        float produto, desconto, valor;

        //entrada de dados e armazenando o que o usuário informou
        System.out.println("Informe um valor referente ao produto escolhido: ");
        produto = sc.nextFloat();

        //calculando o desconto e o valor 
        desconto = produto * 12 / 100;
        valor = produto - desconto;

        //saída de dados monstrando na tela o valor final
        System.out.println("O valor do desconto foi de: " +desconto);
        System.out.println("O valor do produto com desconto é: " +valor);

        System.out.println("-------O programa foi finalizado------");

        sc.close();
        
    }
}
