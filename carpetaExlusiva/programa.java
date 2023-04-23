public class contador{

    public static void main (String[] abc){
        int cant =sumame(3,2);
        int result=dividir(cant,3); 
        System.out.print(cant+"  "+result);

    }
    public static int sumame (int cant,int total){
        for(int i=0;i<cant;i++){
            total=total+1;
        }
        return total;

    }
    public  static int dividir(int total, int sobre){
        int cant =0;
        if(sobre>0){    
            while(total>=sobre){
                total-=sobre;
                cant++;
            }
        }

        return cant;

    }
    public static int multiplicar(int multiplando, int multiplicador){
        int total=0;
        for(int i=0;i<multiplicador;i++){
            total+=multiplando;
        }
        return total;

    }


}