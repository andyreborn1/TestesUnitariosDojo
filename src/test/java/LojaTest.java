import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LojaTest {

    //    Testa se o produto foi adicionado
    @Test
    void addProduto() {
        Produto mouse = new Produto("Mouse", 1, 200);
        Loja loja = new Loja();

        loja.addProduto(mouse);

        assertEquals(1, loja.quantidade());
    }

    //    Remove produto que esta na lista
    @Test
    void removeProdutoExistente() {
        Produto mouse = new Produto("Mouse", 1, 200);
        Loja loja = new Loja();

        loja.addProduto(mouse);
        Boolean remove = loja.removeProduto("Mouse");

        assertEquals(true, remove);
    }

    //    Tenta remover produto de uma lista vazia
    @Test
    void removeProdutoinxistente() {
        Loja loja = new Loja();

        Boolean remove = loja.removeProduto("Mouse");

        assertEquals(false, remove);
    }

    @Test
    void verificaLista() {
        Loja loja = new Loja();
        Produto mouse = new Produto("Mouse", 1, 200);
        Produto fone = new Produto("Fone", 1, 1500);
        Produto mousepad = new Produto("Mousepad", 1, 1000);

        loja.addProduto(mouse);
        loja.addProduto(fone);
        loja.addProduto(mousepad);

        ArrayList e = new ArrayList();

        e.add(mouse);
        e.add(fone);
        e.add(mousepad);

        assertEquals(e, loja.listaTudo());
    }

    //    Busca produto existente na lista
    @Test
    void buscaProdutoExistente() {
        Produto mouse = new Produto("Mouse", 1, 200);
        Loja loja = new Loja();

        loja.addProduto(mouse);
        Boolean encontra = loja.busca("Mouse");

        assertEquals(true, encontra);
    }

    //    Busca produto inxistente na lista
    @Test
    void buscaProdutoinexistente() {
        Loja loja = new Loja();

        Boolean encontra = loja.busca("Mouse");

        assertEquals(false, encontra);
    }

    //    verifica alteção de preço de um produto
    @Test
    void alteraPreco() {
        Produto mouse = new Produto("Mouse", 1, 200);
        Loja loja = new Loja();

        loja.addProduto(mouse);

        Boolean preco = loja.alteraPreco("Mouse", 400);

        assertEquals(true, preco);
    }
}