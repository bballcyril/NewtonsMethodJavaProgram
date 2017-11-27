package cisy105.cmaandal;

/**
 *
 * @author g00265399
 */
public class Term {
    
    private double c;
    private double exponent;
    private double c2;
    private Term[] e;
    public Term(double c,double exponent,double c2){
        this.c =c;
        this.c2=c2;
        this.exponent = exponent;
    }
    public Term(Term[] e){
        this.e = e;
    }
    public Term(double c,double exponent){
        this.c =c;
        this.c2=0;
        this.exponent = exponent;
    }
    public void setC(double c){
        this.c =c;
    }
    public void setExponent(double exp){
        this.exponent =exp;
    }
    public void setB(double b){
        this.c2 = b;
    }
    public String toString(){
        return c+"x^"+exponent;
    }
    public double solve(double x){
        return c*(Math.pow(x,exponent))+c2;
    }
    public double solveAll(Term[] e,double x){
        double total=0;
        for(int i=0;i<e.length;i++){
            total+=e[i].solve(x);
        }
        return total;
    }
}

