package exercicioHeranca;

/**
 * Exercicio de Herenca
 * Instanciacao da classe SuperType(Classe Mae) e das classes filhas
 * Upcast e DownCast
 * Polimorfismo e Sobrescrita
 */

public class RodarAplicacao {
    public static void main (String [] args) {

        //Instanciando objeto Funcionario
//        Funcionario funcionario = new Funcionario();

        //Upcast
//        Funcionario gerente = new Gerente();
//        Funcionario vendedor = new Vendedor();
//        Funcionario faxineiro = new Faxineiro();

        // DownCast (Um conceito que nao deve ser usado porque da erro de ClassCastExeception
//        Gerente gerente_ = (Gerente) new Funcionario();

        Funcionario[] classes = new Funcionario[]{new Gerente(), new Vendedor(), new Faxineiro(), new Funcionario()};

        for (Funcionario funcionario : classes) {
            funcionario.funcionario1();
        }

        System.out.println("==============================================");

        for (Funcionario funcionario : classes) {
            funcionario.funcionario2();
        }

        System.out.println("==============================================");

        Gerente gerente = new Gerente();
        gerente.funcionario1();

    }
}
