package exercicioHeranca;

/**
 * Classe filha que herda uma SuperType(classe Mae Funcionario)
 * Uso de polimorfismo
 */
public class Vendedor extends Funcionario{

    @Override
    void funcionario1() {
        System.out.println("Funcionario: Santos \nCargo: Vendedor\n");
    }

    @Override
    void funcionario2() {
        System.out.println("Funcionario: Kleber \nCargo: Vendedor\n");
    }
}
