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
public class Exerc3 extends Exercise {
    
    @Override
    public String getFilename() {
        return "control/foco.fcl";
    }

    @Override
    public String getName() {
        return "Ejercicio 3";
    } 
    
    @Override
    public String getTitle(){
        return "Potencia de Foco";
    }

    @Override
    public String getInputName1() {
        return "LuzExterior";
    }
    
    @Override
    public int[] getValue1Range() {
        int range[] = {0,100};
        return range;
    }

    @Override
    public String getInputName2() {
        return "Temperatura";
    }
    
    @Override
    public int[] getValue2Range() {
        int range[] = {0,100};
        return range;
    }

    @Override
    public String getOutputName() {
        return "PotenciaFoco";
    }
    
    @Override
    public int[] getOutputRange() {
        int range[] = {0,255};
        return range;
    }
    
}
