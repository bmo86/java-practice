package bytebanckHeredero;

public class TestReferencias {
    public static void main(String[] args) {
        // El elemento mas generico puede ser adaptado al elemento mas especifico
        // adapatado - generico  = Funcionario 
        // especifico = Gerente 
        Funcionario funcionario = new Gerente();

        funcionario.setName("Manuel Monje");

        Gerente gerente = new Gerente();
        gerente.setName("Maria");

        funcionario.setSalary(2000);
        gerente.setSalary(10000);

        // funcionario.Singup("Hola"); -> no tiene el metodo  
        gerente.Singup("Hola"); // -> tiene el metodo especial de iniciar secion 
    }
}
