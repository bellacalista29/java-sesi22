public class fpb {
    public static void main(String[] args) {
        int angka1 = 12;
        int angka2 = 20;
        int fpb = 0;
        for(int i=1; i<=angka1 && i<=angka2; i++)
        {
            if(angka1%i == 0 && angka2%i == 0)
            {
                fpb = i;
            }
        }
        System.out.println(fpb);
    }

}
