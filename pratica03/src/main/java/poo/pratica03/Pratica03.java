/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package poo.pratica03;

import java.text.ParseException;

/**
 *
 * @author iuryp
 */
public class Pratica03 {

    public static void main(String[] args) throws ParseException {
        System.out.println("Hello World!");
        
        CadernoDeEnderecos c1 = new CadernoDeEnderecos();
        c1.setNome("Iury");
        c1.setEmail("iurypedrosa@gmail.com");
        c1.setTelefone("(34) 992400014");
        c1.setEndereco("Av Nicomedes");
        c1.setDataAniversario("12/09/1996");
        
        System.out.printf("Nome: %s \n", c1.getNome());
        System.out.printf("Data de nascimento: %s\n", c1.getDataAniversario());
        System.out.printf("Email: %s\n", c1.getEmail());
        System.out.printf("Endereco: %s\n", c1.getEndereco());
        System.out.printf("Telefone: %s\n", c1.getTelefone());
        
        
        System.out.println("Exercicio 2; \n");
        Restaurante restaurante = new Restaurante
        ("Comida Boa",  
        "R das Comidas", 
        "Uberlandia", 
        "MG", 
        "38412245", 
        "3499240014", 
        29.90, TipoComida.ARROZ); 
       
        
        
        System.out.printf("Cidade: %s \n", restaurante.getCidade());
        System.out.printf("Valor prato: %.2f", restaurante.getValorPrato());
        
        System.out.println(restaurante);
        
        
        System.out.println("Exercicio 2; \n");
        Retangulo r = new Retangulo(12.5, 23.0);
        System.out.printf("Perimetro: %.2f\n", r.perimetro());
        System.out.printf("Area: %.2f\n", r.area());

        
        
        
        
    }
}
