package fr.saclay.mai.master;
import javax.swing.*;

public class Fraction {
    int numerateur ; 
    int denominateur;
    JFrame frame = new JFrame();

    public Fraction(int numr, int denr) {
      this.numerateur = numr;
      this.denominateur = denr;
        }
    
    public int getNumerateur() {
      return this.numerateur;
        }
    
    public void setNumerateur(int numr) {
      this.numerateur = numr;
        }
    
    public int getDenominateur() {
      return this.denominateur;
        }
    
    public void setDenominateur(int denr) {
      this.denominateur = denr;
        }
    public void inverser(Fraction f){
      int n1 = f.getNumerateur();
      int n2 = f.getDenominateur();
      f.setNumerateur(n2);
      f.setDenominateur(n1);
    }
    public Fraction somme (Fraction f){
        int numer = (numerateur * f.getDenominateur()) + 
        (f.getNumerateur() * denominateur);
int denr = denominateur * f.getDenominateur();
return new Fraction(numer, denr);
    }
    public Fraction difference(Fraction f){
      int newNumerator = (numerateur * f.denominateur) - 
      (f.numerateur * denominateur);
  int newDenominator = denominateur * f.denominateur;
  Fraction result = new Fraction(newNumerator, newDenominator);
  return result;
    }
    public boolean estReductible(Fraction f){
      boolean valeur = true;
      int pgcd;
      int n1 = f.getNumerateur();
      int n2 = f.getDenominateur();
          while (n1 != n2) {
            if(n1 > n2)
                  n1 = n1 - n2;
              else
                  n2 = n2 - n1;
          }
          pgcd= n2;
          if(pgcd==1)valeur = false;
      return valeur;
      }
    public String afficher(Fraction f){
        String response;
      if (f.getDenominateur()!=0){
        response = f.getNumerateur()+" / "+f.getDenominateur();
        //JOptionPane.showMessageDialog(frame, f.getNumerateur()+" / "+f.getDenominateur());
        System.out.println (f.getNumerateur()+" / "+f.getDenominateur());
  
      } else {
        response = "Le dénominateur ne peut pas etre nul! Choisissez un autre";
        System.out.println ("Le dénominateur ne peut pas etre nul! Choisissez un autre");
      }
      return response;
  
    }  
    /**
     * @param f
     */
    
     public int calculateGCD(int numerateur, int denominateur) {
      if (numerateur % denominateur == 0) {
                 return denominateur;
            }
      return calculateGCD(denominateur, numerateur % denominateur);
      }
  
      public void reduce() {
        int gcd = calculateGCD(numerateur, denominateur);
        numerateur /= gcd;
        denominateur /= gcd;
          }
      
  
     public Fraction multiplier(Fraction f){
      int newNumerator = numerateur * f.numerateur;
      int newDenominator = denominateur * f.denominateur;
      Fraction result = new Fraction(newNumerator, newDenominator);
      return result;
     }
  
     public Fraction diviser(Fraction f){
      int newNumerator = numerateur * f.getDenominateur();
      int newDenominator = denominateur * f.numerateur;
      Fraction result = new Fraction(newNumerator, newDenominator);
      return result;
    }


    @Override
    public String toString() {
  return this.numerateur + "/" + this.denominateur;
    }
  }