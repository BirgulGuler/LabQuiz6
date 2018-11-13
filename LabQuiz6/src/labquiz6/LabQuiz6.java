/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labquiz6;

/**
 *
 * @author Technopc
 */
public class LabQuiz6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        kume A=new kume();   // A kümesi boş küme
        System.out.println("A kümesi elemanları:");
        A.yazdir();
        int[] dene={1,2,3};
        kume B=new kume(dene);
        kume D=new kume(dene);  // B ile D aynı elemanlara sahiptir
        System.out.println("B kümesi elemanları:");
        B.yazdir();
        int[] dene1={4,5,6};
        kume C=new kume(dene1);
        System.out.println("C kümesi elemanları:");
        C.yazdir();
        System.out.println("D kümesi elemanları:");
        D.yazdir();
        System.out.println("B ile C kümesi için");
        if(B.denk(C)) System.out.println("Denk");
        else System.out.println("Denk Değil");
        System.out.println("B ile C kümesi için");
        if(B.esit(C)) System.out.println("Eşit");
        else System.out.println("Eşit Değil");
        System.out.println("B ile D kümesi için");
        if(B.esit(D)) System.out.println("Eşit");
        else System.out.println("Eşit Değil");
        System.out.println("B ile C kümesi birleşirse");
        B.birlesim(C);
        B.yazdir();
        System.out.println("A boş kümesine 5 elemanını eklersek");
        A.ekle(5);
        A.yazdir(); 
    }
    
}
