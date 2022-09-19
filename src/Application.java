import java.util.LinkedList;
import java.util.Queue;

/**
 * This class will demonstrate the ability to add(queue) and remove(dequeue) people from a serving line in a burger restaurant.
 * @author Adam Winders
 *
 */
public class Application {

	public static void main(String[] args) {
	
		/*
		 * Creates a LinkedList to hold our queue of people waiting for delicious veggie burgers!
		 */
		Queue<String> burgerLine = new LinkedList<String>();
		
		/**
		 * Adds Bill to queue
		 * @return Current queue
		 */
		burgerLine.add("Bill");	// adds Bill to queue
		System.out.println("Bill was added to the queue. \nCurrent queue: " +burgerLine); // prints current queue with Bill
		/**
		 * Adds Alice to queue
		 * @return Current queue
		 */
		burgerLine.add("Alice");	// adds Alice to queue
		System.out.println("\nAlice was added to the queue. \nCurrent queue: " +burgerLine); // prints current queue with Bill & Alice
		/**
		 * Adds Bob to queue
		 * @return Current queue
		 */
		burgerLine.add("Bob");	// adds Bob to queue
		System.out.println("\nBob was added to the queue. \nCurrent queue: " +burgerLine); // prints current queue with Bill, Alice, & Bob
		
		/**
		 * Removes Bill from queue
		 * @return Current queue
		 */
		burgerLine.poll(); // removes first person(Bill) from queue
		System.out.println("\nBill was served. \nCurrent queue: " +burgerLine); // prints current queue with Alice & Bob
		/**
		 * Adds Jane to queue
		 * @return Current queue
		 */
		burgerLine.add("Jane");	// adds Jane to queue
		System.out.println("\nJane was added to the queue. \nCurrent queue: " +burgerLine);// prints current queue with Alice, Bob, & Jane
		/**
		 * Adds Hamad to queue
		 * @return Current queue
		 */
		burgerLine.add("Hamad");	// adds Hamad to queue
		System.out.println("\nHamad was added to the queue. \nCurrent queue: " +burgerLine); // prints current queue with Alice, Bob, Jane, & Hamad
		/**
		 * Removes Alice from queue
		 * @return Current queue.
		 */
		burgerLine.poll();	// removes current first person in queue - Alice
		System.out.println("\nAlice was served. \nCurrent queue: " +burgerLine); // prints current queue with Bob, Jane, & Hamad
		/**
		 * Removes Bob from queue
		 * @return Current queue.
		 */
		burgerLine.poll();	// removes new, current first person in queue - Bob
		System.out.println("\nBob was served. \nCurrent queue: " +burgerLine); // prints current queue with Jane & Hamad
		/**
		 * Adds Jim to queue
		 * @return Current queue
		 */
		burgerLine.add("Jim");	// adds Jim to end of the queue
		System.out.println("\nJim was added to the queue. \nCurrent queue: " +burgerLine);	// prints current queue with Jane, Hamad, & Jim
		/**
		 * Removes Jane from queue
		 * @return Current queue.
		 */
		burgerLine.poll();	// removes Jane from the queue
		System.out.println("\nJane was served. \nCurrent queue: " +burgerLine); // prints current queue with Hamad & Jim
		/**
		 * Removes Hamad from queue
		 * @return Current queue.
		 */
		burgerLine.poll(); 	// removes Hamad from the queue
		System.out.println("\nHamad was served. \nCurrent queue: " +burgerLine);	// prints current queue with just Jim
		

	}	// end main

}	// end class
