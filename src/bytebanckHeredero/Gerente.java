package bytebanckHeredero;

public class Gerente extends Funcionario {

    private String clave;

    public boolean Singup(String clave) {
        return this.clave == clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    // Sobreescritura de metodos
    public double getBoni() {
        return super.getSalary() + this.getSalary() * 0.05;
    }

}
