package iteratorEjer;

import java.util.List;

public class IteratorEmpresaAList implements EmpresaIterator {

	List<Empleado> empleados;
	private int position;
	
	public IteratorEmpresaAList(List<Empleado> empleados) {
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
