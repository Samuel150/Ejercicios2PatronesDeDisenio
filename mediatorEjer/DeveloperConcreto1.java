package mediatorEjer;

public class DeveloperConcreto1 extends Developer {

	public DeveloperConcreto1(IChat chat) {
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
		System.out.println("Developer 1 recive mensaje: "+msg);

	}



}
