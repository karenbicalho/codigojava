/* Escreva um programa que leia um número e informe se ele é dividivel por 3 ou por 5,
 * ou pelos dois ao mesmo tempo.
 */
import java.util.*;
public class divisor {
    public static void main(String [] args){

        Scanner sc  = new Scanner(System.in);

        //declarando de variável
        int numero;

        //entrada e armazenamento de dados que o usuário vai informar ao sistema
        System.out.println("Informe um numero aleatorio: ");
        numero=sc.nextInt();

        //saída de dados informando para o usuário com as operações do número informado
        if(numero % 3 ==0){
            System.out.println("Este numero e divisivel por 3");
        }else if(numero % 5 ==0){
            System.out.println("Este numero e divisivel por 5");
        } else if(numero % 3 ==0 && numero % 5 ==0){
            System.out.println("Este numero e divisivel por 3 e 5");
        } else{
            System.out.println("NUMERO INVALIDO");
        }
        System.out.println("-------O programa foi finalizado------");
        sc.close();
    }
}
