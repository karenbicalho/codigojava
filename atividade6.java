/*
 * Leia uma temperatura em graus Fahrenheit e apresente-a convertida em graus Celsius.
 */
import java.util.*;
public class atividade6 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        //declarando variáveis
        double temperatura, celsius;

        //entrada de dados e armazenando o que o usuário informou
        System.out.println("Favor inserir a temperatura em graus Fahrenheit: ");
        temperatura=sc.nextDouble();

        //calculando a temperatura em celsius
        celsius =(temperatura - 32) / 1.8;

        //saída de dados monstrando na tela o valor final
        System.out.println("A temperatura em graus Celsius é: " +celsius);

        System.out.println("-------O programa foi finalizado------");

        sc.close();
    }
}
