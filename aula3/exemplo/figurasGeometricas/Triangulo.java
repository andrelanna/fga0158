package figurasGeometricas;

public class Triangulo {
	private float lado;
	private float altura;
	
		public Triangulo(float ladoTriangulo, float alturaTriangulo) {
			this.lado=ladoTriangulo;
			this.altura=alturaTriangulo;
			
		}
		public float calcularPerimetro() {
			return (lado*2)+(altura*2);
		}
		public float calcularArea() {
			return (lado*altura)/2;
		}
		public float getLado() {
			return lado;
		}
		public float getAltura() {
			return altura;
		}
}
