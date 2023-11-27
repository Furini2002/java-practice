package lista.exercicios.arraylist;

import java.util.ArrayList;
import java.util.List;
import lista.exercicios.arraylist.model.ItenDeVenda;
import lista.exercicios.arraylist.model.ItensProduto;
import lista.exercicios.arraylist.model.Produto;
import lista.exercicios.arraylist.model.Venda;

public class ListaExerciciosArraylist {

    public static void main(String[] args) {

        //cadastrando itens de produto
        ItensProduto carne = new ItensProduto();
        carne.setNomeItem("carne");
        ItensProduto frango = new ItensProduto();
        frango.setNomeItem("frango");
        ItensProduto presunto = new ItensProduto();
        presunto.setNomeItem("presunto");
        ItensProduto mussarela = new ItensProduto();
        mussarela.setNomeItem("mussarela");
        ItensProduto massa = new ItensProduto();
        massa.setNomeItem("massa");

        //cadastrando os itens na lista
        List<ItensProduto> listaDeItensPastelCarne = new ArrayList();
        listaDeItensPastelCarne.add(carne);
        listaDeItensPastelCarne.add(massa);

        List<ItensProduto> listaDeItensPastelFrango = new ArrayList();
        listaDeItensPastelFrango.add(frango);
        listaDeItensPastelFrango.add(massa);

        List<ItensProduto> listaDeItensPastelPizza = new ArrayList();
        listaDeItensPastelPizza.add(mussarela);
        listaDeItensPastelPizza.add(presunto);
        listaDeItensPastelPizza.add(massa);

        //cadastrar produto
        Produto pastelCarne = new Produto();
        pastelCarne.setNomeProduto("Pastel de carne");
        pastelCarne.setPrecoProtudo(7.00);
        pastelCarne.setItensProdutos(listaDeItensPastelCarne);

        Produto pastelFrango = new Produto();
        pastelFrango.setNomeProduto("Pastel de frango");
        pastelFrango.setPrecoProtudo(7.50);
        pastelFrango.setItensProdutos(listaDeItensPastelFrango);

        Produto pastelPizza = new Produto();
        pastelPizza.setNomeProduto("Pastel de pizza");
        pastelPizza.setPrecoProtudo(8.00);
        pastelPizza.setItensProdutos(listaDeItensPastelPizza);

        //cadastrando lista de produtos
        List<Produto> produtos = new ArrayList();
        produtos.add(pastelPizza);
        produtos.add(pastelCarne);
        produtos.add(pastelFrango);

        //listando os itens de produtos e preço
        System.out.println("LISTANDO ITENS DE PRODUTO E PRECO");
        for (Produto verProduto : produtos) {
            System.out.println("Produto: " + verProduto.getNomeProduto());
            System.out.println("Preco: R$" + verProduto.getPrecoProtudo());
            System.out.print("Itens do produto: ");
            for (ItensProduto verItensProduto : verProduto.getItensProdutos()) {
                System.out.print(verItensProduto.getNomeItem() + ", ");
            }
            System.out.println("\n");
        }

        //cadastrando itens de venda #1
        ItenDeVenda itensVenda1 = new ItenDeVenda();
        itensVenda1.setProdutos(produtos);

        //formula para calcular o preço total dos itens do produto
        Double totalItensVenda = 0.0;
        for (Produto precoProdutos : produtos) {
            totalItensVenda += precoProdutos.getPrecoProtudo();
        }
        itensVenda1.setValorDoitem(totalItensVenda);

        //cadastrando itens de venda #2
        ItenDeVenda itensVenda2 = new ItenDeVenda();
        itensVenda2.setProdutos(produtos);
        itensVenda2.setValorDoitem(totalItensVenda);

        //cadastrando itens de venda #3
        ItenDeVenda itensVenda3 = new ItenDeVenda();
        itensVenda3.setProdutos(produtos);
        itensVenda3.setValorDoitem(totalItensVenda);

        //criando lista de itens de venda
        List<ItenDeVenda> listaItensVenda1 = new ArrayList();
        listaItensVenda1.add(itensVenda1);
        listaItensVenda1.add(itensVenda2);
        listaItensVenda1.add(itensVenda3);

        //cadastar venda
        Venda venda1 = new Venda();
        venda1.setDatavenda("24/11/2023");
        venda1.setItenDeVendas(listaItensVenda1);

        //formula para calcular o preço total dos itens do produto
        Double totalVenda = 200.00;
        for (ItenDeVenda precoItensVenda : listaItensVenda1) {
            totalVenda += precoItensVenda.getValorDoitem();
        }
        venda1.setValorTotalVenda(totalVenda);

        //listar todos os itens de venda e os produtos desta venda
        System.out.println("LISTANDO ITENS DE VENDA E PRECO TOTAL DAS LISTAS");
        for (ItenDeVenda verItemVenda : listaItensVenda1) {
            for (Produto verProdutoVenda : verItemVenda.getProdutos()) {
                System.out.println("Produto: " + verProdutoVenda.getNomeProduto());
            }
            System.out.println("Total dos itens acima: R$" + verItemVenda.getValorDoitem() + "\n");
        }

        //substituindo o produto com indice 2
        //criando o novo produto
        List<ItensProduto> listaDeItensPastelFrangoCarne = new ArrayList();
        listaDeItensPastelFrangoCarne.add(frango);
        listaDeItensPastelFrangoCarne.add(carne);
        listaDeItensPastelFrangoCarne.add(massa);

        Produto pastelFrangoCarne = new Produto();
        pastelFrangoCarne.setNomeProduto("Pastel de frango e carne");
        pastelFrangoCarne.setPrecoProtudo(10.00);
        pastelFrangoCarne.setItensProdutos(listaDeItensPastelFrangoCarne);

        //substituição
        produtos.set(1, pastelFrangoCarne); //posição 2 = indice 1

        System.out.println("LISTANDO PRODUTOS, PRECO E VALOR DAS LISTAS DE ITENS DE VENDA APÓS SUBSTITUIÇÃO");
        for (ItenDeVenda verItenDeVenda : listaItensVenda1) {
            for (Produto produto : verItenDeVenda.getProdutos()) {
                System.out.println("Produto: " + produto.getNomeProduto());
                System.out.println("Preco: R$ " + produto.getPrecoProtudo());
            }
            System.out.println("");
        }

    }
}
