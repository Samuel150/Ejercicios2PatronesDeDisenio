package mediatorEjer;


public abstract class Developer {
	protected IChat chat;
	
	public Developer (IChat chat){
		this.chat= chat;
		
	}
	public abstract void sendDirect(String msg,Developer receptor);
	public abstract void sendBroadcast(String msg);
	public abstract void messageReceived(String msg);


}
