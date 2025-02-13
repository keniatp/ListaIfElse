import java.util.Scanner;
public class DataEhorario {
    public static void main(String[] args) {
        int sair = 1;
        Scanner sc = new Scanner(System.in);
        while (sair == 1) {
            System.out.println("\n\n----- DATAS E HORÁRIOS ----- \nEscolha um dos exercicios abaixo \n1 - 2 - 3 - 4 - 5 \nDigite 0 (zero) para sair! :\n");
            int escolha = sc.nextInt();
            sc.nextLine(); //Limpar meus scaners
            switch (escolha) {
                case 0:
                    sair = 0;
                    break;

                case 1:
                    System.out.println("======= Questão 1 ======= ");
                    System.out.println("Insira as horas atuais abaixo.");
                    System.out.print("Horas: ");
                    int horas = sc.nextInt();
                    System.out.print("Minutos: ");
                    int minutos = sc.nextInt();

                    if (horas >= 0 && horas < 24 && minutos >= 0 && minutos < 60){
                        System.out.printf("Horario válido: %d:%d", horas, minutos);
                    } else {
                        System.out.println("Horário invalido.");
                    }
                    break;

                case 2:
                    System.out.println("======= Questão 2 ======= ");
                    System.out.print("Insira o mes (em numero): ");
                    int mes = sc.nextInt();

                    if (mes > 0 && mes <= 12) {
                        System.out.println("Mes válido.");
                    } else {
                        System.out.println("Mes inválido.");
                    }
                    break;

                case 3:
                    System.out.println("======= Questão 3 ======= ");
                    System.out.print("Insira um dia do mes de dezembro: ");
                    int dia = sc.nextInt();

                    if (dia > 0 && dia <= 31) {
                        System.out.println("Dia válido");
                    } else {
                        System.out.println("Dia inválido.");
                    }
                    break;

                case 4:
                    System.out.println("======= Questão 4 ======= ");
                    System.out.print("Insira a hora: ");
                    double horario = sc.nextDouble();

                    if (horario >= 0 && horario <= 12){
                        System.out.print("Período da manhã!");
                    } else if (horario >= 13 && horario <= 17){
                        System.out.print("Período da tarde");
                    }else if(horario > 17 && horario <= 23) {
                        System.out.print("Periodo da noite!");
                    }else{
                        System.out.print("Horário inválido!");
                    }
                    break;

                case 5:
                    System.out.println("======= Questão 5 ======= ");
                    int dataIn = 20230101;
                    int dataFin = 20231231;
                    int dataEsp = 20230615;

                    if (dataEsp >= dataIn && dataEsp <= dataFin) {
                        System.out.println("A data está dentro do período!");
                    } else {
                        System.out.println("A data está fora do período.");
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