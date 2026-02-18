import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Esotico extends Frutto {
    private String provenienza;
    private double prezzoAlpezzo;

    public Esotico(String provenienza, double prezzoAlpezzo,String nome,String id, boolean rischioAllergia) {
        super(id,nome,rischioAllergia);
        this.provenienza = provenienza;
        setPrezzoAlpezzo(prezzoAlpezzo);
    }

    private void setPrezzoAlpezzo(double prezzoAlpezzo) {
        if (prezzoAlpezzo<=0){
            throw new IllegalArgumentException("Non puoi inserire questo prezzo");
        }
        this.prezzoAlpezzo = prezzoAlpezzo;
    }

    @Override
    public double ScontoMax() {
        double sconto =0;
        List<String> paesi = Arrays.asList("Brasile","Argentina","Paraguay","Chile","Colombia");
        List<Double> sconti = Arrays.asList(0.90,0.34,0.18,0.16);
        for(int i = 0;i < paesi.size() ;i++){
            if (paesi.get(i).equals(provenienza)){
                sconto = sconti.get(i);
            }
            if (isRischioAllergia()==true){
                sconto += 0.11;
            }

        }
        if (sconto==0.11 || sconto==0){
            sconto+= 0.08;
        }
        return sconto;
    }

    @Override
    public String toString() {
        return "Esotico{" + super.toString() +
                "provenienza='" + provenienza + '\'' +
                ", prezzoAlpezzo=" + prezzoAlpezzo +
                '}';
    }
}
