package ca.queens.sat.master;


public class Pile {
    private int taille= 10;
    private int position;
    int [] p;

    public Pile (int taille) { 
        p = new int[taille];
        position = -1;     
        }

    public boolean pileVide( ){
        return position==0;
    }

    public boolean pilePleine( ){
        return taille == position;
    }


    void empiler(int element){
        if (pilePleine()){
            throw new Error("Pile pleine");
        }
        p[position+1] = element;
        position++;
      }

      int depile(){
        if (pileVide()){
            throw  new  Error("Pile Vide");
        }
        position--;  
        return p[position+1];      
     }

   


}
