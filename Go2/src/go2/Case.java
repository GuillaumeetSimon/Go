/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package go2;

/**
 *
 * @author jtaillan
 */
public class Case {
     private String couleur;
     private Point2D position;
       

    public Case(Point2D position) {
        this.couleur = "Vide";
        this.position = position;
        
    }

    
    
    public String getCouleur() {
        return couleur;
    }

    public Point2D getPosition() {
        return position;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setPosition(Point2D position) {
        this.position = position;
    }
    
}