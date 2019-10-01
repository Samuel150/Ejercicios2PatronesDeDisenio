package mediatorEjer;


public interface IChat {
	public void sendDirect(String msg, Developer vueloReceptor);
	public void sendBroadcast(String msg, Developer vueloEmisor);
	public Developer getDeveloper(int code);
}
