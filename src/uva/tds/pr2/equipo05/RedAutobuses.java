package uva.tds.pr2.equipo05;

/**
 * 
 * @author martorb
 * @author ismpere
 *
 */
public class RedAutobuses {
	
	/**
	 * Constructor por defecto de la clase RedAutobuses
	 * @param lista_lineas Lista (array) que contiene las líenas iniciales de la red
	 * @assert.pre lista_lineas.length>1
	 * @assert.pre !lineasRepetidas(lista_lineas)
	 * @throws IllegalArgumentException si lista_lineas==null || alguna de las lineas de la lista es null
	 */
	public RedAutobuses(Linea[] lista_lineas){
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Devuelve una línea de la red a partir de su identificador
	 * @param id Número que identifica la línea
	 * @return línea buscada
	 * @assert.post red.contains(linea) && linea.getId()==id
	 */
	public Linea getLinea(int id){
		// TODO Auto-generated constructor stub
		return null;
	}
	
	/**
	 * Añade una línea a la red 
	 * @param linea Línea a añadir
	 * @assert.pre !red.contains(linea)
	 * @throws IllegalArgumentException si linea==null
	 */
	public void addLinea(Linea linea){
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Elimina una línea de la red
	 * @param linea Línea a eliminar
	 * @assert.pre red.contains(linea)
	 * @assert.post !(red.contains(linea)) && red.getAllLineas.length>1
	 * @throws IllegalArgumentException si linea==null
	 */
	public void deleteLinea(Linea linea){
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Devuelve la lista (array) de todas las líneas de la red
	 * @return Lista (array) que contiene todas las líenas de la red
	 */
	public Linea[] getAllLineas(){
		// TODO Auto-generated constructor stub
		return null;
	}
	/**
	 * Comprueba si en una lista (array) existen líneas repetidas
	 * @param lista_lineas lista a comprobar
	 * @return hayLineaRepetida
	 * @throws IllegalArgumentException si lista_lineas==null || alguna de las lineas de la lista es null
	 */
	public static boolean lineasRepetidas(Linea[] lista_lineas){
		// TODO Auto-generated constructor stub
		return true;
	}
	
	/**
	 * Comprueba si la red contiene una determinada línea
	 * @param linea
	 * @return contieneLinea
	 * @throws IllegalArgumentException si linea==null
	 */
	public boolean contains(Linea linea){
		// TODO Auto-generated constructor stub
		return false;
	}
	
	
}
