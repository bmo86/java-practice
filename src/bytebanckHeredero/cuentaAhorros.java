package bytebanckHeredero;

public class cuentaAhorros extends cuenta {


	public cuentaAhorros(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override 
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	} 
}
