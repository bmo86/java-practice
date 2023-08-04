package bytebanckHeredero;

public abstract class cuenta {

    protected double saldo;
    private int agencia = 1;
    private int numero;
    private cliente titular = new cliente();

    private static int total;
    
    public cuenta() {
    	
    }
    
    public cuenta( int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estoy creando una cuenta " + this.numero);

        cuenta.total ++;
    }
    
    public abstract void deposita(double valor);

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfiere(double valor, cuenta destino) {
        if(this.saldo >= valor) {
            this.saca(valor);
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }

    public cliente getTitular() {
        return titular;
    }

    public void setTitular(cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return cuenta.total;
    }

}