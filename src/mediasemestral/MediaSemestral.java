/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediasemestral;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class MediaSemestral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        float prova, projeto, exercicio, moocs;
        float media;
        float nota1, nota2, nota3;
        
        
        System.out.println("Aluno 1 Digite nota da Prova 1º Bimestre: ");
        prova = ent.nextInt();
        System.out.println("Aluno 1 Digite nota do Projeto 1º Bimestre: ");
        projeto = ent.nextInt();
        System.out.println("Aluno 1 Digite nota ddo Exercício 1º Bimestre: ");
        exercicio = ent.nextInt(); 
        System.out.println("Aluno 1 Digite nota do MOOC´S 1º Bimestre: ");
        moocs = ent.nextInt();
        nota1 = (prova + projeto + exercicio + moocs);
        System.out.println("A nota do aluno no 1º Bimestre é: " + nota1);
        //notas do 1º bimestre
        System.out.println("Aluno 1 Digite nota da Prova 2º Bimestre: ");
        prova = ent.nextInt();
        System.out.println("Aluno 1 Digite nota ddo Projeto 2º Bimestre: ");
        projeto = ent.nextInt();
        System.out.println("Aluno 1 Digite nota ddo Exercício 2º Bimestre: ");
        exercicio = ent.nextInt(); 
        System.out.println("Aluno 1 Digite nota do MOOC´S 2º Bimestre: ");
        moocs = ent.nextInt();
        nota2 = (prova + projeto + exercicio + moocs);
        System.out.println("A nota do aluno no 2º Bimestre é: " + nota2);
        //notas do 2º bimestre
        System.out.println("Aluno 1 Digite nota da Prova 3º Bimestre: ");
        prova = ent.nextInt();
        System.out.println("Aluno 1 Digite nota ddo Projeto 3º Bimestre: ");
        projeto = ent.nextInt();
        System.out.println("Aluno 1 Digite nota ddo Exercício 3º Bimestre: ");
        exercicio = ent.nextInt(); 
        System.out.println("Aluno 1 Digite nota do MOOC´S 3º Bimestre: ");
        moocs = ent.nextInt();
        nota3 = (prova + projeto + exercicio + moocs);
        System.out.println("A nota do aluno no 3º Bimestre é: " + nota3);
        //notas do 3º bimestre
        
        media = (nota1+nota2+nota3)/3;
        System.out.println("A média do aluno no Semestre é: " + media);
        if(media >=8){
        System.out.println("Aluno Aprovado.");
        }else if(media <8){
        System.out.println("Aluno Reprovado. ");
        
        media = (10-media);
            System.out.println("Aluno deve tirar nota  " + media + " na prova final.");
        }
    }
    
}
