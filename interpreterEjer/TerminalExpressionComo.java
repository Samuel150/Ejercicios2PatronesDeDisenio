package interpreterEjer;

public class TerminalExpressionComo extends AbstractExpressionUserStory {

	@Override
	public void interpreter(ContextUserStory userStory) {
		if(userStory.input.startsWith("Como")){
			userStory.output+="Given";
			userStory.input=userStory.input.substring(4);
		}
		
		
	}

}
