package sn.esp.dgi.master;
import javax.swing.*;

import ca.quens.sat.master.Pile;
public class TestPile {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        int n = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter nombre d'element à empiler"));
        Pile mapile = new Pile(n);

        //System.out.println("teste pile pleine:" + mapile.pilePleine(mapile));
        JOptionPane.showMessageDialog(frame,"test pile pleine :" + mapile.pilePleine(mapile));
        JOptionPane.showMessageDialog(frame,"test pile Vide :" + mapile.pileVide(mapile));

        // System.out.println(" Passons à L'empilement:");
        JOptionPane.showMessageDialog(frame,"Passons à L'empilement");
        while (n > 0) {
            mapile.empiler(mapile, Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter element")));
            n--;  
        }
        JOptionPane.showMessageDialog(frame,"La Pile : " + mapile.afficher(mapile));
        System.out.println("teste pile pleine:" + mapile.pilePleine(mapile));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter nombre d'element à depiler"));
        JOptionPane.showMessageDialog(frame,"Passons au depilement");

        while(n2 > 0) {
            JOptionPane.showMessageDialog(frame,mapile.depiler(mapile)+" à été dépiler. Etat de la pile :"+mapile.afficher(mapile));
            // System.out.println(mapile.depiler(mapile));
            //mapile.afficher(mapile);
            n2--;
        }
        
        System.out.println("Depilement");

       // System.out.println("teste pile vide:" + mapile.pileVide(mapile));
        JOptionPane.showMessageDialog(frame,"Test de la pile Vide : " +mapile.pileVide(mapile) );
        JOptionPane.showMessageDialog(frame,"Test de la pile Pleine : " +mapile.pilePleine(mapile) );


    }
}
