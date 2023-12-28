class abc
{
    void Share(int x,int y)
    {
        x++;
        y++;
    }
}
class Value
{
    public static void main(String args[])
    {
        int x=10,y=20;
        System.out.println(x);
        System.out.println(y);
        abc obj = new abc(); 
        obj.Share(x,y);
        System.out.println(x);
        System.out.println(y);
    }
}