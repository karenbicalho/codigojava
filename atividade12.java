/*
 * Faca um programa que leia um numero inteiro positivo de tres dıgitos (de 100 a 999).
 * Gere outro numero formado pelos dıgitos invertidos do numero lido. Exemplo: 
 * numeroLido = 123, numeroGerado = 321.
 */
import java.util.*;
public class atividade12{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        //declarando variáveis
        int numero = 0, unidade = 0, dezena=0, centena = 0 ;

        //entrada de dados e armazenando o que o usuário informou
        System.out.println("Informe um número de 3 digitos");
        numero = sc.nextInt();

        //calculo para poder inverter o número informado
        centena = numero / 100;
        dezena = (numero % 100) /10;
        unidade = numero % 10;

        //saída de dados monstrando na tela o valor final
        System.out.println("O número informado ao sistema invetido é:" +unidade +dezena +centena);

        System.out.println("-------O programa foi finalizado------");

        sc.close();
    }
}