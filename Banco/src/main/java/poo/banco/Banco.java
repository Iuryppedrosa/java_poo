/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package poo.banco;

/**
 *
 * @author iuryp
 */
public class Banco {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Conta conta = new Conta();
        conta.setSaldo(50);
        conta.setLimite(30);
        
        System.out.printf("Seu saldo: %.2f \n", conta.getSaldo());
        System.out.printf("Seu limite: %.2f \n", conta.getLimite());
        
        conta.setSaque(60);
        System.out.printf("Novo valor após saque: %.2f", conta.getSaldo());
        
        
        // apenas na criacao define-se algum valor, sendo que após, o get e set passa a ser valido.
        Conta conta2 = new Conta(1000, 500, true);
        System.out.printf("\nSaldo: %.2f \n", conta2.getSaldo());
        System.out.printf("Personalite: %b \n", conta2.getTipo());
        
        conta.depositar(500.00);
        System.out.printf("Seu saldo: %.2f \n", conta.getSaldo());
        conta.setSaque(90.00);
        System.out.printf("Seu saldo: %.2f \n", conta.getSaldo());
        
        conta.rendimento();
        System.out.printf("Seu saldo: %.2f \n", conta.getSaldo());

    }
}
