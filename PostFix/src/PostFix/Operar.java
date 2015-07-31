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
 * Clase que se encarga de realizar las operaciones
 */
public class Operar {

    //-----------------------------------------------
    // Atributos
    //-----------------------------------------------
    /**
     * Objeto para realizar los analisis
     */
    private Operacion operar;

    //------------------------------------------------
    // Constructor
    //------------------------------------------------
    /**
     * Constructor de la clase
     */
    public Operar(){
        operar = new Operacion();
    }

    //------------------------------------------------
    // Metodos
    //------------------------------------------------
    /**
     * Verifica que contiene la cadena y lo procesa
     * @param cadena ingresada por el usuario
     * @return resultado final de la operacion
     */
    public String hacerOperacion(String cadena){
        String retorno = "";

        for(int i=0; i<cadena.length(); i++){
            if('('!=cadena.charAt(i) && ')'!=cadena.charAt(i) && ' '!=cadena.charAt(i) && '+'!=cadena.charAt(i)
                    && '-'!=cadena.charAt(i) && '*'!=cadena.charAt(i) && '/'!=cadena.charAt(i)){
                String guardar = "";
                try{
                    guardar = cadena.substring(i, cadena.indexOf(" ", i));
                    if(guardar.length()>=2)
                        i += guardar.length();
                }
                catch(Exception e){
                    try{
                        guardar = cadena.substring(i, cadena.indexOf("(", i));
                    }
                    catch(Exception ex){
                        guardar = cadena.substring(i, cadena.indexOf(")", i));
                    }
                }
                operar.push(guardar);
            }

            else if('+'==cadena.charAt(i)){
                String op1 = operar.pop();
                String op2 = operar.pop();
                retorno = operar.suma(op1, op2);
                operar.push(retorno);
            }

            else if('-'==cadena.charAt(i)){
                String op1 = operar.pop();
                String op2 = operar.pop();
                retorno = operar.resta(op1, op2);
                operar.push(retorno);
            }

            else if('/'==cadena.charAt(i)){
                String op1 = operar.pop();
                String op2 = operar.pop();
                retorno = operar.division(op1, op2);
                operar.push(retorno);
            }

            else if('*'==cadena.charAt(i)){
                String op1 = operar.pop();
                String op2 = operar.pop();
                retorno = operar.multiplicacion(op1, op2);
                operar.push(retorno);
            }

//            else{
//                retorno = "Ingreso incorrecto.";
//                reset();
//                break;
//            }
        }

        return retorno;
    }

    public void reset(){
        operar.superPop();
    }
}
