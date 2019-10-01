package iteratorEjer;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;



public class ClienteIteratorEjer {

	public static void main(String[] args) {
		
		Map<Integer, Empleado> centralizado = new HashMap<>();
		int position = 0;;
		
		EmpresaAList listaType1 = new EmpresaAList();
		listaType1.add(new Empleado("Samu", "Obrajes"));
		listaType1.add(new Empleado("Rodri", "Arce"));
		listaType1.add(new Empleado("Joaco", "Irvpavi"));
		listaType1.add(new Empleado("Mendez", "Malasia"));

		EmpresaBList listaType2 = new EmpresaBList();
		listaType2.add(new Empleado("Samu2", "Obrajes"));
		listaType2.add(new Empleado("Rodri2", "Arce"));
		listaType2.add(new Empleado("Joaco2", "Irvpavi"));
		listaType2.add(new Empleado("Mendez2", "Malasia"));
		
		EmpresaCList listaType3 = new EmpresaCList();
		listaType3.add(new Empleado("Samu3", "Obrajes"));
		listaType3.add(new Empleado("Rodri3", "Arce"));
		listaType3.add(new Empleado("Joaco3", "Irvpavi"));
		listaType3.add(new Empleado("Mendez3", "Malasia"));
		
		EmpresaDList listaType4 = new EmpresaDList();
		listaType4.add(new Empleado("Samu4", "Obrajes"));
		listaType4.add(new Empleado("Rodri4", "Arce"));
		listaType4.add(new Empleado("Joaco4", "Irvpavi"));
		listaType4.add(new Empleado("Mendez4", "Malasia"));
		
		EmpresaIterator iterator;
		iterator = listaType1.empresaIterator();
		while(iterator.hasNext()){
			Empleado empleado = (Empleado)iterator.next();
			centralizado.put(position++, empleado);
		}

		iterator = listaType2.empresaIterator();
		while(iterator.hasNext()){
			Empleado empleado = (Empleado)iterator.next();
			centralizado.put(position++, empleado);
		}

		iterator = listaType3.empresaIterator();
		while(iterator.hasNext()){
			Empleado empleado = (Empleado)iterator.next();
			centralizado.put(position++, empleado);
			
		}
		iterator = listaType4.empresaIterator();
		while(iterator.hasNext()){
			Empleado empleado = (Empleado)iterator.next();
			centralizado.put(position++, empleado);
		}
		
		for(Entry<Integer,Empleado> emp : centralizado.entrySet()){
			System.out.println("Nombre: "+ emp.getValue().getNombre() + " Direccion: "+emp.getValue().getDireccion());			
		}
		

	}

}
