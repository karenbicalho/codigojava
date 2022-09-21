/*
 *  Escreva um programa de ajuda para vendedores. A partir de um valor total lido, mostre: 
 * o total a pagar com desconto de 10%; o valor de cada parcela, no parcelamento de 3× sem
 *  juros; a comissao do vendedor, no caso da venda ser parcelada (5% sobre o valor total).
 */
import java.util.*;
public class atividade20 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        //declarando variáveis
        float valor, desconto, parcela, comisao1, comisao2, compra;

        //entrada de dados e armazenando o que o usuário informou
        System.out.println("Informe o valor referente a compra: ");
        valor = sc.nextFloat();

        //calculando desconto, comissão e parcela
        desconto = valor * 10 / 100;
        compra = valor - desconto;
        parcela = valor / 3;
        comisao1 = compra * 5 / 100;
        comisao2 = valor * 5 / 100;

        //saída de dados monstrando na tela o valor final 
        System.out.println("O valor da compra com desconto: " +compra);
        System.out.println("O valor da compra parcelada em 3 vezes: " +parcela);
        System.out.println("O valor da comissão se a compra for a vista: " +comisao1);
        System.out.println("O valor da comissão se a compra for parcelada: " +comisao2);

        System.out.println("-------O programa foi finalizado------");

        sc.close();
    }
}
