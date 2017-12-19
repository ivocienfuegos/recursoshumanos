/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Ivo
 */
public class Empleado {
    private int id;
    private int rut;
    private String fechaIngreso;
    private String fechaCumpleanos;
    private String direccion;
    private String nombre;

    public Empleado() {
        this.id = 0;
        this.rut = 0;
        this.fechaIngreso = "";
        this.fechaCumpleanos = "";
        this.direccion = "";
        this.nombre = "";
    }

    
    public Empleado(int id, int rut, String fechaIngreso, String fechaCumpleanos, String direccion, String nombre) {
        this.id = id;
        this.rut = rut;
        this.fechaIngreso = fechaIngreso;
        this.fechaCumpleanos = fechaCumpleanos;
        this.direccion = direccion;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaCumpleanos() {
        return fechaCumpleanos;
    }

    public void setFechaCumpleanos(String fechaCumpleanos) {
        this.fechaCumpleanos = fechaCumpleanos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", rut=" + rut + ", fechaIngreso=" + fechaIngreso + ", fechaCumpleanos=" + fechaCumpleanos + ", direccion=" + direccion + ", nombre=" + nombre + '}';
    }
    
    
}
