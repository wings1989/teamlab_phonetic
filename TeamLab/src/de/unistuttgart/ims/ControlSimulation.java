package de.unistuttgart.ims;

public class ControlSimulation {

	
	/**
	 * This is the entry-point for the program
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO finish implementation
		
		// The maximum number of cycles to run the simulation
		int maxCycles = 500;
		
		// The size of the population
		int populationSize = -1;//TODO set to appropriate value
		
		Population population = new Population(populationSize);
		
		
		for(int i=0; i<maxCycles; i++) {
			// Get the next speaker:
			Sneetch speaker = population.getNextSneetch();
			
			// Get one listener:
			Sneetch listener = population.getRandomSneetch();
			
			// Attention: make sure that the Sneetch does not talk to itself!
			
			Utterance u = speaker.speak();
			listener.listen(u);
			
		}

	}

}
