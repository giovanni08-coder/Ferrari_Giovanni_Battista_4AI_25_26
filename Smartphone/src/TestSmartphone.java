void main() {
    Smartphone s1 = new Smartphone();
    s1.setMarca(IO.readln("Inserisci la marca dello smartphone"));
    s1.setModello(IO.readln("Inserisci il modello dello smartphone"));
    s1.setPrezzoDiLancio(Double.parseDouble(IO.readln("Inserisci il prezzo di lancio dello smartphone")));
    s1.setNumPollici(Double.parseDouble(IO.readln("Inserisci i pollici dello smartphone")));
    s1.setRam(Double.parseDouble(IO.readln("Inserisci la ram dello smartphones")));
    s1.setTouchscreen(Boolean.parseBoolean(IO.readln("Touchscreen (true o false)")));


    Smartphone s2= new Smartphone();
    s2.setMarca(IO.readln("Inserisci la marca dello smartphone"));
    s2.setModello(IO.readln("Inserisci il modello dello smartphone"));
    s2.setPrezzoDiLancio(Double.parseDouble(IO.readln("Inserisci il prezzo di lancio dello smartphone")));
    s2.setNumPollici(Double.parseDouble(IO.readln("Inserisci i pollici dello smartphone")));
    s2.setRam(Double.parseDouble(IO.readln("Inserisci la ram dello smartphones")));
    s2.setTouchscreen(Boolean.parseBoolean(IO.readln("Touchscreen (true o false)")));
    s2 = new Smartphone(s2.getMarca(),s2.getModello(),s2.getPrezzoDiLancio(),s2.getNumPollici(),s2.getRam(), s2.getTouchscreen());
    System.out.println(s2.toString());
}