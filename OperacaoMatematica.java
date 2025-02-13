import java.util.Scanner;
public class OperacaoMatematica {
    public static void main(String[] args) {
        int sair = 1;
        Scanner sc = new Scanner(System.in);
        while (sair == 1) {
            System.out.println("\n\n----- OPERAÇÕES MATEMATICAS ----- \nEscolha um dos exercicios abaixo \n1 - 2 - 3 - 4 - 5 \nDigite 0 (zero) para sair! :\n");
            int escolha = sc.nextInt();
            sc.nextLine(); //Limpar meus scaners
            switch (escolha) {
                case 0:
                    sair = 0;
                    break;

                case 1:
                    System.out.println("======= Questão 1 ======= ");
                    System.out.println("Digite o primeiro numero: ");
                    int num1 = sc.nextInt();
                    System.out.println("Digite o segundo numero: ");
                    int num2 = sc.nextInt();
                    if ((num1 + num2)>100){
                        System.out.println("A soma de dos valores é maior que 100: ( é: "+ (num1+num2)+")" );
                    }else{
                        System.out.println("A soma de dos valores é menor que 100: ( é: "+ (num1+num2)+")" );
                    }
                    break;

                case 2:
                    System.out.println("======= Questão 2 ======= ");
                    System.out.print("Insira o 1° número: ");
                    double numero1 = sc.nextDouble();

                    System.out.print("Insira o 2° número: ");
                    double numero2 = sc.nextDouble();
                    double diferenca = numero1 - numero2;

                    if (diferenca < 0){
                        System.out.print("\nA diferença é negativa!");
                    } else {
                        System.out.print("\nA diferença não é negativa!");
                    }
                    break;

                case 3:
                    System.out.println("======= Questão 3 ======= ");
                    System.out.print("Insira o 1° número: ");
                    double n1 = sc.nextDouble();

                    System.out.print("Insira o 2° número: ");
                    double n2 = sc.nextDouble();

                    if (n1 % n2 == 0){
                        System.out.print("\nO número é divisível pelo outro!");
                    } else {
                        System.out.print("\nO número não é divisível pelo outro!");
                    }
                    break;

                case 4:
                    System.out.println("======= Questão 4 ======= ");
                    System.out.print("Insira o primeiro numero: ");
                    int num01 = sc.nextInt();

                    System.out.print("Insira o segundo numero: ");
                    int num02 = sc.nextInt();

                    System.out.print("Insira o terceiro numero: ");
                    int num03 = sc.nextInt();
                    if (num01 < num02 + num03 && num02 < num01 + num03 && num03 < num01 + num02){
                        if (num01 == num02 && num01 == num03) {
                            System.out.println("\nEsses 3 números formam um triangulo equilátero.");
                        } else if (num01 == num02 || num01 == num03){
                            System.out.println("\nEsses 3 números formam um triangulo isosceles.");
                        } else {
                            System.out.println("\nEsses 3 números formam um triangulo escaleno.");
                        }
                    } else {
                        System.out.println("\nEsses números não formam um triângulo...");
                    }
                    break;

                case 5:
                    System.out.println("======= Questão 5 ======= ");
                    System.out.print("Insira um numero: ");
                    int valor = sc.nextInt();
                    double raiz = Math.sqrt(valor);
                    double numeroDecimal = raiz - (int)raiz;

                    if (numeroDecimal == 0){
                        System.out.println("O numero é um quadrado perfeito!");
                    } else {
                        System.out.printf("O numero não é um quadrado perfeito!");
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
