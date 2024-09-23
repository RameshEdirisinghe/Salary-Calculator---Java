import java.util.*;
class coursework4{
	public static void main(String args[]){	

		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("|                        SALARY INFORAMATION SYSTEM                                     |");
		System.out.println("-----------------------------------------------------------------------------------------");
		
		Scanner input = new Scanner(System.in);
		System.out.println("        [1] Calculate Income Tax");
		System.out.println("        [2] Calculate Annual Bonus");
		System.out.println("        [3] Calculate Loan amount");
		System.out.println("\n");
		
		System.out.print("Enter an option to continue >");
		int num = input.nextInt();

		
		if(num==1){
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("|                        Calculate Income Tax                                           |");
			System.out.println("-----------------------------------------------------------------------------------------");
			


			System.out.print("Input Employe name - ");
			String customerName = input.nextLine();
			
			input.nextLine();	
		
			System.out.print("Input Employee Salary -");
			double salary = input.nextDouble();	
		
			double ITax;
			ITax = 00;
			
			if(salary<=100000){
				
			}else if(salary<=141667){
				ITax= (salary-100000)*0.06;

				
			}else if(salary<=183330){
				ITax=2500 + (salary-141667)*0.12;
				
			}else if(salary<=225000){
				ITax=7500 + (salary-183330)*0.18;
				
			}else if(salary<= 266667){
				ITax=15000 + (salary-225000)*0.24;
				
			}
			else if(salary<= 308333){
				ITax=25000 + (salary-266667)*0.30;
				
			}else if(salary>308333){
				ITax=37500 + (salary-308333)*0.36;
				
			}else{
				System.out.println("Invalid Salary");
			}
			System.out.print("You have to pay Icome Tax per month: " + ITax);
	
			}else if (num==2){
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println("|                        Calculate Annual Bonus                                          |");
				System.out.println("-----------------------------------------------------------------------------------------");
			
				System.out.print("");
				String d = input.nextLine();

				System.out.print("Input Employe name - ");
				String customerName = input.nextLine();	
		
				System.out.print("Input Employee Salary -");
				double salary = input.nextDouble();
				
				double Bonus;
				Bonus=0;
			
				if(salary<100000){
					Bonus=5000;
				}else if(salary<199999){
					Bonus=salary*0.1;
				}else if(salary<299999){
					Bonus=salary*0.15;
				}else if(salary<399999){
					Bonus=salary*0.20;
				}else {
					Bonus=salary*0.35;
				}
				System.out.print("Annual Bonus: " + Bonus);
				
			
		}else if (num==3){
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println("|                        Calculate Loan amount                                          |");
				System.out.println("-----------------------------------------------------------------------------------------");
			
				System.out.print("");
				String d = input.nextLine();

				System.out.print("Input Employe name - ");
				String customerName = input.nextLine();	
		
				System.out.print("Input Employee Salary -");
				double salary = input.nextDouble();
				
				System.out.print("Input number of year -");
				int noyear = input.nextInt();
				
				if(salary<=50000){
					System.out.println("You Can not get a loan because your salary lessthan Rs.50 000");
				}else if (noyear>5) {
					System.out.println("The maximum number of the year is 5");
				}else {
				 int nomonth = noyear*12;
				 double monthlyIns= salary*0.6;
				 double monthlyrate = 0.15/12;
				 
				 double loanAmount=(monthlyIns*(1-(1/Math.pow(1+monthlyrate,nomonth)))/monthlyrate);
				 System.out.println("You can get Loan Amount:" + Math.round(loanAmount) );
				}
					
		
		}else{
			System.out.println("Invalid number");
		}
		
	}
}



 








