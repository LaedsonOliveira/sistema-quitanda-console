package Model;

import java.lang.classfile.instruction.ReturnInstruction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.SortedMap;

public class Quitanda  {

    private int id = 1;

    List<Produto> produtos = new ArrayList<>();

    HashMap<Integer, Produto> produtoHashMap = new HashMap<>();

    public String AdcionarProduto(String nome, double preco, int quantidade){

        Produto produtoAnalise = null;

        for (Produto produto : produtos) {

            if (produto.getNome().equals(nome)) {
                produtoAnalise = produto;
                break;

            } else {


            }
        }
        return "Produto " + nome + " adicionado com sucesso";
    }

    public String RemoverProduto(int id) {

        Produto removido = null;

        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                removido = produto;
                break;
            }
        }

        if (removido != null) {
            produtos.remove(removido);
            return "Produto com ID " + removido.getId() + ", nome " + removido.getNome();
        } else {
            return "Produto com ID : " + id + ", não encontrado";
        }
    }

    public String PesquisarProduto(int id){

        Produto encontrado = null;

        for (Produto produto: produtos){
            if (produto.getId() == id){
                encontrado = produto;
                break;
            } else {
                encontrado = null;
            }
        }

        if (encontrado != null){
            return "Produto: " + encontrado.toString();
        }
        else {
            return "Produto: " + id + "não encontrado";
        }

    }

    public void ConsultarEstoque(){
        for (Produto produto : produtos){
            System.out.println(produto.toString());
        }
    }
}
