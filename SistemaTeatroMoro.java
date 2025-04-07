/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author bpach
 */
public class SistemaTeatroMoro {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        
        final int VIP = 30000;
        final int PLATEA_BAJA = 15000;
        final int PLATEA_ALTA = 18000;
        final int PALCO = 13000;
        
        int respuestaCompra;
        int valorEntradaApagar;
        String nombreUbicacion;
        double descuento;
        int totalCompra = 0;
        int descuentoAplicado;
        
        System.out.println("Bienvenido al Teatro Moro");
        
        try {
            
            
            System.out.println("Por favor seleccione una opcion del menu:");
            System.out.println("1. Comprar entrada");
            System.out.println("2. Salir");
            System.out.println("Elija una opcion:");
            respuestaCompra = Integer.parseInt(scanner.nextLine());
                
            
           
            while(respuestaCompra == 1){
               
            System.out.println("Por favor ingrese la ubicacion de su asiento");
            System.out.println("Ubicaciones disponibles: 1. VIP, 2. platea alta, 3. platea baja, 4. Palco");
            int ubicacionSeleccionada = scanner.nextInt();
            
               
                   System.out.println("Por favor ingrese su edad");
                   int edadUsuario = scanner.nextInt();
                   
                   if (edadUsuario < 18 ) {
                       descuento = 0.9;
                   }else if (edadUsuario >= 65 ) {
                       descuento = 0.85;
                   }else{
                       descuento = 1;
                   }
         
            System.out.println("Resumen de la compra");   
            switch (ubicacionSeleccionada) {
                case 1:
                nombreUbicacion = "VIP";
                valorEntradaApagar = (int) (VIP * descuento);            
                descuentoAplicado = VIP - valorEntradaApagar;

                System.out.println("Ubicacion: "+nombreUbicacion);
                System.out.println("Precio base: $"+VIP);
                System.out.println("Descuento aplicado: $"+descuentoAplicado);
                System.out.println("Precio final de la entrada: $"+valorEntradaApagar);
                
                break;
                case 2:
                nombreUbicacion = "Platea alta";
                valorEntradaApagar = (int) (PLATEA_ALTA * descuento);
                descuentoAplicado = PLATEA_ALTA - valorEntradaApagar;
                System.out.println("Ubicacion: "+nombreUbicacion);
                System.out.println("Precio base: $"+PLATEA_ALTA);
                System.out.println("Descuento aplicado: $"+descuentoAplicado);
                System.out.println("Precio final de la entrada: $"+valorEntradaApagar);
                
                break;
                case 3:
                nombreUbicacion = "Platea baja";
                valorEntradaApagar = (int) (PLATEA_BAJA * descuento);
                descuentoAplicado = PLATEA_BAJA - valorEntradaApagar;
                System.out.println("Ubicacion: "+nombreUbicacion);
                System.out.println("Precio base: $"+PLATEA_BAJA);
                System.out.println("Descuento aplicado: $"+descuentoAplicado);
                System.out.println("Precio final de la entrada: $"+valorEntradaApagar);
                
                break;
                case 4:
                nombreUbicacion = "Palco";
                valorEntradaApagar = (int) (PALCO * descuento);
                descuentoAplicado = PALCO - valorEntradaApagar;
                System.out.println("Ubicacion: "+nombreUbicacion);
                System.out.println("Precio base: $"+PALCO);
                System.out.println("Descuento aplicado: $"+descuentoAplicado);
                System.out.println("Precio final de la entrada: $"+valorEntradaApagar);
                
                break;
                default:
                System.out.println("Esta ubicacion no es valida");
                return;
            }
            
            totalCompra = totalCompra + valorEntradaApagar;

            System.out.println("El total de todas sus entradas es: $"+totalCompra);
            
            System.out.println("Quiere otra entrada?:");
            System.out.println("1. Si");
            System.out.println("2. No, Salir");
            System.out.println("Elija una opcion:");
            int resp = scanner.nextInt();
            respuestaCompra = resp;
           }
           
        } catch (NumberFormatException e) {
            System.out.println("Error: por favor seleccione una opcion valida");
            
        } finally {
            System.out.println("Operacion finalizada");
            scanner.close();
        }
            

    }
}
