1. Component Testing 
	The main component we had, not as a part of our main project was our Demo.java file. This file is a full java program that runs very similarly to our website, and mainly acts as a sort of outline of how we want our program to work. The program is divided into many different methods, such as genForearms, genHamstrings, genShoulders, etc. that are only called when their boolean value is set to true. By default, the boolean value for all of these methods is set to false. When the main method is called, the user is prompted to enter which muscle groups they want exercises for. When they enter a muscle group listed, it's boolean value is set to true and then when the program runs, any method set to true is called, and the methods will generate workouts for the designated muscle groups. In order to test each of these methods, we had to go through the program multiple times, selecting each individual muscle group to test each method. For example, when genShoulders is called, we need to make sure that every line of code in the genShoulders method is working as it is supposed to and getting called properly. We also need to make sure that the method isn't getting called when the boolean for genShoulders is set to false. There are additional methods for setting the timer for each workout, and the number of sets of each workout. We also tested what would take place when an invalid input was given. Say, for example, if the user tried to generate a workout for a muscle group not listed. Or if the user tried to do a negative time for their workouts, or entered a value that wasn't a number. These problems did not persist over to the main program, however, as we used radio buttons, so that the user is not prompted to enter a custom input- rather they are given preselected inputs to choose between. These choices done in our Demo.java program, which is not a part of our final program helped us to better understand our end goal for our project. Testing them gave us a good understanding of where things could mess up and break, and how to avoid it, such as avoiding the option of allowing the user to enter a custom input altogether. While we did not user or incorporate our Demo.java program anywhere in our actual end product, it provided an adequate skeleton for the format and general idea of our project. Testing it in many ways mirrored testing our actual program, and gave us forwarning to potential pitfalls that we might encounter further on down the line when we come across the same steps in making our finished product.
	
2. System Testing
	System testing involved going through each individual possible input that the user could make and seeing if it responded accordingly. The first site the user will see is the index.html page, which contains multiple things that the user could potentially interact with. The first of these is a selection area, containing multiple radio elements, where the user is able to select between abs, back, biceps, calves, chest, forearms, hamstrings, shoulders, and triceps. The end result of clicking these items, ideally, is to generate a workout that contains exercises that workout these selected elements. For example, someone who selected chest might get a workout like bench press, or push ups, whereas someone who selected legs might get exercises like squats or deadlifts. The second selectable option was how many workouts the user wanted for each muscle that they selected in the previous step. If they selected one workout, and selected say chest and legs, they would only get one chest workout (i.e. bench press) and one leg workout (i.e. squats). The third selection would be how long each set should be. If they select 30 seconds, ideally on the next page, each workout would be counting down from 30 seconds. Then they would select how many sets they wanted to do. If they selected three sets, the number of remaining steps would show on the next page. The final thing they could select is how often per week they wanted to work out. This would be tracked on the calender, as the app is designed to generate a workout routine for each individual day of the week for the user. Many of these components are still being updated, and many of the tests came back with an insufficient result. However, these tests did allow us to gain a better understanding of what we want our project to end up looking like. System testing also allowed us to find some errors in our program, such as how once a value is selected in the first step, such as abs or shoulders, that value can no longer be unselected, unless the page is entirely refreshed. Additionally, some of the selected settings do not get transferred over to the next page correctly. System testing allowed us to find what needed to be fixed and the bugs in our program.

3. Acceptance Testing 

	The main acceptance testing that we used for our system is to test all possible cases for users' requests. We focused our testing and development on our user stories, and that was the main idea that led our testing. 
	We took what the users requested and developed their wishes to the best of our ability. These users also gave us some ideas of tests to use to make sure the system is what they imagined. We took these ideas and made 
	sure to test them all out to make sure it was specifically what the user requested, we also added some of our own tests that we thought of to make sure that our system was as well run and bug free as we could get it.
	The user stories gave us ways to test our system, and they were our main basis for designing our tests. 
	
		1) Random Workout Generator Feature 
			The user acceptance test for this feature was to be able to generate a random workout based on the equipment that the user has inputted. 
			This feature is not completely implemented, we have random workout generation we just need to add the generation based on user input. 
			We have tested out the random workout generation heavily, now we just need to figure out how to use user input and test it.
		
		2) Tutorial Feature	
			The user acceptance test for the tutorial feature was that there is a small tutorial for every workout on the site so the user can make sure they are doing the workout correctly. 
			This feature is fully implemented. For every workout, we have a tutorial gif given to show the user the correct form. 
		
		3) Timer
			The user acceptance test for the timer was that each workout comes with a timer to show the user how long they still have in their current set. 
			This feature is not fully implemented. We have a timer, but it only counts down from 30 seconds. Just like the random workout generator feature, 
			we need to figure out how to get user input and use it to choose the timer length. While this was not an acceptance test from the user, we have 
			added it ourselves to better test this feature. 
		
		4) Workout Increase 
			The user acceptance test for the workout increase feature was the user should tell the website how difficult their last workout was for them and 
			the workout should make their next workout either the same weight or heavier based on input. 
			This feature is not fully implemented. We have to store previous user data before we can develop this idea, that is what is currently holding us back from 
			finishing and testing this feature. 
		
		5) Workout History to Calendar Tracker Feature 
			The user acceptance test for the workout history feature wass that once a user has completed a workout, it will be marked as finished on their calendar
			so that they can keep track of their previous workouts. 
			This feature is not fully implemented. We currently have the calendar feature working and we can add events to it, the thing holding us back from this 
			one is also the ability to store user data. We have to develop a way for users to sign in and a database to keep track of their previous workouts. 
			
		6) Progressive Overload Feature 
			The user acceptance test for the progressive overload feature was that the website would keep mildly increasing the weight of the user so that the user 
			can continue to get stronger slowly without becoming stagnant at a specific weight. 
			This feature is not fully implemented. As with the workout increase and the workout history features, we need a way to keep track of the user's data 
			so that we can know what their previous weights were. 