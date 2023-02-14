public class Operadores {
    public static void main(String[] args) {
        //Aula 2
        String nomeCompleto = "LINGUAGEM " + "JAVA";

        System.out.println(nomeCompleto);

        String concatenacao ="?";

        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);
    
        //Aula 3
        
        int numeroa3 = 5;

        numeroa3 = - numeroa3;

        System.out.println(numeroa3);

        numeroa3 = numeroa3 * -1;

        System.out.println(numeroa3);

        //Aula 4

        int numeroa4 = 5;

        //x repeticao

        //numeroa4 = numeroa4 +1;

        System.out.println(--numeroa4);
        
        boolean variavela4 = true;

        System.out.println(!variavela4);

        variavela4 = !variavela4;
        
        System.out.println(variavela4);

        //Aula 5

        int a, b;

        a = 5;
        b = 6;
        
        String resultadoa5 = a==b ? "Verdadeiro": "Falso";
        
        System.out.println(resultadoa5);

        //Aula 6

        String nomeUm = "Leonardo";
        String nomeDois = new String("Leonardo");

        System.out.println(nomeUm.equals(nomeDois));
        //.equals compara o conteúdo do objeto
        
        int numero1a6 = 1;
        int numero2a6 = 2;

        String numero1a6txt = Integer.toString(numero1a6);
        String numero2a6txt = Integer.toString(numero2a6);

        System.out.println(numero1a6txt.concat(" e ") + numero2a6txt);
        
        boolean simNao = numero1a6 == numero2a6;

        System.out.println("numero1a6 é igual a numero2a6? " + simNao);
        
        simNao = numero1a6 != numero2a6;

        System.out.println("numero1a6 é diferente de numero2a6? " + simNao);

        simNao = numero1a6 > numero2a6;

        System.out.println("numero1a6 é maior que numero2a6? " + simNao);

        simNao = numero1a6 < numero2a6;

        System.out.println("numero1a6 é menor que numero2a6? " + simNao);
    }
}