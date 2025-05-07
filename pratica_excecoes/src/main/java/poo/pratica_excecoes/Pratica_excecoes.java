/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package poo.pratica_excecoes;
/**
 *
 * @author iuryp
 */
public class Pratica_excecoes {

    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        try{
            cc.deposita(20);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        
        Conta cp = new ContaPoupaca();
        cp.deposita(110);
        // sacando das contas:
        try{
            cc.saca(500);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Confira seu saldo apos essa operacao");
        }
        
        TestePai pai = new TestePai(50);
        TesteFilha filha = new TesteFilha(pai.valor, 500);
        
        System.out.println(filha.getFilha());

     
        cp.saca(50);
        System.out.println("Consegui sacar da poupança!");
    }
}
