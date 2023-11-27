package lista.exercicios.arraylist.model;

import java.util.List;
public class Produto {

    private String nomeProduto;
    private Double precoProtudo;
    private List<ItensProduto> itensProdutos;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getPrecoProtudo() {
        return precoProtudo;
    }

    public void setPrecoProtudo(Double precoProtudo) {
        this.precoProtudo = precoProtudo;
    }

    public List<ItensProduto> getItensProdutos() {
        return itensProdutos;
    }

    public void setItensProdutos(List<ItensProduto> itensProdutos) {
        this.itensProdutos = itensProdutos;
    }
    
    

}
