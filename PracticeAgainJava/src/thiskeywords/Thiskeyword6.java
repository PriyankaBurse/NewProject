package thiskeywords;

class Thiskeyword6
{
    int a;
    int b;     
    // Parameterized constructor
    Thiskeyword6(int a, int b)
    {
        this.a = a;
        this.b = b;
    } 
    void display()
    {
        //Displaying value of variables a and b
        System.out.println("a = " + a + "  b = " + b);
    } 
    public static void main(String[] args)
    {
    	Thiskeyword6 object = new Thiskeyword6(10, 20);
        object.display();
        System.out.println(object.a+" "+object.b);//10 20
        Thiskeyword6 object2 = new Thiskeyword6(102, 201);
        object2.display();
        System.out.println(object2.a+" "+object2.b);//102  201
    }
}