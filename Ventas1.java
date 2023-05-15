import java.util.Scanner;

public class Ventas1 {
    public static void main(String[] args) {
         char tipoCarro;
         float ventas;
         char refproducto = 0 ;
         float acum =1; 
         float ventas2 =0; 
         double num;
        
Scanner sc = new Scanner(System.in);
Scanner input = new Scanner(System.in);
System.out.println("Indique el numero de productos vendidos  :  ");
ventas = sc.nextFloat();

while( acum <= ventas) {
    
System.out.println("ingrese el precio de la venta:  " + acum);
num = sc.nextDouble();
ventas2 += num;
acum++;
System.out.print("ingrese la referencia del producto:  ");
refproducto = input.next().charAt(0);
System.out.print("ingrese el nombre del vehiculo al cual aplica el producto:");
tipoCarro = input.next().charAt(0);
}
float promedio =  (acum + ventas2) / ventas;

System.out.println("el numero de ventas fue de:  " + ventas  );
System.out.println("El promedio de ventas es " + promedio);
}
}