public class OperadoresRelacionais {
    public static void main(String[] args) {
        
        String nomeUm = "Roberto";
        String nomeDois = new String("Roberto");
        
        System.out.println(nomeUm.equals(nomeDois));
        
        
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2) {
            System.out.println("A nossa condicao é verdadeira");
        }
        System.out.println("numeroUm é igual a numeroDois " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente do numeroDois " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior que numeroDois " + simNao);
        

    }
}
