package iteratorEjer;

import java.util.Vector;

public class EmpresaCList implements IEmpresaList {

	
	Vector<Empleado> empleados;
	
	public EmpresaCList() {
		empleados = new Vector<>();
	}
	
	public void add(Empleado empleado){
		empleados.add(empleado);
	}
	@Override
	public EmpresaIterator empresaIterator() {
		return new IteratorEmpresaCList(this.empleados);
	}

}
