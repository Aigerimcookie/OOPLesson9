public class RecRec {//разные типы данных

     int Rec ( int a, int b){

        return a*b;
    }

     double Rec (double d, double p){
        return d*p;
    }


    public static void main(String[] args) {
        RecRec r = new RecRec();
        System.out.println(r.Rec(2,3));
        System.out.println(r.Rec(5.5, 2.3));


    }
}
