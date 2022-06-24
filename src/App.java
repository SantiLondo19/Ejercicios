public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("La suma es: "+sum(421,3213,42));
        coche primerCoche = new coche(4);
        primerCoche.addDoors(2);
        System.out.println("El coche tiene "+primerCoche.getNumeroPuertas()+" puertas");

    }

    public static int sum(int n1, int n2, int n3){
        return n1+n2+n3;
    }
}
