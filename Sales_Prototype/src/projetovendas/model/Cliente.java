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
public class Cliente extends Pessoa implements IPesquisar{
    
    private Double renda;
    private int status;
    private String localDeTrabalho;

    @Override
    public Pessoa pesquisar() {
        return  new Cliente();
    }

    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getLocalDeTrabalho() {
        return localDeTrabalho;
    }

    public void setLocalDeTrabalho(String localDeTrabalho) {
        this.localDeTrabalho = localDeTrabalho;
    }

    @Override
    public String toString() {
        return "Cliente{" + "renda=" + renda + ", status=" + status + ", localDeTrabalho=" + localDeTrabalho + '}';
    }
    
    
    
}
