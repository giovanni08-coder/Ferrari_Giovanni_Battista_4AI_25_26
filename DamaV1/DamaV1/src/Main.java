//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Pedina.Colore colore = Pedina.Colore.NERO;

    Pedina pedina = null;
    try {
        pedina = new Pedina(2,2,colore);
        pedina.muovi(1,3);
    } catch (DamaException e) {
        throw new RuntimeException(e);
    }

}
