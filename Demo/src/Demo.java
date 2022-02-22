import java.io.*; 
import java.util.*;
import java.lang.Thread;

public class Demo {
	
	// the number of muscle groups
	private static final int NUM_OF_GROUPS = 9;
	// the array of muscle groups
	private String[] muscleArray = {"Abs", "Back", "Biceps", "Calves", "Chest", "Forearms", "Hamstrings", "Shoulders", "Triceps" };
	// the array of workouts to do
	private static String[] workouts = new String[NUM_OF_GROUPS];
	// Scanner 
	static Scanner scan = new Scanner(System.in);
	private static int timeInput, setInput; 

	/**
	 * Generates a random ab workout.
	 * @return
	 * 		Returns the workout. 
	 */
	public static String genAbs() { 
		
		// get input from file
		In inAbs = new In( "Abs.txt" );
		String[] absArray = inAbs.readAllLines();
	    
		// generate random number 
		Random rand = new Random();
		int num = rand.nextInt(absArray.length);
	    
		// return the randomly chosen ab workout
		return absArray[num];
		
	} // end genAbs
	
	/**
	 * Generates a random back workout.
	 * @return
	 * 		Returns the workout. 
	 */
	public static String genBack() { 
		
		// get input from file
		In inBack = new In( "Back.txt" );
		String[] backArray = inBack.readAllLines();
	    
		// generate random number 
		Random rand = new Random();
		int num = rand.nextInt(backArray.length);
	    
		// return the randomly chosen back workout
		return backArray[num];
		
	} // end genBack

	/**
	 * Generates a random bicep workout.
	 * @return
	 * 		Returns the workout. 
	 */
	public static String genBiceps() { 
		
		// get input from file
		In inBicep = new In( "Biceps.txt" );
		String[] bicepArray = inBicep.readAllLines();
	    
		// generate random number 
		Random rand = new Random();
		int num = rand.nextInt(bicepArray.length);
	    
		// return the randomly chosen bicep workout
		return bicepArray[num];
		
	} // end genBiceps
	
	/**
	 * Generates a random calf workout.
	 * @return
	 * 		Returns the workout. 
	 */
	public static String genCalves() { 
		
		// get input from file
		In inCalves = new In( "Calves.txt" );
		String[] calvesArray = inCalves.readAllLines();
	    
		// generate random number 
		Random rand = new Random();
		int num = rand.nextInt(calvesArray.length);
	    
		// return the randomly chosen calves workout
		return calvesArray[num];
		
	} // end genCalves
	
	/**
	 * Generates a random chest workout.
	 * @return
	 * 		Returns the workout. 
	 */
	public static String genChest() { 
		
		// get input from file
		In inChest = new In( "Chest.txt" );
		String[] chestArray = inChest.readAllLines();
	    
		// generate random number 
		Random rand = new Random();
		int num = rand.nextInt(chestArray.length);
	    
		// return the randomly chosen chest workout
		return chestArray[num];
		
	} // end genChest
	
	/**
	 * Generates a random forearm workout.
	 * @return
	 * 		Returns the workout. 
	 */
	public static String genForearms() { 
		
		// get input from file
		In inForearm = new In( "Forearms.txt" );
		String[] forearmArray = inForearm.readAllLines();
	    
		// generate random number 
		Random rand = new Random();
		int num = rand.nextInt(forearmArray.length);
	    
		// return the randomly chosen forearm workout
		return forearmArray[num];
		
	} // end genForearms
	
	/**
	 * Generates a random hamstring workout.
	 * @return
	 * 		Returns the workout. 
	 */
	public static String genHamstrings() { 
		
		// get input from file
		In inHamstring = new In( "Hamstrings.txt" );
		String[] hamstringArray = inHamstring.readAllLines();
	    
		// generate random number 
		Random rand = new Random();
		int num = rand.nextInt(hamstringArray.length);
	    
		// return the randomly chosen hamstring workout
		return hamstringArray[num];
		
	} // end genHamstrings
	
	/**
	 * Generates a random shoulder workout.
	 * @return
	 * 		Returns the workout. 
	 */
	public static String genShoulders() { 
		
		// get input from file
		In inShoulder = new In( "Shoulders.txt" );
		String[] shoulderArray = inShoulder.readAllLines();
	    
		// generate random number 
		Random rand = new Random();
		int num = rand.nextInt(shoulderArray.length);
	    
		// return the randomly chosen shoulder workout
		return shoulderArray[num];
		
	} // end genShoulders
	
	/**
	 * Generates a random tricep workout.
	 * @return
	 * 		Returns the workout. 
	 */
	public static String genTriceps() { 
		
		// get input from file
		In inTricep = new In( "Triceps.txt" );
		String[] tricepArray = inTricep.readAllLines();
	    
		// generate random number 
		Random rand = new Random();
		int num = rand.nextInt(tricepArray.length);
	    
		// return the randomly chosen tricep workout
		return tricepArray[num];
		
	} // end genBiceps
	
	/**
	 * Generates a random workout set.
	 * @param
	 * 		The mask array to know whcih muscle groups are requested.
	 */
	public static void genWorkout( boolean[] bArray ) { 
		
		// declare variable	
		int i = 0;
		// go through mask array and generate a workout for every requested muscle group
		if ( bArray[0] )
			workouts[i++] = genAbs();
		if ( bArray[1] )
			workouts[i++] = genBack();
		if ( bArray[2] )
			workouts[i++] = genBiceps();
		if ( bArray[3] )
			workouts[i++] = genCalves();
		if ( bArray[4] )
			workouts[i++] = genChest();
		if ( bArray[5] )
			workouts[i++] = genForearms();
		if ( bArray[6] )
			workouts[i++] = genHamstrings();
		if ( bArray[7] )
			workouts[i++] = genShoulders();
		if ( bArray[8] )
			workouts[i++] = genTriceps();	
		
	} // end genWorkout
	
	/**
	 * Gets input from the user and calls genWorkout.
	 */
	public static void getInput( ) { 
		
		// create a mask array to keep track of requested workouts, initialize all to false to start
		boolean[] maskArray = new boolean[NUM_OF_GROUPS];
		for ( int i = 0; i < maskArray.length; i++ ) 
			maskArray[i] = false;
	
		// get input 
		System.out.println("Please enter the muscle groups you would like to work out, each separated by a space. ");
		System.out.println("Possible inputs: abs, back, biceps, calves, chest, forearms, hamstrings, shoulders, triceps.");
		String input = scan.nextLine();
		input = input.toLowerCase();
		// get input for length of each set and how many sets
		System.out.println("How many seconds per set? ");
		timeInput = scan.nextInt();
		System.out.println("How many sets of each workout? ");
		setInput = scan.nextInt();
		
		// go through each possible input and change mask array 
		if ( input.indexOf("abs") != -1 )
			maskArray[0] = true;
		if ( input.indexOf("back") != -1 )
			maskArray[1] = true;
		if ( input.indexOf("biceps") != -1 )
			maskArray[2] = true;
		if ( input.indexOf("calves") != -1 )
			maskArray[3] = true;
		if ( input.indexOf("chest") != -1 )
			maskArray[4] = true;
		if ( input.indexOf("forearms") != -1 )
			maskArray[5] = true;
		if ( input.indexOf("hamstrings") != -1 )
			maskArray[6] = true;
		if ( input.indexOf("shoulders") != -1 )
			maskArray[7] = true;
		if ( input.indexOf("triceps") != -1 )
			maskArray[8] = true;
		
		// generate the necessary workouts
		genWorkout(maskArray);
		
	} // end getInput
	
	/**
	 * Times the current workout based on the user input time. 
	 * @param w
	 * 		The current workout.
	 */
	public static void workoutTiming( String w ) { 
		
		try { 
			// countdown to workout start
			System.out.println("Starting " + w + " in: ");
			for ( int i = 3; i > 0; i-- ) { 
				System.out.println(i);
				Thread.sleep(1000);
			}
			System.out.println("Begin!");
			Thread.sleep(1000);
			
			// count down specified amount of time
			for ( int i = timeInput; i > 0; i-- ) { 
				System.out.println(i);
				Thread.sleep(1000);
			}
			System.out.println();
		
		} // end try
		
		catch (Exception e) { 
			System.out.println(e);
		}
		
		
	} // end workout
	
	/**
	 * Goes through each workout set one by one, the amount of times set by user input.
	 */
	public static void goThroughWorkout( ) { 
		
		int currWorkout = 0; 
		// go through workouts one by one and count down the time and sets
		while ( currWorkout < NUM_OF_GROUPS && workouts[currWorkout] != null ) { 
			if ( currWorkout == 0 ) 
				System.out.println("The first workout is: " + workouts[currWorkout] );
			else 
				System.out.println("The next workout is: " + workouts[currWorkout]) ;
			for ( int i = 0; i < setInput; i++ ) {
				if ( i == 0 && currWorkout == 0 ) {
					System.out.println("Press enter when ready for first set. ");
					scan.nextLine();
				} // end if
				else if ( i == 0 ) { 
					System.out.println("Press enter when ready for first set. ");
				}
				else
					System.out.println("Press enter when ready for next set. ");
				scan.nextLine();
				workoutTiming(workouts[currWorkout]);
			} // end for
			currWorkout++;
		}
		
		System.out.println("Workout finished, congratulations!");
		
	}

	/**
	 * Serves as the main method for the demo program.
	 * @param args
	 * 		Command line arguments.
	 */
	public static void main ( String args[] ) { 
		
		// get input and generate workouts
		getInput(); 
		
		// go through workouts
		goThroughWorkout();		
		
	} // end main
	
} // end class
