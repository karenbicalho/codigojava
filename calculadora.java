/*
 * Calculadora simples com quatro opçõs de operadores matématicos
 */
import java.util.*;
public class calculadora {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        //declarando variáveis
        int num1, num2, soma, subtracao, divisao, multiplicacao;
        char op;

        //entrada de dados e armazenando o que o usuário informou
        System.out.println("Favor escolher um oprador matemático [ + / * - ]: ");
        op = sc.next().charAt(0);
        System.out.println("Insira um número aleátorio: ");
        num1 = sc.nextInt();
        System.out.println("Insira um outro número aleátorio: ");
        num2 = sc.nextInt();

        //saída de dados monstrando na tela o valor final 
        if( op == '+'){
           soma =num1 + num2;
           System.out.println("A soma dos numero informados é: " +soma);
        }else if( op == '-'){
            subtracao = num1 - num2;
            System.out.println("A subtração dos numero informados é: " +subtracao);
        }else if (op == '*'){
            multiplicacao = num1 * num2;
            System.out.println("A multiplicação dos numero informados é: " +multiplicacao);
        }else if ( op == '/'){
            divisao = num1 / num2;
            System.out.println("A divisão dos numero informados é: " +divisao);
        }else{
            
            System.out.println("A opção escolhida de operador matemático é inválida");
        }
        
        System.out.println("-------O programa foi finalizado------");

        sc.close();

    }
}
