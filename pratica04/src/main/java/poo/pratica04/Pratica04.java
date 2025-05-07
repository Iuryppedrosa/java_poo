/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package poo.pratica04;

import java.util.Scanner;

/**
 *
 * @author iuryp
 */
public class Pratica04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hello World!");
        System.out.println("Exercicio 1: ");
        
        Pessoa p = new Pessoa("Iury Alves Pedrosa");
        System.out.printf("Primeiro nome: %s \n", p.getFirstName());
        System.out.printf("Segundo nome: %s \n", p.getMiddleName());
        System.out.printf("Ultimo nome: %s \n", p.getLastName());
        
        
        
        Pessoa p2 = new Pessoa("Giovanna", "Camilo", "Rezende");
        System.out.printf("Primeiro nome: %s \n", p2.getFirstName());
        System.out.printf("Segundo nome: %s \n", p2.getMiddleName());
        System.out.printf("Ultimo nome: %s \n", p2.getLastName());
        
//        System.out.println("Exercicio 2: ");
//        Pessoa p3 = new Pessoa();
//        System.out.print("Digite o seu primeiro nome: ");
//        p3.setFirstName(sc.nextLine());
//        
//        System.out.print("Digite o seu segundo nome: ");
//        p3.setMiddleName(sc.nextLine());
//        
//        System.out.print("Digite o seu terceiro nome: ");
//        p3.setLastName(sc.nextLine());
//        
//        
//        System.out.printf("Primeiro nome: %s \n", p3.getFirstName());
//        System.out.printf("Segundo nome: %s \n", p3.getMiddleName());
//        System.out.printf("Ultimo nome: %s \n", p3.getLastName());
//        
//        
//        System.out.println("Nome completo: \n" + p3.fullName());
//        System.out.println("Rubrica : " + p3.rubrica());
        
        
        System.out.println("Exercicio 3");
        Usuario us = new Usuario("Joao", "01248254699", "3299394954");
        System.out.printf("Nome do usuário: %s\n", us.getNome());
        System.out.printf("Cpf do usuário: %s\n", us.getCpf());
        System.out.printf("Telefone do usuario:  %s\n", us.getNome());
        
       
        
        if(us.setUserAsEmail("iurypedrosa@gmail") == 0){
            System.out.print("Nao foi possivel definir o seu usuario como email. Esta fora do padrao \n");
            System.out.printf("Email: %s \n", us.getEmail());
        }
        
        System.out.printf("Usuario: %s \n", us.getUser());
        us.login("iurypedrosa@gmail.com", "01248254699");


        
        
        
    }
}
