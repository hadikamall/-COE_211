import java.util.Scanner;
public class EntryPoint {
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);			
		 
		
				String InputU="y";
				while(InputU.equalsIgnoreCase("y")) {
 System.out.println("input the opteration you prefer to use:\n[1],Basic week visualizer\r\n"   +"[2]Advanced week visualizer\r\n"+   "[3],Basic calculator\r\n"+     "[4],Employee repertoire\r\n"+"");
				
				
				
				
				int operation=s.nextInt();			
				while(operation != 1 && operation != 2 && operation != 3 && operation!= 4) {	
System.out.println("Please make sure you pick a number between 1 and 4.");					
System.out.println("input the option you prefer to use:\n[1],Basic week visualizer\r\n"   +"[2]Advanced week visualizer\r\n"+   "[3],Basic calculator\r\n"+     "[4],Employee repertoire\r\n"+"");
	
	int operation=s.nextInt();			 	
	
				}
				
	
	
	switch(operation) {
	
	case 1 :
			BasicWeek b=new BasicWeek();
			b.printDays();
			break;

	case 2 :
			AdvancedWeek a =new AdvancedWeek();
			a.printDays();
			break;
			
	case 3 :
			Calculator calc =new Calculator();
			break;
		
		
	case 4 :
			Employee emp  =new Employee();
			System.out.println(emp.toString());
			break;
		
		
	}
	System.out.println("Would you like to perform another operation? (y/n)");
		s.nextLine();
	
	
	if(InputU.equalsIgnoreCase("n")) {
		System.out.println("Enjoy your day");
	}
}	
}		
		
			
			
	
	
		

	