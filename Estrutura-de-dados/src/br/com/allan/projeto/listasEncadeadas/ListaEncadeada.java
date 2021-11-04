package br.com.allan.projeto.listasEncadeadas;

import java.util.Iterator;

public class ListaEncadeada<T> {

	No<T> referenciaEntrada;

	public ListaEncadeada(No<T> referenciaEntrada) {
		this.referenciaEntrada = null;
	}

	public boolean isEmpy() {
		return referenciaEntrada == null ? true : false;

	}

	public int size() {
		int tamanhoLista = 0;

		No<T> referenciaAux = referenciaEntrada;

		while (true) {
			if (referenciaAux != null) {
				tamanhoLista++;
				if (referenciaAux.getProximoNo() != null) {
					referenciaAux = referenciaAux.getProximoNo();
				} else {
					break;
				}
			} else {
				break;
			}
		}
		return tamanhoLista;
	}
	
	public void add(T conteudo) {
		No<T> novoNo = new No<>(conteudo);
		if(this.isEmpy()) {
			referenciaEntrada = novoNo;
			return;
		}
		
		No<T> noAuxiliar = referenciaEntrada;
		for(int i = 0; i < this.size()-1; i++) {
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		noAuxiliar.setProximoNo(novoNo);
	}
	
	private No<T> getNo(int index){
		
		validaIndice(index);
		
		No<T> noAuxiliar = referenciaEntrada;
		No<T> noRetorno = null;
		
		for(int i = 0; i <= index; i++) {
			noRetorno = noAuxiliar;
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		return noRetorno;
	}
	
	
	public T get(int index) {
		return getNo(index).getConteudo();
	}
	
	public T remove(int index) {
		
		No<T> noPivor = this.getNo(index);
		if (index == 0){
			referenciaEntrada = noPivor.getProximoNo();
			return noPivor.getConteudo();
		}
		
		No<T> noAnterior = getNo(index-1);
		noAnterior.setProximoNo(noPivor.getProximoNo());
		return noPivor.getConteudo();
	}
	
	
	public void validaIndice(int index) {
		if (index >= size()) {
			int ultimoIndex = size() - 1;
			throw new IndexOutOfBoundsException("nao existe conteudo no indece" + index + "desta lista, esta lista so vai ate o indice " + ultimoIndex);
		}
	}
	
	@Override
	public String toString() {
		String strRetorno = "";
		No<T> noAuxiliar = referenciaEntrada;
		for (int i = 0; i < this.size(); i++) {
			strRetorno += "No{conteudo=" + referenciaEntrada + "}-->";
			noAuxiliar = noAuxiliar.getProximoNo();
			
		}
		
		strRetorno += "null";
		return strRetorno;
	}
}
