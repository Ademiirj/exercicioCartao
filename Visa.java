
public class Visa extends Cartao {
    private String vencimento;
    private double limite;
    
    // método construtor, que recebe 5 parâmetros (numero, cliente, validade, vencimento e limite) e 
    public Visa (int numero, String cliente, String validade, String vencimento, double limite){
        // chama o construtor da superclasse(Cartao), passando os parâmetros numero, cliente e validade
        super(numero, cliente, validade);

        // atribuiu os parâmetros aos atributos da classe Visa
        this.vencimento = vencimento;
        this.limite = limite;
    }    

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    @Override //sobrecarga do método entrar, definido na ICadastro
    public void entrar() {
        super.entrar(); // executar o método entrar da superclasse (Cartao)
        System.out.println("\n\n \t\t *****  CARTÃO VISA  ***** \n\n");
        System.out.print("Digite o vencimento............: ");
        setVencimento( leia.next() ); // utilizado o método set para receber o dado digitado

        System.out.print("Digite o limite................: ");
        setLimite( leia.nextDouble()); // utilizado o método set para receber o dado digitado
    }

    @Override //sobrecarga do método imprimir, definido na ICadastro
    public void imprimir() {
        super.imprimir(); // executar o método imprimir da superclasse (Cartao)
        System.out.println("Vencimento.....................: " + getVencimento()); //utilizado o método get para retornar o dado digitado
        System.out.println("Limite.........................: " + getLimite()); //utilizado o método get para retornar o dado digitado
    }
}
