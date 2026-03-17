public abstract class Calcolatrice {

    public static double somma(double a, double b) {
        if ((int)a==a && (int) b==b){
            return (int)  (a+b);
        }
        return a+b;

    }
    public static double sottrazione(double a, double b) {if ((int)a ==a && (int) b==b){
        return (int) (a-b);
    }return a - b;}
    public static double moltiplicazione(double a, double b){
        if ((int)a ==a && (int) b==b){
            return (int)  (a*b);
        }
        return a*b;}
    public static double divisione(double a, double b){if (b==0){throw new ArithmeticException("Non dividere per 0");}
        if ((int)a ==a && (int) b==b){
        return (int)  (a/b);
    }return a/b;}

    public static double radice(double a,double tipoRadice){if (a<=0 && tipoRadice>1){throw new ArithmeticException("Non puoi fare la radice");}
        return Math.pow(a,tipoRadice) ;}

    public static double potenza(double a,double esponente){if (esponente<2){throw new ArithmeticException("Non puoi fare la potenza");}
        return Math.pow(a,esponente) ;}
}