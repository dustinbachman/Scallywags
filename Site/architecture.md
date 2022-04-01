 
 
1.1 Team Name and Team Member Names 
		Team Name: Syntax Error Scallywags
		Team Members: Elias Leverett, Adrian Collier, Dustin Bachman, Kevin Haro
	
	
1.2 Project Overview: 
		A workout web app that allows user to get workouts, track their previous workouts, 
		and learn new workouts. We have a calendar portion that allows users to keep 
		track of what they have previously worked out. We have small tutorial gifs/videos
		to help users learn new workouts that they may be unfamiliar with. We have an
		option to pick which muscle group to be worked out and what equipment the user 
		has access to in order to generate a workout.
		

1.3: Key Architectural Drivers: 
		The main deciding factors in choosing our project’s architecture were simplicity of use 
		and ease of understanding, as well as what our current skills allow us to implement. We intend to 
		create a functioning website that will produce a workout routine, as well as store the user’s 
		previous workouts, and our primary goal in doing so is to have it work as effectively as possible 
		while still being intuitive and easy to understand.

		
			
1.4: Architectural Style Choices: 
		Style 1 - Our first candidate is the Event-Driven Architecture. Due to the nature of our workout application project, 
		It is heavily dependent on buttons, text boxes, scroll bars, and other objects. All these functions implement 
		event-listeners that will activate the desired function and output its result. 
		
		Style 2 - Our second candidate is the Client-Server Architecture. Our project could also benefit from this architecture 
		for similar reasons. Many client-side requests may include “generate a random workout” or “view tutorial on proper 
		form for this exercise” and the server-side response would be to activate those functions and return their output. 
		
		We chose Style 1 because it most closely aligns with our goals for this project. We plan to build our application around 
		“events”, for example,  clicking the “generate random workout” button should activate an event-listener that will 
		call the function responsible for generating a random workout. Clicking the “workout complete” button should activate 
		an event-listener that will call the function responsible for logging this workout into the calendar.
				
		
1.5: Our Architecture: 
		Our architecture is the Event-Driven Architecture.
		Link to image: https://github.com/dustinbachman/Scallywags/blob/main/Site/Architecture.jpg
		
1.6: Conclusion: 
		In conclusion, our architectural style is the Event-Driven Architecture and with it some downfalls of it 
		is that it can cause duplication of events and lack of clear workflow order. Meaning without proper organization 
		and planning, a single event of our website can cause multiple duplicate events to trigger.
		
			- A prime example is the same workout displaying of an abodemen workout to display in leg 
			or chest workouts causing confusion for the user. 
			
			- Another example is name confusion of a workout, with not labeling stuff properly we can 
			cause a name convention confusion within our team. 
				
		
