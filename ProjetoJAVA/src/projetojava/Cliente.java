
package projetojava;

public class Cliente extends Pessoa implements IPessoa{
    private String email,cidadeUF;
    private long cpf, telefone;
    private int plano;
    

    public int getPlano() {
        return plano;
    }

    public void setPlano(int plano) {
        this.plano = plano;
    }

    
    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCidadeUF() {
        return cidadeUF;
    }

    public void setCidadeUF(String cidadeUF) {
        this.cidadeUF = cidadeUF;
    }
    
    @Override
    public void exibir(){
        System.out.println("\nDADOS DO PACIENTE");
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade+" anos");
        System.out.println("CPF: "+cpf);
        System.out.println("Telefone: "+telefone);
        System.out.println("E-mail: "+email);
        System.out.println("Cidade-UF: "+cidadeUF);
        switch(plano){
            case 1:
                System.out.println("Plano Família");
                break;
                
            case 2:
                System.out.println("Plano Individual");
                break;
                
            case 3:
                System.out.println("Plano Preferencial");
            break;
        }
    }
    
    /**
     *
     */
    @Override
    public void cadastro(){
         //PARA CADASTRO DE PACIENTES/CLIENTES
        System.out.println("\nCADASTRO DE CLIENTE - Preencha os seguintes campos:");
        
        try{
          System.out.print("Nome: ");
        nome = teclado.nextLine();
        }
        catch(StringVazioException e){
             System.out.println(e.getMessage());
        }
        
        try{
            System.out.print("Idade: ");
        idade = teclado.nextInt();
        }
        catch (StringVazioException e){
             System.out.println(e.getMessage());
        }
        
        try{
           System.out.print("CPF: ");
        cpf = teclado.nextLong();
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
          System.out.print("E-mail: ");
        email = teclado.next();
       }
    catch (StringVazioException e){
            System.out.println(e.getMessage());
        }
        
        
        try{
          System.out.print("Cidade-Estado: ");
        cidadeUF = teclado.nextLine();
        }
        catch(StringVazioException e){
            System.out.println(e.getMessage());
        }
        
        do{
            teclado.nextLine();
        System.out.println("\nPlano de Saude - Digite: ");
        System.out.println("+---------------------------+");
        System.out.println("| 1 para Plano Familia      |");
        System.out.println("| 2 para Plano Individual   |");
        System.out.println("| 3 para Plano Preferencial |");
        System.out.println("+---------------------------+");
        
        plano = teclado.nextInt();
        if (plano > 0 && plano <= 3){
            System.out.println("\nCADASTRO FINALIZADO COM SUCESSO!\n");
            break;
        }
        else {
            //MENSAGEM DE ERRO
            System.out.println("\nEscolha um Plano!\n");
        }
        }while(plano!=1 || plano!=2 || plano!=3);
                
    }
}
