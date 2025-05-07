/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package poo.classe_abstrata_ativ_lab_entregar;

/**
 *
 * @author iuryp
 */
public class Classe_abstrata_ativ_lab_entregar {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        ContaEspecial ce = new ContaEspecial(10000, 30000, 996655, 7878);
        
        ce.creditaValor(7878, 500);
        System.out.println("Saldo: " + ce.getSaldo(7878));
        
        ce.debitaValor(50, 7878);
        System.out.println("Saldo: " + ce.getSaldo(7878));
        
        ce.getEstado(7878);
        System.out.println("Conta ativa: " + ce.getEstado(7878));
       
        
        ce.setLimite(0);
        if(ce.getLimite() == 0){
            ContaCorrente cu = new ContaComum(ce.saldo, ce.numConta, ce.senha);
            ce = null;
            System.out.println("Conta especial convertida em Comum!");
        }
        
    }
}
