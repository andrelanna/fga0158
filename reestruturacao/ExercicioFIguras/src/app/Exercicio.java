package app;

import javax.swing.JOptionPane;

import FigurasPlanas.FiguraPlana;
import FigurasPlanas.Quadrado;
import FigurasPlanas.TrianguloEquilatero;
import FigurasSolidas.Cubo;
import FigurasSolidas.FiguraSolida;

public class Exercicio {

	public static void main(String[] args) {
		FiguraPlana fp1;
		FiguraSolida fs1; 
		
		fp1 = new Quadrado(5);
		imprimir(fp1);
		fp1 = new TrianguloEquilatero(10);
		imprimir(fp1);
		
		fs1 = new Cubo(10);
		imprimir(fs1);
		fs1 = new Cubo(20);
		imprimir(fs1);
		
	}

	private static void imprimir(FiguraSolida fs1) {
		String msg = "A figura sólida é um " + fs1.getClass().getName() + "\n" + 
				     "A área da superficie da figura é " + fs1.calcularAreaSuperficie() + "\n" +
	                 "O volume da figura é " + fs1.calcularVolume() + ".";
		JOptionPane.showMessageDialog(null, msg);
	}

	private static void imprimir(FiguraPlana fp1) {
		String msg = "A figura plana é um " + fp1.getClass().getName() + "\n" + 
   				     "A área da figura plana é " + fp1.calcularArea() + "\n" +
		             "O perímetro da figura plana é " + fp1.calcularPerimetro() + ".";
		JOptionPane.showMessageDialog(null, msg);             
	}

}
