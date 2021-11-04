package br.com.allan.projeto.listasDuplamenteEncadeadas;

public class ListaDuplamenteEncadeada<T> {

	private NoDuplo<T> primeiroNo;
	private NoDuplo<T> ultimoNo;
	private int tamanhoLista = 0;

	public ListaDuplamenteEncadeada() {
		this.primeiroNo = null;
		this.ultimoNo = null;
		tamanhoLista = 0;
	}

	public int size() {
		return this.tamanhoLista;
	}
	
	public T get(int index) {
		return this.getNo(index).getConteudo();
	}

	private NoDuplo<T> getNo(int index) {
		NoDuplo<T> noAuxiliar = primeiroNo;

		for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
			noAuxiliar = noAuxiliar.getNoProximo();

		}

		return noAuxiliar;
	}
	
	public void add(T elemento) {
		
		NoDuplo<T> novoNo = new NoDuplo<>(elemento);
		novoNo.setNoProximo(null);
		novoNo.setNoPrevio(ultimoNo);
		if (primeiroNo == null) {
			primeiroNo = novoNo;
			
		}
		
		if (ultimoNo != null) {
			ultimoNo.setNoProximo(novoNo);
		}
		
		ultimoNo = novoNo;
		tamanhoLista ++;
	}
	
	
	public void add(int index, T elemento) {
		NoDuplo<T> noAuxiliar = getNo(index);
		NoDuplo<T> novoNo = new NoDuplo<>(elemento);
		novoNo.setNoProximo(noAuxiliar);
		
		if(novoNo.getNoProximo() != null) {
			novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
			novoNo.getNoProximo().setNoPrevio(novoNo);
		}else {
			novoNo.setNoPrevio(ultimoNo);
			ultimoNo = novoNo;
		}
		
		if (index == 0) {
			primeiroNo = novoNo;
		}else {
			novoNo.getNoPrevio().setNoProximo(novoNo);
		}
		
		tamanhoLista++;
	}
	
	public void remove(int index) {
		if (index == 0) {
			primeiroNo = primeiroNo.getNoProximo();
			
			if (primeiroNo != null) {
				primeiroNo.setNoPrevio(null);
			}
		}else {
			NoDuplo<T> noAuxliar = getNo(index);
			noAuxliar.getNoPrevio().setNoProximo(noAuxliar.getNoProximo());
			if(noAuxliar != ultimoNo) {
				noAuxliar.getNoProximo().setNoPrevio(noAuxliar.getNoPrevio());
			}else {
				ultimoNo = noAuxliar;
			}
		}
		
		this.tamanhoLista--;
	}

	@Override
	public String toString() {
		String strRetorno = "";
		
		NoDuplo<T> noAuxiliar = primeiroNo;
		for (int i = 0; i < size(); i++) {
			strRetorno += "[No{conteudo = " + noAuxiliar + "}]--->";
			noAuxiliar = noAuxiliar.getNoProximo();
			
		}
		strRetorno+= "null";
		return strRetorno;
	}
	
	
}
