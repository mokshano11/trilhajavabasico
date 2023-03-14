public class Operadores {

    public static void main(String[] args) throws Exception {
    
        String nomeUm = "Mateus";
        String nomeDois = new String ("Mateus");

        System.out.println(nomeUm.equals(nomeDois));  // utilizar .equals para relacionar OBJETOS


        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm, e igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm, e diferente a numeroDois? " + simNao);

        simNao = numero1 <= numero2;
    
        System.out.println("numeroUm, e menor a numeroDois? " + simNao);
    }
    
}
