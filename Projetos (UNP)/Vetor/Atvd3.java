public class Atvd3 {
    public static void main(String[] args) {
        int n = 0, i, qNum_p =0;
        for (i = 0; i<=20; i++){
            if (i % 2 == 0){
                qNum_p++;
            }
        }
        int [] núm_p = new int[qNum_p];
        for (i = 0; i<=20; i++ ){
            if(i % 2 == 0){
                núm_p[n] = i;
                n++;
            }
        }
        for (n = 0; n < 11; n++){
            System.out.println(núm_p[n]);
        }
    }
}
