/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg12441107_abby_fernandez_prueba4;

/**
 *
 * @author afern
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> juegod = new ArrayList();
    static ArrayList<String> juegop=new ArrayList();
    static Random rand=new Random();
    //static Juego juego = new Juego ();



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido!");
        
        
        System.out.println("--------------------------------------------------");
        System.out.println("Menu: ");
        System.out.println("1) Agregar nuevo juego");
        System.out.println("2) Presar juego");
        System.out.println("3) Regresar juego: ");
        System.out.println("4) Buscar juego por nombre");
        System.out.println("5) Listar juegos disponibles");
        System.out.println("6) Listar juegos prestados");
        System.out.println("Ingrese una opcion:");
        int op =sc.nextInt();
        String estado="disponible";
        switch (op){
            case 1: 
                System.out.println("Ingrese el nombre del juego: ");
                String nombre = sc.nextLine();
                System.out.println("Ingrese el autor del juego");
                String autor =sc.nextLine();
                int id =rand.nextInt(900); 
                System.out.println("Su pin es: "+ id);
                estado="disponible";
                juegod.add(nombre);
    
                break;
            case 2: 
                System.out.println("Ingrese el nombre del solicitador del juego: ");
                nombre = sc.nextLine();
                System.out.println("Ingrese la posicion del juego");
                String posicion=sc.nextLine();
                juegop.add(nombre);
                
            case 3: 
                System.out.println("Ingrese el nombre del juego que se esta devolviendo: ");
                nombre=sc.nextLine();
                System.out.println("Ingrese la posicion del juego: ");
                posicion=sc.nextLine();
                estado="disponible";
                juegod.add(nombre);
                
            case 4: 
                System.out.println("Ingrese el nombre que busca: ");
                nombre=sc.nextLine();
                String busca= juegod.get(0); 
                System.out.println(busca);
                
            case 5: 
                for (String lista : juegod) {
                     System.out.println(lista);
                 }
            case 6: 
                for (String lista : juegop) {
                     System.out.println(lista);
                }   
               
        }
    }
    
}
