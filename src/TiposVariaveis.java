public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        int idade; // tipo 'int', nome 'idade' , sem valor algum atribuido // 
        int anoFabricacao = 2023; // tipo 'int', nome 'anoFabricacao', valor '2023'
        double salarioMinimo = 2.500; // tipo 'double', nome 'salarioMinimo', valor '2.500'
        
        int cep = 21070333; // se comecar com '0', devera utilizar outro tipo //
        long cpf = 98765432109L; // se comecar com '0'm devera utilizar outro tipo e colocar a letra 'L' no final do valor //
        float pi = 3.14F; // deve-se colocar a letra F no final do valor //
        
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;  // casting //

        final double VALOR_DE_PI = 3.14; // CONSTANTE, variavel declarada com a sintaxe 'final', obrigatoriamente se nomeia a variavel com CAIXA ALTA. //
    
    }
}
