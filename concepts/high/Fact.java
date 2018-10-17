package concepts.high;

public class Fact extends Argument implements AdoptableThought {

	public Argument proof; 
	
	@Override
	public Argument presentReasoningForAdaption() {
		return Science.getRelatedArgument(this);
	}

}
