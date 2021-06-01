package View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import Controller.Controller;
import Model.AlgebraicComplex;
import Model.ExponentialComplex;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


/**
 * A class creating an application window.
 * 
 * @author Pawe³ Maœluch
 * */
public class View {

	// The elements of an application window.
	private JFrame frame;
	
	
	private JTextField textFieldBasicRe1;
	private JTextField textFieldBasicIm1;
	private JTextField textFieldBasicRe2;
	private JTextField textFieldBasicIm2;
	private JTextField textFieldBasicAnswer;
	private JTextField textFieldConversionToAlgebraicAnswer;
	private JTextField textFieldConversionRe;
	private JTextField textFieldConversionIm;
	private JTextField textFieldConversionR;
	private JTextField textFieldConversionTheta;
	private JTextField textFieldConversionToExponentialAnswer;
	
	
	private JLabel lblTitle;
	private JLabel lblBasic1stComplexNumber;
	private JLabel lblBasic2ndComplexNumber;
	private JLabel lblBasicRe1;
	private JLabel lblBasicIm1;
	private JLabel lblBasicRe2;
	private JLabel lblBasicIm2;
	private JLabel lblBasicAnswer;
	private JLabel lblConversionToAlgebraicAnswer;
	private JLabel lblConversionIm;
	private JLabel lblConversionRe;
	private JLabel lblConversionTheta;
	private JLabel lblConversionR;
	private JLabel lblCoversionToExponentialAnswer;
	private JLabel lblConversion;
	private JLabel lblBasicOperations;
	
	
	private JButton AddButton;
	private JButton SubtractButton;
	private JButton MultiplyButton;
	private JButton DivideButton;
	private JButton AlgebraicFormButton;
	private JButton ExponentialFormButton;
	

	/**
	 * A public constructor which creates the application.
	 * 
	 * @param controller A controller of an application window.
	 */
	public View(Controller controller) {
		frame = new JFrame();
		frame.setBounds(100, 100, 1220, 820);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		lblTitle = new JLabel("Complex Numbers' Calculator");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(254, 10, 655, 49);
		frame.getContentPane().add(lblTitle);
		
		textFieldBasicRe1 = new JTextField();
		textFieldBasicRe1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldBasicRe1.setBounds(160, 185, 300, 40);
		frame.getContentPane().add(textFieldBasicRe1);
		textFieldBasicRe1.setColumns(10);
		
		textFieldBasicIm1 = new JTextField();
		textFieldBasicIm1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldBasicIm1.setBounds(160, 232, 300, 40);
		frame.getContentPane().add(textFieldBasicIm1);
		textFieldBasicIm1.setColumns(10);
		
		textFieldBasicRe2 = new JTextField();
		textFieldBasicRe2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldBasicRe2.setBounds(676, 185, 300, 40);
		frame.getContentPane().add(textFieldBasicRe2);
		textFieldBasicRe2.setColumns(10);
		
		textFieldBasicIm2 = new JTextField();
		textFieldBasicIm2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldBasicIm2.setBounds(676, 232, 300, 40);
		frame.getContentPane().add(textFieldBasicIm2);
		textFieldBasicIm2.setColumns(10);
		
		lblBasic1stComplexNumber = new JLabel("1st complex number");
		lblBasic1stComplexNumber.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblBasic1stComplexNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblBasic1stComplexNumber.setBounds(187, 150, 234, 25);
		frame.getContentPane().add(lblBasic1stComplexNumber);
		
		lblBasic2ndComplexNumber = new JLabel("2nd complex number");
		lblBasic2ndComplexNumber.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblBasic2ndComplexNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblBasic2ndComplexNumber.setBounds(708, 145, 221, 34);
		frame.getContentPane().add(lblBasic2ndComplexNumber);
		
		lblBasicRe1 = new JLabel("Re:");
		lblBasicRe1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBasicRe1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBasicRe1.setBounds(110, 187, 60, 35);
		frame.getContentPane().add(lblBasicRe1);
		
		lblBasicIm1 = new JLabel("Im:");
		lblBasicIm1.setForeground(Color.BLACK);
		lblBasicIm1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBasicIm1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBasicIm1.setBounds(108, 234, 60, 35);
		frame.getContentPane().add(lblBasicIm1);
		
		lblBasicRe2 = new JLabel("Re:");
		lblBasicRe2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBasicRe2.setHorizontalAlignment(SwingConstants.CENTER);
		lblBasicRe2.setBounds(627, 187, 60, 35);
		frame.getContentPane().add(lblBasicRe2);
		
		lblBasicIm2 = new JLabel("Im:");
		lblBasicIm2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBasicIm2.setHorizontalAlignment(SwingConstants.CENTER);
		lblBasicIm2.setBounds(625, 234, 60, 35);
		frame.getContentPane().add(lblBasicIm2);
		
		AddButton = new JButton("Add");
		AddButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		AddButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String Re1 = textFieldBasicRe1.getText();
				String Im1 = textFieldBasicIm1.getText();
				String Re2 = textFieldBasicRe2.getText();
				String Im2 = textFieldBasicIm2.getText();
				
				boolean isOK = controller.isBasicInputIsDouble( Re1, Im1, Re2, Im2 );
				
				if( isOK == true ) {
					
					controller.getModel().setAlgCplxNum1(   new AlgebraicComplex( Double.parseDouble(Re1), Double.parseDouble(Im1) )   );
					controller.getModel().setAlgCplxNum2(   new AlgebraicComplex( Double.parseDouble(Re2), Double.parseDouble(Im2) )   );
					controller.getModel().setAlgCplxResult(    AlgebraicComplex.add(  controller.getModel().getAlgCplxNum1(), controller.getModel().getAlgCplxNum2()  )    );
					
					textFieldBasicAnswer.setText( controller.toText(  controller.getModel().getAlgCplxResult()  ) );
				}
				else {
					JOptionPane.showMessageDialog(null, "Enter valid numbers!");
				}
			}
			
		});
		AddButton.setBounds(176, 301, 150, 40);
		frame.getContentPane().add(AddButton);
		
		SubtractButton = new JButton("Subtract");
		SubtractButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		SubtractButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String Re1 = textFieldBasicRe1.getText();
				String Im1 = textFieldBasicIm1.getText();
				String Re2 = textFieldBasicRe2.getText();
				String Im2 = textFieldBasicIm2.getText();
				
				boolean isOK = controller.isBasicInputIsDouble( Re1, Im1, Re2, Im2 );
				
				if( isOK == true ) {
					
					controller.getModel().setAlgCplxNum1(   new AlgebraicComplex( Double.parseDouble(Re1), Double.parseDouble(Im1) )   );
					controller.getModel().setAlgCplxNum2(   new AlgebraicComplex( Double.parseDouble(Re2), Double.parseDouble(Im2) )   );
					controller.getModel().setAlgCplxResult(    AlgebraicComplex.subtract(  controller.getModel().getAlgCplxNum1(), controller.getModel().getAlgCplxNum2()  )    );
					
					textFieldBasicAnswer.setText( controller.toText(  controller.getModel().getAlgCplxResult()  ) );
				}
				else {
					JOptionPane.showMessageDialog(null, "Enter valid numbers!");
				}
				
			}
			
		});
		SubtractButton.setBounds(384, 301, 150, 40);
		frame.getContentPane().add(SubtractButton);
		
		MultiplyButton = new JButton("Multiply");
		MultiplyButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		MultiplyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Re1 = textFieldBasicRe1.getText();
				String Im1 = textFieldBasicIm1.getText();
				String Re2 = textFieldBasicRe2.getText();
				String Im2 = textFieldBasicIm2.getText();
				
				boolean isOK = controller.isBasicInputIsDouble( Re1, Im1, Re2, Im2 );
				
				if( isOK == true ) {
					
					controller.getModel().setAlgCplxNum1(   new AlgebraicComplex( Double.parseDouble(Re1), Double.parseDouble(Im1) )   );
					controller.getModel().setAlgCplxNum2(   new AlgebraicComplex( Double.parseDouble(Re2), Double.parseDouble(Im2) )   );
					controller.getModel().setAlgCplxResult(    AlgebraicComplex.multiply(  controller.getModel().getAlgCplxNum1(), controller.getModel().getAlgCplxNum2()  )    );
					
					textFieldBasicAnswer.setText( controller.toText(  controller.getModel().getAlgCplxResult()  ) );
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Enter valid numbers!");
				}
				
			}
		});
		MultiplyButton.setBounds(592, 301, 150, 40);
		frame.getContentPane().add(MultiplyButton);
		
		DivideButton = new JButton("Divide");
		DivideButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		DivideButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Re1 = textFieldBasicRe1.getText();
				String Im1 = textFieldBasicIm1.getText();
				String Re2 = textFieldBasicRe2.getText();
				String Im2 = textFieldBasicIm2.getText();
				
				boolean isOK = controller.isBasicInputIsDouble( Re1, Im1, Re2, Im2 );
				
				if( isOK == true ) {
					
					controller.getModel().setAlgCplxNum1(   new AlgebraicComplex( Double.parseDouble(Re1), Double.parseDouble(Im1) )   );
					controller.getModel().setAlgCplxNum2(   new AlgebraicComplex( Double.parseDouble(Re2), Double.parseDouble(Im2) )   );

					if( controller.isZero( controller.getModel().getAlgCplxNum2() ) == true ) {
						JOptionPane.showMessageDialog(null, "The 2nd complex number is zero!");
					}
					else {

						controller.getModel().setAlgCplxResult(    AlgebraicComplex.divide(  controller.getModel().getAlgCplxNum1(), controller.getModel().getAlgCplxNum2()  )    );
						
						textFieldBasicAnswer.setText( controller.toText(  controller.getModel().getAlgCplxResult()  ) );
						
						
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Enter valid numbers!");
				}
				
			}
		});
		DivideButton.setBounds(799, 301, 150, 40);
		frame.getContentPane().add(DivideButton);
		
		AlgebraicFormButton = new JButton("toAlgebraicForm");
		AlgebraicFormButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		AlgebraicFormButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String R = textFieldConversionR.getText();
				String Theta = textFieldConversionTheta.getText();
				
				
				boolean isOK = controller.isConversionInputIsDouble(R, Theta);
				
				if(isOK == true) {
					
					
					double r = Double.parseDouble(R);
					double theta = Double.parseDouble(Theta);
					
					controller.getModel().setExpCplxConv(   new ExponentialComplex(r, theta)   );
					
					if( controller.isRadiusNonNegative(r) == true ) {
						
						controller.getModel().setAlgCplxConvResult( controller.getModel().getExpCplxConv().toAlgebraicComplex() );
						
						textFieldConversionToAlgebraicAnswer.setText( controller.toText(  controller.getModel().getAlgCplxConvResult()  ) );
					}
					else {
						JOptionPane.showMessageDialog(null, "A negative length of a radius!");
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Enter valid numbers!");
				}
				
			}
		});
		AlgebraicFormButton.setBounds(243, 637, 150, 40);
		frame.getContentPane().add(AlgebraicFormButton);
		
		
		
		ExponentialFormButton = new JButton("toExponentialForm");
		ExponentialFormButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		ExponentialFormButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String RE = textFieldConversionRe.getText();
				String IM = textFieldConversionIm.getText();
				
				
				boolean isOK = controller.isConversionInputIsDouble(RE, IM);
				
				if(isOK == true) {
					double Re = Double.parseDouble(RE);
					double Im = Double.parseDouble(IM);
					
					controller.getModel().setAlgCplxConv(   new AlgebraicComplex(Re, Im)   );
					
					controller.getModel().setExpCplxConvResult( controller.getModel().getAlgCplxConv().toExponentialComplex() );
					
					textFieldConversionToExponentialAnswer.setText( controller.toText(  controller.getModel().getExpCplxConvResult()  ) );
				}
				else {
					JOptionPane.showMessageDialog(null, "Enter valid numbers!");
				}
				
			}
		});
		ExponentialFormButton.setBounds(847, 637, 150, 40);
		frame.getContentPane().add(ExponentialFormButton);
		
		textFieldBasicAnswer = new JTextField();
		textFieldBasicAnswer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldBasicAnswer.setEditable(false);
		textFieldBasicAnswer.setBounds(375, 380, 500, 40);
		frame.getContentPane().add(textFieldBasicAnswer);
		textFieldBasicAnswer.setColumns(10);
		
		lblBasicAnswer = new JLabel("Answer:");
		lblBasicAnswer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBasicAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		lblBasicAnswer.setBounds(193, 373, 185, 49);
		frame.getContentPane().add(lblBasicAnswer);
		
		lblConversionToAlgebraicAnswer = new JLabel("Answer:");
		lblConversionToAlgebraicAnswer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblConversionToAlgebraicAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		lblConversionToAlgebraicAnswer.setBounds(-6, 695, 153, 49);
		frame.getContentPane().add(lblConversionToAlgebraicAnswer);
		
		textFieldConversionToAlgebraicAnswer = new JTextField();
		textFieldConversionToAlgebraicAnswer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldConversionToAlgebraicAnswer.setEditable(false);
		textFieldConversionToAlgebraicAnswer.setColumns(10);
		textFieldConversionToAlgebraicAnswer.setBounds(122, 704, 440, 40);
		frame.getContentPane().add(textFieldConversionToAlgebraicAnswer);
		
		textFieldConversionRe = new JTextField();
		textFieldConversionRe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldConversionRe.setColumns(10);
		textFieldConversionRe.setBounds(775, 519, 300, 40);
		frame.getContentPane().add(textFieldConversionRe);
		
		textFieldConversionIm = new JTextField();
		textFieldConversionIm.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldConversionIm.setColumns(10);
		textFieldConversionIm.setBounds(775, 576, 300, 40);
		frame.getContentPane().add(textFieldConversionIm);
		
		lblConversionIm = new JLabel("Im:");
		lblConversionIm.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblConversionIm.setHorizontalAlignment(SwingConstants.CENTER);
		lblConversionIm.setBounds(722, 580, 61, 36);
		frame.getContentPane().add(lblConversionIm);
		
		lblConversionRe = new JLabel("Re:");
		lblConversionRe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblConversionRe.setHorizontalAlignment(SwingConstants.CENTER);
		lblConversionRe.setBounds(721, 520, 62, 32);
		frame.getContentPane().add(lblConversionRe);
		
		textFieldConversionR = new JTextField();
		textFieldConversionR.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldConversionR.setColumns(10);
		textFieldConversionR.setBounds(172, 519, 300, 40);
		frame.getContentPane().add(textFieldConversionR);
		
		textFieldConversionTheta = new JTextField();
		textFieldConversionTheta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldConversionTheta.setColumns(10);
		textFieldConversionTheta.setBounds(172, 576, 300, 40);
		frame.getContentPane().add(textFieldConversionTheta);
		
		lblConversionTheta = new JLabel("theta:");
		lblConversionTheta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblConversionTheta.setHorizontalAlignment(SwingConstants.CENTER);
		lblConversionTheta.setBounds(106, 578, 72, 30);
		frame.getContentPane().add(lblConversionTheta);
		
		lblConversionR = new JLabel("r:");
		lblConversionR.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblConversionR.setHorizontalAlignment(SwingConstants.CENTER);
		lblConversionR.setBounds(133, 520, 45, 33);
		frame.getContentPane().add(lblConversionR);
		
		lblCoversionToExponentialAnswer = new JLabel("Answer:");
		lblCoversionToExponentialAnswer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCoversionToExponentialAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		lblCoversionToExponentialAnswer.setBounds(606, 695, 161, 49);
		frame.getContentPane().add(lblCoversionToExponentialAnswer);
		
		textFieldConversionToExponentialAnswer = new JTextField();
		textFieldConversionToExponentialAnswer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldConversionToExponentialAnswer.setEditable(false);
		textFieldConversionToExponentialAnswer.setColumns(10);
		textFieldConversionToExponentialAnswer.setBounds(741, 704, 440, 40);
		frame.getContentPane().add(textFieldConversionToExponentialAnswer);
		
		lblConversion = new JLabel("Conversion to algebraic/exponential form ");
		lblConversion.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblConversion.setHorizontalAlignment(SwingConstants.CENTER);
		lblConversion.setBounds(330, 463, 545, 34);
		frame.getContentPane().add(lblConversion);
		
		lblBasicOperations = new JLabel("Basic operations (+,-,*,/)");
		lblBasicOperations.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblBasicOperations.setHorizontalAlignment(SwingConstants.CENTER);
		lblBasicOperations.setBounds(412, 86, 371, 34);
		frame.getContentPane().add(lblBasicOperations);
	}

}
