/*
 * Faca um programa para ler as dimensoes de um terreno (comprimento  c e largura l),
 *  bem como o preco do metro de tela p. Imprima o custo para cercar
 *  este mesmo terreno com tela.
 */
import java.util.*;
public class atividade17 {
    public static void main(String [] args){

      Scanner sc = new Scanner(System.in);

      //declarando variáveis
      int comprimento, largura, arame, custo;

      //entrada de dados e armazenando o que o usuário informou
      System.out.println(" Informe o preco do metro do arame: ");
      arame = sc.nextInt();
      System.out.println(" Informe a largura do seu terreno: ");
      largura = sc.nextInt();
      System.out.println(" Informe o comprimento do seu terreno: ");
      comprimento = sc.nextInt();

      //calculo
      custo = comprimento * arame * largura;

      //saída de dados monstrando na tela o valor final para cercar o terreno
      System.out.println(" O custo que você terá para cerca todo o terreno será de: " +custo);

      System.out.println("-------O programa foi finalizado------");

      sc.close();
    }
}
