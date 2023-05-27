package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotMethods {
	
	static Robot rob = new Robot();
	
	public static void main(String[] args) {

		
		while(true) {
		
			String shape = JOptionPane.showInputDialog("square, triangle, or circle");
			String inputColor = JOptionPane.showInputDialog("what color");
					
			
			if (inputColor.equals("black")) {
				rob.setPenColor(Color.black);
			} else if (inputColor.equals("red")) {
				rob.setPenColor(Color.red);		
			} else if (inputColor.equals("blue")) {
				rob.setPenColor(Color.blue);
			}
			
			rob.penDown();		
			rob.setSpeed(1000);
		
			if (shape.equals("square")) {
				drawSquare();
			} else if (shape.equals("circle")) {
				drawCircle();
			} else if(shape.equals("triangle")) {
				drawTriangle();
			}
		
		}

	}
	
	static void drawCircle() {
		for(int i = 0; i < 36; i++) {
			rob.move(10);
			rob.turn(10);
		}
	}
	
	static void drawSquare() {
		
		for (int i = 0; i < 4; i++) {
			rob.move(100);
			rob.turn(90);
		}
	}
	
	static void drawTriangle() {
		
		for(int i = 0; i < 3; i++) {
			rob.move(100);
			rob.turn(360 / 3);
		}
		
	};
}
