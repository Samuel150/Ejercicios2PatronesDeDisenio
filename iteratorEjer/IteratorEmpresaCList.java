package iteratorEjer;

import java.util.Vector;

public class IteratorEmpresaCList implements EmpresaIterator {

	Vector<Empleado> empleados;
	private int position;
	
	public IteratorEmpresaCList(Vector<Empleado> empleados) {
		this.empleados=empleados;
	}
	
	@Override
	public Object next() {
		return empleados.get(position++);
	}

	@Override
	public boolean hasNext() {
		return position<empleados.size() && empleados.size()!=0;
	}

}
