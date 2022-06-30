
package projetojava;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Servicos implements IPessoa {
    Scanner teclado = new Scanner(System.in);
    
    private String nome, especialidade, email;
    private double consulta;
    private long telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getConsulta() {
        return consulta;
    }

    public void setConsulta(double consulta) {
        this.consulta = consulta;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
    
    
  
   public void cadastro(){
         
        System.out.println("\nCADASTRO DE SERVIÇOS - Preencha os seguintes campos:");
        
        try{
          System.out.print("Nome: ");
        nome = teclado.nextLine();
        }
        catch(StringVazioException e){
             System.out.println(e.getMessage());
        }
        
        try{
        System.out.print("Especialidade: ");
        especialidade = teclado.nextLine();
        }
        catch (StringVazioException e){
            System.out.println(e.getMessage());
        }
        
        try{
          System.out.print("E-mail: ");
        email = teclado.next();
       }
        catch (StringVazioException e){
            System.out.println(e.getMessage());
        }
        
        try{ 
          System.out.print("Telefone: ");
        telefone = teclado.nextLong();
       }
       catch (StringVazioException e){
            System.out.println(e.getMessage());
        }
        
        try{
        System.out.print("Valor da consulta: ");
        consulta = teclado.nextDouble();
        }
        catch (StringVazioException e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("\nCADASTRO FINALIZADO COM SUCESSO!\n");
    }

    @Override
    public void exibir() {
        
        System.out.println("\nDADOS DO MÉDICO\n ");
        System.out.println("Nome: "+nome);
        System.out.println("Especialidade: "+especialidade);
        System.out.println("E-mail: "+email);
        System.out.println("Telefone: "+telefone);
        System.out.println("Valor da consulta: R$ "+consulta);
        
     
    }
    
    
        
    
}
  