/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;
import java.util.Scanner;
/**
 *
 * @author SALA I
 */
public class Ejecutor2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        String x1,nombreP,cedulaP;
        System.out.println("Ingrese el nombre de su barrio: ");
        x1 = teclado.next();
        
        Barrio b1 = new Barrio(x1);
        
        System.out.println("Ingrese el nombre de la persona: ");
        nombreP = teclado.next();
        System.out.println("Ingrese la cedula de la persona: ");
        cedulaP = teclado.next();
        
        Persona personaObjeto = new Persona(nombreP,cedulaP,b1);
        System.out.printf("%s\n",personaObjeto);
    }
}
