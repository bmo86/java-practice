package bytebanckHeredero;

public class cuentaCorriente extends cuenta {

	public cuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double comision = 0.2;
		return super.saca(valor+comision);
	}
	
	@Override
	public void deposita(double valor) {
		
	}
}
