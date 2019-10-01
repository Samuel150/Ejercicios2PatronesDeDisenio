package singleFactoryEjer;

public class FactoryCajero {

	public static  Cajero make(Cajeros type){
	Cajero cajero;
	
	switch(type){
	case Cajero1:
		cajero = new CajeroConcrete1();
		break;
	case Cajero2:
		cajero = new CajeroConcrete2();
		break;
	default:
		cajero = new CajeroConcrete3();
		break;
	
	}
	return cajero;
	
	
	
	
	}

	public enum Cajeros {
		Cajero1, Cajero2, Cajero3;
	}

}
