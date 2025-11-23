void main() {
    Stack<Integer> stack = new Stack<Integer>();
    System.out.println(stack);
    Rastrelliera r = new Rastrelliera(7,"A");
    Stack<Integer> t = new Stack<>();
    r.InserisciDisco(r,new Disco(1));
    r.InserisciDisco(r,new Disco(2));
    r.InserisciDisco(r,new Disco(3));
    r.InserisciDisco(r,new Disco(4));
    r.InserisciDisco(r,new Disco(5));
    r.InserisciDisco(r,new Disco(6));
    r.InserisciDisco(r,new Disco(7));
    System.out.println(r.RastrellieraCompleta(r));

}
