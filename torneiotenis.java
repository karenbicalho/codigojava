/*A prefeitura contratou um novo professor para ensinar as crianças do bairro a jogar tênis na quadra de tênis do parque municipal. O professor convidou todas as crianças do bairro interessadas em aprender a jogar tênis. Ao final do primeiro mês de aulas e treinamentos foi organizado um torneio em que cada participante disputou exatamente seis jogos. O professor vai usar o desempenho no torneio para separar as crianças em três grupos, de forma a ter grupos de treino em que os participantes tenham habilidades mais ou menos iguais, usando o seguinte critério:

participantes que venceram 5 ou 6 jogos serão colocados no Grupo 1;
participantes que venceram 3 ou 4 jogos serão colocados no Grupo 2;
participantes que venceram 1 ou 2 jogos serão colocados no Grupo 3;
participantes que não venceram nenhum jogo não serão convidados a continuar com os treinamentos. */

import java.util.*;
public class torneiotenis{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

//declarando as variáveis

char primeiro, segundo, terceiro, quarto, quinto, sexto;

// entrada de dados onde usuário informa se perdeu ou ganhou o jogo e armazena informação

System.out.println("----Responda as perguntas com F para falso e V para verdadeiro:----");
System.out.println("Você venceu o primeiro jogo?");
primeiro = sc.next().charAt(0);
System.out.println("Você venceu o segundo jogo?");
segundo = sc.next().charAt(0);
System.out.println("Você venceu o terceiro jogo?");
terceiro = sc.next().charAt(0);
System.out.println("Você venceu o quarto jogo?");
quarto = sc.next().charAt(0);
System.out.println("Você venceu o quinto jogo?");
quinto = sc.next().charAt(0);
System.out.println("Você venceu o sexto jogo?");
sexto = sc.next().charAt(0);

//saíde da dados retornando ao usuário o que foi pedido

if (sexto == 'v' || quinto == 'v'){
System.out.println(" Você foi escalado para o Grupo 1");
}
else if(terceiro == 'v' || quarto == 'v'){
System.out.println(" Você foi escalado para o Grupo 2");
}
else if (primeiro == 'v' || segundo == 'v'){
System.out.println(" Você foi escalado para o Grupo 3");
}else {
System.out.println("-1");
}
System.out.println("-------O programa foi finalizado------");
sc.close();
}
}
