/* FINISH ME! */


import org.junit.Test;

public class LoanTest {
		
		Loan loan = new Loan();
		
	    // Example: Testing setLoanAmount and getLoanAmount for loan class. 
		@Test
		public void setLoanTest() throws Exception{
			loan.setLoanAmount(10);
			assert(loan.getLoanAmount() == 10);
		}
		
		@Test
		public void setAnnualInterestRate() throws Exception{
			loan.setAnnualInterestRate(2.5);
			assert(loan.getAnnualInterestRate() == 2.5);
		}
		
		@Test
		public void setNumberOfYears() throws Exception{
			loan.setNumberOfYears(3);
			assert(loan.getNumberOfYears() == 3);
		}
		
		@Test
		public void setLoanAmount() throws Exception{
			loan.setLoanAmount(7);
			assert(loan.getLoanAmount() == 7);
		}
		
		@Test
		public void getMonthlyPayment() throws Exception{
			loan.getMonthlyPayment();
		}
		
		@Test
		public void getTotalPayment() throws Exception{
			loan.getTotalPayment();
		}
	
		/*
		 * TODO:
		 * 		1. Test ALL getters and setters in the Loan class.
		 * 		2. Test the getMonthlyPayment() method.
		 * 		3. Test the getTotalPayment() method.
		 * 
		 * 		For the getMonthlyPayment() method and the getTotalPayment() method, 
		 * 		test these for a few different values. Are there any values that can be used to 
		 * 		break the class?
		 * 
		 * */
		
		
		/* UnitTest - Exception when setting loan amount to negative number. */
		@Test() // Hint. You need to add a parameter to the annotation in order for the UnitTest to work properly.
		public void negativeTest() throws Exception {
			loan.setLoanAmount(-2);
			assert(loan.getLoanAmount() == -2);
		}
	}

