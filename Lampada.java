package treino2;

public class Lampada {
	
	String marca, modelo;
	int potencia;
	boolean bivolt;
	
	protected void ligarLampada() {
		System.out.println("Lampada Ligada!");
	}
	
	protected void desligarLampada() {
		System.out.println("Lampada Desligada!");
	}
}
