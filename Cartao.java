/**
 classe abstrata (não gera objetos, serve de modelo, que implementa os 
    métodos da interface ICadastro)
*/
public abstract class Cartao implements ICadastro {
    private int numero;
    private String cliente, validade;

    // método construtor, que recebe 3 parâmetros (numero, cliente e validade)   
    public Cartao(int numero, String cliente, String validade) {
        this.numero = numero;
        this.cliente = cliente;
        this.validade = validade;
    }
        
    @Override //sobrecarga do método entrar, definido na ICadastro
    public void entrar() {
        System.out.print("Digite o Número................: ");
        setNumero( leia.nextInt() ); // utilizado o método set para receber o dado digitado

        System.out.print("Digite o Cliente...............: ");
        setCliente( leia.next() ); // utilizado o método set para receber o dado digitado

        System.out.print("Digite a Validade..............: ");
        setValidade( leia.next() ); // utilizado o método set para receber o dado digitado
    }

    @Override //sobrecarga do método imprimir, definido na ICadastro
    public void imprimir() {
        System.out.println("Número.........................: " + getNumero()); //utilizado o método get para retornar o dado digitado
        System.out.println("Cliente........................: " + getCliente()); //utilizado o método get para retornar o dado digitado
        System.out.println("Validade.......................: " + getValidade()); //utilizado o método get para retornar o dado digitado
    }

    // métodos getters e setters, utilizados para encapsulamento (proteção)
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
    
}
