package day11.StringClass;



public class Rudra{
            private Rudra()
            {
                    System.out.println( "hhhhhhhhhh");
}
            public static Rudra R=new Rudra(); // ---static reference variable
           public static Rudra getObject()
           {
             return R;
             }
}

class AArya{
	public static void main(String[] args) {
		Rudra R1=Rudra.R.getObject();
		R1.getObject()
;	}
}