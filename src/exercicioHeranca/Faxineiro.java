package exercicioHeranca;

/**
 * Classe filha que herda uma SuperType(classe Mae Funcionario)
 * Uso de polimorfismo
 */
public class Faxineiro extends Funcionario{

    @Override
    void funcionario1(){
        System.out.println("Funcionario: Marcelo \nCargo: Faxineiro\n");
    }

    @Override
    void funcionario2() {
        System.out.println("Funcionario: Alex \nCargo: Faxineiro\n");
    }
}
