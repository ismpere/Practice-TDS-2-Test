package uva.tds.pr2.equipo05;

/**
 * 
 * @author ismpere
 * @author martorb
 *
 */
public class Linea{
	/**
	 * Constructor por defecto de la clase Linea
	 * @param id
	 * @param p
	 */
	public Linea(int id, Parada[] p) {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Devuelve el identificador de la linea
	 * @return id
	 */
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
	/**
	 * Devuelve las paradas de la linea
	 * @return paradas
	 */
	public Parada[] getParadas() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * Devuelve la parada inicial de la linea
	 * @return inicio
	 */
	public Parada getParadaInicio() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * Devuelve la parada final de la linea
	 * @return fin
	 */
	public Parada getParadaFin() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * Añade una nueva parada a la Linea
	 * @param p
	 * @param i
	 */
	public void addParadaIntermedia(Parada p) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Cambia el identificador de la linea
	 * @param id
	 */
	public void setId(int id) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Cambia la parada ininio de la linea
	 * @param p
	 */
	public void setParadaInicio(Parada p) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Cambia la parada fin de la linea
	 * @param p
	 */
	public void setParadaFin(Parada p) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Añade la parada en la posicion seleccionada
	 * @param p
	 * @param i
	 */
	public void addParadaAt(Parada p, int i) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Elimina la parada intermedia de la linea
	 * @param p
	 */
	public void removeParadaIntermedia(Parada p) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Devuelve una lista de paradas de la linea cercanas a una direccion
	 * @param gd
	 * @return paradas
	 */
	public Parada[] getParadasCercanas(GD gd) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * Devuelve si hay parads cercanas de esa linea a una direccion
	 * @param gd
	 * @return existenParadasCercanas
	 */
	public boolean existeParadasCercanas(GD gd) {
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * Devuelve las paradas con correspondencia de this con l
	 * @param l
	 * @return paradas
	 */
	public Parada[] getParadasConCorrespondencia(Linea l) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * Devuelve si hay o no correspondencia de this con l
	 * @param l
	 * @return hayCorrespondencia
	 */
	public boolean existeCorrespondencia(Linea l) {
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * Devuelve las paradas con transbordo directo de this con l
	 * @param l
	 * @return paradas
	 */
	public Parada[] getParadasConTransbordoDirecto(Linea l) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * Devuelve si hay transbordo directo entre this y l
	 * @param l
	 * @return existeTransbordoDirecto
	 */
	public boolean existeTransbordoDirecto(Linea l) {
		// TODO Auto-generated method stub
		return false;
	}
	
}