package projetovendas.classes;

public class Funcionario extends Pessoa{
    
    private String cargo;
    private double comissao;
    private long dataAdminssao;
    private long dataDemissao;
    private String funcao;
    private int status;
    
  
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public long getDataAdminssao() {
        return dataAdminssao;
    }

    public void setDataAdminssao(long dataAdminssao) {
        this.dataAdminssao = dataAdminssao;
    }

    public long getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(long dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
    
}
