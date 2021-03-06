package com.ipartek.formacion.basedatosProfe.modelo;

import java.util.ArrayList;

/**
 * Interfaz para permitir guardar, recuperar, modificar y eliminar Beans
 * Soporta las operaciones b�sicas de CRUD
 * @author Curso
 *
 */

//UN INTERFACE NO TIENE C�DIGO, LE PASA EL MARR�N AL QUE LO IMPLEMENTA (ModeloVia)
public interface Persistable {
	
	// {@code int} y {@code Object} para que lo ponga en los Tag de code
	/**
	 * Persiste el Objeto y lo guarda
	 * @param o {@code Object} a guardar
	 * @return {@code int} Identificador del objeto guardado, -1 en caso de fallo
	 */
	int save ( Object o );
	
	/**
	 * Recupera Objeto por su identificador
	 * @param id {@code int} identificador del objeto a recuperar
	 * @return {@code Object} objeto encontrado o null en caso contrario
	 */
	Object getById(int id);
	
	/**
	 * Recupera una colecci�n de Objetos
	 * @return colecci�n de objetos, si no existe colecci�n vac�a
	 */
	ArrayList<Object> getAll();
	
	/**
	 * Modifica un objeto el cual debe tener un identificador definido
	 * @param o {@code Object} a modificar
	 * @return true si se modifica bien, false en caso contrario
	 */
	boolean update(Object o);
	
	/**
	 * Eliminar un Objeto por su identificador
	 * @param id {@code int} identificador del objeto a eliminar
	 * @return true si elimina, false en caso contrario
	 */
	boolean delete(int id);
	
	
	
	

	
}
