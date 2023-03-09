/**
 * Escribir un programa que almacene la cadena de caracteres contraseña en una variable, 
 * pregunte al usuario por la contraseña e imprima por pantalla si la contraseña introducida 
 * por el usuario coincide con la guardada en la variable sin tener en cuenta mayúscula y minúscula
 */
package actividad02;

import javax.swing.JOptionPane;


public class Actividad02 {

    
    public static void main(String[] args) {
        //Declaracion de variables
         String contrasenia;
         
         //Asignacion de Variable
         
         contrasenia = JOptionPane.showInputDialog("Ingrese su contraseña");
        
         // Procesando la solucion
        if(contrasenia.equalsIgnoreCase("Marcelo")){
            System.out.println("Se valido su contraseña de manera satisfactoria");
        }
    }
    
}
