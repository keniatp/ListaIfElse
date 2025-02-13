package org.example;

import java.util.Random;
import java.util.Scanner;
public class SituacoesCotidianas {
    public static void main(String[] args) {
        int sair = 1;
        Scanner sc = new Scanner(System.in);
        while (sair == 1) {
            System.out.println("\n\n----- SITUAÇÕES COTIDIANAS ----- \nEscolha um dos exercicios abaixo \n1 - 2 - 3 - 4 - 5 \nDigite 0 (zero) para sair! :\n");
            int escolha = sc.nextInt();
            sc.nextLine(); //Limpar meus scaners
            switch (escolha) {
                case 0:
                    sair = 0;
                    break;

                case 1:
                    System.out.println("======= Questão 1 ======= ");
                    System.out.println("Digite o numero da placa: ");
                    int placa = sc.nextInt();
                    int ultimoDigito = placa%10;
                    if (ultimoDigito % 2 == 0){
                        System.out.println("A placa com final par " + ultimoDigito + ": pode passar");
                    }else if (ultimoDigito % 2 == 1){
                        System.out.println("A placa com final impar " + ultimoDigito + ": pode passar");
                    }else{
                        System.out.println("Nao pode passar!");
                    }
                    break;

                case 2:
                    System.out.println("======= Questão 2 ======= ");
                    int codigoAcesso = 003231;
                    System.out.println("Digite o codigo de acesso: ");
                    int codigo = sc.nextInt();
                    if (codigo == codigoAcesso){
                        System.out.println("Codigo correspondente!");
                    }else{
                        System.out.println("Os codigos não sao correspondentes");
                    }
                    break;

                case 3:
                    System.out.println("======= Questão 3 ======= ");
                    System.out.println("Digite um valor em Celsius: ");
                    double celsius = sc.nextDouble();
                    System.out.println("Digite 1 para transformar em Fahrenheit \nDigite 2 para transformar em Kelvin");
                    int op = sc.nextInt();

                    if (op == 1){
                        double Fahrenheit = (celsius*1.8) + 32;
                        System.out.println("Fahrenheit: " + Fahrenheit);
                    }else if(op == 2){
                        double Kelvin = celsius+273.15;
                        System.out.println("Kelvin: " + Kelvin);
                    }else{
                        System.out.println("Opcao invalida");
                    }
                    break;

                case 4:
                    System.out.println("======= Questão 4 ======= ");
                    System.out.println("Digite sua idade: ");
                    int idade = sc.nextInt();
                    System.out.println("Digite seu peso: ");
                    double peso = sc.nextDouble();

                    if ((idade >= 18 && idade <= 65) && (peso >= 50)){
                        System.out.println("Esta apto(a) a doar sangue");
                    }else{
                        System.out.println("Não esta apto(a) a doar sangue");
                    }

                    break;

                case 5:
                    System.out.println("======= Questão 5 ======= ");
                    String usuarioAutorizado = "Kenia";
                    String senhaAutorizada = "123Senai";
                    System.out.print("Usuario: ");
                    String usuario = sc.nextLine();
                    System.out.print("Senha: ");
                    String senha = sc.nextLine();

                    if ((senha.equals(senhaAutorizada)) && (usuario.equals(usuarioAutorizado))){
                        System.out.println("Usuário autorizado");
                    }else{
                        System.out.println("Usuario nao autorizado");
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