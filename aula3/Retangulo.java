package figurasGeometricas;

public class Retangulo {

		private float base;
		private float altura;
		
		public Retangulo(float baseRetangulo, float alturaRetangulo) {
			this.base = baseRetangulo;
			this.altura = alturaRetangulo;
		}
	
		public float calcularPerimetro() {
			return 2 * base * base * altura*altura; 
		}
		
		public float calcularArea() {
			return base * altura; 
		}
	
		public float getBase() {
			return base;
		}
		public float getAltura() {
			return altura;
		}
}
