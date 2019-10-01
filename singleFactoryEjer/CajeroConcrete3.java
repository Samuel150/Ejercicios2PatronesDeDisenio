package singleFactoryEjer;

public class CajeroConcrete3 extends Cajero {

	@Override
	public void realizarPrestamo(int dinero) {
		if(CuentaSingleton.getInstance().getDinero()>=dinero){
			CuentaSingleton.getInstance().restarDinero(dinero);
		}

	}

}
