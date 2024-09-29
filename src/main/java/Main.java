public class Main
{
  public static void main(String[] args)
  {
    String s1 = "shinyApple542";
    String s2 = "shinyOrange897";
    System.out.println(s1.compareTo(s2));

    Penguin p1 = new Penguin("Peppy", 20.8, 15.6);
    Penguin p2 = new Penguin("Hal", 25.6, 17.4);
    
    // p1 < p2
    if(p1.compareTo(p2) < 0)
    {
      
    }
    // p1 > p2
    else if(p1.compareTo(p2) > 0)
    {
      
    }
    // p1 equals p2
    else
    {
      
    }
    
  }
}