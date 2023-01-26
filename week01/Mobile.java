package week01;

public class Mobile 
{   public static void main(String[] args)
    {Mobile functions=new Mobile();
        functions.call();
        functions.picture();
        functions.message();
        functions.document();
    }
    public void call()
    {System.out.println("make a call");
    }
    public void message()
    {System.out.println("send a message");
    }
    public void picture()
    {System.out.println("take a picture");
    }
    public void document()
    {System.out.println("openthe document");
    }
}
