package pl.camp.it;

public class Kucharz {

    public static void main(String[] args) {
        System.out.println(Oblicz(1,3,1));
        System.out.println(Oblicz(5,3,3));
        System.out.println(Oblicz(1,10,20));
    }

    public static int Oblicz(int j, int p, int z){
        for(int i = 0; i < z; i++){
            if(j <= p){
                j++;
            }else{
                p++;
            }
        }
        return Math.abs(j-p);
    }


}
