import java.util.*;
@author Kamaluddin Shakiri


public class Model {
	private int total_Number;
	private int count;
	private View view;
	
	public Model(int total_Number, int count, View view) {
		this.total_Number = total_Number;
		this.count = count;
		this.view = view;
	}
	
	public int getCount() {
		return this.count;
	}
	
	public void setCount() {
		this.count = view.getInputFromUser(); 
	}
	
	public void increment() {
		count++;
		
		if(total_Number == count) {
			view.complete();	
		}
		
		else if(count > total_Number) {
			view.inconsistence();
		}
		else if(count < total_Number) {
			view.incomplete();
		}
		view.updateView();
	}
	
	public void decrement() {
		count--;
		if(total_Number == count) {
			view.complete();	
		}
		
		else if(count > total_Number) {
			view.inconsistence();
		}
		else if(count < total_Number) {
			view.incomplete();
		}
		
		view.updateView();	
	}
	
	public void setMax(int max) {
		this.total_Number = max;
		
	}

}
