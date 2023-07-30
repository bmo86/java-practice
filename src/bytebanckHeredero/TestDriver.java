package bytebanckHeredero;

public class TestDriver {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalary(2000);

        Gerente gerente = new Gerente();
        gerente.setSalary(10000);

        Driverboni d = new Driverboni();
        d.registerSalary(funcionario);
        d.registerSalary(gerente);
    }
}
