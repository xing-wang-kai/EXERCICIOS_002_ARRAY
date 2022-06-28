package br.com.mercadinho;

/**
 * ESTA É A CLASS QUE DEFINE OS PRODUTODS DO MERCADO.
 * @author KAI WANG
 *
 */
public class Produto {
	
	private static int id;
	private int codigo;
	private String nome;
	private double preco;
	
	public Produto(String nome, double preco) {
		this.setCodigo(id);
		this.setNome(nome);
		this.setPreco(preco);
		id++;
	}
	public int getCodigo() {
		return this.codigo;
	}
	public String getNome() {
		return this.nome;
	}
	public double getPreco() {
		return this.preco;
	}
	public void setCodigo(int valor) {
		this.codigo = valor;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	@Override
	public String toString() {
		return "[Produto: Codigo- " + this.codigo + " Nome-" + this.nome + " Preco-" + this.preco + " ]";
	}
}
