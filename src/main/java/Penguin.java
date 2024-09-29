class Penguin implements Comparable<Penguin>
{

    String name;
    double height;
    double weight;

    public Penguin(String name, double height, double weight)
    {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    // first compare Penguins by height, then compare by weight
    public int compareTo(Penguin other)
    {

        // compare by heights - sign of return value is based on that comparison
        if (this.height < other.height)
        {
            return -1;
        }
        if (this.height > other.height)
        {
            return 1;
        }
       
        // they have the same height ... so now compare by weight
        if (this.weight < other.weight)
        {
            return -1;
        }
        if (this.weight > other.weight)
        {
            return 1;
        }

        // they have the same height and weight so return 0 signifying equal
        return 0;      
      
    }

    // this "aligns" with compareTo because this returns true when compareTo returns 0
    // in the case where their heights and weights are equal
    public boolean equals(Object other)
    {
        if (other == null)
        {
            return false;
        }
        if (!(other instanceof Penguin))
        {
            return false;
        }

        Penguin otherPenguin = (Penguin) other;

        return this.height == otherPenguin.height && this.weight == otherPenguin.weight;
    }
  
}