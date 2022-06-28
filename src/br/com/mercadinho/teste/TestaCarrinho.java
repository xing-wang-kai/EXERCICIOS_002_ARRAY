package br.com.mercadinho.teste;

import java.util.Locale;

import br.com.mercadinho.CarrinhoCompras;
import br.com.mercadinho.Produto;

public class TestaCarrinho {
	public static void main(String[] args)
	{
		Produto cafe = new Produto("Café Pilão", 12.40 );
		Produto Arroz = new Produto("Arroz bom joão", 22.40);
		Produto Oleo = new Produto("Oleo Girrasol", 14.50);
		Produto Papel = new Produto("papel higienico flocos", 44.30);
		Produto pao = new Produto("pao de forma", 6.55);
		
		System.out.println(pao);
		
		CarrinhoCompras carrinho = new CarrinhoCompras();
		carrinho.add(cafe);
		carrinho.add(Arroz);
		carrinho.add(Oleo);
		carrinho.add(Papel);
		carrinho.add(pao);
		
		System.out.println(carrinho.getCarrinho());
		System.out.println(String.format(new Locale("pt", "BR"),"valor total: R$ %05.2f", carrinho.getValorTotal()));
	}
}
