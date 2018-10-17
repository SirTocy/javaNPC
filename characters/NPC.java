package characters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

import concepts.high.AdoptableThought;
import concepts.high.Argument;
import concepts.high.BaselessIdea;
import creatures.Mammal;
import institutions.Education;

public class NPC extends Mammal implements Suggestible {
	private static final String ORANGE_MAN_BAD;
	private static final Set<AdoptableThought> politicalBeliefs;
	private static final Boolean believeAllWahmen;
	private static final ArrayList<String> GENERIC_DIALOGUE_RESPONSES;
	
	static {
		ORANGE_MAN_BAD = "Fuck Drumpf!";
		politicalBeliefs = Education.loadNeoliberalIdeology();
		believeAllWahmen = true;
		//This really needs to be expanded.
		GENERIC_DIALOGUE_RESPONSES = new ArrayList<String>(Arrays.asList(
				"You're a nazi.",
				"Muh wage gap.",
				"Muh pink tax.",
				"Muh gun ban.",
				"Muh mysoginy.",
				"Muh patriarchy.",
				"Muh slavery."
		));
	}
	
	public static String getPoliticalOpinion() {
		return ORANGE_MAN_BAD;
	}
	
	public String provideDialogueResponse(Object dialogueInput) {
		if (dialogueInput instanceof Argument) {
			return "Stop oppressing me!";
		}
		
		//TODO Re-think and correct this in a ticket later ffs, some NPCs are adopting
		//borderline nazi ideas about skin colour and gender!
		if (dialogueInput instanceof BaselessIdea) {
			gobbleUpUngroundedIdeas((BaselessIdea) dialogueInput);
			return "Preach!";
		}
		
		if (dialogueInput instanceof AdoptableThought) {
			int responseIndex = (int) Math.random()*GENERIC_DIALOGUE_RESPONSES.size();
			return GENERIC_DIALOGUE_RESPONSES.get(responseIndex);
		}
		
		return getPoliticalOpinion();
	}
	
	@Override
	public void gobbleUpUngroundedIdeas(BaselessIdea brainfart) {
		politicalBeliefs.add(brainfart);
	}

}
