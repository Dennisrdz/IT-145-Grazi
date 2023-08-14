import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    static String Yes = "Yes";
	private static ArrayList<Dog> dogList = new ArrayList<Dog>();
	private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
     static // Instance variables (if needed)
    
    	public int userInput = 30;
    public static void main(String[] args) {
    	initializeDogList();
        initializeMonkeyList();
    	Scanner input = new Scanner (System.in); //added scanner for user input
    	while (userInput != 0){ //added different paths depending on user input
    		displayMenu();
    		if (userInput == 1) {
    			intakeNewDog();
    			}
    		if (userInput == 2) {
    			intakeNewMonkey();
    		}
    		if (userInput == 3) {
    			reserveAnimal();
    		}
    		if (userInput == 4  ) {
    			printAnimals();
    		}
    		if (userInput == 5) {
    			printAnimals();
    		}
    		if (userInput == 6) {
    			printAnimals();
    		}
    	}

        

      

    }

    // This method prints the menu options
    public static int displayMenu() {
    	Scanner input = new Scanner (System.in);
    	System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[0] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
        userInput = input.nextInt();
        return userInput;
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "in service", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("Tizi", "Macaque", "male", "9", "15.2", "08-14-2022", "Japan", "in service", false, "United States","9.8 in", "25.2", "25.2");
        Monkey monkey2 = new Monkey("Chico", "Marmoset", "male", "4", "1.8", "06-12-2023", "Columbia", "in service", false, "United States","8.8 in ", " 6.2", " 6.2");
        Monkey monkey3 = new Monkey("Tiny", "Marmoset", "female", "2", "1.3", "06-12-2023", "Colombia", "intake", false, "United States","7 in", "5.3 in", "5.3 in");

        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
        monkeyList.add(monkey3);
    }


   
    public static void intakeNewDog() {
        Scanner scanner = new Scanner(System.in);
    	System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
            else {
            	continue;
            }
        }
     // allows the user to enter all the needed information and stores them to strings
        System.out.println("What is the dog's Breed?"); 
        	String breed = scanner.nextLine();
        System.out.println("What is the dog's Gender");
        	String gender = scanner.nextLine();
    	System.out.println("How old is the dog");
    		String age = scanner.nextLine();
		System.out.println ("What is the Dog's Weight");
			String weight = scanner.nextLine();
		System.out.println("What is today's date in this format mm-dd-yyyy");
			String acquisitionDate = scanner.nextLine();
		System.out.println("What country is the dog from");
			String aquisitionCountry = scanner.nextLine();
		System.out.println("What is the Dog's Trainning status");
			String trainningStatus = scanner.nextLine();
		boolean reserved = false;
		System.out.println("What country will the dog service");
			String inServiceCountry = scanner.nextLine();
			//repeats all information back to user to ensure that all is correct
			System.out.println("Is all the information correct" + " " + name + " " +breed+ " " + gender + " " + age + " " +
					weight + " " + acquisitionDate + " " + aquisitionCountry + " " + trainningStatus + " " + reserved + " " + inServiceCountry );
			String userInput = scanner.nextLine();
			userInput.toLowerCase();
			//once the user confirms all information is passed through constructor to create a new dog object
			if (userInput.equalsIgnoreCase(Yes)) { Dog newDog = new Dog(name,breed, gender, age, weight, acquisitionDate,aquisitionCountry, trainningStatus, reserved, inServiceCountry );
        		dogList.add(newDog);
			}
			//if the user denies the information they are asked to re enter the information
			else {
				intakeNewDog();
			}
        
    }

	

        public static void intakeNewMonkey() {
        	Scanner scanner = new Scanner(System.in);
        	//asks for the monkey's name that they wish to add
        	System.out.println("What is the monkey's name?");
            String name = scanner.nextLine();
           //ensures the monkey they are attempting to add is not already in the system
            for(Monkey monkey: monkeyList) {
                if(monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis monkey is already in our system\n\n");
                    return; //returns to menu
                }
                else {
                	continue;
                }
            	}
            //allows user to add all needed information unique to monkeys
        System.out.println("What is the monkey's Species?");
        	String species = scanner.nextLine();
        System.out.println("What is the Monkey's Gender");
        	String gender = scanner.nextLine();
    	System.out.println("How old is the Monkey");
    		String age = scanner.nextLine();
		System.out.println ("What is the Monkey's Weight");
			String weight = scanner.nextLine();
		System.out.println("What is today's date in this format mm-dd-yyyy");
			String acquisitionDate = scanner.nextLine();
		System.out.println("What country is the Monkey from");
			String aquisitionCountry = scanner.nextLine();
		System.out.println("What is the Monkey's Trainning status");
			String trainningStatus = scanner.nextLine();
		boolean reserved = false;
		System.out.println("What country will the Monkey service");
			String inServiceCountry = scanner.nextLine();
		System.out.println("What is the Monkey's Tail Length");
			String tailLength = scanner.nextLine();
		System.out.println("What is the Monkey's height");
			String height = scanner.nextLine();
			String bodyLength = height; // height and body length end up being the same thing
			//repeats all information back to user to ensure that all is correct
			System.out.println("Is all the information correct" + " " + name + " " +species+ " " + gender + " " + age + " " +
					weight + " " + acquisitionDate + " " + aquisitionCountry + " " + trainningStatus + " " + reserved + " " + inServiceCountry + " " + tailLength + " " + height + " " + bodyLength );
			String userInput = scanner.nextLine();
			userInput.toLowerCase();
			//once the user confirms all information is passed through constructor to create a new monkey object
			if (userInput.equalsIgnoreCase(Yes)) { Monkey newMonkey = new Monkey(name,species, gender, age, weight, acquisitionDate,aquisitionCountry, trainningStatus, reserved, inServiceCountry, tailLength, height, bodyLength );
        		monkeyList.add(newMonkey);
			}
			//if the user denies the information they are asked to re enter the information
			else {
				intakeNewMonkey();
        }
        }

        public static void reserveAnimal() {
            
        	Scanner scanner = new Scanner(System.in);
        	Available();// prints all available animals
            System.out.println("\nWhich animal would you like to reserve");
        	String userInput = scanner.nextLine();
        	System.out.println("\nWhat country are you from? ");
        	String userInput2 = scanner.nextLine();
        	//Checks if the animal and client live in the same country
        	for (Dog dog: dogList) {
        		if (dog.getName().equals(userInput) & dog.getInServiceLocation().equals(userInput2)) {
        			dog.setReserved(true);
        			System.out.println(dog.getName() + "'s Reservation status has been set to " + dog.getReserved());
        			//reserves animal
        		}else { // if anything goes wrong the process loops
        			System.out.println("Reservation for " + dog.getName() + " was unsuccesful please try again");
        			reserveAnimal();
        		}
        		
        	}
        	
        	for (Monkey monkey: monkeyList) {
        		if (monkey.getName().equals(userInput) & monkey.getInServiceLocation().equals(userInput2)) {
        			monkey.setReserved(true);
        			System.out.println(monkey.getName() + "'s Reservation status has been set to " + monkey.getReserved());
        			//reserves animal
        		}else { // if any information is wrong the process loops
        			System.out.println("Reservation for " + monkey.getName() + " was unsuccesful please try again");
        			reserveAnimal();
        		}
        	}
        	returnToMenu();
        }
        

       
        public static void printAnimals() {
        	//paths into all available print methods
        	if (userInput == 4) {
        		printDogs();
        		returnToMenu();
        		}
    		if (userInput == 5) {
    			printMonkeys();
    			returnToMenu();
    		}
    		if (userInput == 6) {
    			Available();
    			returnToMenu();
    		}
        	 }
        		
        	

        
        public static void printDogs(){	for(Dog dog: dogList) {
        	//prints all dog's name, training status and whether they are reserved
        	System.out.println("DOGS");
        	System.out.printf ("%12s" ,dog.getName() + " " + " " + dog.getTrainingStatus() + " " + dog.getReserved() + " \n");
        	System.out.println("-----------------------------------------------------------------------");
        }}
        public static void printMonkeys(){	for(Monkey monkey: monkeyList) {
        	//prints all monkey's name, training status and whether they are reserved
        	System.out.println("MONKEYS");
        	System.out.printf ("%15s" ,monkey.getName() + " " + monkey.getTrainingStatus() + " " + monkey.getReserved() + " \n");
        	System.out.println("------------------------------------------------------------------------");
        }
     
        }
        public static void returnToMenu() {
        	//implemented a method that allows user to return to menu via input rather 
        	//than being thrown back after the method is done
        	
        	Scanner scanner = new Scanner(System.in); 
        	System.out.println("\nReturn to Menu?");
    		String userInput = scanner.nextLine();
    		userInput.toLowerCase();
    		if (userInput.equals(Yes)){
    			displayMenu();
        	
        }
        }
        public static void Available() {
        	//prints all animals information that are not reserved and in service 
        	String service = "in service";
        	for (Dog dog: dogList) {
        		if (dog.getReserved() == false && dog.getTrainingStatus().equals(service))   {
        			System.out.print("Dog: " + " " + dog.getName() + " "  +  dog.getTrainingStatus() + " " + dog.getInServiceLocation() +  " \n");
        		}
        		
        	}
        	for (Monkey monkey: monkeyList) {
        		if (monkey.getReserved() == false && monkey.getTrainingStatus().equals(service))   {
        			System.out.print("Monkey: " + monkey.getName() + " "  +  monkey.getTrainingStatus() + " " + monkey.getInServiceLocation() + " \n");
        		}
       }  
        
        }}
        
			

