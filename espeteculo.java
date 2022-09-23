/*
 * Faça um programa que receba o custo de um espatáculo teatral e o preço do convite desse 
 * espetáculo. Esse programa deverá calcular e mostrar a quantidade de convits que devem 
 * ser vendidos para que pelo menos o custo do espetáculo seja alcançado. 
 */
import java.util.*;
public class atividade3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
 
        //delaração de variáveis
        double custo,preco, totalconvites;
 
        //entrada e armazenamentos de dados informados pelo usuário
        System.out.println("Digite o preço do convite:");
        preco= sc.nextDouble();
        System.out.println("Digite o custo do espetaculo:");
        custo= sc.nextDouble();
 
        //calculo para saber o preço do convinte
        totalconvites = custo / preco;
 
        //saída de dados informando para o usuário com as operações do número informado
        System.out.println("O numero de convite é igual a: " +totalconvites);
 
        System.out.println("-------O programa foi finalizado------");
        sc.close();
    }
   
   
}

