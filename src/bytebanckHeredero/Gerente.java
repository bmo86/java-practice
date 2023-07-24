package bytebanckHeredero;

public class Gerente extends Funcionario {

    private String clave;

    public boolean Singup(String clave) {
        return this.clave == clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public double getBoni() {
        return super.getSalary();
    }

}
