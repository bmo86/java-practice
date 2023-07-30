package bytebanckHeredero;

public class Driverboni {

    private double plus;

    public double registerSalary(Funcionario funcionario) {
        this.plus = funcionario.getBoni() + this.plus;
        System.out.println("Calculo actual -> " + this.plus);
        return this.plus;
    }

    public double registerSalary(Gerente gerente) {
        this.plus = gerente.getBoni() + this.plus;
        System.out.println("Calculo actual -> " + this.plus);
        return this.plus;
    }

}
