/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzycontrol;

/**
 *
 * @author joslu
 */
public class Exerc6 extends Exercise {
    
    @Override
    public String getFilename() {
        return "control/propina.fcl";
    }

    @Override
    public String getName() {
        return "Ejercicio 6";
    } 
    
    @Override
    public String getTitle(){
        return "Propina Sugerida";
    }

    @Override
    public String getInputName1() {
        return "Servicio";
    }
    
    @Override
    public int[] getValue1Range() {
        int range[] = {0,9};
        return range;
    }

    @Override
    public String getInputName2() {
        return "Comida";
    }
    
    @Override
    public int[] getValue2Range() {
        int range[] = {0,9};
        return range;
    }

    @Override
    public String getOutputName() {
        return "Propina";
    }
    
    @Override
    public int[] getOutputRange() {
        int range[] = {0,30};
        return range;
    }
    
}
