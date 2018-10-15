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
public class Chien extends Canin {
 
  public Chien(){

  }

  public Chien(String couleur, int poids){
    this.couleur = couleur;
    this.poids = poids;
  }       

  void crier() {
    System.out.println("J'aboie sans raison !");
  } 
}
