package bytebanckHeredero;

public class Driverboni {

    private double plus;

    public double registerSalary(Funcionario funcionario) {
        this.plus = funcionario.getBoni() + this.plus;
        System.out.println("Calculo actual -> " + this.plus);
        return this.plus;
    }

}
