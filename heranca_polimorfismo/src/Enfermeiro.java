public class Enfermeiro extends Pessoa {

    int horaTrabalho;
    String setor;
    String numeroCadastro;

    public Enfermeiro(int horaTrabalho, String setor, String numeroCadastro, String nome, int idade, String documento) {
        super(nome, idade, documento);
        this.horaTrabalho = horaTrabalho;
        this.setor = setor;
        this.numeroCadastro = numeroCadastro;
    }

    public void imprimirInfo(){
        super.imprimirInfo();
        System.out.println("Hora de Trabalho: " + this.horaTrabalho);
        System.out.println("Setor: " + this.setor);
        System.out.println("Número de Cadastro: " + this.numeroCadastro);
    }
}
