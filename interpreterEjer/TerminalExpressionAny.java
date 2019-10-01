package interpreterEjer;

public class TerminalExpressionAny extends AbstractExpressionUserStory {

	private String token;
	
	public TerminalExpressionAny(String token) {
		this.token=token;
	}
	
	@Override
	public void interpreter(ContextUserStory userStory) {	
			userStory.output += token;
			userStory.input = userStory.input.substring(token.length());
	}

}
