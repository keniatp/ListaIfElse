import java.util.Random;
import java.util.Scanner;
public class DesafioEjogo {
    public static void main(String[] args) {
        int sair = 1;
        Scanner sc = new Scanner(System.in);
        while (sair == 1) {
            System.out.println("\n\n----- DESAFIOS E JOGOS ----- \nEscolha um dos exercicios abaixo \n1 - 2 - 3 - 4 - 5 \nDigite 0 (zero) para sair! :\n");
            int escolha = sc.nextInt();
            sc.nextLine(); //Limpar meus scaners
            switch (escolha) {
                case 0:
                    sair = 0;
                    break;

                case 1:
                    System.out.println("======= Questão 1 ======= ");
                    System.out.print("Insira o primeiro valor: ");
                    double num1 = sc.nextDouble();
                    System.out.print("Insira o segundo valor: ");
                    double num2 = sc.nextDouble();

                    if (num1 >= 0 && num2 >= 0){
                        System.out.print("Os dois valores são positivos");
                    } else if ( num1 < 0 && num2 < 0){
                        System.out.print("Os dois valores são negativos.");
                    }else {
                        System.out.println("Os valores são diferentes.");
                    }
                    break;

                case 2:
                    System.out.println("======= Questão 2 ======= ");
                    System.out.print("Insira o primeiro valor: ");
                    double n1 = sc.nextDouble();

                    System.out.print("Insira o segundo valor: ");
                    double n2 = sc.nextDouble();

                    if (n1 > (2 * n2)) {
                        System.out.print(n1 + " é maior que o dobro de " + n2);
                    } else {
                        System.out.print(n1 + " não é maior que o dobro de " + n2);
                    }
                    break;

                case 3:
                    System.out.println("======= Questão 3 ======= ");
                    int numeroSecreto = 23;
                    System.out.print("Insira um número: ");
                    int numero = sc.nextInt();

                    if (numero == numeroSecreto){
                        System.out.print("Número secreto correto!");
                    } else {
                        System.out.println("Número secreto não é este!");
                    }
                    break;

                case 4:
                    System.out.println("======= Questão 4 ======= ");
                    int valores[] = new int[3];
                    System.out.print("Insira o primeiro valor: ");
                    valores[0] = sc.nextInt();
                    System.out.print("Insira o segundo valor: ");
                    valores[1] = sc.nextInt();
                    System.out.print("Insira o terceiro valor: ");
                    valores[2] = sc.nextInt();

                    if (valores[0] > valores[1]) {
                        int temp = valores[0];
                        valores[0] = valores[1];
                        valores[1] = temp;
                    }

                    if (valores[1] > valores[2]) {
                        int temp = valores[1];
                        valores[1] = valores[2];
                        valores[2] = temp;
                    }

                    if (valores[0] > valores[1]) {
                        int temp = valores[0];
                        valores[0] = valores[1];
                        valores[1] = temp;
                    }

                    System.out.print("Valores ordenados \n");
                    for (int i = 0; i < valores.length; i++) {
                        System.out.print(valores[i] + " ");
                    }

                    break;

                case 5:
                    System.out.println("======= Questão 5 ======= ");
                    Random sorteio = new Random();
                    int numeroSorteado = sorteio.nextInt(10) + 1;
                    System.out.print("Digite um numero de 1 a 10: ");
                    int tentativa = sc.nextInt();

                    if (tentativa == numeroSorteado) {
                        System.out.println("Você acertou!!");
                    } else {
                        System.out.println("Você errou! \nNumero sorteado: " + numeroSorteado);
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