package lista.exercicios.arraylist.model;

import java.util.List;
public class Venda {
    
    private String datavenda;
    private Double valorTotalVenda;
    private List<ItenDeVenda>itenDeVendas;

    public String getDatavenda() {
        return datavenda;
    }

    public void setDatavenda(String datavenda) {
        this.datavenda = datavenda;
    }

    public Double getValorTotalVenda() {
        return valorTotalVenda;
    }

    public void setValorTotalVenda(Double valorTotalVenda) {
        this.valorTotalVenda = valorTotalVenda;
    }

    public List<ItenDeVenda> getItenDeVendas() {
        return itenDeVendas;
    }

    public void setItenDeVendas(List<ItenDeVenda> itenDeVendas) {
        this.itenDeVendas = itenDeVendas;
    }
    
    
            
    
}
