import java.nio.channels.Pipe;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class ContoCorrente {
    private String intestatario;
    private double saldo;
    private String numeroConto;
    private String pin;
    private LocalDate apertura;
    private List<Transazione> movimenti;
    private static int id = 0;

    public ContoCorrente(String intestatario) {
        setIntestatario(intestatario);
        id++;
        InserisciNumeroContoRandomico();
        saldo=0;
        InserisciPinRandomico();
        apertura = LocalDate.now();
        this.intestatario = intestatario;
    }

    private void InserisciNumeroContoRandomico() {
        String stringa ="";
        stringa += intestatario.substring(0,4);

        this.numeroConto = stringa + id;
    }

    private void InserisciPinRandomico() {
        Random r = new Random();
        for (int i=0; i< 6 ;i++){
            pin += r.nextInt(0,10);
        }
    }

    public void setApertura(LocalDate apertura) {
        this.apertura = apertura;
    }

    public void setIntestatario(String intestatario) {
        if (intestatario.trim().isEmpty() || !(intestatario.matches("[a-zA-Z]"))){
            throw new IllegalArgumentException("Non puoi inserire questo intestatario");
        }
        this.intestatario = intestatario;
    }

    public String getPin() {
        return pin;
    }

    public String getNumeroConto() {
        return numeroConto;
    }
    public void Bonifco(ContoCorrente dest,double importo,String causale){
        if (saldo<0){
            throw new IllegalArgumentException("Non puoi inserire ");
        }
        if (importo<0.1){
            throw new IllegalArgumentException("Non puoi fare un bonico senza fare soldi");
        }
        else {
            movimenti.add(new Transazione(intestatario, dest.intestatario, importo,LocalDate.now(),causale ));
            saldo-= importo;
            dest.saldo += importo;
        }

    }
}
