public class Principal {
    public static void main(String[] args) {
//        (long numero, String cliente, String validade, String vencimento, double limite){
        Visa visa1 = new Visa(100, "Cássio", "06/2025", "20/02/2020", 550.00);
        Visa visa2 = new Visa(200, "Fagner", "07/2025", "20/03/2020", 650.00);
        Visa visa3 = new Visa(300, "Gil", "08/2025", "20/04/2020", 750.00);
        
//public Master (int numero, String cliente, String validade, String banco, double saldo){
        Master master1 = new Master(400, "Pedro Henrique", "07/2025", "20/05/2020", 10550.00);
        Master master2 = new Master(500, "Luan", "08/2025", "20/06/2020", 11550.00);
        Master master3 = new Master(600, "Pedrinho", "09/2025", "20/07/2020", 12550.00);
        
        System.out.println("*** Imprimindo objeto visa1 ***");
        visa1.imprimir();
        System.out.println("------------------------------------------------------------");
        System.out.println("*** Imprimindo objeto visa2 ***");
        visa2.imprimir();
        System.out.println("------------------------------------------------------------");
        System.out.println("*** Imprimindo objeto visa3 ***");
        visa3.imprimir();
        System.out.println("------------------------------------------------------------");

        System.out.println("*** Imprimindo objeto master1 ***");
        master1.imprimir();
        System.out.println("------------------------------------------------------------");
        System.out.println("*** Imprimindo objeto master2 ***");
        master2.imprimir();
        System.out.println("------------------------------------------------------------");
        System.out.println("*** Imprimindo objeto master3 ***");
        master3.imprimir();    
    }
    
}
