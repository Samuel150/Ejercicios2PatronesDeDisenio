package iteratorEjer;

import java.util.ArrayList;
import java.util.List;



public class EmpresaAList implements IEmpresaList {
	
	List<Empleado> empleados;
	
	public EmpresaAList() {
		empleados = new ArrayList<>();
	}
	
	public void add(Empleado empleado){
		empleados.add(empleado);
	}

	@Override
	public EmpresaIterator empresaIterator() {
		return new IteratorEmpresaAList(this.empleados);
	}
}
