/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones;

import java.util.ArrayList;

/**
 *
 * @author Manuel Rodriguez
 */
public class Main {
    public static void main(String[] args) {
        final String SEPARADOR="--------------------------------------------";
    
        Fabrica f = new Fabrica();
        cargarFabrica(f);
        
        
        System.out.println(SEPARADOR);
        System.out.println("PUNTO A");
        System.out.println(SEPARADOR);
        f.listarInstrumentos();
        
        System.out.println(SEPARADOR);
        System.out.println("PUNTO B");
        System.out.println(SEPARADOR);
        
        ArrayList<Instrumento> lista = f.instrumentosPorTipo(TipoInstrumento.PERCUSION);
        for (Instrumento instrumento : lista) {
            System.out.println(instrumento);
        }
        
        System.out.println(SEPARADOR);
        System.out.println("PUNTO C");
        System.out.println(SEPARADOR);

        Instrumento borrado = f.borrarInstrumento("BCD456");
        System.out.println("Se borró: " + borrado);
        f.listarInstrumentos();
        
        
        System.out.println(SEPARADOR);
        System.out.println("PUNTO D");
        System.out.println(SEPARADOR);
        
        String sucBuscada = "Sucursal A";
        double[] porcs = f.porcInstrumentosPorTipo(sucBuscada);
        TipoInstrumento[] tipos = TipoInstrumento.values();
        System.out.println(sucBuscada);
        for (int i = 0; i < porcs.length; i++) {
            System.out.println(tipos[i] + ": " + porcs[i] + "%");
        }   
    }

    private static void cargarFabrica(Fabrica f) {
        Sucursal s1 = new Sucursal("Sucursal A");
        Sucursal s2 = new Sucursal("Sucursal B");

        s1.agregarInstrumento(new Instrumento("ABC123", 13214, TipoInstrumento.CUERDA));
        s1.agregarInstrumento(new Instrumento("BCD456", 13432, TipoInstrumento.VIENTO));
        s1.agregarInstrumento(new Instrumento("DEF567", 15464, TipoInstrumento.PERCUSION));

        s2.agregarInstrumento(new Instrumento("ASD353", 52432, TipoInstrumento.CUERDA));
        s2.agregarInstrumento(new Instrumento("VXCBE2", 45645, TipoInstrumento.VIENTO));

        f.agregarSucursal(s1);
        f.agregarSucursal(s2);
    }
   
}
