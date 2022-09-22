/*Programa que calcule a área de um trapézio a partir da informações 
  dadas pelo usuário.
    */
import java.util.*;
public class areatrapezio {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        //declaração de variáveis
        Float basemaior, basemenor, altura, area;
      
        //entrada e armazenamento de dados que o usuário vai informar ao sistema
        System.out.println("Informe a altura do trapézio: ");
        altura = sc.nextFloat();
        System.out.println("Informe a base maior trapézio: ");
        basemaior = sc.nextFloat();
        System.out.println("Informa base menor trapézio: ");
        basemenor= sc.nextFloat();

        //calculando o valor da área do trapezio
        area = (basemaior + basemenor) * altura/ 2;
        
        //saída de dados informando para o usuário o valor total da área 
        System.out.println("A área do trapézio é: " +area);

        System.out.println("-------O programa foi finalizado------");
        
        sc.close();
    }
}
