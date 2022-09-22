/*Escreva um programa que receba dois valores e imprima qual deles é
 * maior
 */
import java.util.*;
public class maiornumero{
public  static void main(String [] args){

    Scanner sc = new Scanner(System.in);

    //declaração de variáveis
    int valor1, valor2;

    //entrada e armazenamento de dados que o usuário vai informar ao sistema
    System.out.println("Informe um numero aleatorio:");
    valor1 = sc.nextInt();
    System.out.println("Informe outro numero aleatorio:");
    valor2 = sc.nextInt();

    //saída de dados informando para o usuário com as operações do número informado
    if(valor1 > valor2){
        System.out.println("O maior valor informado ao sistema e:" +valor1);
    }else{
        System.out.println("O maior valor informado ao sistema e:" +valor2);
    }
    System.out.println("-------O programa foi finalizado------");
    
   sc.close();
}
}