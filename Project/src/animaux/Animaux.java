/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animaux;

/**
 *
 * @author Rigo
 */
public class Animaux {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tigre t = new Tigre("rouge",20);
        t.manger();
        t.boire();
        t.crier();
        System.out.println(t.toString());
        
        Loup l = new Loup("blanche et noire",50);
        l.manger();
        l.boire();
        l.crier();
        System.out.println(l.toString());
        
        System.out.println("modification");
    }
    
}
