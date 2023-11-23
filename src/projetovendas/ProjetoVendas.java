/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetovendas;

import projetovendas.model.Cidade;
import projetovendas.model.Cliente;
import projetovendas.model.Endereco;
import projetovendas.model.Fornecedor;
import projetovendas.view.TelaCidade;
import projetovendas.view.TelaEndereco;

/**
 *
 * @author aluno
 */
public class ProjetoVendas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menuApp menuApp = new menuApp();
        menuApp.show();

    }

    private static Cliente criarCliente() {
        Cliente cliente = new Cliente();
        cliente.setContador(0);
        cliente.setEmail("email@email.com");
        cliente.setLocalDeTrabalho("casa");
        cliente.setEndereco(criarEndereco());
        cliente.setNome("Cristiano");
        cliente.setRenda(150000.);
        cliente.setStatus(1);
        cliente.setTipoPessoa("loco");
        System.out.println("criou cliente " + cliente.toString());
        return cliente;
    }

    private static Endereco criarEndereco() {
        Endereco endereco = new Endereco();
        endereco.setBairro("jaboticabeira");
        endereco.setLogradouro("rua flor de maio");
        endereco.setCidade(criarCidade());
        return endereco;
    }

    private static Cidade criarCidade() {
        Cidade cidade = new Cidade();
        cidade.setCodibge(1265456);
        cidade.setNome("Umuarama");
        return cidade;
    }

    private static Fornecedor criarFornecedor() {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setContador(0);
        fornecedor.setEmail("email@email.com");
        fornecedor.setEndereco(criarEndereco());
        fornecedor.setNome("Cristiano");
        fornecedor.setStatus(true);
        fornecedor.setTipoPessoa("loco");
        System.out.println("criou um fornecedor " + fornecedor.toString());
        return fornecedor;

    }

}
