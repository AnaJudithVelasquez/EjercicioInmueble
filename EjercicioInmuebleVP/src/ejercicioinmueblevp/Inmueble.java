/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioinmueblevp;


public class Inmueble {
     int identificadorInmobiliario;
     int area;
     String direccion;
     double precioVenta;

    public Inmueble(int identificadorInmobiliario, int area, String direccion, double precioVenta) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.area = area;
        this.direccion = direccion;
        this.precioVenta = precioVenta;
    }
     
     public double calcularPrecioVenta(double valorArea){
         
         this.precioVenta = area * valorArea;
        return precioVenta;   
 }
     public void imprimir(){
         System.out.println(" Identificador: " + identificadorInmobiliario);
         System.out.println(" Area: " + area + " m^2 ");
         System.out.println(" Direccion:" + direccion);
         System.out.println(" Precio de Venta: $ " + precioVenta);
     }
}

         
     
  
     
    


