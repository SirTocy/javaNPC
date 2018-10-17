package institutions;

import java.util.HashSet;
import java.util.Set;

import concepts.high.AdoptableThought;
import concepts.high.BaselessIdea;

public abstract class Education {
	@SuppressWarnings({"unchecked", "rawtypes"})
	public static Set<AdoptableThought> loadNeoliberalIdeology() {
		int numberOfNewIdeas = (int) Math.random()*100+1;
		HashSet result = new HashSet<AdoptableThought>();
		
		for(int i=0; i <= numberOfNewIdeas;i++) { 
			result.add(new BaselessIdea());
		}
		
		return result;
	}
}
