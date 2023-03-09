/**
 * Se ingresan tres notas de un alumno, si el promedio es mayor
 * o igual a siete mostrar un mensaje "Promocionado".
 */
package actividad01;

public class Actividad01 {

    public static void main(String[] args) {
        
        //Declaracion de Variables
        float nota1, nota2, nota3, promedio, cantidadNotas, totalNotas;
               
        //Asignacion de variables
        nota1 = 4;
        nota2 = 10;
        nota3 = 9;
        totalNotas = nota1 + nota2 + nota3;
        cantidadNotas = 3;
        promedio = totalNotas / cantidadNotas;
        
        // Procesando la solucion
        if(promedio >= 7){
            System.out.println("Promocionado, con un promedio de: " + promedio);
        }
       
       
      
        

    }

}
