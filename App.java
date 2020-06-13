
public class App {

	public static void main(String[] args) {
		
		//item prices
		double shoePrice = 65.95;
		System.out.println("The pair of shoes costs $" + shoePrice);
		
		double breadPrice = 4.99;
		System.out.println("A single loaf of bread costs $" + breadPrice);
		
		
		//amount of money in wallet
		double zachWallet = 50;
		System.out.println("Zach typically has about $" + zachWallet + " in his wallet");

		double zachChristmasWallet = 0;
		System.out.println("After Christmas, Zach will have $" + zachChristmasWallet + " in his wallet");
		
		//number of friends
		short allFriends = 100;
		System.out.println("All in all I probably have about " + allFriends + " friends");

		byte closeFriends = 8;
		System.out.println("However, if I'm being picky, I probably only have about " + closeFriends + " close friends");
		
		//age in years
		byte zachAge = 28;
		System.out.println("Zach is " + zachAge + " years old");
		
		int arizonaAge = 108;
		System.out.println("The state of Arizona celebrates " + arizonaAge + " years since statehood");
		
		//first name
		String zachName = "Zachary";
		System.out.println("This student's full name is " + zachName);

		String fatherName = "Phil";
		System.out.println("My dad's name is " + fatherName);
		
		//last name
		String zachLastName = "Rind";
		System.out.println("This student's last name is " + zachLastName);
		
		String momMaidenName = "Sonju";
		System.out.println("My mom's maiden name is " + momMaidenName);
		
		//middle initial
		char zachMiddleInitial = 'L';
		System.out.println(zachMiddleInitial + " is my middle initial");

		char dadMiddleInitial = 'E';
		System.out.println("My dad's middle initial is " + dadMiddleInitial);
		
		//new wallet variable
		zachWallet = zachWallet - breadPrice;
		System.out.println("After buying a loaf of bread Zach had $" + zachWallet + " left in his wallet");
		
		//number of friends per year variable
		int friendsPerYear = allFriends / zachAge;
		System.out.println("Over the course of my life I have made about " + friendsPerYear + " friends each year");		
		
		//full name
		String fullName = zachName + " " + zachMiddleInitial + " " + zachLastName;
		System.out.println("My full name is " + fullName);
	}

}
