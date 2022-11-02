public class Carro  extends Veiculo{

    String modelo;
    String cor;
    int capacidadeTanque;

    Carro() {

    }
    Carro(String modelo, String cor, int capacidadeTanque) {
        this.modelo = modelo;
        this.cor = cor;
        this.capacidadeTanque = capacidadeTanque;
    }

    void setCor(String cor) {
        this.cor = cor;
    }
    void setModelo(String modelo) {
        this.modelo = modelo;
    }
    void setCapacidadeTanque (int capacidade) {
        this.capacidadeTanque = capacidade;
    }

    String getCor() {
        return cor;
    }

    String getModelo() {
        return modelo;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }

}
