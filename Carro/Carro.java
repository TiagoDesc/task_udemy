package Carro;

public class Carro implements Comparable<Carro> {
    public String placa;
    public int anoFabricacao;
    public String marca;
    public String modelo;

    public Carro(String placa, int anoFabricacao, String marca, String modelo) {
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public int compareTo(Carro rodizio) {
        return this.modelo.compareTo(rodizio.modelo);
    }
}
