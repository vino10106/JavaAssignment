class MyException extends Exception
{
  private int exception1;
  MyException(int a)
  {
    exception1 = a;
  }
  public String toString()
  {
    return "a value should not be zero";
  }
}

class JavaException
{
  static void div(int a,int b) throws MyException
  {
    if(a==0)
    {
      throw new MyException(a);
    }
    else
    {
      System.out.println(b/a);
    }
  }

  public static void main(String[] args)
  {
    try
    {
      div(0, 10);
    }
    catch(MyException k)
    {
      System.out.println(k);
    }
  }
}