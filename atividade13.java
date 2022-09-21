/*
 * Leia um numero inteiro de 4 dıgitos (de 1000 a 9999) e imprima 1 dıgito por linha.
 */
import java.util.*;
public class atividade13{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);

        //declarando variáveis
        int numero, m, c, d, u;
        
        //entrada de dados e armazenando o que o usuário informou
        System.out.println("Informe um número aleatório: ");
        numero = sc.nextInt();

        //calculando o valor e mostrando na tela para o usuário
        m=numero/1000;
        c=numero/100-10*m;
        d=numero/10-100*m-10*c;
        u=numero/1-1000*m-100*c-10*d;
        System.out.println(m);
        System.out.println(c);
        System.out.println(d);
        System.out.println(u);
        
        System.out.println("-------O programa foi finalizado------");
        sc.close();
    }
}