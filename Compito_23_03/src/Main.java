String capitalize(String s){
    String l="";
    if(s.matches("^[a-zA-Z\\s]*$")) {
        for (int i = 0; i < s.length(); i++) {

            if (i == 0 || s.charAt(i - 1) == ' ') {
                char b = Character.toUpperCase(s.charAt(i));
                l = l + b;
            } else {
                l = l + s.charAt(i);
            }
        }
    }
    return l;
}
void main() {
    String s1 = IO.readln("inserisci una frase: " );
    String b= capitalize(s1);
    IO.println(b);
}
//Character.isLetter() e Character.isWhitespace() metodi per controllare se un carattere
// è una lettera e uno spazio bianco