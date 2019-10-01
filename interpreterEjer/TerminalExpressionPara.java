package interpreterEjer;

public class TerminalExpressionPara extends AbstractExpressionUserStory{

	@Override
	public void interpreter(ContextUserStory userStory) {
		if(userStory.input.startsWith("Para")){
			userStory.output+="Then";
			userStory.input=userStory.input.substring(4);
		}
		
		
	}

}
