/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ups.clases;

/**
 *
 * @author Usuario
 */
public class Profesor extends Persona{
    
    
    private String titulo;
    private double salario;
    private String cargo;

    public Profesor() {
    }

    public Profesor(int codigo) {
        super(codigo);
    }

    public Profesor(int codigo, String nombre, String cedula) {
        super(codigo, nombre, cedula);
    }

    public Profesor(String titulo, double salario, String cargo, int codigo, String nombre, String cedula, String telefono, String direccion, String correo, Sede sede) {
        super(codigo, nombre, cedula, telefono, direccion, correo, sede);
        this.titulo = titulo;
        this.salario = salario;
        this.cargo = cargo;
    }
    
   

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Profesor{" + "titulo=" + titulo + ", salario=" + salario + ", cargo=" + cargo + '}';
    }
    
    
    
         
    
}
