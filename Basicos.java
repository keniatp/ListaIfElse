import java.util.Scanner;

public class Basicos {
    public static void main(String[] args) {
        int sair = 1;
        Scanner sc = new Scanner(System.in);
        while (sair == 1) {
            System.out.println("\n\n----- BASICO ----- \nEscolha um dos exercicios abaixo \n1 - 2 - 3 - 4 - 5 \n6 - 7 - 8 - 9 - 10 \nDigite 0 (zero) para sair! :\n");
            int escolha = sc.nextInt();
            switch (escolha) {
                case 0:
                    sair = 0;
                break;

                case 1:
                    System.out.println("======= Questão 1 ======= ");
                    System.out.println("Digite um numero: ");
                    int verifica = sc.nextInt();
                    if (verifica > 0) {
                        System.out.println("Numero Positivo!");
                    }else{
                        System.out.println("Numero negativo!");
                    }
                    break;

                case 2:
                    System.out.println("======= Questão 2 ======= ");
                    System.out.println("Digite um numero: ");
                    int isPar = sc.nextInt();
                    if (isPar%2 ==  0) {
                        System.out.println("Numero Par");
                    }else{
                        System.out.println("Numero ímpar!");
                    }
                    break;
                    
                case 3:
                    System.out.println("======= Questão 3 ======= ");
                    System.out.println("Digite o primeiro numero: ");
                    int num1 = sc.nextInt();
                    System.out.println("Digite o segundo numero: ");
                    int num2 = sc.nextInt();

                    if (num1 > num2) {
                        System.out.println(num1 + " maior que " + num2);
                    }else{
                        System.out.println(num2 + " maior que " + num1);
                    }
                    break;
                    
                case 4:
                    System.out.println("======= Questão 4 ======= ");
                    System.out.println("Digite sua idade");
                    int idade = sc.nextInt();
                    if (idade >= 16) {
                        System.out.println("Voce pode votar!");
                    } else {
                        System.out.println("Voce não pode votar!");
                    }
                    break;
                
                case 5:
                    System.out.println("======= Questão 5 ======= ");
                    System.out.println("Digite o primeiro numero: ");
                    int primeiro = sc.nextInt();
                    System.out.println("Digite o segundo numero: ");
                    int segundo = sc.nextInt();
                    System.out.println("Digite o terceiro numero: ");
                    int terceiro = sc.nextInt();

                    if (primeiro > segundo && primeiro > terceiro) {
                        System.out.println("O " + primeiro + " é o maior numero");
                    } else if(segundo > primeiro && segundo > terceiro) {
                        System.out.println("O " + segundo + " é o maior numero");
                    }else{
                        System.out.println("O " + terceiro + " é o maior numero");
                    }
                    break;
                
                case 6:
                    System.out.println("======= Questão 6 ======= ");
                    System.out.println("Digite o ano: ");
                    int ano = sc.nextInt();
                    int bissexto = ano%100;

                    if (bissexto%4==0){
                        System.out.println(ano + " é um ano bissexto!");
                    }else{
                        System.out.println(ano + " não é um ano bissexto!");
                    }
                    break;
                
                case 7:
                    System.out.println("======= Questão 7 ======= ");
                    System.out.println("Digite um numero: ");
                    int isMultiplo = sc.nextInt();
                    if (isMultiplo%5 == 0) {
                        System.out.println(isMultiplo + " é multiplo de 5");
                    }else{
                        System.out.println(isMultiplo + " não é multiplo de 5");
                    }
                    
                    break;
                
                case 8:
                    System.out.println("======= Questão 8 ======= ");
                    System.out.println("Digite um caractere: ");
                    char letra = Character.toLowerCase(sc.next().charAt(0));
                    if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                        System.out.println("É uma vogal");
                    }else{
                        System.out.println("Não é uma vogal");
                    }

                    break;
                    
                case 9:
                    System.out.println("======= Questão 9 ======= ");
                    System.out.println("Digite um valor: ");
                    int x = sc.nextInt();
                    if (x >= 10 && x <= 50){
                        System.out.println("O valor esta entre 10 e 50!");
                    }else{
                        System.out.println("O valor não esta entre 10 e 50!");
                    }
                    break;
                    
                case 10:
                    System.out.println("======= Questão 10 ======= ");
                    System.out.println("Digite um valor: ");
                    int valor = sc.nextInt();
                    if (valor >= 100 && valor <= 200){
                        System.out.println("O valor esta entre 100 e 200!");
                    }else{
                        System.out.println("O valor não esta entre 100 e 200!");
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
