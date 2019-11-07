package ar.edu.unte.errores;

public class Alumno {
	
	
	public String[] getNotas() {
		return notas;
	}
	public void setNotas(String[] notas) {
		this.notas = notas;
	}

	private String[] notas;
	
	public Alumno(int cantidadNotas) {
		
		this.notas = new String[cantidadNotas];
		
	}
	public void colocarNota(int numeroNota, String nota) throws Exception {
		int cantidadNotas = this.notas.length;
		if (numeroNota >= cantidadNotas) {
			throw new Exception("Numero de Nota Invalido");
		}
		else if (numeroNota < 0) {
			throw new Exception("Numero de Nota Invalido");
		}
		else {
		this.notas[numeroNota] = nota;
		}
	}

	public String mostrarNota(int numeroNota) throws Exception {
		int cantidadNotas = this.notas.length;
		if (cantidadNotas < numeroNota) {
			String mensaje = "El numero de nota " + numeroNota + " supera la cantidad " + cantidadNotas + " que posee el alumno";
			throw new Exception(mensaje);
			
		}
		return this.notas[numeroNota];
	}
	
}
