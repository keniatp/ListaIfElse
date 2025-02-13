import java.util.Scanner;

public class MediasENotas {
    public static void main(String[] args) {
        int sair = 1;
        Scanner sc = new Scanner(System.in);
        while (sair == 1) {
            System.out.println("\n\n----- MÉDIAS E NOTAS ----- \nEscolha um dos exercicios abaixo \n1 - 2 - 3 - 4 - 5 \nDigite 0 (zero) para sair! :\n");
            int escolha = sc.nextInt();
            switch (escolha) {
                case 0:
                    sair = 0;
                break;

                case 1:
                    System.out.println("======= Questão 1 ======= ");
                    System.out.println("Digite a primeira nota: ");
                    float nota1 = sc.nextFloat();
                    System.out.println("Digite a segunda nota: ");
                    float nota2 = sc.nextFloat();
                    float media = (nota1 + nota2)/2;

                    if (media >= 7) {
                        System.out.println("Aprovado!");
                    }else{
                        System.out.println("Reprovado");
                    }
                   break;

                case 2:
                    System.out.println("======= Questão 2 ======= ");
                    System.out.println("Digite a primeira nota: ");
                    float nota01 = sc.nextFloat();
                    System.out.println("Digite a segunda nota: ");
                    float nota02 = sc.nextFloat();
                    float mediaAluno = (nota01 + nota02)/2;

                    if (mediaAluno >= 7) {
                        System.out.println("Aprovado!");
                    }else if (mediaAluno >= 5 && mediaAluno < 7) {
                        System.out.println("Recuperação");
                    }else{
                        System.out.println("Reprovado");
                    }
                    break;
                    
                case 3:
                    System.out.println("======= Questão 3 ======= ");
                    float notas[] = new float[3];
                    System.out.println("Digite a primeira nota: ");
                    notas[0] = sc.nextFloat();  
                    System.out.println("Digite a segunda nota: ");
                    notas[1] = sc.nextFloat();     
                    System.out.println("Digite a terceira nota: ");
                    notas[2] = sc.nextFloat();  
                    float menor = notas[0];
                    float maior = notas[0];

                    for(int i = 1; i < 3; i++){
                        if (notas[i] < menor) {
                            menor = notas[i];
                        }
                        if (notas[i] > maior) {
                            maior = notas[i];
                        }
                    }

                    System.out.println("A maior nota: " + maior + "\nA menor nota: " + menor);
                    break;
                    
                case 4:
                    System.out.println("======= Questão 4 ======= ");
                    System.out.println("Digite a nota: ");
                    float isMaxima = sc.nextFloat();
                    if (isMaxima >= 10) {
                        System.out.println("O aluno foi aprovado com nota máxima!");
                    }
                    break;
                
                case 5:
                    sc.nextLine();
                    System.out.println("======= Questão 5 ======= ");
                    System.out.println("Escreva a 1º disciplina que o aluno foi aprovado: ");
                    String disciplina1 = sc.nextLine();
                    System.out.println("Escreva a 2º disciplina que o aluno foi aprovado: ");
                    String disciplina2 = sc.nextLine();

                    if (!(disciplina1.equalsIgnoreCase(disciplina2))) {
                        System.out.println("O aluno foi aprovado em 2 disciplinas diferentes");
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
