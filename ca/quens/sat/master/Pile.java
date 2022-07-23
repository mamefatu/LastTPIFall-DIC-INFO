package ca.quens.sat.master;

public class Pile {
    private int sommet;
    private int[] maPile;
    private int tailleMax;

    public void setTailleMax(int tailleMax) {
        if (tailleMax > 0) {
            this.tailleMax = tailleMax;
        }
    }                                                      

    public Pile(int n) {
        this.setTailleMax(n);
        this.maPile = new int[tailleMax];
         this.sommet = -1;
        
    }
    public int getSommet(){
        return maPile[sommet];
    }

    public boolean pileVide(Pile p) {
        if (p.sommet == -1){
            return true;
        } else return false;
        
    }

    public boolean pilePleine(Pile p) {
        if ((tailleMax) == (sommet ))
            return true;
        else return false;
    }

    public void empiler(Pile p, int element) {
        if (pilePleine(p)) {
            throw new Error("La pile est pleine impossible d'empiler");
        } else {
            maPile[sommet + 1] = element;
            sommet++;
        }
       
        System.out.println(+ element);
        
    }

   public int depiler(Pile p) {
    
        if (pileVide(p)) {
            throw new Error("La pile est vide impossible de depiler");
        } else {
           
            sommet--;
            return maPile[sommet + 1];
        }
    }

   public String afficher(Pile p) {
    int n = sommet;
    String response = "[";
    if(pileVide(p)) {
        return "[]";
    }
    while(n >= 0) {
        response += ""+maPile[n] +", ";   
        n--;
    }
    response += "]";  
    return response;   
    }

}