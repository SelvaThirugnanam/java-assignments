package week01;

public class Car
{
      public static void main(String[] args) 
      {Car functions=new Car();
         functions.start();
         functions.clutch();
         functions.gear();
         functions.accelerator();
         functions.steering();
      }
      
      public void start()
      {System.out.println("start the car");
      }
      public void clutch()
      {System.out.println("press the clutch pedal");
      }
      public void gear()
      {System.out.println("shift the gear and release the clutch");
      }
      public void accelerator()
      {System.out.println("slowly press the accelerator");
      }
      public void steering()
      {System.out.println("steer the car and drive ");
      }
}

