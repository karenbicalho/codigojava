/*
  Faca um programa que leia um numero inteiro e o imprima
 */

import java.util.*;
public class atividade1{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        //declaração de variável 
        int numero;

        //entrada de dados e armazenando o que o usuário informou
        System.out.println("Insira um nuúero aleatório:");
        numero=sc.nextInt();

        //saída de dados mostrando na tela o valor final
        System.out.println("O número que você informou ao sistema é:" +numero);

        System.out.println("-------O programa foi finalizado------");
        sc.close();
    }

}