//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() throws Exception {
    Albero alberoBase = new Albero();
    Gfg.Leggi_binario();
    FinestraDomande finestra = new FinestraDomande(alberoBase.getRadice());
    Gfg.Scrivi_binario(alberoBase);
  }
