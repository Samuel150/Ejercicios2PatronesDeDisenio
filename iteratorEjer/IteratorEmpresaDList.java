package iteratorEjer;

import java.util.Stack;

public class IteratorEmpresaDList implements EmpresaIterator {

	Stack<Empleado> empleados;
	private int position;
	
	public IteratorEmpresaDList(Stack<Empleado> empleados) {
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
