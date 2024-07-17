package util;

public class Iterador<C> {

	private int pos;
	private Cadastro<C> cadastro;
	
	public Iterador(Cadastro<C> cadastro) {
		this.cadastro = cadastro;
		pos = 0;
	}
	
	public boolean hasNext() {
		return (pos < cadastro.getSize());
	}
	
	public <C> C next() {
		C c = cadastro.get(pos);
		pos++;
		return c;
	}
	
}
