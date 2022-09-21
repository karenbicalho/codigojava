/*
 * Faca um programa que leia um numero real e o imprima
 */
import java.util.*;
public class atividade2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        //declaração de variável 
        float numeroreal;
        
        //entrada de dados e armazenando o que o usuário informou
        System.out.println("Insira o valor da camisa:");
        numeroreal = sc.nextFloat();

        //saída de dados mostrando na tela o valor final
        System.out.println("O valor informado pela camisa foi:" +numeroreal);

        System.out.println("-------O programa foi finalizado------");
  
        sc.close();
}
}