/*
 * Faça um programa que receba um número positivo e maior que zero, 
 * calcule e mostre:
 * O numero digitado ao quadrado.
 * O numero digitado ao cubo.
 * A raiz quadrada do numero digitado.
 * A raiz cubica do numero digitado.
 */
import java.util.*;
public class numeropositivo{
    public static void main(String [] agrs){
        Scanner sc = new Scanner (System.in);

        // declarando variáveis 
        double numero, quadrado, cubo, raizquadrada, raizcubica;

        //pedindo para o usuário informar os dados e armazenando 
        System.out.println("Favor inserir um numero positivo (maior que 0):");
        numero=sc.nextDouble();

        //caculando o quadrado do número informado 
        quadrado = Math.pow(numero,2);
       
        //calculando o cubo do número informado 
        cubo =Math.pow(numero, 3);

        //calculando a raiz quadrada do número informado
        raizquadrada = Math.sqrt(numero);

        //calculando a raiz cubica do número informado
        raizcubica = Math.cbrt(numero);

        //saída de dados informando para o usuário com as operações do número informado
        System.out.println("O quadrado de " + numero + " é: " + quadrado);
        System.out.println("O cubo de  " + numero + " é: " + cubo);
        System.out.println("A raiz quadrada de " + numero + " é: " + raizquadrada);
        System.out.println("A raiz cubica de " + numero + " é: " + raizcubica);

        System.out.println("-------O programa foi finalizado------");

     sc.close();
    }
    
}
