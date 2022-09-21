/*
 * Leia uma temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit 1
 */
import java.util.*;
public class atividade5{ 
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        //declarando variáveis
        double temperatura, temperaturaFahrenheit;

        //entrada de dados e armazenando o que o usuário informou
        System.out.println("Informe a temperatura em °C da sua cidade:");
        temperatura = sc.nextDouble();

        //calculando a temperatura em Fahrenheit
        temperaturaFahrenheit = (9* temperatura + 160) / 5;

        //saída de dados monstrando na tela o valor final
        System.out.println("A temperatura da sua cidade em graus Fahrenhei é:" +temperaturaFahrenheit);

        System.out.println("-------O programa foi finalizado------");


        sc.close();
      }

}