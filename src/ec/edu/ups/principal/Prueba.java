/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ups.principal;

import ec.edu.ups.clases.Carrera;
import ec.edu.ups.clases.Estudiante;
import ec.edu.ups.clases.Materia;
import ec.edu.ups.clases.Persona;
import ec.edu.ups.clases.Profesor;
import ec.edu.ups.clases.Sede;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Sede sedeCuenca=new Sede(10001,"Sede Cuenca","Calle Vieja","2569835");
         Carrera carrera=new Carrera(1, "Computacion", 10, 400, "Ingeniero en Ciencias de la Computacion");
         Carrera carrera1=new Carrera(2, "Telemática", 10, 420, "Ingeniero en Telemática");
         Carrera carrera2=new Carrera(3, "Mecatronica", 10, 350, "Ingeniero Mecatronico");
         Materia materia=new Materia(101, "Programacion Aplicada", 6, 240, 3);
         Materia materia1=new Materia(102, "Algebra Lineal", 4, 200, 1);
         Materia materia2=new Materia(103, "Etica", 2, 150, 3);
         Materia materia3=new Materia(104, "Base de Datos", 6, 240, 4);
         Materia materia4=new Materia(105, "Sistema Operativos", 6, 240, 2);
         Materia materia5=new Materia(106, "Ecuaciones Diferenciales", 4, 200, 3);
         Profesor profe1=new Profesor("Ingeniero Sistemas", 1101.10, "Profesor", 1001, "Juan Espinoza", "0102698554", "4086953", "Av. Solano", "juane@est.ups.edu.ec");
         Profesor profe2=new Profesor("Ingeniero Electrico", 1500.10, "Profesor", 1002, "Andres Placencia", "0102698584", "4086953", "Av. Americas", "juane@est.ups.edu.ec");
         
                 
    }
    
}
