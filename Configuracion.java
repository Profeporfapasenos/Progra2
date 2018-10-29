/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2;

/**
 *
 * @author Jose Daniel
 */
import javax.swing.JOptionPane;

public class Configuracion {
        int cantidadconsultoriosrojos;
        int cantidadconsultoriosama;
        int cantidadconsultoriosverdes;
        int opcion=0, elemento;
        int minimo;
        int maximo;
        
        
        public void configura(){
            do{
                try{
                    opcion= Integer.parseInt(JOptionPane.showInputDialog(null, 
                            "1.Ingresar cantidad de consultorios\n"+"2.Salir\n"+
                                    "Elige una opción...", JOptionPane.QUESTION_MESSAGE));
                    switch(opcion){
                        case 1:
                            cantidadconsultoriosrojos= Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingrese la cantidad de consultorios rojos","Agregando Cantidad",
                                    JOptionPane.QUESTION_MESSAGE));
                            cantidadconsultoriosama= Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingrese la cantidad de consultorios amarillos","Agregando Cantidad",
                                    JOptionPane.QUESTION_MESSAGE));      
                            cantidadconsultoriosverdes= Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingrese la cantidad de consultorios verdes","Agregando Cantidad",
                                    JOptionPane.QUESTION_MESSAGE));
                            minimo = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingrese el tiempo minimo para el egreso","Agregando Minimo",
                                    JOptionPane.QUESTION_MESSAGE));
                            maximo = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingrese el tiempo maximo para el egreso","Agregando Maximo",
                                    JOptionPane.QUESTION_MESSAGE));
                            
                            InterfazCopia contador = new InterfazCopia();
                            contador.setMaximoRojo(cantidadconsultoriosrojos);
                            contador.setMaximoAmarillo(cantidadconsultoriosama);
                            contador.setMaximoVerde(cantidadconsultoriosverdes);
                            contador.setMaximo(maximo);
                            contador.setMinimo(minimo);
                            contador.setVisible(true);
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "Configuración finalizada",
                            "Fin",JOptionPane.INFORMATION_MESSAGE);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción Incorrecta", "¡Ciudado!",
                                    JOptionPane.INFORMATION_MESSAGE);
                    }
                }catch(NumberFormatException n){
                    JOptionPane.showMessageDialog(null, "Error"+ n.getMessage());
                }
            }while(opcion!=2);
        }
}
