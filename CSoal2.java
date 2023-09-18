class CSoal2
{
    public static void main(String Args[])
    {
        StringBuffer Sb1 = new StringBuffer("Sistem Basis Data");
        StringBuffer Sb2 = new StringBuffer();
        char Kar;
        for(int I=0 ; I<=Sb1.length()-1; I++)
        {
            Kar=Sb1.charAt(I);
            if(Kar!=' ')
            {
                Sb2.append(Kar);
            }
            else
            {
                System.out.print(Sb2.reverse());
                System.out.print(" ");
                Sb2.delete(0, Sb2.length());
            }
        }
        System.out.println(Sb2.reverse());
    }
}