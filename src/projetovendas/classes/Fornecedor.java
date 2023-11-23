package projetovendas.classes;

import projetovendas.interfaces.IPesquisar;

public class Fornecedor extends Pessoa {
    private boolean  status;


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
