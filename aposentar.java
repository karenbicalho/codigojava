
import java.util.*;
public class atividade5{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        //declaração de variáveis
        int tempo, idade;
        
        //entrada e armazenamento de dados que o usuário vai informar ao sistema
        System.out.println("Informe a sua idade: ");
        idade= sc.nextInt();
        System.out.println("Informe o tempo de serviços prestado: ");
        tempo = sc.nextInt();

        //saída de dados informando para o usuário com as operações do número informado
        if((idade >= 65 ) || (tempo >= 30) || (idade>=60 && tempo >= 25)){
            System.out.println("Voce pode aposentar");
        }else{
            System.out.println("Voce nao pode aposentar");
        }
        System.out.println("-------O programa foi finalizado------");

        sc.close();

    }
}