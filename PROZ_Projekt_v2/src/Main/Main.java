package Main;

import java.awt.EventQueue;
import java.lang.reflect.InvocationTargetException;

import Controller.Controller;
import Model.Model;
import View.View;

/**
 * A main class which launches an application.
 * 
 * @author Pawe³ Maœluch
 */ 
public class Main {

	/**
	 * Launch the application.
	 *
	 *@param args A list of arguments for this method. 
	 * @throws InterruptedException If any thread has interrupted this thread.
	 * @throws InvocationTargetException  If an throwable is thrown when running {@code runnable}.
	 */
	public static void main(String[] args) throws InvocationTargetException, InterruptedException {
		EventQueue.invokeAndWait(new Runnable() {
			public void run() {
				try {

					Model model = new Model();
					Controller controller = new Controller(model);
					
					@SuppressWarnings("unused")
					View view = new View(controller);
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
