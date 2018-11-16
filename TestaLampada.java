package treino2;

public class TestaLampada {

	public static void main(String[] args) {
		
		Lampada led = new Lampada();
		led.marca = "ourolux";
		led.modelo = "LED";
		led.potencia = 12;
		led.bivolt = false;
		System.out.println();
		
		System.out.println("marca: " + led.marca + "\nModelo: " + led.modelo + "\n" + led.potencia + "v\nBivolt: " + led.bivolt);
		
		System.out.println();
		led.ligarLampada();
		led.desligarLampada();

	}

}
