package br.com.allan.digital.innovation.one.tiposPrimitivos;

public class DefaultValues {

	public static void main(String[] args) {
		final Default d = new Default();
		System.out.println(d.get());
		System.out.println(d.isActive());

	}

}

class Default {
	int i;
	boolean active;
	
	public int get() {
		return i;
	}

	public boolean isActive() {
		return active;
	}

}
