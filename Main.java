public class Main {

	public static void main(String[] args) {
	
		Wilder Wilder1 = new Wilder("Alex", true);
		
		    if(Wilder1.isAware()) {
				    System.out.println("Je m'appelle " + Wilder1.getFirstname() + " et je suis aware");
			
		   }else  { 
			   System.out.println("Je m'appelle " + Wilder1.getFirstname() + " et je suis pas aware");		   
		   }

		Wilder Wilder2 = new Wilder("Git", false);
		Wilder2.setFirstname("Lucas");
				
		   if (Wilder2.isAware()){
			   System.out.println("Je m'appelle " + Wilder2.getFirstname() + " et je suis aware");
		  }else {
			   System.out.println("Je m'appelle " + Wilder2.getFirstname() + " et je suis pas aware");
			   
		
		}
     }
	
 }
