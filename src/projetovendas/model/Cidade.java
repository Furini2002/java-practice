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
public class Cidade implements IOperacao {

    private String nome;
    private int codibge;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodibge() {
        return codibge;
    }

    public void setCodibge(int codibge) {
        this.codibge = codibge;
    }

    @Override
    public void cadastrar() {
         String insert  = "insert into cidade(nome_cidade, codigo_ibge) "
                + "values('"+getNome()+"',"+getCodibge()+")";
        System.out.println(insert);
        //inserindo no "banco de dados"
        BancoDeDados.LISTA_CIDADES.add(this);
        System.out.println("lista de cidades"+BancoDeDados.LISTA_CIDADES);
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

    @Override
    public String toString() {
        return "Cidade{" + "nome=" + nome + ", codibge=" + codibge + '}';
    }
    
    

}
