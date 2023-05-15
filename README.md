


# AlMACEN DE AUTOPARTES 
# BASE DEL PROGRAMA 

En su labor como programador de software ha sido elegido para el desarrollo de una aplicación que necesita un almacén de autopartes , que desea calcular el promedio de venta segun su precio de  cualquier cantidad de productos de la empresa.  como información básica cada producto debe registrar referencia, para que tipo de carro aplica y su precio.

 ### Principales aclaraciones:
 
<ol>
• Se supondrá que la aplicación solo se requiere para calcular el promedio de las ventas ingresadas 
</ol>
<ol>
• Para efectos de mantener la simplicidad del ejemplo no se contemplan manejar persistencia en el almacenamiento de los datos.
</ol>
<ol>
• No se realiza validación, ni se verifica calidad en los datos ingresados.
</ol>

<H2>HISTORIA DE USUARIO:




<h2>CASO DE USO


 <b>Nombre:</b> Calcular Promedio Ventas Autopartes.
 <b> Actores: </b> Gerente de Autopartes
Propisito: Guardar numero de referencia del producto ,  nombre y modelo del vehiculo y precio de la venta para calcular un promedio de venta.
<b>Curso Normal de Eventos:</b>
<ol>
1. El gerente ingresa la cantidad de ventas obtenidas
</ol>
<ol>
2. El gerente ingresa el precio del producto , numero de referencia del producto , modelo del vehiculo a aplicar el producto
</ol>
<ol>
3. Se calcula el promedio de venta a partir de : 
promedio =  (acum + ventas2) / ventas;</ol>
<ol>
4. Se da a conocer el promedio de las ventas y los productos que fueron ingresados 
</ol>

<hr>
<H2>DIAGRAMA DE FLUJO

<link>https://lucid.app/documents/view/3f1cf999-31fe-4def-87ec-c73198817c49</link>


</hr>


<h2>pseudocodigo</h2>
<p>
INICIO

     // Declarar variables
    caracter tipoCarro
    flotante ventas
    caracter refproducto = 0
    flotante acum = 1
    flotante ventas2 = 0
    doble num
    
    // Crear objetos Scanner
    Scanner sc = nuevo Scanner(System.in)
    Scanner input = nuevo Scanner(System.in)
    
    // Pedir al usuario el número de productos vendidos
    imprimir "Indique el numero de productos vendidos: "
    ventas = sc.nextFloat()
    
    // Iniciar el ciclo while
    mientras (acum <= ventas) hacer
        // Pedir al usuario el precio de la venta
        imprimir "ingrese el precio de la venta: " + acum
        num = sc.nextDouble()
        
        // Sumar el precio de venta al total de ventas
        ventas2 += num
        
        // Incrementar el acumulador
        acum = acum + 1
        
        // Pedir al usuario la referencia del producto y el nombre del vehículo
        imprimir "ingrese la referencia del producto: "
        refproducto = input.next().charAt(0)
        imprimir "ingrese el nombre del vehiculo al cual aplica el producto: "
        tipoCarro = input.next().charAt(0)
        
    fin mientras
    
    // Calcular el promedio de ventas
    flotante promedio = (acum + ventas2) / ventas
    
    // Mostrar el número de ventas y el promedio de ventas
    imprimir "el numero de ventas fue de: " + ventas
    imprimir "El promedio de ventas es " + promedio
    
FIN
