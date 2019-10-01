package interpreterEjer;


public class ClientInterpreterEjer {

	public static void main(String[] args) {
		String toInterpreter = "Como [usuario] Quiero [accciones] Para [valor de la story]";
		System.out.println("Evaluate: "+toInterpreter+"\nInterpretated: "+ new ParserEjer(toInterpreter).evaluate());
		

	}

}
