/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg12441107_abby_fernandez_prueba4;

/**
 *
 * @author afern
 */
import java.util.Scanner;
public class Juego {
    static Scanner sc = new Scanner(System.in);
    private String nombre; 
    private String autor; 
    private String desarollador;
    private int id;
    private String estado; 
    private String dueno;
    
    
    
    public Juego (String nombre, String autor, int id, String estado, String dueno){
        this.nombre=nombre;
        this.autor=autor;
        this.id=id;
        this.estado=estado;
        this.dueno=dueno;
        
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }
    
    public void devolver(){
        System.out.println("Ingrese el nombre");
        String nombre=sc.nextLine();
        estado="disponible";
        
    }
        
    public void prestado(){
        if (estado=="disponible"){
                    System.out.println("El juego esta dispoible, desea rentarlo? [si o no] ");
                    String resp = sc.nextLine();
                    if (resp=="si"){
                        estado="prestado";
                    }
                    else{
                        estado="disponible";
                    }
       }
    }
}
