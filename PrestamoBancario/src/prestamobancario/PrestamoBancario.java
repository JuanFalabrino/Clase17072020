
package prestamobancario;

import javax.swing.JOptionPane;

/*
Realizar un programa que calcule las cuotas de un préstamo bancario. 
Solicitarle al Cliente por JOPTIONPANE :
Nombre  y apellido
DNI
Sueldo Mensual:
Solicitado:
Cuotas : hasta 12 

Calculo: 
•	El banco presta hasta 100000 pesos siempre y cuando el sueldo del solicitante superé los 200000 anuales.
•	El préstamo  no debe superar a los 10 sueldos del cliente.
•	Calculo = solicitado / cuota

Imprimir la información consola
Logo del banco 
Información del cliente  
Monto solicitado
Cantidad de cuotas
Importe a pagar
Y Si esta aprobado o no 
*/
public class PrestamoBancario {

  
    public static void main(String[] args) {
       
       String Nombreyapellido;
       int DNI;
       int Sueldo_Mensual;
       int Solicitado;
       int Cuotas;
       double cuotaspagar = 0;
       boolean resultado = false;
       
        
       Nombreyapellido =JOptionPane.showInputDialog(null, "Ingrese el nombre y apellido del solicitante", "Simulador de prestamo",JOptionPane.WARNING_MESSAGE );
       DNI = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el DNI del solicitante", "Simulador de prestamo",JOptionPane.WARNING_MESSAGE ));
       Sueldo_Mensual = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el Sueldo mensual del solicitante : ", "Simulador de prestamo",JOptionPane.WARNING_MESSAGE ));
       Solicitado = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el importe solicitado : ", "Simulador de prestamo",JOptionPane.WARNING_MESSAGE ));
       Cuotas = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de cuotas : ", "Simulador de prestamo",JOptionPane.WARNING_MESSAGE ));
       
       if (Solicitado > 100000 || Cuotas > 12){
        condicionesgenerales();
        imprimir(Nombreyapellido,resultado,DNI,Sueldo_Mensual,Solicitado,Cuotas,cuotaspagar); 
        System.exit(0);
       }else {
           int sueldoanual = Sueldo_Mensual * 12;
           if (sueldoanual < 200000){
                 condicionesgenerales();
                 imprimir(Nombreyapellido,resultado,DNI,Sueldo_Mensual,Solicitado,Cuotas,cuotaspagar); 
                 System.exit(0);    
           }else {
             int prestamomaximo = Sueldo_Mensual * 10;
             if (prestamomaximo > Solicitado ){
                 JOptionPane.showInputDialog(null,"El banco se encuentra procesando la información",JOptionPane.INFORMATION_MESSAGE);
                 resultado = true;
                 cuotaspagar =  Solicitado / Cuotas;
                 imprimir(Nombreyapellido,resultado,DNI,Sueldo_Mensual,Solicitado,Cuotas,cuotaspagar); 
                 System.exit(0);
             }else {
                 condicionesgenerales();
                 imprimir(Nombreyapellido,resultado,DNI,Sueldo_Mensual,Solicitado,Cuotas,cuotaspagar); 
                 System.exit(0);   
              }             
            }
         }
       
              
    }
    public static  void condicionesgenerales(){
    JOptionPane.showConfirmDialog(null," 1_El banco no puede presta mas de 10 veces  el sueldo del cliente\n 2_El sueldo anual del cliente debe ser mayor o igual a $ 200000\n 3_El banco presta hasta $100000\n 4_El banco solo permite cuotas hasta 12 ","Condiciones Generales",JOptionPane.WARNING_MESSAGE);
           
    }
    
    
    public static  void imprimir(String Nombreyapellido, boolean resultado,int DNI, int Sueldo_Mensual,int Solicitado,int Cuotas, double cuotaspagar){

        System.out.println("=============================================");
        System.out.println("==              BANCO CFP36                ==");
        System.out.println("=============================================");
        System.out.println("== Nombre y Apellido : " + Nombreyapellido + "==" );
        System.out.println("== DNI : " + DNI + "==");
        System.out.println("== Sueldo Mensual : " + Sueldo_Mensual + "==");
        System.out.println("==  Solicitado por el cliente : " + Solicitado + "==");
        System.out.println("==  Cuota : " + Cuotas + "==");
        System.out.println("==  Cuota por mes  : " + cuotaspagar + "==");
        System.out.println("== El resultado de la evaluacion es : " + resultado + "==" );
        System.out.println("=============================================");
      
        
    }
    
}
