package examenModulo2.parte1;

public class CursoImpl implements Curso {
	private String cursoName;
	private String codIdentificador;
	private int cupoDisponible;
	private  int cupoMaximo;
	
	public CursoImpl(String cursoName, String codIdentificador, int cupoDisponible, int cupoMaximo) throws ExepControCupo{
		super();
		this.cursoName = cursoName;
		this.codIdentificador = codIdentificador;
		this.cupoMaximo = cupoMaximo;
		if (cupoDisponible < cupoMaximo) {
            this.cupoDisponible = cupoDisponible;
        } else {
            throw new ExepControCupo("La cantidad de alumnos que pueden ingresar en el curso es de  " + cupoMaximo);
        }
    }
	public CursoImpl(String cursoName, String codIdentificador, int cupoMaximo) {
		super();
		this.cursoName = cursoName;
		this.codIdentificador = codIdentificador;
		this.cupoMaximo = cupoMaximo;
	}
	
	public final String getCursoName() {
		return cursoName;
	}

	public final void setCursoName(String cursoName) {
		this.cursoName = cursoName;
	}

	public final String getCodIdentificador() {
		return codIdentificador;
	}

	public final void setCodIdentificador(String codIdentificador) {
		this.codIdentificador = codIdentificador;
	}

	public final int getCupoDisponible() {
		return cupoDisponible;
	}

	public final void setCupoDisponible(int cupoDisponible) throws ExepControCupo {
		if (cupoDisponible < cupoMaximo) {
			this.cupoDisponible = cupoDisponible;
        } else {
            throw new ExepControCupo("El nuevo valor de miAtributo debe ser menor que " + cupoMaximo+" disculpe las molestias");
        }
		
	}

	public final int getCupoMaximo() {
		return cupoMaximo;
	}

	public final void setCupoMaximo(int cupoMaximo) {
		this.cupoMaximo = cupoMaximo;
	}

	@Override
	public String devuelveNombre() {
		System.out.println(this.cursoName);
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String devuelveCodigoID() {
		System.out.println(this.codIdentificador);
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int devuelveCupoDisp() {
		System.out.println(this.cupoMaximo-this.cupoDisponible);
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		return "CursoImpl [cursoName=" + cursoName + ", codIdentificador=" + codIdentificador + ", cupoDisponible="
				+ cupoDisponible + "]";
	}
	
	

}
