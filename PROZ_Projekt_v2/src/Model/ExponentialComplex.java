package Model;

/**
 * A class representing exponential complex numbers.
 * 
 * @author Pawe³ Maœluch
 */
public class ExponentialComplex {
	
	/** A radius (r is non-negative). */
	private double r;
	
	/** An angle (in radians). */
	private double theta;
	
	
	
	/**
     * A public constructor creating an exponential complex number equal zero. 
     * */
	public ExponentialComplex() {
		r = 0;
		theta = 0;
	}
	
	
	
	/**
     * A public constructor creating an exponential complex number with a given radius and an argument. 
     * 
     * @param r A radius of an exponential complex number.
     * @param theta An argument of an exponential complex number.
     * */
	public ExponentialComplex(double r, double theta){
        this.r = r;
        this.theta = theta;
    }
	
	
	
	/**
     * Copy constructor.
     * 
     * @param other An exponential complex number to be copied.
     * */
    public ExponentialComplex(ExponentialComplex other){
         r = other.r;
         theta = other.theta;
    }
    
    
    
    /**
     * A method which returns a radius of an exponential complex number.
     * 
     * @return A radius of an exponential complex number.
     * */
    public double getR() {
    	return r;
    }
    
    
    
    /**
     * A method which sets a radius of an exponential complex number.
     * 
     * @param r A new value of a radius of an exponential complex number.
     * */
    public void setR(double r) {
    	this.r = r;
    }
    
    
    
    /**
     * A method which returns an argument of an exponential complex number.
     * 
     * @return An argument of an exponential complex number.
     * */
    public double getTheta() {
    	return theta;
    }
    
    
    
    /**
     * A method which sets an argument of an exponential complex number.
     * 
     * @param theta A new value of an argument of an exponential complex number.
     * */
    public void setTheta(double theta) {
    	this.theta = theta;
    }
    
    
    
    /**
     * This method converts an exponential complex number into an algebraic complex number.
     * 
     *  @return An algebraic form of an exponential complex number.
     * */
    public AlgebraicComplex toAlgebraicComplex() {
    	double Re = r * Math.cos( theta );
    	double Im = r * Math.sin( theta );
    	
    	return new AlgebraicComplex(Re, Im);
    }
}
