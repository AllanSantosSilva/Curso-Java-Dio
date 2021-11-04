package br.com.allan.projeto.listasCirculares;

public class ListaCircular<T> {
	
	private No<T> cabeça;
	private No<T> calda;
	private int tamanhoLista;
	
	
	
	public ListaCircular() {
		this.calda = null;
		this.cabeça = null;
		this.tamanhoLista = 0;
	}

	public int size() {
		return this.tamanhoLista;
	}
	
	public boolean isEmpty() {
		return this.tamanhoLista == 0 ? true : false;
	}
	
	private No<T> getNo(int index){
		if(this.isEmpty())
			throw new IndexOutOfBoundsException("lista esta vazia");
		if(index == 0) {
			return this.calda;
		}
		No<T> noAuxiliar = this.calda;
		for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
			noAuxiliar = noAuxiliar.getNoProximo();
		}
		return noAuxiliar;
	}
	
	public T get(int index) {
		return this.getNo(index).getConteudo();
	}
	
	public void remove(int index) {
		if(index >= this.tamanhoLista)
			throw new IndexOutOfBoundsException("o indice e maior que o tamanho da lista");
		No<T> noAuxiliar = this.calda;
		if(index == 0) {
			this.calda = this.calda.getNoProximo();
			this.cabeça.setNoProximo(this.calda);
		}else if(index == 1) {
			this.calda.setNoProximo(this.calda.getNoProximo());
		}else {
			for (int i = 0; i < index-1; i++) {
				noAuxiliar = noAuxiliar.getNoProximo();
			}
			
			noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
		}
		
		this.tamanhoLista--;
	}
	
	public void add(T conteudo) {
		No<T> novoNo = new No<T>(conteudo);
		if (this.tamanhoLista == 0) {
			this.cabeça = novoNo;
			this.calda = this.cabeça;
			this.cabeça.setNoProximo(calda);
		}else {
			novoNo.setNoProximo(this.calda);
			this.cabeça.setNoProximo(novoNo);
			this.calda = novoNo;
		}
		this.tamanhoLista++;
	}

	@Override
	public String toString() {
		String strRetorno = "";
		No<T> noAuxiliar = this.calda;
		for (int i = 0; i < this.size(); i++) {
			strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]----->";
			noAuxiliar = noAuxiliar.getNoProximo();
			
		}
		strRetorno += this.size() != 0 ? "(retorna ao inicio)" : "[]";
		
		return strRetorno;
	}
	
	
}
