import java.util.ArrayList;
import java.util.List;

public class Nodo {
    private Stato stato;
    private String ip;
    private String nomeRouter;

    public Nodo(Stato stato, String ip) {
        this.stato = stato;
        setIp(ip);
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    public String getNomeRouter() {
        return nomeRouter;
    }

    public void setNomeRouter(String nomeRouter) {
        this.nomeRouter = nomeRouter;
    }

    public Stato getStato() {
        return stato;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        if (ip==null || ip.isEmpty()){
            throw new IllegalArgumentException("Non puoi inserire questo ip");
        }
        if (ip.substring(0, 1).equals(".") || ip.substring(ip.length() - 1).equals(".")){
            throw new IllegalArgumentException("L'ip deve cominciare per forza con un numero");
        }
        String[] partiDinum = ip.split("\\.");
        if (partiDinum.length != 4){
            throw new IllegalArgumentException("Errore Lunghezza stringa");
        }

        for (String parti: partiDinum){
                int n = Integer.parseInt(parti);
                if(n<0 || n>255){
                    throw new IllegalArgumentException("Non puoi inserire questi numeri");
                }
        }


        this.ip = ip;
    }

}
