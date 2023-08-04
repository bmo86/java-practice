package bytebanckHeredero;

public class testCuenta {
	
	public static void main(String[] args) {
		cuentaCorriente cc = new cuentaCorriente(1, 1);
		cuentaAhorros ca = new cuentaAhorros(2, 3);
		cc.deposita(2000);
		cc.transfiere(1000, ca);
		
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());
		
	}
	
	
}
