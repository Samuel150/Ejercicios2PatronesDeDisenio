package iteratorEjer;

public class IteratorEmpresaBList implements EmpresaIterator {

	
	Empleado[] empleados;
	private int position;
	
	public IteratorEmpresaBList(Empleado[] empleados) {
		this.empleados=empleados;
	}
	
	@Override
	public Object next() {
		return empleados[position++];
	}

	@Override
	public boolean hasNext() {
		return position<empleados.length && empleados.length!=0;
	}

}
