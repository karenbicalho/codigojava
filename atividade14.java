/*
 * Leia um valor inteiro em segundos, e imprima-o em horas, minutos e segundos.
 */
import java.util.*;
public class atividade14{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);

        //declarando variáveis
        int segundosinformado, hora, minutos, segundos, sobra;

        //entrada de dados e armazenando o que o usuário informou
        System.out.println("Informe os segundos desejatado: ");
        segundosinformado = sc.nextInt();

        //calculo 
        hora = segundosinformado / 3600;
        sobra = segundosinformado % 3600;
        minutos = sobra / 60;
        segundos = sobra % 60;

        //saída de dados monstrando na tela para o usuário a hora minuro e segundo 
        System.out.println(hora);
        System.out.println(minutos);
        System.out.println(segundos);

        System.out.println("-------O programa foi finalizado------");
        
        sc.close();
    }
}
