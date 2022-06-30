
package projetojava;

public class Funcionario extends Pessoa implements IPessoa{
    private String cargo,periodo,cidadeUF;
    private long codigo;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getCidadeUF() {
        return cidadeUF;
    }

    public void setCidadeUF(String cidadeUF) {
        this.cidadeUF = cidadeUF;
    }
    
    @Override
    public void exibir(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade+" anos");
        System.out.println("Cargo: "+cargo);
        System.out.println("Período: "+periodo);
        System.out.println("Cidade-UF: "+cidadeUF);
        System.out.println("Código de identificação: "+codigo);
    }
    
    @Override
    public void cadastro(){
         //PARA CADASTRO DE FUNCIONÁRIOS
        System.out.println("\nCADASTRO DE FUNCIONÁRIO - Preencha os seguintes campos:");
        
        try{
          System.out.print("Nome: ");
        nome = teclado.nextLine();
        
            System.out.print("Idade: ");
        idade = teclado.nextInt();
        
        teclado.nextLine();
        
        System.out.print("Cargo: ");
        cargo = teclado.nextLine();
        
        System.out.print("Período: ");
        periodo = teclado.nextLine();
        
          System.out.print("Cidade-Estado: ");
        cidadeUF = teclado.nextLine();
        
        System.out.print("Codigo de identificação: ");
        codigo = teclado.nextLong();
        }
        
         catch (StringVazioException e){
             System.out.println(e.getMessage());
        }
        
        System.out.println("\nCADASTRO FINALIZADO COM SUCESSO!\n");
    }
}
