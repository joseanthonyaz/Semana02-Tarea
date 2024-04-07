/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana02_ejercicio02;
import java.util.Scanner;
import java.util.Date;
/**
 *
 * @author Anthony
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        
        //Implementar un programa que imprima una boleta de pago, incluyendo descuentos, subtotal y total.
        
        Scanner lector=new Scanner(System.in);
        Date today = new Date();
        
        int dni;
        double desc, subT, total, descT;
        
        System.out.println("Ingrese el nombre del cliente:".toUpperCase());
        String cliente = lector.nextLine();
        
        System.out.println("Ingrese su DNI:".toUpperCase());
        dni = lector.nextInt();
        
        System.out.println("Ingrese el precio del producto:".toUpperCase());
        subT = lector.nextDouble();
        
        System.out.println("Ingrese el descuento:".toUpperCase());
        desc = lector.nextDouble();
        
        descT=subT*(desc/100);
        total=subT-descT;
                
       System.out.println("#############################");
       System.out.println("\ttienda bonifacio".toUpperCase());
       System.out.println("#############################");
       
       System.out.printf("FECHA:%tD%n", today);
       System.out.printf("HORA:%tT%n", today);
       System.out.println("CLIENTE:"+cliente.toUpperCase());
       System.out.println("DNI:"+dni);
       
       System.out.println("#############################");
       System.out.println("SUBTOTAL:S/."+subT);
       System.out.println("DESCUENTO:S/."+descT);
       System.out.println("TOTAL:S/."+total);
       
       System.out.println("#############################");
       System.out.println("vuelva pronto!".toUpperCase());
       System.out.println("#############################");
    }
    
}
