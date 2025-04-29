// ResultadoEscolar.java
public class ResultadoEscolar {
    public static void main(String[] args) {

       int nota = 7;
       
       if(nota >= 7)
            System.out.println("Aluno(a) Aprovado");
        else if (nota >=5 && nota<7)
            System.out.println("Aluno(a) em recuperação");
       else
        System.out.println("Aluno(a) Reprovado");
    }
}