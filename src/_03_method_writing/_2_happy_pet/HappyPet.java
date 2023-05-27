package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	static int happinessLevel = 0;
	
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		int petSize = JOptionPane.showOptionDialog(null, "what size pet would you want? Big or Small", "PET SIZE", 0, 
		JOptionPane.INFORMATION_MESSAGE, null, new String[] {"Big", "Small"}, null);
		
		//big = 0
		
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		while (happinessLevel < 5) {
			
			int task = JOptionPane.showOptionDialog(null, "do you want to be nice to your pet", "Pet Options", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Food", "Water", "NO!" }, null);
			
			if (task == 0) {
				food(petSize);
			} else if (task == 1) {
				water(petSize);
			} else if (task == 2) {
				JOptionPane.showMessageDialog(null, "mean");
				break;
			}
			
			JOptionPane.showMessageDialog(null, "Your Pets happiness level is " + happinessLevel + "/5");
		}
		
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.


			// 6. Use user input to call the appropriate method created in step 5 below.

	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
	public static void food(int petSize) {
		
		String petSizeName = petSize == 0? "large": "tiny"; 
		JOptionPane.showMessageDialog(null, "You fed your " + petSizeName + " pet!");
		happinessLevel += ( petSize == 1 ? 1 : 2  )	; //ternary operator
		
	}
	
	public static void water(int petSize) {
	
		String petSizeName = petSize == 0? "large": "tiny"; 
		JOptionPane.showMessageDialog( null, "You watered your " + petSizeName + " pet");
		happinessLevel += ( petSize == 1 ? 2 : 3  )	; //ternary operator
	}
}