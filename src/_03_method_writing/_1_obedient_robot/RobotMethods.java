package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotMethods {
	
	static Robot rob = new Robot();
	
	public static void main(String[] args) {
		String color = JOptionPane.showInputDialog("COLOR);
		
		rob.penDown();
		rob.setSpeed(1000);
		drawCircle();
		rob.move(100);
		drawSquare();
		rob.move(100);
		drawTriangle();
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
