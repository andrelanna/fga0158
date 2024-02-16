package exemploPolimorfismoParametrico;

public class Mesa {
	int largura, altura, comprimento; 
	String cor;
	
	public Mesa(int l, int a, int c, String cr) {
		largura = l; 
		altura = a; 
		comprimento = c;
		cor = cr;
	}
	
	public String toString() {
		return largura + " x " + altura + " x " + comprimento + " : " + cor;
	}
}
