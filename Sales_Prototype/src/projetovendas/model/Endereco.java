/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetovendas.model;

import projetovendas.interfaces.IOperacao;

/**
 *
 * @author aluno
 */
public class Endereco implements IOperacao{
    private String logradouro;
    private Cidade cidade;
    
    //antonio cristiana isaac 
    private String bairro;

    @Override
    public void cadastrar() {
        System.out.println("endereco"+this.toString());
    }

    @Override
    public boolean alterar() {
        return false;
    }

    @Override
    public boolean excluir() {
       return false;
    }

    @Override
    public void cancelar() {
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return "Endereco{" + "logradouro=" + logradouro + ", cidade=" + cidade + ", bairro=" + bairro + '}';
    }
    
    
    
    
    
}
