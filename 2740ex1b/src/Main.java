import java.util.Scanner; // needed for the scanner class


public class Main {

	public static void main(String[] args) {
        System.out.println("p123 #1:");
        	String name = "Darren Benson";
        	int age = 88;
        	double annualPay = 22000;
        
        	System.out.println("My name is " + name + ", " + "my age is " + age + " and" );
        	System.out.println("I hope to earn " + "$" + annualPay + " per year.");

        System.out.println("\np123 #3:");
        	
        
        	System.out.println("Darren Benson \n150 North Shore Drive, Fountain City, WI 54629 \n608-385-5915 \nComputer Programming and Web Development" );
        

        System.out.println("\np124 #5:");
        	int cookiesPerBag = 40;
        	int servingsPerBag = 10;
        	int caloriesPerServing = 300;
        	int cookiesEaten = 0;
        	int totalCalories;
        	int cookiesPerServing;
        	int caloriesPerCookie;
    	
        	//create a Scanner object to read input
        	Scanner keyboard = new Scanner(System.in); 
        	
        	//get the number of cookies eaten
        	System.out.print("How many cookies have you eaten?");
        	cookiesEaten = keyboard.nextInt();
        	
        	//calculate cookies per serving
        	cookiesPerServing = cookiesPerBag / servingsPerBag;
        	
        	//calculate calories per cookie
        	caloriesPerCookie = caloriesPerServing / cookiesPerServing;
        	
        	//calculate total calories consumed
        	totalCalories = cookiesEaten * caloriesPerCookie;
        	
        	//display results
        	System.out.println("You have consumed " + totalCalories + " calories");

        System.out.println("\np124 #6:");
        	double percentOfSales = 0.65;
        	double sales = 8300000.0;
        	double divisionSales;
    	
        	//calculate East Coast sales
    	
        	divisionSales = sales * percentOfSales;
    	
        	//display results
        	System.out.println("East Coast sales = " + "$" + divisionSales);
        	
	}

}
