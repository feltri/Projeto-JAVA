
package projetojava;

import java.util.Scanner;

public abstract class Pessoa {
    protected String nome,email;
    protected int idade;
    protected long telefone;
    
    Scanner teclado = new Scanner(System.in);

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
    
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
