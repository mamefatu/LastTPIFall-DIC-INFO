package sn.esp.dgi.master;
import fr.saclay.mai.master.Fraction;
import javax.swing.*;

public class Test {
    public static void main (String args[]) {

     JFrame frame = new JFrame();
     int num = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter Numerator"));
     int dem = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter Denominator"));
     int num2 = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter Numerator 2"));
     int dem2 = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter Denominator 2"));
     Fraction f = new Fraction(num,dem);
     Fraction f2 = new Fraction(num2, dem2);
     String Stringf;
     String reducedString;
     String inversedString;
      if(f.estReductible(f)){
        Stringf = f.afficher(f);
        f.reduce();
        reducedString = f.afficher(f);
        f.inverser(f);
        inversedString = f.afficher(f);
        System.out.println ("la fraction est reductible et sa forme simplifiée est");
        JOptionPane.showMessageDialog(frame," la fraction " + Stringf +" est reductible et sa forme simplifiée est" + " : " + reducedString + "Et son inverse est : " + inversedString);
        //f.afficher(f);
        
      }
      else{

        Stringf = f.afficher(f);
        f.inverser(f);
        inversedString = f.afficher(f);
        //System.out.println (" n'est pas reductible") ;
        JOptionPane.showMessageDialog(frame,Stringf+" n'est pas reductible. Son inverse est : "+inversedString);

      }
    

      if(f2.estReductible(f2)){
        Stringf = f2.afficher(f2);
        f2.reduce();
        reducedString = f2.afficher(f2);
        f2.inverser(f2);
        inversedString = f2.afficher(f2);
        System.out.println ("la fraction est reductible et sa forme simplifiée est");
        JOptionPane.showMessageDialog(frame," la fraction " + Stringf +" est reductible et sa forme simplifiée est" + " : " + reducedString + "Et son inverse est : " + inversedString);
        //f.afficher(f);
        
      }
      else{

        Stringf = f2.afficher(f2);
        f2.inverser(f2);
        inversedString = f2.afficher(f2);
        //System.out.println (" n'est pas reductible") ;
        JOptionPane.showMessageDialog(frame,Stringf+" n'est pas reductible. Son inverse est : "+inversedString);

      }
    String sum;
    String mul;
    String dif;
    String div;  
    f.inverser(f);
    f2.inverser(f2);
   
    Fraction som = f.somme(f2);
   sum = som.afficher(som);

   Fraction produit= f.multiplier(f2);
   mul = produit.afficher(produit);
   
   Fraction diff= f.difference(f2);
   dif = produit.afficher(diff);
   
   Fraction quotient= f.diviser(f2);
   div = quotient.afficher(quotient);
   
   JOptionPane.showMessageDialog(frame,"Leur somme donne : "+ sum + ". Leur Produit donne : "+ mul +". Leur différence donne : "+ dif+". Leur division donne : "+div);
  
  
  
    } }
    