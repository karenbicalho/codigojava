/*
 * Escreva um programa para ler as notas da primeira e segunda avalições 
 * de um aluno, calcular e mostrar a média das notas.
 */
 import java.util.Scanner;
  public class media{
     public static void main(String [] args){
 
        Scanner sc = new Scanner(System.in);
 
        //declarando variáveis para calcular a média
        float nota1, nota2, media;
         
        //entrada de dados armazenando o que o usuário informou
       
        System.out.println("Informe uma nota:");
        nota1=sc.nextFloat();
        System.out.println("Informe outra nota:");
        nota2=sc.nextFloat();
 
        //calculando a média entre as notas informada
        media = (nota1 + nota2) / 2;
 
        //saída de informações retornando o valor para o usuário 
        System.out.println("A media das notas é: " +media);

        System.out.println("-------O programa foi finalizado------");
 
        sc.close();
     }
 
 }



