package mediatorEjer;

public class ClientMediatorEjer {

	public static void main(String[] args) {
		ChatGeneral chat = new ChatGeneral();
		
		DeveloperConcreto1 developer1 = new DeveloperConcreto1(chat);
		DeveloperConcreto2 developer2 = new DeveloperConcreto2(chat);
		DeveloperConcreto3 developer3 = new DeveloperConcreto3(chat);
		DeveloperConcreto4 developer4 = new DeveloperConcreto4(chat);
		
		chat.addDeveloper(1, developer1);
		chat.addDeveloper(2, developer2);
		chat.addDeveloper(3, developer3);
		chat.addDeveloper(4, developer4); 
		
		developer1.sendBroadcast("Tomando tarea 1 de Backlog");
		
		developer1.sendDirect("Codigo modificado", chat.getDeveloper(2));
		developer2.sendDirect("Codigo modificado", chat.getDeveloper(3));
		
		developer1.sendBroadcast("Codigo modificado");
		


	}

}
