
void main() {
    //Mago m = new Mago("Gjini");
    //System.out.println(m);
    List<Personaggio> personaggi =Arrays.asList(new Personaggio("lapo"),new Personaggio("manila"),new Personaggio("Franci")
    ,new Zombie("Frank"));
    try{
        Gfg.Scrivi_binario(personaggi);
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
    try {
        Gfg.Leggi_binario();
    } catch (Exception e) {
        throw new RuntimeException(e);
    }


}
