import java.util.Scanner;
public class DecisaoFinanceira {
    public static void main(String[] args) {
        int sair = 1;
        Scanner sc = new Scanner(System.in);
        while (sair == 1) {
            System.out.println("\n\n----- DECISÕES FINANCEIRAS ----- \nEscolha um dos exercicios abaixo \n1 - 2 - 3 - 4 - 5 \nDigite 0 (zero) para sair! :\n");
            int escolha = sc.nextInt();
            sc.nextLine(); //Limpar meus scaners
            switch (escolha) {
                case 0:
                    sair = 0;
                    break;

                case 1:
                    System.out.println("======= Questão 1 ======= ");
                    double saldo = 500.0;
                    System.out.print("Digite o valor do saque: ");
                    double saque = sc.nextDouble();

                    if(saque <= saldo){
                        System.out.print("Saque concluído! ");
                    } else {
                        System.out.print("Saldo insuficiente!");
                    }
                    break;

                case 2:
                    System.out.println("======= Questão 2 ======= ");
                    System.out.print("Insira o valor da compra: ");
                    double compra = sc.nextDouble();
                    double desconto = compra * 0.10;
                    double valorFinal = compra - desconto;

                    if (compra > desconto){
                        System.out.println("Valor da compra: " +compra+ "\nDesconto da compra: " +desconto + "\nValor final: " + valorFinal);
                    }
                    break;

                case 3:
                    System.out.println("======= Questão 3 ======= ");
                    System.out.print("Insira seu salario: ");
                    double salario = sc.nextDouble();

                    if (salario >= 3000){
                        System.out.print("Você pode financiar um imóvel");
                    } else {
                        System.out.print("Você não pode financiar um imóvel");
                    }
                    break;

                case 4:
                    System.out.println("======= Questão 4 ======= ");
                    System.out.print("Insira o valor do seu salario: ");
                    double sal = sc.nextDouble();
                    System.out.print("\nInsira o valor de cada parcela: ");
                    double valorParcela = sc.nextDouble();
                    if(valorParcela <= (sal * 0.10)) {
                        System.out.println("Você pode comprar o produto!");
                    }else{
                            System.out.println("Você não pode comprar esse produto!");
                    }
                    break;

                case 5:
                    System.out.println("======= Questão 5 ======= ");
                    System.out.print("Insira o valor da sua compra: ");
                    double valorCompra = sc.nextDouble();

                    if (valorCompra >= 50.0){
                        System.out.println("Você pode resgatar o seu brinde!");
                    } else {
                        System.out.println("O minimo pra resgatar o brinde não foi atingido");
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
