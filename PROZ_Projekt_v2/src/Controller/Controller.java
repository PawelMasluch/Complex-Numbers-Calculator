package Controller;


import Model.AlgebraicComplex;
import Model.ExponentialComplex;
import Model.Model;

/**
 * 
 * A class containing methods that validate an application's input data and modify an application window.  
 * 
 * @author Pawe³ Maœluch
 * 
 * */
public class Controller {
	
	/** A model of an application window. */
	private Model model;
	
	
	/**
	 * Public constructor.
	 * 
	 * @param other A model for our controller.
	 * */
	public Controller(Model other) {
		model = other;
	}

	
	
	/** 
	 * A method which returns a model of an application window. 
	 * 
	 * @return A model of an application window.
	 * */
	public Model getModel() {
		return model;
	}
	
	
	
	/** 
	 * A method which sets a model of an application window. 
	 * 
	 * @param other A model of an application window.
	 * */
	public void setModel(Model other) {
		model = other;
	}
	
	
	/**
	 * A method that checks whether a given text represents a double value.
	 * 
	 * @param text A text to be checked.
	 * @return {@code true} if a given text represents a double value, <br>
	 * {@code false} otherwise.
	 * */
    private boolean isTextIsDouble(String text){
    	boolean isOK = true;
        
    	try{
            @SuppressWarnings("unused")
			double number = Double.parseDouble( text );
        }
        catch (Exception e){
            isOK = false;
        }
        
        return isOK;
    }


    
    /**
     *
     * A method that checks whether a given algebraic complex number equals zero.
     * 
     * @param z An algebraic complex number to be checked.
     * @return {@code true} if a given algebraic complex number equals zero, <br>
	 * {@code false} otherwise.
     *
     */
    public boolean isZero(AlgebraicComplex z){
        return z.getRe() == 0  &&  z.getIm() == 0;
    }

    

    /**
     * This method checks the input's correctness for basic operations on algebraic complex numbers (+,-,*,/).
     * @param Re1 A string corresponding to a real part of the 1st algebraic complex number.
     * @param Im1 A string corresponding to an imaginary part of the 1st algebraic complex number.
     * @param Re2 A string corresponding to a real part of the 2nd algebraic complex number.
     * @param Im2 A string corresponding to an imaginary part of the 2nd algebraic complex number.
     *
     * @return {@code true} if all input strings contains correct double numbers, <br> 
     * {@code false} otherwise.
     */
    public boolean isBasicInputIsDouble(String Re1, String Im1, String Re2, String Im2){
    	return this.isTextIsDouble(Re1) & 
    		   this.isTextIsDouble(Im1) & 
        	   this.isTextIsDouble(Re2) & 
        	   this.isTextIsDouble(Im2);
    }

    
    
    /**
     * This method checks the input's correctness for conversion operations on complex numbers.
     * @param str1 A string corresponding to a real part of an algebraic complex number (or a radius of an exponential complex number).
     * @param str2 A string corresponding to an imaginary part of an algebraic complex number (or an argument of an exponential complex number).
     *
     * @return {@code true} if all input strings contains correct double numbers, <br> 
     * {@code false} otherwise.
     */
    public boolean isConversionInputIsDouble(String str1, String str2) {
    	return this.isTextIsDouble(str1) & 
    		   this.isTextIsDouble(str2);
    }
    
    
    
    /**
    *
    * A method that checks whether a given radius of an exponential complex number is non-negative.
    * 
    * @param r A radius to be checked.
    * @return {@code true} if a given radius of an exponential complex number is non-negative, <br>
	 * {@code false} otherwise.
    *
    */
    public boolean isRadiusNonNegative(double r) {
    	return r >= 0.;
    }
    
    
    
    /**
     * This method converts an algebraic complex number into text.
     * 
     * @param z An algebraic complex number to be written.
     * 
     * @return A text representation of an algebraic complex number.
     * */
    public String toText(AlgebraicComplex z) {
    	return Double.toString( z.getRe() ) + " + " + Double.toString( z.getIm() ) + "*i";
    }
    
    
    
    /**
     * This method converts an exponential complex number into text.
     * 
     * @param z An exponential complex number to be written.
     * 
     * @return A text representation of an exponential complex number.
     * */
    public String toText(ExponentialComplex z) {
    	return Double.toString( z.getR() ) + " * exp(" + Double.toString( z.getTheta() ) + "*i)";
    }
}