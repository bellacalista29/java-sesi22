public class HelloCimb {
    public static void main(String[] args) {
        Boolean happy = true;
        boolean sad = false;
        if(happy)
        {
            System.out.println(happy.toString());
        }
        else
        {
            System.out.println("I am sad");
        }

        int maxDistance = 10;
        int distanceToHome = 11;

        if(distanceToHome > maxDistance)
        {
            System.out.println("You don't get the discount");
        }

        if(distanceToHome <= maxDistance)
        {
            System.out.println("Yay! You get the discount!");
        }

        int speed = 90;
        int maxSpeed = 100;
        int speedForFine = 110;

        if(speed > maxSpeed)
        {
            System.out.println("Anda melanggar batas kecepatan");
        }
        else if(speed > speedForFine)
        {
            System.out.println("Anda didenda");
        }
        else
        {
            System.out.println("Anda tidak melanggar");
        }

        String nama1 = "A";
        String nama2 = "a";

        int hasil = nama1.compareTo(nama2); // compare string dengan total unicode
        System.out.println(hasil);
        if(hasil < 0)
        {
            System.out.println("nama1 < nama2");
        }
        else if(hasil == 0)
        {
            System.out.println("nama1 = nama2");
        }
        else
        {
            System.out.println("nama1 > nama2");
        }
    }
}