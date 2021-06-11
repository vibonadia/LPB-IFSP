package exemploVeiculo;

// Classe "Carro" herda da classe abstrata "Veiculo"
public class Carro extends Veiculo {

    public Carro(String placa, String modelo, int anoFabricacao) {
        super.setPlaca(placa);
        super.setModelo(modelo);
        super.setAnoFabricacao(anoFabricacao);
    }

    // Uma vez que a classe "Carro" herda da classe "Veiculo", ela deve OBRIGATORIAMENTE
    // implementar os métodos abstratos da classe "Veiculo".
    // No exemplo, os métodos abstratos da classe ""Veiculo" são:
    // somBuzina() e somMotor()
    @Override
    public void somBuzina() {
        System.out.println("Bibibi");
    }

    @Override
    public void somMotor() {
        System.out.println("Runnnn");
    }

}
