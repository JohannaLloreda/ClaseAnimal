/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseanimal;

/**
 *
 * @author geo
 */
public class ClaseAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mascota obj = new Mascota ();
    obj.setClase("Perro");
    obj.setEdad(5);
    obj.setNombre("Cody");
    obj.setNum_Patas(10);
    
        System.out.println(obj.getClase());
        System.out.println(obj.getEdad());
        System.out.println(obj.getNombre());
        System.out.println(obj.getNum_Patas());
        
        
        

            

// TODO code application logic here
    }
}
