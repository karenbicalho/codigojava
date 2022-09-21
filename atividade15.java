import java.util.*;
public class atividade15 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        //declarando variáveis
        int mes, ano, dias;

        //entrada de dados e armazenando o que o usuário informou
        System.out.println("Informe sua idade em anos: ");
        ano= sc.nextInt();
        System.out.print("Informe sua idade em dias: ");
        dias = sc.nextInt();
        System.out.print("Informe sua idade em mes: ");
        mes = sc.nextInt();

        //calculando
        dias = (dias +(ano * 365) + (mes * 30));


       //saída de dados monstrando na tela para o usuário o que foi pedido
        System.out.print("o valor total de idade em dias é: " +dias);

        
        System.out.println("-------O programa foi finalizado------");

        sc.close();
    }
}
