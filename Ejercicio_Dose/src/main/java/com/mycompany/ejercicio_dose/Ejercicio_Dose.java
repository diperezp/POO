/**
 * @author diperezp
 * @brief  Solucion de un ejercicio propuesto por el libro guia
 * @date   24-02-2024
 */

package com.mycompany.ejercicio_dose;


public class Ejercicio_Dose {

    public static void main(String[] args) {
        double Horas_Trabajadas,Valor_Hora;
        double Percent_Retencion;
        double Salario_Bruto,Salario_Neto;
        
        Valor_Hora=5000;
        Horas_Trabajadas=48;
        Salario_Bruto=Valor_Hora*Horas_Trabajadas;
        Percent_Retencion=12.5/100;
        Salario_Neto=Salario_Bruto*(1-Percent_Retencion);
        
        System.out.println("Horas Trabajadas :"+Horas_Trabajadas);
        System.out.println("Salario Bruto :"+Salario_Bruto);
        System.out.println("Salario Neto :" + Salario_Neto);
        
    }
}
