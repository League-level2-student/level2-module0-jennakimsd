package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	//2. create an array of 5 robots.
Robot[] cool = new Robot[5];
	//3. use a for loop to initialize the robots.
int robotX= -30;
for (int i = 0; i < cool.length; i++) {
	cool[i] = new Robot();
		//4. make each robot start at the bottom of the screen, side by side, facing up
	cool[i].setY(300);
	cool[i].setX(robotX+=100);
	cool[i].setSpeed(5);
	
}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
Random randy = new Random();
while(true) {
for (int i = 0; i < cool.length; i++) {
	cool[i].move(randy.nextInt(51));
	cool[i].turn(50);
	if (cool[i].getY()>300) {
		JOptionPane.showMessageDialog(null, "robot " + (i+1) + " is the winner");
		return;
	}

}
	}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.

}
	}
