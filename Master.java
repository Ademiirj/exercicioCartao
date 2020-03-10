public class Master extends Cartao {
    private String banco;
    private double saldo;


    public Master (int numero, String cliente, String validade, String banco, double saldo){
        // chama o construtor da superclasse(Cartao), passando os parâmetros numero, cliente e validade
        super(numero, cliente, validade);

        // atribuiu os parâmetros aos atributos da classe Master

        this.banco = banco;
        this.saldo = saldo;
    }    
    
    // métodos getters e setters, para encapsulamento (proteção)
    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getBanco() {
        return this.banco;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    @Override //sobrecarga do método entrar, definido na ICadastro
    public void entrar() {
        super.entrar(); // executar o método entrar da superclasse (Cartao)
        System.out.println("\n\n \t\t *****  CARTÃO MASTERCARD  ***** \n\n");
        System.out.print("Digite o Banco.................: ");
        setBanco( leia.next() ); // utilizado o método set para receber o dado digitado

        System.out.print("Digite o Saldo.................: ");
        setSaldo( leia.nextDouble()); // utilizado o método set para receber o dado digitado
    }

    @Override //sobrecarga do método imprimir, definido na ICadastro
    public void imprimir() {
        super.imprimir(); // executar o método imprimir da superclasse (Cartao)
        System.out.println("Banco..........................: " + getBanco()); //utilizado o método get para retornar o dado digitado
        System.out.println("Saldo..........................: " + getSaldo()); //utilizado o método get para retornar o dado digitado
    }
}
