import java.util.Random;
class CSoal
{
    public static void main(String Args[])
    {
        Random Rnd = new Random();
        int Bil;
        int I=0;
        while(I<=10)
        {
            Bil=Rnd.nextInt(100);
            if(Bil >0)
            {    
                System.out.println(Bil);
                I++;
            }    
        }
    }
}