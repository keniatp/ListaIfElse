import java.util.Scanner;
public class CategoriaEClassificacao {
    public static void main(String[] args) {
        int sair = 1;
        Scanner sc = new Scanner(System.in);
        while (sair == 1) {
            System.out.println("\n\n----- CATEGORIA E CLASSIFICAÇÃO ----- \nEscolha um dos exercicios abaixo \n1 - 2 - 3 - 4 - 5 \nDigite 0 (zero) para sair! :\n");
            int escolha = sc.nextInt();
            sc.nextLine(); //Limpar meus scaners
            switch (escolha) {
                case 0:
                    sair = 0;
                    break;

                case 1:
                    System.out.println("======= Questão 1 ======= ");
                    System.out.print("Insira uma idade: ");
                    int idade = sc.nextInt();

                    if (idade > 0 && idade < 12){
                        System.out.println("Essa pessoa é uma criança: ");
                    } else if (idade >= 12 && idade < 18) {
                        System.out.println("Essa pessoa é um adolescente: ");
                    } else if (idade >= 18 && idade < 60) {
                        System.out.println("Essa pessoa é um adulto: ");
                    } else if (idade >= 60) {
                        System.out.println("Essa pessoa é um idoso: ");
                    } else {
                        System.out.println("Idade invalida!");
                    }
                    break;

                case 2:
                    System.out.println("======= Questão 2 ======= ");
                    System.out.print("Insira um numero de 1 até 30: ");
                    int numero = sc.nextInt();

                    if (numero > 0 && numero <= 10){
                        System.out.printf("O numero pertence ao grupo A");
                    } else if (numero > 10 && numero <= 20) {
                        System.out.printf("O numero pertence ao grupo B");
                    } else if (numero > 20 && numero <= 30){
                        System.out.printf("O numero pertence ao grupo C");
                    } else {
                        System.out.println("O numero inserido não pertence a nenhum grupo.");
                    }
                    break;

                case 3:
                    System.out.println("======= Questão 3 ======= ");
                    System.out.print("Digite seu tamanho: ");
                    double tamanho = sc.nextDouble();

                    if (tamanho < 1.60){
                        System.out.println("Baixa estatura.");
                    } else if (tamanho >= 1.60 && tamanho <= 1.75) {
                        System.out.println("Estatura Média.");
                    } else {
                        System.out.println("Estatura Alta");
                    }
                    break;

                case 4:
                    System.out.println("======= Questão 4 ======= ");
                    System.out.print("Insira sua pressão arterial: ");
                    double pressao = sc.nextDouble();

                    if(pressao <= 13 && pressao >= 10){
                        System.out.print("\nSua pressão arterial está normal!");

                    } else if (pressao >= 14 ){
                        System.out.print("\nSua pressão arterial está alta!");

                    } else {
                        System.out.print("\nSua pressão arterial está baixa!");
                    }
                    break;

                case 5:
                    System.out.println("======= Questão 5 ======= ");
                    System.out.print("Insira a temperatura: ");
                    double temperatura = sc.nextDouble();

                    if(temperatura >= 21 && temperatura <= 26){
                        System.out.print("A temperatura está normal!");

                    } else if (temperatura <= 20){
                        System.out.print("A temperatura está baixa!");

                    }else {
                        System.out.print("A temperatura está alta!");
                    }
                    break;

                default:
                    System.out.println("Valor inválido!\n");
                    break;
            }
        }
        sc.close();
    }
}
