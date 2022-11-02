public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.setCor("Azul");
        carro1.setModelo("Lexus");
        carro1.setCapacidadeTanque(50);

        System.out.println("Cor do carro: " + carro1.getCor());
        System.out.println("Modelo do carro: " + carro1.getModelo());
        System.out.println("Capacidade do tanque de combustivel: " + carro1.getCapacidadeTanque());

        Carro carro2 = new Carro("Mercedes", "Cinza Prateado", 40);
        System.out.println("\n\nModelo do carro: " + carro2.getModelo());
        System.out.println("Cor do carro: " + carro2.getCor());
        System.out.println("Capacidade do tanque de combustivel: " + carro2.getCapacidadeTanque());

    }
}