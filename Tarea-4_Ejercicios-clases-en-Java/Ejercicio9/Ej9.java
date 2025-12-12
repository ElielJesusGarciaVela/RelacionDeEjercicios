class Empleado {
    String nombre;
    double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    double salarioTotal() {
        return salario;
    }
}

class Gerente extends Empleado {
    double bono;

    public Gerente(String nombre, double salario, double bono) {
        super(nombre, salario);
        this.bono = bono;
    }

    @Override
    double salarioTotal() {
        return salario + bono;
    }
}