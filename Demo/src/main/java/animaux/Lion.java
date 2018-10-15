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
public class Lion extends Felin{
 
  public Lion(){
                
  }

  public Lion(String couleur, int poids){
    this.couleur = couleur;
    this.poids = poids;
  }
    
    public void crier(){
        System.out.println("Je rougis dans la savane !!");
    }
}
