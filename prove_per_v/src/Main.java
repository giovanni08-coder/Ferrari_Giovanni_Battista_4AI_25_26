//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
void main() throws IOException {
    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //String b=br.readLine()
    //Scanner scanner = new Scanner(System.in); // crea un oggetto Scanner per leggere da tastiera
    //System.out.print("Inserisci un numero intero: ");
    //int numero = scanner.nextInt(); // legge un intero inserito dall'utente
    //scanner.nextLine();
    //System.out.println(numero);
    /*int n=0;
    String b=IO.readln("inserisci un numero");
    try {
        n=Integer.parseInt(b);
    }catch (Exception e ){
        System.out.println("il valore che hai inserito non è un numero");
    }
    System.out.println(n);*/
    /*
    String b=IO.readln("inserisci un numero");
    int n=Integer.parseInt(b);
    int conts=0;
    do{
        System.out.println("#");
        conts=conts + 3;
    }while(conts < n);
    List<String> names = new ArrayList<String>();
    names.add( "Sophie" );
    names.add( "Tim" );
    names.add( "Anna" );
    names.add( "John" );
    names.add( "Melissa" );
    // for each loop
    for(String name: names){
        System.out.println(name);
    }*/
    /*System.out.println("Inserisci una stringa");
    String s =IO.readln();
    String l="";
    if(s.matches("[a-zA-Z\\s]*$")) {
        for (int i = 0; i < s.length(); i++) {

            if (i == 0 || s.charAt(i - 1) == ' ') {
                char b = Character.toUpperCase(s.charAt(i));
                l = l + b;
            } else {
                l = l + s.charAt(i);
            }
        }
    }else {
        System.out.println("No");
    }*/
    /*String s="ppapapap";
    List<String> b=new ArrayList<>();
    System.out.println(s.concat(" la"));
    String [] wor=s.split("");
    for (String a:wor){
        System.out.println(a);
    }*/
    /*int[] w = {8, 5, 4, 2, 1};
    int temp = 0 ;
    for (int i = 1; i < w.length; i++) {
        for (int j = i; j > 0; j--){

            if (w[j]<w[j-1]){
                temp=w[j];
                w[j]=w[j-1];
                w[j-1]=temp;
            }
        }


    }
    for (int d=0;d<w.length;d++) {
        System.out.println(w[d]);
    }*/
    String s="  ppapapap  ";
    System.out.println(s.strip());
    System.out.println(s);

}