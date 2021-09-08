package figurasGeometricas;

public class Circulo {
	
		private float raio;
		public static final float PI = (float) 3.14;
		public Circulo(float raioCirculo) {
			this.raio = raioCirculo;
		}
	
		public float calcularPerimetro() {
			return (float) (2 * PI * raio); 
		}
		
		public float calcularArea() {
			return (float) (raio * raio * PI); 
		}
	
		public float getRaio() {
			return raio;
		}
}
