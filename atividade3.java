/*
 * Peca ao usuario para digitar tres valores inteiros e imprima a soma deles.
 */
import java.util.*;
public class atividade3 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        //declarando variáveis
        int valor1, valor2, valor3, soma;

        //entrada de dados e armazenando o que o usuário informou
        System.out.println("Insira três valores aleatórios:");
        valor1 = sc.nextInt();
        valor2 = sc.nextInt();
        valor3 = sc.nextInt();
        
        //calculando a soma dos valores informado 
        soma = valor1 + valor2 + valor3;

        //saída de dados mostrando na tela o valor final
        System.out.println("A soma dos valores informados ao sistema é: " +soma);

        System.out.println("-------O programa foi finalizado------");

     sc.close();
    }
}
