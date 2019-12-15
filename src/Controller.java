import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
@author Kamaluddin Shakiri

public class Controller implements ActionListener {
	
	private View view; // controller now has view
	private Model model; // Controller now has model
	
	
	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
			
	}

	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getActionCommand().equals("Increment")){
	        model.increment();
	    }
		
		else if(e.getActionCommand().equals("Decrement")){
	        model.decrement();
	    }
		
		else if(e.getActionCommand().equals("Submit")){
			model.setCount();
			model.setMax(view.getNumber());
			
		}
			
	}
	
	
}
