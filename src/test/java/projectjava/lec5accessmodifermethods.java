package projectjava;

public class lec5accessmodifermethods {
	//attribute
	int a=10;
	String car="nissan";
	//syntax of method 
	//accessmodifier returnType methoad name(){}
	
	public void facebooklogin() {
		//body
	}
public void facebooksignup() {
	// body
}
	
	private void methodp() {
		//body
	}	
	
	
	
	
	
	void methodD() {
		//BODY
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		// create object of the class 
		//syntax for making object
		//classname object name of the class =new classname();
		
		lec5accessmodifermethods accessmodifier=new lec5accessmodifermethods();
		System.out.println(accessmodifier.car);
		accessmodifier.methodp();
		//change the value 10 t0 100
		accessmodifier.a =100;
		
		System.out.println(accessmodifier.a);
		
		
		
		
		
		
		
		 
		

	}

}
