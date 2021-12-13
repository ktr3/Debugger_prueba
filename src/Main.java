
public class Main {

	public static void main(String[] args) {

		Operaciones operaciones = new Operaciones();
		
		int uno = 8;
		int dos = 8;
		int resultado = 0;
		
		resultado = operaciones.suma(uno, dos);
		System.out.println("la suma es: " + resultado);
		resultado = operaciones.multiplicacion(uno,dos);
		System.out.println("La multiplicacion es: " + resultado);
		
		if (resultado==64) {
			System.out.println("EXITO");
			
		}else {
			System.out.println("ERROR");
		}
	}

}
