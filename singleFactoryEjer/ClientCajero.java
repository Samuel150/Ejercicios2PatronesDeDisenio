package singleFactoryEjer;

import singleFactoryEjer.FactoryCajero.Cajeros;

public class ClientCajero {

	public static void main(String[] args) {
		CuentaSingleton.getInstance().sumarDinero(1000000);
		FactoryCajero.make(Cajeros.Cajero1).realizarPrestamo(100);
		FactoryCajero.make(Cajeros.Cajero1).realizarPrestamo(5000);
		FactoryCajero.make(Cajeros.Cajero1).realizarPrestamo(800);

	}

}
