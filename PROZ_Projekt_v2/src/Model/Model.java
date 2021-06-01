package Model;

/**
 * A class representing a model in MVC design pattern.
 * 
 * @author Pawe³ Maœluch
 */
public class Model {
	
	/* Fields connected with basic operations (+,-,*,/). */
	
	/** 1st algebraic complex number for basic operations (+,-,*,/). */
	private AlgebraicComplex algCplxNum1;
	
	/** 2nd algebraic complex number for basic operations (+,-,*,/). */
	private AlgebraicComplex algCplxNum2;
	
	/** A result for basic operations (+,-,*,/). */
	private AlgebraicComplex algCplxResult;
	
	
	
	/* Fields connected with conversion operations. */
	
	/** An algebraic complex number to be converted into an exponential complex number. */
	private AlgebraicComplex algCplxConv;
	
	/** An exponential complex number converted from an algebraic complex number. */
	private ExponentialComplex expCplxConvResult;
	
	
	/** An exponential complex number to be converted into an algebraic complex number. */
	private ExponentialComplex expCplxConv;
	
	/** An algebraic complex number converted from an exponential complex number. */
	private AlgebraicComplex algCplxConvResult;
	
	
	/** Public constructor. */
	public Model() {
		algCplxNum1 = new AlgebraicComplex(0,0);
		algCplxNum2 = new AlgebraicComplex(0,0);
		algCplxResult = new AlgebraicComplex(0,0);
		
		algCplxConv = new AlgebraicComplex(0,0);
		expCplxConvResult = new ExponentialComplex(0,0);
		
		expCplxConv = new ExponentialComplex(0,0);
		algCplxConvResult = new AlgebraicComplex(0,0);
	}
	
	
	
	/** Copy constructor. 
	 * 
	 * @param other A model to be copied.
	 * */
	public Model(Model other) {
		algCplxNum1 = other.algCplxNum1;
		algCplxNum2 = other.algCplxNum2;
		algCplxResult = other.algCplxResult;
		
		algCplxConv = other.algCplxConv;
		expCplxConvResult = other.expCplxConvResult;
		
		expCplxConv = other.expCplxConv;
		algCplxConvResult = other.algCplxConvResult;
	}
	
	
	
	/* Getters. */
	
	/** A method which returns a 1st algebraic complex number for basic operations (+,-,*,/). 
	 * 
	 * @return A 1st algebraic complex number for basic operations (+,-,*,/).
	 * */
	public AlgebraicComplex getAlgCplxNum1() {
		return algCplxNum1;
	}
	
	
	
	/** A method which returns a 2nd algebraic complex number for basic operations (+,-,*,/). 
	 * 
	 * @return A 2nd algebraic complex number for basic operations (+,-,*,/).
	 * */
	public AlgebraicComplex getAlgCplxNum2() {
		return algCplxNum2;
	}
	
	
	
	/** A method which returns a result for basic operations (+,-,*,/). 
	 * 
	 * @return A result for basic operations (+,-,*,/).
	 * */
	public AlgebraicComplex getAlgCplxResult() {
		return algCplxResult;
	}
	
	
	
	/** A method which returns an exponential complex number to be converted into an algebraic complex number. 
	 * 
	 * @return An exponential complex number to be converted into an algebraic complex number. 
	 * */
	public ExponentialComplex getExpCplxConv() {
		return expCplxConv;
	}
	
	
	
	/** A method which returns an algebraic complex converted from an exponential complex number. 
	 * 
	 * @return An algebraic complex number converted from an exponential complex number. 
	 * */
	public AlgebraicComplex getAlgCplxConvResult() {
		return algCplxConvResult;
	}
	
	
	
	/** A method which returns an algebraic complex number to be converted into an exponential complex number. 
	 * 
	 * @return An algebraic complex number to be converted into an exponential complex number. 
	 * */
	public AlgebraicComplex getAlgCplxConv() {
		return algCplxConv;
	}
	
	
	
	/** A method which returns an exponential complex converted from an algebraic complex number. 
	 * 
	 * @return An exponential complex number converted from an algebraic complex number. 
	 * */
	public ExponentialComplex getExpCplxConvResult() {
		return expCplxConvResult;
	}
	
	
	
	/* Setters. */
	
	/** A method which sets a 1st algebraic complex number for basic operations (+,-,*,/). 
	 * 
	 * @param other A 1st algebraic complex number for basic operations (+,-,*,/).
	 * */
	public void setAlgCplxNum1(AlgebraicComplex other) {
		algCplxNum1 = other;
	}
	
	
	
	/** A method which sets a 2nd algebraic complex number for basic operations (+,-,*,/). 
	 * 
	 * @param other A 2nd algebraic complex number for basic operations (+,-,*,/).
	 * */
	public void setAlgCplxNum2(AlgebraicComplex other) {
		algCplxNum2 = other;
	}
	
	
	
	/** A method which sets a result for basic operations (+,-,*,/). 
	 * 
	 * @param other A result for basic operations (+,-,*,/).
	 * */
	public void setAlgCplxResult(AlgebraicComplex other) {
		algCplxResult = other;
	}
	
	
	
	/** A method which sets an algebraic complex number to be converted into an exponential complex number. 
	 * 
	 * @param other An algebraic complex number (to be converted into an exponential complex number). 
	 * */
	public void setAlgCplxConv(AlgebraicComplex other) {
		algCplxConv = other;
	}
	
	
	
	/** A method which sets an exponential complex number converted from an algebraic complex number. 
	 * 
	 * @param other An exponential complex number (converted from an algebraic complex number). 
	 * */
	public void setExpCplxConvResult(ExponentialComplex other) {
		expCplxConvResult = other;
	}
	
	
	
	/** A method which sets an exponential complex number to be converted into an algebraic complex number. 
	 * 
	 * @param other An exponential complex number (to be converted into an algebraic complex number). 
	 * */
	public void setExpCplxConv(ExponentialComplex other) {
		expCplxConv = other;
	}
	
	
	
	/** A method which sets an algebraic complex number converted from an exponential complex number. 
	 * 
	 * @param other An exponential complex number (converted from an algebraic complex number). 
	 * */
	public void setAlgCplxConvResult(AlgebraicComplex other) {
		algCplxConvResult = other;
	}
	
}
