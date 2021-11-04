package br.com.allan.projeto.estruturaNoEmArvoreBinaria;

public class BinNo<T extends Comparable<T>> {

	private T conteudo;
	private BinNo<T> noEsq;
	private BinNo<T> nodir;

	public BinNo() {
	}

	public BinNo(T conteudo) {
		this.conteudo = conteudo;
		noEsq = nodir = null;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public BinNo<T> getNoEsq() {
		return noEsq;
	}

	public void setNoEsq(BinNo<T> noEsq) {
		this.noEsq = noEsq;
	}

	public BinNo<T> getNodir() {
		return nodir;
	}

	public void setNodir(BinNo<T> nodir) {
		this.nodir = nodir;
	}

	@Override
	public String toString() {
		return "BinNo [conteudo=" + conteudo + "]";
	}

}
