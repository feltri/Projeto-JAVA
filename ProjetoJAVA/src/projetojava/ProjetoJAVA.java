
package projetojava;

import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ProjetoJAVA {
static ArrayList <Cliente> listacli = new ArrayList();
static ArrayList <Funcionario> listafunc = new ArrayList();
static ArrayList <Servicos> listamed = new ArrayList();
    

 public static void buscarFuncionario(){
     
     Scanner teclado = new Scanner(System.in);
     String nome;
     
        System.out.print("\nBUSCA DE CADASTRO\nDigite o nome que deseja buscar:");
        nome = teclado.nextLine();
        
        for (Funcionario f1: listafunc){
            if (f1.getNome().startsWith(nome))
                f1.exibir();
            System.out.println("\n");
        }
    }
 
 public static void buscarCliente(){
     Scanner teclado = new Scanner(System.in);
     String nome;
     
        System.out.print("\nBUSCA DE CADASTRO\nDigite o nome que deseja buscar:");
        nome = teclado.nextLine();
        
         for (Cliente c1: listacli){
            if (c1.getNome().startsWith(nome))
                c1.exibir();
            System.out.println("\n");
        }
    }
 
 public static void buscarServico(){
    
     String nome,especialidade;
     double consulta;
     int op;
     
     do{
          Scanner teclado = new Scanner(System.in);
     System.out.println("BUSCA DE SERVIÇOS - Digite:");
     System.out.println("+--------------------------------------+");
     System.out.println("| 1 para buscar pelo nome do Médico    |");
     System.out.println("| 2 para buscar pela especialidade     |");
     System.out.println("| 3 para buscar pelo valor da consulta |");
     System.out.println("| 4 para sair da aplicação             | ");
     System.out.println("+--------------------------------------+");
     op = teclado.nextInt();
     
     switch (op){
         case 1:
             teclado.nextLine();
             System.out.print("\nBUSCA DE CADASTRO\nDigite o nome que deseja buscar:");
             nome = teclado.nextLine();
        
         for (Servicos s1: listamed){
            if (s1.getNome().startsWith(nome))
                s1.exibir();
            System.out.println("\n");
        }
             break;
           
             
         case 2:
             teclado.nextLine();
             System.out.print("\nBUSCA DE CADASTRO\nDigite a especialidade que deseja buscar:");
             especialidade = teclado.nextLine();
        
       
             for (Servicos s1: listamed){
            if (s1.getEspecialidade().startsWith(especialidade))
                s1.exibir();
            System.out.println("\n");
        }
             break;
             
             
         case 3:
             System.out.print("\nBUSCA DE CADASTRO\nDigite o valor da consulta que deseja buscar:");
        consulta = teclado.nextDouble();
        
         for (Servicos s1: listamed){
            if (s1.getConsulta()==(consulta))
                s1.exibir();
            System.out.println("\n");
        }
             break;
             
             
         default:
             //errinho
     }
     }while (op !=4);
 }
 
     public static void excluirCli(){
         Scanner teclado = new Scanner(System.in);
         String nome;
         
             teclado.nextLine();
             System.out.print("Digite o nome do cliente que deseja excluir: ");
             nome = teclado.nextLine();

         for (Cliente c1: listacli){
            if (c1.getNome().startsWith(nome))
            {
                //c1.exibir();
                System.out.println("Excluido com sucesso! \n");
                listacli.remove(c1);
                break;
            }
         } 
     }
         
         public static void excluirFunc(){
         Scanner teclado = new Scanner(System.in);
         String nome;
         
         teclado.nextLine();
             System.out.println("Digite o nome do funcionário que deseja excluir: ");
             nome = teclado.nextLine();
             
             for (Funcionario f1 : listafunc){
                 if (f1.getNome().startsWith(nome)){
                     System.out.println("Excluido com sucesso!\n");
                     listafunc.remove(f1);
                     break;
                 }
             }
         }
         
         public static void excluirServico(){
         Scanner teclado = new Scanner(System.in);
         String nome;
         
             teclado.nextLine();
             System.out.print("Digite o nome do médico que deseja excluir:");
             nome = teclado.nextLine();

         for (Cliente c1: listacli){
            if (c1.getNome().startsWith(nome))
            {
                //c1.exibir();
                System.out.println("Excluído com sucesso \n");
                listacli.remove(c1);
                break;
            }
         } 
         }

         //RETORNA CLIENTE MAIS VELHO DO ARRAY
         public static void maiorIdadeCli(){
             int maisVelho=0;
             String nome="";
             
             for (Cliente c1: listacli){
                 if (c1.getIdade() > maisVelho){
                     maisVelho = c1.getIdade();
                     nome = c1.getNome();
                 }
             }
             System.out.println("\nO cliente de menor idade é: "+nome+" de "+maisVelho+" anos!");
         }
         
         //RETORNA CLIENTE MAIS NOVO DO ARRAY
         public  static void menorIdadeCli(){
             int maisNovo=100;
             String nome="";
             
             for (Cliente c1: listacli){
                 /*if(idade<maisnova)
		 maisnova=idade;*/
                 if (c1.getIdade() < maisNovo){
                     maisNovo = c1.getIdade();
                     nome = c1.getNome();
                 }
             }
             System.out.println("\nO cliente de menor idade é: "+nome+" de "+maisNovo+" anos!");
         }
         
         
         
        
         public static void maiorSessenta(){
             int cont=0;
             for (Cliente c1: listacli){
                 if (c1.getIdade() > 60){
                     cont +=1;
                 } 
             }
             System.out.println("\nA quantidade de clientes maiores de 60 anos é: "+cont+".");
         }
         
         
         
         public static void menordeIdade(){
             int cont=0;
             for (Cliente c1: listacli){
                 if (c1.getIdade() < 18){
                     cont +=1;
                 } 
             }
             System.out.println("\nA quantidade de clientes menores de 18 anos é: "+cont+".");
         }
         
         
         
         public static void media(){
             double media=0,cont=0,soma=0;
             
             for (Cliente c1: listacli){
                 soma += c1.getIdade();
                 cont += 1;
                 media = soma/cont;
             }
             System.out.println("\nA média das idades dos clientes é: "+ new DecimalFormat("0.00").format( media )+".");
         }
         
         
         public static void maisCaro(){
             double maisCaro=0;
             String nome="",especialidade="";
             
             for (Servicos s1: listamed){
                 if (s1.getConsulta() > maisCaro){
                     maisCaro = s1.getConsulta();
                     nome = s1.getNome();
                     especialidade = s1.getEspecialidade();
                 }
             }
             System.out.println("\nA consulta de maior valor é do médico dr. "+nome+ ", especialista em "+especialidade+", custando R$ "+ new DecimalFormat("0.00").format(maisCaro)+".");
         }
         
         public static void maisBarato(){
             double maisBarato=7000;
             String nome="",especialidade="";
             
             for (Servicos s1: listamed){
                 if (s1.getConsulta() < maisBarato){
                     maisBarato = s1.getConsulta();
                     nome = s1.getNome();
                     especialidade = s1.getEspecialidade();
                 }
             }
             System.out.println("\nA consulta de menor valor é do médico dr. "+nome+ ", especialista em "+especialidade+", custando R$ "+ new DecimalFormat("0.00").format(maisBarato)+".");
         }
         
         public static void mediaServico(){
             double media=0,soma=0,cont=0;
             
             for (Servicos s1: listamed){
                 soma += s1.getConsulta();
                 cont += 1;
                 media = soma / cont;
             }
             System.out.println("\nA média de valores das consultas é: R$ "+ new DecimalFormat("0.00").format(media));
         }
         
         public static void acimaMedia(){
             double media=0,soma=0,cont=0,cont2=0;
             
             for (Servicos s1: listamed){
                 soma += s1.getConsulta();
                 cont += 1;
                 media = soma / cont;
                 if (s1.getConsulta() > media){
                     cont2+=1;
                 }
             }
             System.out.println("\nA quantidade de serviços acima da média é: "+cont2+".");
         }
       
         
         
    public static void main(String[] args) {
        
       Scanner teclado = new Scanner(System.in);
       
        int op;
        
        do{
        System.out.println("\nMENÚ - Digite:");
        System.out.println("+----------------------------+");
        System.out.println("| 1 para área do Cliente     |");
        System.out.println("| 2 para área do Funcionário |");
        System.out.println("| 3 para área de Serviços    |");
        System.out.println("| 0 para sair da aplicação   |");
        System.out.println("+----------------------------+");
        op = teclado.nextInt();  
        
        
        switch(op){
            case 1:
                System.out.println("\nÁREA DO CLIENTE - Digite:");
                System.out.println("+--------------------------------+");
                System.out.println("| 1 para buscar dados de Cliente |");
                System.out.println("| 2 para realizar cadastro       |");
                System.out.println("| 3 para excluir cadastro        |");
                System.out.println("| 4 para voltar ao menú          |");
                System.out.println("| 5 para dados dos clientes      |");
                System.out.println("| 0 para sair da aplicação       |");
                System.out.println("+--------------------------------+");
                op = teclado.nextInt();
                switch (op){
                    case 1:
                        buscarCliente();
                 
                        break;
                        
                        
                    case 2:
                        Cliente c = new Cliente();
                        c.cadastro();
                        listacli.add(c);
                 
                        break;
                        
                        
                    case 3:
                        excluirCli ();
                        break;
                        
                        
                    case 4:
                        break;
                        
                        
                    case 5:
                        System.out.println("\nDigite:");
                        System.out.println("+--------------------------------------------+");
                        System.out.println("| 1 para exibir cliente de maior idade       |");
                        System.out.println("| 2 para exibir cliente mais jovem           |");
                        System.out.println("| 3 para exibir a quantidade de clientes 60+ |");
                        System.out.println("| 4 para exibir a quantidade de clientes 18- |");
                        System.out.println("| 5 para exibir a média das idades           |");
                        System.out.println("+--------------------------------------------+");
                        op = teclado.nextInt();
                        
                        switch(op){
                            case 1:
                                maiorIdadeCli();
                                break;
                        
                            case 2:
                                menorIdadeCli();
                                break;
                        
                            case 3:
                                maiorSessenta();
                                break;
                        
                            case 4 :
                                menordeIdade();
                                break;
                                
                            case 5:
                                media();
                                break;
                                
                                
                            default:
                                System.out.println("\nNÚMERO INVÁLIDO!");
                                break;
                        }
                        break;
                }
                break;
            
                
            case 2:
                System.out.println("\nÁREA DO FUNCIONÁRIO - Digite:");
                System.out.println("+------------------------------------+");
                System.out.println("| 1 para buscar dados de Funcionário |");
                System.out.println("| 2 para realizar cadastro           |");
                System.out.println("| 3 para excluir cadastro            |");
                System.out.println("| 4 para voltar ao menú              |");
                System.out.println("| 0 para sair da aplicação           |");
                System.out.println("+------------------------------------+");
                op = teclado.nextInt();
                switch(op){
                    case 1:
                        buscarFuncionario();
                        break;
                        
                        
                    case 2:
                        Funcionario f = new Funcionario();
                        f.cadastro();
                        listafunc.add(f);
                        break;
                        
                        
                    case 3:
                        excluirFunc();
                        break;
                        
                        
                    case 4:
                        break;
                        
                        
                    default:
                        System.out.println("\nNÚMERO INVÁLIDO!"); 
                }
                break;
                
                
                
            case 3:
                System.out.println("\nÁREA DE SERVIÇOS - Digite:");
                System.out.println("+-----------------------------------------+");
                System.out.println("| 1 para buscar Médicos ou Especialidades |");
                System.out.println("| 2 para cadastrar Médico                 |");
                System.out.println("| 3 para excluir cadastro                 |");
                System.out.println("| 4 para voltar ao menú                   |");
                System.out.println("| 5 para informações sobre consultas      |");
                System.out.println("| 0 para sair da aplicação                |");
                System.out.println("+-----------------------------------------+");
                op = teclado.nextInt();
                switch (op){
                    case 1:
                        buscarServico();
                        break;
                        
                        
                    case 2:
                        Servicos s = new Servicos();
                        s.cadastro();
                        listamed.add(s);
                        break;
                        
                        
                    case 3:
                        excluirServico();
                        break;
                        
                        
                    case 4:
                        break;
                      
                        
                        
                    case 5:
                        System.out.println("\nDigite:");
                        System.out.println("+--------------------------------------------------------+");
                        System.out.println("| 1 para exibir a consulta de maior valor                |");
                        System.out.println("| 2 para exibir a consulta de menor valor                |");
                        System.out.println("| 3 para exibir a média de valores                       |");
                        System.out.println("| 4 para exibir quantiadade de consulltas acima da média |");
                        System.out.println("+--------------------------------------------------------+");
                        op = teclado.nextInt();
                        
                        switch (op){
                            case 1:
                                maisCaro();
                                break;
                                
                                
                            case 2:
                                maisBarato();
                                break;
                                
                                
                            case 3:
                                mediaServico();
                                break;
                                
                                
                            case 4:
                                acimaMedia();
                                break;
                                
                                
                            default:
                                System.out.println("\nNÚMERO INVÁLIDO!");
                                break;
                        }
                        
                        
                    default:
                        break;
                        
                }
                break;
                
                
            default:
                break;
                
        }
        } while (op != 0);
        
    }
}