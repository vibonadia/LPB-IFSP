package exemploVeiculo;

import java.util.Calendar;
import java.util.GregorianCalendar;

// Exemplo de classe abstrata
public abstract class Veiculo {

    private String placa;
    private String modelo;
    private int anoFabricacao;

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int anosExistencia() {
        Calendar cal = GregorianCalendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);
        return anoAtual - this.anoFabricacao;
    }

    // Exemplo de métodos abstratos
    public abstract void somBuzina();

    public abstract void somMotor();

}
