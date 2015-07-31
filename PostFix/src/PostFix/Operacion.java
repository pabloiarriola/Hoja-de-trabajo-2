import java.util.*;
/**
 * Universidad del Valle de Guatemala
 * Facultad de Ingenieria
 * Departamento de Ciencias de la Computacion
 * Algoritmos y Estructuras de Datos
 * Seccion 10
 * @author Pablo Arriola
 * @author Christopher Aju
 */
public class Operacion extends AbstractPila<String>{

    //-------------------------------------------------------
    // Atributos
    //-------------------------------------------------------
    /**
     * Guarda las operaciones
     */
    private ArrayList<String> operaciones;

    //-------------------------------------------------------
    // Constructor
    //-------------------------------------------------------
    /**
     * Constructor de la clase
     * se encarga de inicializar los arraylists
     */
    public Operacion(){
        operaciones = new ArrayList();
    }

    //-------------------------------------------------------
    // Metodos
    //-------------------------------------------------------
    /**
     * Agrega un nuevo elemento
     * @param elemento que debe ser agregado
     */
    public void push(String elemento) {
        operaciones.add(elemento);
    }

    /**
     * Da el ultimo elemento y lo borra
     * @return el ultimo elemento
     * @throws NullPointerException
     */
    public String pop() throws NullPointerException {
        String retorno = "";
        try{
            int tam = size() - 1;
            retorno = operaciones.get(tam);
            operaciones.remove(tam);
        }
        catch(Exception e){
            System.out.println("La lista esta vacia.");
        }

        return retorno;
    }

    /**
     * Mira al ultimo elemento
     * @return el ultimo elemento
     * @throws NullPointerException
     */
    public String peek() throws NullPointerException {
        String retorno = "";
        try{
            int tam = size() - 1;
            retorno = operaciones.get(tam);
        }
        catch(Exception e){
            System.out.println("La lista esta vacia.");
        }

        return retorno;
    }

    /**
     * Da el tamano actual del arraylist
     * @return el tamano
     */
    public int size() {
        int tam;

        if(operaciones.isEmpty())
            tam = 0;
        else
            tam = operaciones.size();

        return tam;
    }

    /**
     * limpia operaciones y operandos
     */
    public void superPop() {
        operaciones.clear();
    }

}
