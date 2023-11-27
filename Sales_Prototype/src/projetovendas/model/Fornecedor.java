/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetovendas.model;

import projetovendas.interfaces.IPesquisar;



/**
 *
 * @author aluno
 */
public class Fornecedor extends Pessoa implements IPesquisar{
    private boolean  status;

    @Override
    public Pessoa pesquisar() {
       return new Fornecedor();
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Fornecedor{" + "status=" + status + '}';
    }
    
    
    
    
}
