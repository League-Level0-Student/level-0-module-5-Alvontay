package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	
	public static void main(String[] args) {
		
		String number = JOptionPane.showInputDialog("Enter a number");
		
		int numberAsInt = Integer.parseInt(number);
		
		for (int i = 2; i < numberAsInt; i++) {
			
			if (numberAsInt % i == 0) {
				JOptionPane.showMessageDialog(null, numberAsInt + " is not prime");
				System.exit(0);
			}
			
		}
		
		JOptionPane.showMessageDialog(null, numberAsInt + " is prime!");
		
	}

}
