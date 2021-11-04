package br.com.allan.projeto.estruturaNoEmArvoreBinaria;

public class ArvoreBinaria<T extends Comparable<T>> {

	private BinNo<T> raiz;

	public ArvoreBinaria() {
		this.raiz = null;
	}

	public void inserir(T conteudo) {
		BinNo<T> novoNo = new BinNo<T>(conteudo);
		this.raiz = inserir(raiz, novoNo);
	}

	private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo) {
		if (atual == null) {
			return novoNo;
		} else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
			atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
		} else {
			atual.setNodir(inserir(atual.getNodir(), novoNo));
		}
		return atual;
	}

	public void exibirInOrdem() {
		System.out.println("\n exibindo em ordem");
		exibirInOrdem(this.raiz);
	}

	private void exibirInOrdem(BinNo<T> atual) {
		if (atual != null) {
			exibirInOrdem(atual.getNoEsq());
			System.out.print(atual.getConteudo() + " ,");
			exibirInOrdem(atual.getNodir());
		}
	}

	public void exibirPosOrdem() {
		System.out.println("\n exibindo pós ordem");
		exibirPosOrdem(this.raiz);
	}

	private void exibirPosOrdem(BinNo<T> atual) {
		if (atual != null) {
			exibirPosOrdem(atual.getNoEsq());
			exibirPosOrdem(atual.getNodir());
			System.out.print(atual.getConteudo() + " ,");

		}
	}

	public void exibirPreOrdem() {
		System.out.println("\n exibindo pós ordem");
		exibirPreOrdem(this.raiz);
	}

	private void exibirPreOrdem(BinNo<T> atual) {
		if (atual != null) {
			System.out.print(atual.getConteudo() + " ,");
			exibirPreOrdem(atual.getNoEsq());
			exibirPreOrdem(atual.getNodir());

		}
	}

	public void remove(T conteudo) {
		try {
			BinNo<T> atual = this.raiz;
			BinNo<T> pai = this.raiz;
			BinNo<T> filho = this.raiz;
			BinNo<T> temp = this.raiz;

			while (atual != null && !atual.getConteudo().equals(conteudo)) {
				pai = atual;

				if (conteudo.compareTo(atual.getConteudo()) < 0) {
					atual = atual.getNoEsq();
				} else {
					atual = atual.getNodir();
				}
			}

			if (atual == null) {
				System.out.println("conteudo nao encontrado. bloco try");
			}

			if (pai == null) {
				if (atual.getNodir() == null) {
					this.raiz = atual.getNoEsq();
				} else if (atual.getNoEsq() == null) {
					this.raiz = atual.getNodir();
				} else {
					for (temp = atual, filho = atual = atual.getNoEsq(); filho.getNodir() != null;temp = filho, filho.getNoEsq()) {
						if (filho != atual.getNoEsq()) {
							temp.setNodir(filho.getNoEsq());
							filho.setNoEsq(raiz.getNoEsq());
						}
						filho.setNodir(raiz.getNodir());
						raiz = filho;
					}
				}
			} else if (atual.getNodir() == null) {
				if(pai.getNoEsq() == atual) {
					pai.setNoEsq(atual.getNoEsq());
				}else {
					pai.setNodir(atual.getNoEsq());
				}
			} else if (atual.getNoEsq() == null) {
				if(pai.getNoEsq() == atual) {
					pai.setNoEsq(atual.getNodir());
				}else {
					pai.setNodir(atual.getNodir());
				}
			} else {
				for (temp = atual,filho = atual.getNoEsq(); filho.getNodir() != null; temp =filho = filho.getNodir()) {
					if (filho != atual.getNoEsq()) {
						temp.setNodir(filho.getNoEsq());
						filho.setNoEsq(atual.getNoEsq());
					}
					filho.setNodir(atual.getNodir());
					if (pai.getNoEsq() == atual) {
						pai.setNoEsq(filho);
					} else {
						pai.setNodir(filho);
					}
				}	
			}

		} catch (NullPointerException e) {
			System.out.println("conteudo nao encontrado. bloco catch");
		}

	}
}
