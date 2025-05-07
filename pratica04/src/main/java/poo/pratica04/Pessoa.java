/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pratica04;

/**
 *
 * @author iuryp
 */
public class Pessoa {
    String firstName;
    String middleName;
    String lastName;
    
    StringBuilder sb = new StringBuilder();
    
    public Pessoa(){
        
    }
    
    public Pessoa(String nomeCompleto){
        String[] nomes = nomeCompleto.split(" ");
        this.firstName = nomes[0];
        this.middleName = nomes[1];
        this.lastName = nomes[2];  
    }
    
    public Pessoa(String firstName, String middleName, String lastName){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public StringBuilder fullName(){
        StringBuilder fullName = sb.append(firstName).append(" ").append(middleName).append(" ").append(lastName);
        return fullName;
    }
    
    public StringBuilder rubrica(){
        char firstLetter = firstName.charAt(0);
        char firstLetterSecondName = middleName.charAt(0);
        char firstLetterLastName = lastName.charAt(0);
        
        StringBuilder rubrica = sb.append(firstLetter).append(" ").append(firstLetterSecondName).append(" ").append(firstLetterLastName);
        return rubrica;
    }
    
    
}
