package ar.edu.unte.errores;

public class Prueba {

	public static void main(String[] args) {

		Alumno a = new Alumno(5);
		
		try {
			a.colocarNota(10, "A");
		} catch (Exception e1) {
			e1.printStackTrace();
			System.out.println(e1.getMessage());
		}
		try {
			a.colocarNota(3, "C");
		} catch (Exception e1) {
			e1.printStackTrace();
			System.out.println(e1.getMessage());
		}
		
		
		try {
			System.out.println(a.mostrarNota(6));
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		for (String nota : a.getNotas()){
			System.out.println((nota));
		}
		
	}

}
