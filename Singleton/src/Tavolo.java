import javax.swing.*;

public class Tavolo extends JFrame {
    private static Tavolo instanza;


    public static Tavolo getIstance(){
        if (instanza==null){
            instanza = new Tavolo();
        }
        return instanza;
    }
    private Tavolo(){

        super();
        setTitle("Franco");

        setSize(400, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        setVisible(true);

    }

}
