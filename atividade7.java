/*
 * Leia um angulo em graus e apresente-o convertido em radianos. A formula de conversao 
 * e: R = G *π/180, sendo G o angulo em graus e R em radianos e  π = 3.14.
 */
import java.util.*;
public class atividade7{
    public static void main(String [] args){
      Scanner sc = new Scanner(System.in);

      //declarando variáveis
      double angulo, radianos;

      //entrada de dados e armazenando o que o usuário informou
      System.out.println("Insira o ângulo em graus: ");
      angulo = sc.nextDouble();
       
      //calculando o radiano 
      radianos = angulo * 3.14 /180;

      //saída de dados monstrando na tela o valor final
      System.out.println("O ângulo em graus convertido para radiano é: " +radianos);

      System.out.println("-------O programa foi finalizado------");

    sc.close();
  }
    
}