/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetovendas.model;

import java.math.BigDecimal;
import projetovendas.interfaces.IOperacao;

/**
 *
 * @author aluno
 */
public class Produto implements IOperacao{
    
    private String nomeProduto;
    private BigDecimal preco;

    @Override
    public void cadastrar() {
    }

    @Override
    public boolean alterar() {
     return false;
    }

    @Override
    public boolean excluir() {
        return  false;
    }

    @Override
    public void cancelar() {
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
    
    
    
}
