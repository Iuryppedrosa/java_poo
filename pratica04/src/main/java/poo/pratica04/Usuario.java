/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pratica04;

/**
 *
 * @author iuryp
 */
public class Usuario {
    String nome;
    String cpf;
    String telefone;
    String user;
    String senha;
    String email;
    
    
    public Usuario(String nome, String cpf, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;   
    }
    
    public int setUserAsEmail(String email){
        if(email.contains("@") && email.endsWith(".com")){
            this.user = email;
            this.email = email;
            return 1;
        }else{
            this.user = nome;
            return 0;
        }
    }
    
    public void login(String usuario, String senha){
        if((usuario.equalsIgnoreCase(nome) || usuario.equalsIgnoreCase(email)) && senha.equalsIgnoreCase(senha)){
            System.out.println("Login realizado!");
        }else{
            System.out.println("Login Falhou!");
        }
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setPassword(){
        this.senha = cpf;
    }
    
    public void setLogin(){
        this.user = nome;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
