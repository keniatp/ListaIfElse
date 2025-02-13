import java.util.Scanner;
public class CondComString {
    public static void main(String[] args) {
        int sair = 1;
        Scanner sc = new Scanner(System.in);
        while (sair == 1) {
            System.out.println("\n\n----- CONDIÇÕES COM STRINGS ----- \nEscolha um dos exercicios abaixo \n1 - 2 - 3 - 4 - 5 \nDigite 0 (zero) para sair! :\n");
            int escolha = sc.nextInt();
            sc.nextLine(); //Limpar meus scaners
            switch (escolha) {
                case 0:
                    sair = 0;
                    break;

                case 1:
                    System.out.println("======= Questão 1 ======= ");
                    System.out.println("Digite sim ou nao: ");
                    String simOrnao = sc.nextLine().toLowerCase();
                    if (simOrnao.equals("sim")){
                        System.out.println("Foi digitado Sim");
                    }else if(simOrnao.equals("nao")){
                        System.out.println("Foi digitado Nao");
                    }else{
                        System.out.println("Nao reconhecido!");
                    }
                    break;

                case 2:
                    System.out.println("======= Questão 2 ======= ");
                    int senha = 1234;
                    System.out.println("Digite uma senha: (em numeros)");
                    int tentativa = sc.nextInt();
                    if (tentativa == senha){
                        System.out.println("Senha correta!");
                    }else{
                        System.out.println("Senha incorreta!");
                    }
                    break;

                case 3:
                    System.out.println("======= Questão 3 ======= ");
                    System.out.println("Digite um nome: ");
                    String nome = sc.nextLine();
                    char letraNome = nome.charAt(0);
                    if (letraNome == 'A' || letraNome == 'a'){
                        System.out.println("O nome começa com A");
                    }else{
                        System.out.println("O nome não começa com A");
                    }
                    break;

                case 4:
                    System.out.println("======= Questão 4 ======= ");
                    System.out.print("Insira uma palavra: ");
                    String palavra = sc.nextLine();
                    int quantLetras = palavra.length();
                    if (quantLetras > 5){
                        System.out.println("Essa palavra tem MAIS de 5 letras!");
                    } else {
                        System.out.println("Essa palavra tem MENOS de 5 letras!");
                    }
                    break;

                case 5:
                    System.out.println("======= Questão 5 ======= ");
                    System.out.print("Insira a primeira palavra: ");
                    String palavra1 = sc.nextLine().toLowerCase();

                    System.out.print("Insira a segunda palavra: ");
                    String palavra2 = sc.nextLine().toLowerCase();

                    if (palavra1.equals(palavra2)) {
                        System.out.println("\nAs palavras são iguais");
                    } else {
                        System.out.println("\nAs palavras não são iguais");
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
