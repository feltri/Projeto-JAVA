
package projetojava;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    
    static ArrayList <Cliente> listacli = new ArrayList();
    static ArrayList <Funcionario> listafunc = new ArrayList();
    static ArrayList <Servicos> listamed = new ArrayList();
    Scanner teclado = new Scanner(System.in);

    public String getNome() {
        return nome;
        
    }

    public void setNome(String nome) {
        if(nome.equals(""))
        {
            throw new StringVazioException();
        }
        else
        {
        this.nome = nome;
    }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
         if(idade<1)
        {
            throw new IllegalArgumentException("Idade Negativa.Tente Novamente");
        }
           else{
        this.idade = idade;
    
           }
    }
   
    public void cadastro(){
    }
}
