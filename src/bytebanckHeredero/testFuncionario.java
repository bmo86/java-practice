package bytebanckHeredero;

public class testFuncionario {
    public static void main(String[] args) {
        // new object
        Funcionario funcionario = new Funcionario();
        // new Funcionario
        funcionario.setName("Victor");
        funcionario.setDocument("444555666");
        funcionario.setSalary(2000);

        System.out.println(funcionario.getSalary() + " -> " + funcionario.getBoni());

    }
}
