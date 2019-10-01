package mediatorEjer;

public class DeveloperConcreto4 extends Developer {

	public DeveloperConcreto4(IChat chat) {
		super(chat);
	}

	@Override
	public void sendDirect(String msg, Developer receptor) {
		chat.sendDirect(msg, receptor);
		
	}
	
	@Override
	public void sendBroadcast(String msg) {
		chat.sendBroadcast(msg, this);
		
	}

	@Override
	public void messageReceived(String msg) {
		System.out.println("Developer 4 recive mensaje: "+msg);

	}

}
