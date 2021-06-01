package Model;

/**
 * A class representing algebraic complex numbers.
 * 
 * @author Pawe³ Maœluch
 * */
public class AlgebraicComplex {

	/** A real part of an algebraic complex number. */
	private double Re;
	
	/** An imaginary part of an algebraic complex number. */
    private double Im;


    
    /** A public constructor creating an algebraic complex number equal zero. */
    public AlgebraicComplex(){
        Re = Im = 0;
    }

    
 
    /**
     * A public constructor creating an algebraic complex number with a given real and imaginary part. 
     * 
     * @param Re Real part of an algebraic complex number.
     * @param Im Imaginary part of an algebraic complex number.
     * */
    public AlgebraicComplex(double Re, double Im){
        this.Re = Re;
        this.Im = Im;
    }

    
    
    /**
     * Copy constructor.
     * 
     * @param other An algebraic complex number to be copied.
     * */
    public AlgebraicComplex(AlgebraicComplex other){
        Re = other.Re;
        Im = other.Im;
    }


    
    /**
     * A method which returns a real part of an algebraic complex number.
     * 
     * @return A real part of an algebraic complex number.
     * */
    public double getRe() { return Re; }
    
    
    
    /**
     * A method which sets a real part of an algebraic complex number.
     * 
     * @param Re A new value of a real part of an algebraic complex number.
     * */
    public void setRe(double Re) { this.Re = Re; }
    

    
    /**
     * A method which returns an imaginary part of an algebraic complex number.
     * 
     * @return An imaginary part of an algebraic complex number.
     * */
    public double getIm() { return Im; }
    
    
    
    /**
     * A method which sets an imaginary part of an algebraic complex number.
     * 
     * @param Im A new value of an imaginary part of an algebraic complex number.
     * */
    public void setIm(double Im) { this.Im = Im; }


    
    /**
     * This method computes an algebraic complex number conjugated to a given algebraic complex number.
     * 
     * @return An algebraic complex number conjugated to a given algebraic complex number.
     * */
    private AlgebraicComplex conjugate(){
        return new AlgebraicComplex( Re, -Im );
    }


    
    /**
     * This method computes a squared absolute value of an algebraic complex number.
     * 
     * @return A squared absolute value of an algebraic complex number.
     * */
    private double sqrAbs(){
        return Re*Re + Im*Im;
    }

    
    
    /**
     * This method computes an absolute value of an algebraic complex number.
     * 
     * @return An absolute value of an algebraic complex number.
     * */
    public double abs(){
        return Math.sqrt( this.sqrAbs() );
    }
    
    
    
    /**
     * This method divides an algebraic complex number divided by a real number k.
     * 
     * @param k A number we divide an algebraic complex number for.
     * 
     * @return An algebraic complex number divided by a real number k.
     * */
    private AlgebraicComplex divide(double k){
        return new AlgebraicComplex(Re/k, Im/k);
    }
    
    
    
    /**
     * This method adds two algebraic complex numbers.
     * 
     * @param number1 1st algebraic complex number.
     * @param number2 2nd algebraic complex number.
     * 
     * @return A sum (number1 + number2).
     * */
    public static AlgebraicComplex add(AlgebraicComplex number1, AlgebraicComplex number2){
    	
    	double Re = number1.Re + number2.Re;
    	double Im = number1.Im + number2.Im;
    	
        return new AlgebraicComplex( Re, Im );
    }


    
    /**
     * This method subtracts two algebraic complex numbers.
     * 
     * @param number1 1st algebraic complex number.
     * @param number2 2nd algebraic complex number.
     * 
     * @return A difference (number1 - number2).
     * */
    public static AlgebraicComplex subtract(AlgebraicComplex number1, AlgebraicComplex number2){
    	double Re = number1.Re - number2.Re;
    	double Im = number1.Im - number2.Im;
    	
        return new AlgebraicComplex( Re, Im );
    }


    
    /**
     * This method multiplies two algebraic complex numbers.
     * 
     * @param number1 1st algebraic complex number.
     * @param number2 2nd algebraic complex number.
     * 
     * @return A product (number1 * number2).
     * */
    public static AlgebraicComplex multiply(AlgebraicComplex number1, AlgebraicComplex number2){
        double Re   =   number1.Re * number2.Re   -   number1.Im * number2.Im;
        double Im   =   number1.Re * number2.Im   +   number1.Im * number2.Re;

        return new AlgebraicComplex( Re, Im );
    }


    
    /**
     * This method divides two algebraic complex numbers.
     * 
     * @param number1 1st algebraic complex number.
     * @param number2 2nd algebraic complex number.
     * 
     * @return A quotient (number1 / number2).
     * */
    public static AlgebraicComplex divide(AlgebraicComplex number1, AlgebraicComplex number2){
        double k = number2.sqrAbs();
        AlgebraicComplex tmpAlgebraicComplex = multiply( number1, number2.conjugate() );
        AlgebraicComplex result = tmpAlgebraicComplex.divide( k );

        return result;
    }
    
    
    
    /**
     * This method converts an algebraic complex number into an exponential complex number.
     * 
     *  @return An exponential form of an algebraic complex number.
     * */
    public ExponentialComplex toExponentialComplex() {
    	double r = this.abs();
    	double theta = Math.atan2( Im, Re );
    	
    	return new ExponentialComplex(r, theta);
    }
}
