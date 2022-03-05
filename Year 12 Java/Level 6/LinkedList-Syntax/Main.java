import java.util.*;
class Main {
  public static void main(String[] args) {
  LinkedList<String> names=new LinkedList<String>();
  LinkedList<Integer> ages=new LinkedList<Integer>();
    //Reading values into a LL
    Scanner kb=new Scanner(System.in);
    for(int i=0;i<3;i++)
    {
      System.out.println("Enter name:");
      names.add(kb.nextLine());
      System.out.println("Enter age:");
      ages.add(Integer.parseInt(kb.nextLine()));
    }
    //Bubble Sort
    for(int i=0;i<names.size();i++)
    {
      for(int j=0;j<names.size();j++)
      {
        if(ages.get(i)>ages.get(j))
        {
          //Swap
          int temp=ages.get(i);
          ages.set(i,ages.get(j));
          ages.set(j,temp);
        }
      }
    }
    System.out.println(ages);
  }
}
