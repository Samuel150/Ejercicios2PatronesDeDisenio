package singleFactoryEjer;

public class CuentaSingleton {
	
	private int dinero;
	private static CuentaSingleton instance = null;
	
	private CuentaSingleton(){
		
	}
	
	public int getDinero() {
		return dinero;
	}
	
	public void restarDinero(int dinero) {
		this.dinero -= dinero;
		System.out.println("Dinero en Cuenta: " + this.dinero);
	}
	
	public void sumarDinero(int dinero){
		this.dinero+=dinero;
		System.out.println("Dinero en Cuenta: " + this.dinero);
	}
	
	private synchronized static void makeInstance(){
		if(instance == null){
			instance = new CuentaSingleton();
		}
	}

	public static CuentaSingleton getInstance(){
		if(instance == null){
			makeInstance();
		}
		return instance;
	}
	
	public Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}
	
	
}
