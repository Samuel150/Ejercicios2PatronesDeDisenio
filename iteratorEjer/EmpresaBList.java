package iteratorEjer;


public class EmpresaBList implements IEmpresaList {

	
	Empleado[] empleados;
	private int position;
	
	public EmpresaBList(){
		empleados = new Empleado[4];  
	}
	
	public void add(Empleado empleado){
		empleados[position++]=empleado;
	}
	@Override
	public EmpresaIterator empresaIterator() {
		return new IteratorEmpresaBList(this.empleados);
	}

}
