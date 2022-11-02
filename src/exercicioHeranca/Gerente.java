package exercicioHeranca;

/**
 * Classe filha que herda uma SuperType(classe Mae Funcionario)
 * Uso de polimorfismo
 */
public class Gerente extends Funcionario{

    @Override
    void funcionario1() {
        System.out.println("Funcionario: Mauricio \nCargo de Gerente\n");
    }
}
