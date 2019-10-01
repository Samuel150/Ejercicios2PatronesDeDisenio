package interpreterEjer;

public class TerminalExpressionQuiero extends AbstractExpressionUserStory {

	@Override
	public void interpreter(ContextUserStory userStory) {
		if(userStory.input.startsWith("Quiero")){
			userStory.output+="When";
			userStory.input=userStory.input.substring(6);
		}
		
		
	}

}
