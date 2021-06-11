package exemploVeiculo;

public class Main {

    public static void main(String[] args) {

        Veiculo carro = new Carro("ASC123", "Ka", 2015);
        
        Veiculo moto = new Moto("ABC121", "Exemplo", 1990);
        
        
        informacoesBasicas(carro);
        informacoesBasicas(moto);
        
    }
    
    public static void informacoesBasicas(Veiculo veiculo){
        System.out.println("Placa do veiculo: " + veiculo.getPlaca());
        System.out.println("Anos de existencia: " + veiculo.anosExistencia());
        System.out.println("Som da buzina: ");
        veiculo.somBuzina();
    }
    
  
    
}
