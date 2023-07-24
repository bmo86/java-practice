package bytebanckHeredero;

public class TestGerente {

    public static void main(String[] args) {
         Gerente gerente = new Gerente();
        // Funcionario gerente = new Funcionario();
        gerente.setSalary(5000);
        gerente.setType(1);
        gerente.setName("Victor");

        gerente.setClave("Hola");
        System.out.println(gerente.getBoni());
        // System.out.println(gerente.Singup("Hola1"));
    }


}
