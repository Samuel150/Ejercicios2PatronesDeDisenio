package interpreterEjer;

import java.util.ArrayList;


public class ParserEjer {
	private ArrayList<AbstractExpressionUserStory> parseTree = new ArrayList<>();
	private ContextUserStory context;
	
	public ParserEjer (String s){
		context = new ContextUserStory(s.replace(" ", ""));
		for(String token : s.split(" ")){
			switch (token){
			case "Como":
				parseTree.add(new TerminalExpressionComo());
				break;
			case "Quiero":
				parseTree.add(new TerminalExpressionQuiero());
				break;
			case "Para":
				parseTree.add(new TerminalExpressionPara());
				break;
			default:
				parseTree.add(new TerminalExpressionAny(token));
				break;
			}
			
		}
	}
	public String evaluate(){
		for(AbstractExpressionUserStory e : parseTree)
			e.interpreter(context);
			return context.output;
	}

}
