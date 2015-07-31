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
 * Clase abstracta con algunas implementaciones y funciones adicionales
 */
public abstract class AbstractPila<E> implements Pila<E>{

    //------------------------------------------------------
    // Atributos
    //------------------------------------------------------
    /**
     * almacena datos temporales
     */
    private int s1 = 0;

    /**
     * almacena datos temporales
     */
    private int s2 = 0;

    //------------------------------------------------------
    // Metodos
    //------------------------------------------------------
    /**
     * Indica si la pila esta vacia.
     * @return true Si esta vacia. false Si no lo esta.
     */
    public boolean isEmpty(){
        if(size()==0) return true;
        return false;
    }

    /** Introduce un elemento a la pila.
     *  @param elemento El elemento a introducir.
     */
    public abstract void push( E elemento );

    /** Saca un elemento de la pila y lo retorna.
     *	pre: La pila no puede estar vacia.
     *	@return El elemento que se saca de la pila.
     */
    public abstract E pop() throws NullPointerException;

    /** Retorna el elemento que toca sacar en la pila, pero no lo saca.
     *  pre: La pila no puede estar vacia.
     *  @return El elemento que esta hasta arriba de la pila.
     */
    public abstract E peek() throws NullPointerException;

    /** Informa el tamano de la pila
     *  @return La cantidad de elementos de la pila
     */
    public abstract int size();

    /** Quita todos los elementos de la pila.
     *  post: La pila queda vacia.
     */
    public abstract void superPop();

     /**
     * Suma dos valores que se mandan
     * @param a primer valor a sumar
     * @param b segundo valor a sumar
     * @return la suma en string
     */
    public String suma(String a, String b){
        String total = "";

        s1 = Integer.parseInt(a);
        s2 = Integer.parseInt(b);

        s1 += s2;
        total = s1 + "";

        return total;
    }

    /**
     * Resta dos valores que se mandan
     * @param a primer valor para la suma
     * @param b valor con se va a restar
     * @return la resta en string
     */
    public String resta(String a, String b){
        String total = "";

        s1 = Integer.parseInt(a);
        s2 = Integer.parseInt(b);

        s1 = s2 - s1;
        total = s1 + "";

        return total;
    }

    /**
     * multiplicacion de dos valores obtenidos
     * @param a valor a multiplicar
     * @param b valor a multiplicar
     * @return multiplicacion en string
     */
    public String multiplicacion(String a, String b){
        String total = "";

        s1 = Integer.parseInt(a);
        s2 = Integer.parseInt(b);

        s1 *= s2;
        total = s1 + "";

        return total;
    }

    /**
     * divide dos valores que se reciben
     * @param a numerador
     * @param b denominador
     * @return la division en string
     */
    public String division(String a, String b){
        String total = "";

        s1 = Integer.parseInt(a);
        s2 = Integer.parseInt(b);

        s1 = s2 / s1;
        total = s1 + "";

        return total;
    }
}