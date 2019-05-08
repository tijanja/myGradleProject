package hello;

import org.joda.time.LocalTime;

public class Hello{

       public static void main(String[] args)
       {
          Good good = new Good();
		LocalTime localtime  = new LocalTime();
		System.out.println(good.print()+" "+localtime);
	}
}
