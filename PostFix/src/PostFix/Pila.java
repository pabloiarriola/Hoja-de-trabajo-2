/**
 * Universidad del Valle de Guatemala
 * Facultad de Ingenieria
 * Departamento de Ciencias de la Computacion
 * Algoritmos y Estructuras de Datos
 * Seccion 10
 * @author Pablo Arriola
 * @author Christopher Aju
 */

/**
 * Clase que se encarga de definir la interfaz que debe ser implementada
 */
public interface Pila<E> {

    /**
     * Indica si la pila esta vacia.
     * @return true Si esta vacia. false Si no lo esta.
     */
    public boolean isEmpty();

    /** Introduce un elemento a la pila.
     *  @param elemento El elemento a introducir.
     */
    public void push( E elemento );

    /** Saca un elemento de la pila y lo retorna.
     *	pre: La pila no puede estar vacia.
     *	@return El elemento que se saca de la pila.
     */
    public E pop() throws NullPointerException;

    /** Retorna el elemento que toca sacar en la pila, pero no lo saca.
     *  pre: La pila no puede estar vacia.
     *  @return El elemento que esta hasta arriba de la pila.
     */
    public E peek() throws NullPointerException;

    /** Informa el tama�o de la pila
     *  @return La cantidad de elementos de la pila
     */
    public int size();

    /** Quita todos los elementos de la pila.
     *  post: La pila queda vacia.
     */
    public void superPop();

}