import com.sun.scenario.effect.impl.prism.PrDrawable;

import java.util.ArrayList;
import java.util.List;


public class Loja {
    protected List<Produto> produtos;

    public Loja() {
        this.produtos = new ArrayList<>();
    }

    public void addProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public boolean removeProduto(String nomeProduto) {
        Produto p = verificaSeExiste(nomeProduto);

        if (p != null) {
            this.produtos.remove(p);
            return true;
        }

        return false;
    }

//    Altera o preço de um produto
    public boolean alteraPreco(String nomeProduto, float novoPreco) {
        Produto p = verificaSeExiste(nomeProduto);

        if (p != null) {
            p.setPreco(novoPreco);
            return true;
        }
        return false;
    }

    public void mostraProduto(String nome) {
        if (this.quantidade() > 0) {
            for (Produto p : this.produtos) {
                if (p.getName().equals(nome)) {
                    System.out.println(p);
                }
            }
        } else {
            System.out.println("Carrinho de Compras Vazio.\n");
        }
    }

    public int quantidade() {
        return this.produtos.size();
    }

    public boolean busca(String nomeProduto) {
        Produto p = verificaSeExiste(nomeProduto);

        if (p != null) {
            return true;
        }

        return false;
    }

    public Produto verificaSeExiste(String nomeProduto) {
        for (Produto p : this.produtos) {
            if (p.getName().equals(nomeProduto)) {
                return p;
            }
        }
        return null;
    }

    public List<Produto> listaTudo() {
        return this.produtos;
    }

}