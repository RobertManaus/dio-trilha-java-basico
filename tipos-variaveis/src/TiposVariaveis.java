public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
       
        //Tipos primitivos
        //Estudar a classe String que representa texto na aplicação
       
        String meuNome = "ROBERTO SILVA";
       
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;    
        
        int numero = 5;
        numero = 10;

        System.out.print("Numero.: " + numero);
        
        final double VALOR_DE_PI = 3.14;
    }
}
