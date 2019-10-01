package mediatorEjer;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ChatGeneral implements IChat {

	private Map<Integer, Developer> map = new HashMap<>();

	public void addDeveloper(int code, Developer developer) {
		map.put(code, developer);
	}

	@Override
	public Developer getDeveloper(int code) {
		return map.get(code);
	}

	@Override
	public void sendDirect(String msg, Developer developerReceptor) {
		System.out.println("DIRECT MESSAGE");
		developerReceptor.messageReceived(msg);
		
	}

	@Override
	public void sendBroadcast(String msg, Developer developerEmisor) {
		System.out.println("BROADCAST");
		for(Entry<Integer, Developer> dev : map.entrySet()){
			if(!dev.getValue().equals(developerEmisor)){
				dev.getValue().messageReceived(msg);
			}
		}
		
	}

}
