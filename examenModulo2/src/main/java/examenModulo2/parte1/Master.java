package examenModulo2.parte1;

public class Master extends CursoImpl {
	private boolean oficial;

	
	
	public Master(String cursoName, String codIdentificador, int cupoDisponible, int cupoMaximo, boolean oficial)
			throws ExepControCupo {
		super(cursoName, codIdentificador, cupoDisponible, cupoMaximo);
		this.oficial = oficial;
	}
	

	public Master(String cursoName, String codIdentificador, int cupoMaximo, boolean oficial) {
		super(cursoName, codIdentificador, cupoMaximo);
		this.oficial = oficial;
	}


	public final boolean isOficial() {
		return oficial;
	}

	public final void setOficial(boolean oficial) {
		this.oficial = oficial;
	}

	@Override
	public String devuelveNombre() {
		// TODO Auto-generated method stub
		return super.devuelveNombre();
	}

	@Override
	public String devuelveCodigoID() {
		// TODO Auto-generated method stub
		return super.devuelveCodigoID();
	}

	@Override
	public int devuelveCupoDisp() {
		// TODO Auto-generated method stub
		return super.devuelveCupoDisp();
	}

	

	
	

}
