/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.exercicioslide1;

/**
 *
 * @author iuryp
 */
public class Aula {
    
    int numAlunos;
    boolean intervalo;
    
    public Aula(int numAlunos, boolean intervalo){
        this.intervalo = intervalo;
        this.numAlunos = numAlunos;        
    }
    
    
    public void status(){
        if(intervalo){
              System.out.printf("Sao %d alunos e eles estao no intervalo. \n", numAlunos);
              
        }else{
            System.out.printf("Sao %d alunos e eles nao estao no intervalo.\n", numAlunos);
        }
    }
    
    public void exercicio(){
        if(numAlunos > 0 && intervalo == false){
            System.out.print("Comecar a aplicar exercicios na sala...\n");
        }
    }
    
    public void fimIntervalo(){
        if(numAlunos == 0 && intervalo == true){
            System.out.print("Chamar os launos de volta a sala...\n");
        }
    }
    
    public void comeco(){
        if(numAlunos > 1){
            System.out.print("Comeco a dar aula para os meus alunos...\n");
        }else if(numAlunos == 1){
            System.out.print("Parece que somente um aluno compareceu, comecar a aula\n");
        }
    }
    
    public void fim(){
        if(numAlunos > 0){
            System.out.print("Fim da aula!\n");
        }else{
            System.out.print("Erro, nao ha alunos\n");
        }
    }
    
}
