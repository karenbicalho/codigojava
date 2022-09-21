/*
 * Tres amigos jogaram na loteria. Caso eles ganhem, o premio deve ser repartido 
 * proporcionalmente ao valor que cada deu para a realizacao da aposta. Faca um 
 * programa que leia quanto cada apostador investiu, o valor do premio, e imprima 
 * quanto cada um ganharia do premio com base no valor investido.
 */
import java.util.*;
public class atividade16 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        //declarando variáveis
        float valor1, valor2, valor3, premio, porcentagem1, porcentagem2, porcentagem3,
         total, ganhador1, ganhador2, ganhador3;

         //entrada de dados e armazenando o que o usuário informou
         System.out.println("Informe o valor que será investido: ");
         valor1 = sc.nextFloat();
         System.out.println("Informe outro valor que será investido: ");
         valor2 = sc.nextFloat();
         System.out.println("Informe outro valor que será investido: ");
         valor3 = sc.nextFloat();
         System.out.println("Informe o valor do premio");
         premio = sc.nextFloat();

        //calculando o valor que cada ganhador vai receber do premio
      total = valor1 + valor2 + valor3;
      porcentagem1 = valor1 / total;
      porcentagem2 = valor2 / total;
      porcentagem3 = valor3 / total;

      ganhador1 = premio * porcentagem1;
      ganhador2 = premio * porcentagem2;
      ganhador3 = premio * porcentagem3;


     //saída de dados monstrando na tela o valor final de cada ganhador 
     System.out.println("O apostador 1 no final ganhara: " +ganhador1);
     System.out.println("O apostador 2 no final ganhara: " +ganhador2);
     System.out.println("O apostador 3 no final ganhara: " +ganhador3);

     System.out.println("-------O programa foi finalizado------");

     sc.close();
    }
}
