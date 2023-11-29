
public class Main {
    public static void main(String[] args) {
        // Polimorfismo -> deu uma forma de paciente pra classe pessoa
        System.out.println("Informações do paciente:");
        Pessoa paciente = new Paciente("1234", "Unimed", "Pedro", 21, "12345657");
        paciente.imprimirInfo();


        // Polimorfismo -> deu uma forma de enfermeiro pra classe pessoa
        System.out.println("\nInformações do enfermeiro:");
        Pessoa enfermeiro = new Enfermeiro(8, "UTI", "12345", "Pedro", 21, "1234567");
        enfermeiro.imprimirInfo();
    }
}