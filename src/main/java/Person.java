class Person implements Comparable<Person>
{

  String name;
  int age;

  public Person(String n, int a)
  {
    this.name = n;
    this.age = a;
  }

  // compare first by name, secondly by age
  public int compareTo(Person p)
  {

    // compare by name first
    if (this.name.compareTo(p.name) < 0)
    {
      return -1;
    }
    if(this.name.compareTo(p.name) > 0)
    {
      return 1;
    }

    // compare by age second
    return this.age - p.age;
    
  }
  
}