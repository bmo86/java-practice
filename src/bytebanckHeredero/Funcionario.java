package bytebanckHeredero;


public class Funcionario {

    private String name;
    private String document;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // constructor aquel metodo publico que retorna el mismo tipo de la clase
    // pueda que lleve parametros o no
    public Funcionario() {
    }

}
