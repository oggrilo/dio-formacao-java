public class Operadores {
    
    public static void main(String[] args) {
        //unários
        int numero = 5;

        numero = - numero;

        System.out.println(numero);

        numero =  numero * -1;

        System.out.println(numero);

        //repetição
        //numero ++;
        //numero = numero + 1

        System.out.println( ++ numero);
        System.out.println( -- numero);

        boolean variavel = true;

        System.out.println(variavel);

        variavel = !variavel;
        System.out.println(variavel);

        //ternário
        int a,b;
        a = 6;
        b = 6;
        String resultado = a == b ? "verdadeiro" : "falso";
        
        System.out.println(resultado);

        //lógicos
        boolean condicao1 = true;
        boolean condicao2 = true;


        if (condicao1 && condicao2 == true) {
            System.out.println("Ambas Condições são verdadeiras");

        }
        else System.out.println("Uma ou mais Condições são falsas");

        if (condicao1 || condicao2 == true) {
            System.out.println("Uma das Condições é verdadeiras");

        }
        else System.out.println("Nenhuma Condição é verdadeira");

        
            
        
    }
}
