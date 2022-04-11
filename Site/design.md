1. Describe the design of your system

We are designing a workout app that will allow the user to input their preferred settings, and have a workout that they can do generated for them.
It will show videos, demonstrating each exercise. And it will allow the users to keep track of the workouts that they've done, using a calendar.
The first page the user will see is the Generate a Workout page, which will allow the user to select the muscles that they would like exercises for.
They are then able to select how many workouts per muscle group, how long per set, and how many sets of the given exercise to do, as well as how often.
Once they have selected those, a workout routine will be generated for them, which they can either print out or follow along with.
They can also access a calendar page that will allow them to keep track of all of their completed workouts.

2. Architecture
Our architecture is the Event-Driven Architecture.
An event-driven architecture uses events to trigger and communicate between decoupled services, meaning that each selection of user input creates an event.
These events are then sent to the driver program and used to generate a workout routine from a database, which is then sent back to the user.
Link to image: https://github.com/dustinbachman/Scallywags/blob/main/Site/Architecture.jpg 

3. Classes

There is one main driver class in our program, and a selection of corresponding HTML pages that are displayed.
The driver program is what selects which workout to display, corresponding with the user's input given in the index.html page.
The page contains code to display the timer counting down, show the workout as well as an image of what the user is supposed to be doing, and remaining sets.

4. Threading and control

The program will, once completed, have the user begin at the index.html page, and take input from each of the segments allowing for user input.
Each of these will produce a value, and each value will then be used to create a workout routine, done using the driving Java code.
Each segment is connected, either through built in HTML features, or through alternative methods not yet implemented


