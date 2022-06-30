
package projetojava;

import java.text.DecimalFormat;

/**
 *
 * @author aluno
 */
public class Servicos extends Pessoa implements IPessoa{
    
    private String especialidade;
    private double consulta;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getConsulta() {
        return consulta;
    }

    public void setConsulta(double consulta) {
        this.consulta = consulta;
    }
    
    
  
    @Override
   public void cadastro(){
         
        System.out.println("\nCADASTRO DE SERVIÇOS - Preencha os seguintes campos:");
        
        try{
          System.out.print("Nome: ");
        nome = teclado.nextLine();
        
        System.out.print("Especialidade: ");
        especialidade = teclado.nextLine();
        
          System.out.print("E-mail: ");
        email = teclado.next();
       
          System.out.print("Telefone: ");
        telefone = teclado.nextLong();
       
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
        System.out.println("Valor da consulta: R$ "+new DecimalFormat("0.00").format(consulta));
        
     
    }
    
    
        
    
}
  