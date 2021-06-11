package exemploVeiculo;

// Classe "Moto" herda da classe abstrata "Veiculo"
public class Moto extends Veiculo {

    public Moto(String placa, String modelo, int anoFabricacao) {
        super.setPlaca(placa);
        super.setModelo(modelo);
        super.setAnoFabricacao(anoFabricacao);
    }

    // Uma vez que a classe "Moto" herda da classe "Veiculo", ela deve OBRIGATORIAMENTE
    // implementar os métodos abstratos da classe "Veiculo".
    // No exemplo, os métodos abstratos da classe ""Veiculo" são:
    // somBuzina() e somMotor()
    @Override
    public void somBuzina() {
        System.out.println("Bii");
    }

    @Override
    public void somMotor() {
        System.out.println("vrurruuun");
    }

}
