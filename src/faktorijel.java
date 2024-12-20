public class faktorijel {
    public static void main(String[] args) {
        int x = 3;
        faktorijel(x);
    }
    public static void faktorijel(int x){
        int [] niz = new int [x];
        for (int i = niz.length - 1; i > -1; i--){
            niz[i] = x;
            x--;

        }
        int y = 1;
        for (int i = 0; i < niz.length; i++){

            y *= niz[i];

        }
        System.out.println(y);

    }
}
