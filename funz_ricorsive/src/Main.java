public int fattoriale(int n){
    if (n==1) return 1;
    return n*fattoriale(n-1);
}
public int fibonacci(int n){
    if (n==1 || n==2) return 1;
    return fibonacci(n-1) + fibonacci(n-2);
}
public int fattoriale2(int n){
    int risulato = 1;
    for (int i=n; i>=1;i--){
        risulato= risulato*i;
    }
    return risulato;
}
void main() {
    System.out.println(fattoriale(5));
    System.out.println(fibonacci(3));
    System.out.println(fattoriale2(3));
}
