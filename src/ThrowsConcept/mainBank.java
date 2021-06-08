package ThrowsConcept;

public class mainBank {

	public static void main(String[] args) {
		Citibank citibank = new Citibank();
		citibank.displayBankInterest();
		
		Bank bank=new Citibank();
		bank.anotherpdisplay();
		bank.displayBankInterest();
		
		
	}

}
