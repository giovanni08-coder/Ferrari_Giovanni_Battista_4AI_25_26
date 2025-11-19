void main() {
    TriangoloRettangolo t1 = new TriangoloRettangolo();
    TriangoloRettangolo t2 = new TriangoloRettangolo(3,4);
    System.out.println(t1.toString());
    System.out.println(t2.toString());

    System.out.println("Il rettangolo maggiore è");
    if (t1.calcoloArea()>t2.calcoloArea()){
        System.out.println(t1.toString());
    }
    else System.out.println(t2.toString());
}
