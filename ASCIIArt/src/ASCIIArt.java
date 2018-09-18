/*
  Unit 1 Project
  
  In this project you have the opportunity to create a piece of artwork using ASCII 
  (American Standard Code for Information Interchange). Using the already created file 
  named `ASCIIArt.java` write a program that outputs your artwork to the console. 
  The goal of this project is to use ONLY what we have learned in Unit 1 to create 
  anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
  
  For those of you who have dabbled in coding before, try to contain your code to 
  just what we have discussed in this unit.  
  
  @author Mr. Rasmussen 
 */

// YOUR CODE GOES HERE :)
public class ASCIIArt {
	public static void head() {
		antenna();
		System.out.println("               |     |     ");
		System.out.println("           ____|_____|____         _____________________");
		System.out.println("           /|||||||||||||\\       /                      \\");
		System.out.println("          /||||| O ||||-||\\  ___/  \" I'm made of ASCII!\" \\");
		System.out.println("         /-----------------\\    \\    -R2-D2              /");
		System.out.println("        /   -        ~      \\    \\______________________/");
		System.out.println("        \\ | | |  |  | | | | /");
	}
			public static void antenna() {
				System.out.println("                     |     ");
				System.out.println("                     |     ");
				System.out.println("                     |     ");
			
			}
		
	public static void body() {
		System.out.println("        |||||||||||||||||||||");
		System.out.println("     +--|    \\              |--+");
		sides();
	}
			public static void sides() {
				sidearm();
				sidearm();
				sidearm();
				sidearm();
				sidearm();
			}
			public static void sidearm() {
				System.out.println("     |  |                   |  |");
			}
		
	public static void bottom() {
		System.out.println("     | | \\\\ | | | | | | | // | |");
		System.out.println("    /|||\\  ---------------  /|||\\");
	}
		
	public static void main (String[] args) {
		System.out.println("This is an ASCII Artwork of R2-D2 from StarWars! \n");
		head();
		body();
		bottom();
	}
}