/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzycontrol;

import java.math.BigDecimal;
import java.math.RoundingMode;
import net.sourceforge.jFuzzyLogic.FIS;

/**
 *
 * @author joslu
 */
public class Exercise {
    
    private double inputValue1 = 0.0;
    
    private double inputValue2 = 0.0;
    
    public String getName(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public String getTitle(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public String getInputName1(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public String getInputName2(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void setInputValue1(double value){
        inputValue1 = value;
    }
    
    public int[] getValue1Range() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void setInputValue2(double value){
        inputValue2 = value;
    }
    
    public int[] getValue2Range() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public String getOutputName(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public String getFilename(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public double getOutputValue(){
         // Load from 'FCL' file
        FIS fis = FIS.load(getFilename(),true);
        
        // Error while loading
        if( fis == null ) { 
            System.err.println("Can't load file: '" + getFilename() + "'");
            return 0.0;
        }

        // Set inputs
        fis.setVariable(getInputName1(), inputValue1);
        fis.setVariable(getInputName2(), inputValue2);

        // Evaluate
        fis.evaluate();

        // Show output variable
        double result = fis.getVariable(getOutputName()).getValue(); 
        return round(result,2);
    }
    
    public int[] getOutputRange() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    
}
