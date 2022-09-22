/* Faca um programa que, dado tres valores a, b e c, verifique se o triângulo
 * é equilátero, isóceles ou escaleno.Caso contrario seu programa deve e escrever 
 * a mensagem "NÃO FORMAM UM TRIANGULO"
 */
import java.util.*;
public class tipotriangulo{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        
        //declaração de variáveis
        float ladoA, ladoB, base;
        
        //entrada e armazenamento de dados que o usuário vai informar ao sistema
        System.out.println("Informe um lado do triangulo: ");
        ladoA = sc.nextFloat();
        System.out.println("Informe o outro lado do triangulo: ");
        ladoB = sc.nextFloat();
        System.out.println("Informe a base do triangulo: ");
        base = sc.nextFloat();

        //saída de dados informando para o usuário com as operações do número informado
        if( (ladoA == ladoB ) && (ladoB == base)){
            System.out.println("Este triangulo e equilatero");

        }else if((ladoA == ladoB) || (base == ladoA) || (base ==ladoB)){
            System.out.println("Este triangulo e isosceles");

        }else if( (ladoA != ladoB) && (ladoB != base) && (ladoB != base) ){
            System.out.println("Este triangulo e escaleno");
        }else{
            System.out.println("Os dados informados ao sistema NAO FORMAM UM TRIANGULO");
        }

        System.out.println("-------O programa foi finalizado------");
        sc.close();
    }
}
