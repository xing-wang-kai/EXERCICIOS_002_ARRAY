package br.com.mercadinho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * CLASS CARRINHO QUE RETORNA TODOS PRODUTOS E SOMA OS VALORES
 * @author kaiuc
 *
 */
public class CarrinhoCompras {
	private List<Produto> carrinho = new ArrayList<>();
	private double valorTotal;
	
	public CarrinhoCompras() {
		
	}
	public void add(Produto produto) {
		carrinho.add(produto);
		this.valorTotal += produto.getPreco();
	}
	public double getValorTotal() {
		return this.valorTotal;
	}
	public List<Produto> getCarrinho() {
		return Collections.unmodifiableList(carrinho);
	}
	public Produto getProduto(int valor) {
		return this.carrinho.get(valor);
	}
	
}
