package iteratorEjer;

import java.util.Stack;

public class EmpresaDList implements IEmpresaList {

	Stack<Empleado> empleados;
	
	public EmpresaDList() {
		empleados = new Stack<>();
	}
	
	public void add(Empleado empleado){
		empleados.push(empleado);
	}
	@Override
	public EmpresaIterator empresaIterator() {
		return new IteratorEmpresaDList(this.empleados);
	}

}
