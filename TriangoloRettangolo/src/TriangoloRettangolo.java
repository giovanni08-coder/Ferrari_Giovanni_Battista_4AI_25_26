public class TriangoloRettangolo {
    double cateto1;
    double cateto2;

    public TriangoloRettangolo(){
        cateto1 = 4;
        cateto2 = 5;
    }
    public TriangoloRettangolo(double cateto1,double cateto2){
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }

    public double getCateto1() {
        return cateto1;
    }

    public void setCateto1(double cateto1) {
        if (cateto1 < 2){
            throw new IllegalArgumentException("la misura del cateto1 non può misurare così poco");
        }
        this.cateto1 = cateto1;
    }

    public double getCateto2() {
        return cateto2;
    }

    public void setCateto2(double cateto2) {
        if (cateto2 < 2){
            throw new IllegalArgumentException("la misura del cateto2 non può misurare così poco");
        }
        this.cateto2 = cateto2;
    }
    public double calcolaIpotenusa(){
        return Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2) );
    }
    public double calcoloArea(){
        return (cateto1*cateto2)/2;
    }
    public  double calcolaPerimetro(){
        return cateto1 + cateto2 + calcolaIpotenusa();
    }

    @Override
    public String toString() {
        return "TriangoloRettangolo{" +
                "cateto1=" + cateto1 +
                ", cateto2=" + cateto2 +
                ", ipotenusa=" + calcolaIpotenusa() +
                ", Area=" + calcoloArea() +
                ", perimetro=" + calcolaPerimetro() +
                '}';
    }
}
