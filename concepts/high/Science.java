package concepts.high;

import java.util.List;
import concepts.high.Provable;

public abstract class Science {
	public static List<Fact> scientificFacts;
	
	public static Argument getRelatedArgument(Object o) {
		if (!(o instanceof Provable)) {
			return null;
		}
		
		Provable provable = (Provable) o;
		
		return provable.getRelatedFact().proof;
	}
}
