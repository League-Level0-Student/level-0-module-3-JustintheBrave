package _16_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot shape = new Robot();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape.setSpeed(100);
		shape.penDown();
		String yay = JOptionPane.showInputDialog("what shape do you want(square, triangle, cricle)?");
		String nay = JOptionPane.showInputDialog("what color do you want(red, green, blue)");
		
		if(nay.equalsIgnoreCase("red")) {
			shape.setPenColor(255,0,0);
			}
		else if(nay.equalsIgnoreCase("green")) {
			shape.setPenColor(0,255,0);
			}
		
		else if(nay.equalsIgnoreCase("blue")) {
			shape.setPenColor(0,0,255);
			}

		if(yay.equalsIgnoreCase("square")) {
		drawSquare();
		}
		else if(yay.equalsIgnoreCase("triangle")) {
			drawTriangle();
		}
		
		else if(yay.equalsIgnoreCase("circle")) {
			drawCircle();
		}
	}

	public static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			shape.move(100);
			shape.turn(90);
		}
	}
		
		public static void drawTriangle() {
			for (int i = 0; i < 3; i++) {
				shape.move(100);
				shape.turn(120);
			}
		}
		
		public static void drawCircle() {
			for (int i = 0; i < 360; i++) {
				shape.move(1);
				shape.turn(1);
			}
		
	}
}