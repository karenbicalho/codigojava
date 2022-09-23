/*
 * Escreva um programa que leia as medidas dos lados de um retângulo,
 * calcule e imprima a medida do seu perímetro, da área do retângulo e da diagonal.
 */
import java.util.*;
public class atividade2{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
 
       //declaração de variáveis
       int base, altura, perimetro, area, diagonal;
 
       //entrada e armazenamento de dados que o usuário vai informar
       System.out.println("Digite um numero referente a base do retangulo:");
       base = sc.nextInt();
       System.out.println("Digite um numero referente a altura do retangulo:");
       altura = sc.nextInt();
 
      //calculando o perimetro
      perimetro = base + base + altura + altura;
     
      //calculando a area
      area = base * altura;
 
      //calculando a  diagonal
      diagonal= (int)Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
 
       
      //saída de dados informando para o usuário com as operações do número informado
      System.out.println("O perimetro é: " +perimetro);
      System.out.println("A area é: " +area);
      System.out.println("A Diagonal é: " +diagonal);
 
      System.out.println("-------O programa foi finalizado------");
      sc.close();
    }
   
   
}
