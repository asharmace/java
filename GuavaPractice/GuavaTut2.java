import com.google.common.base.Optional;

class GuavaTut2{
   public static void main(String args[])
   {
      GuavaTut2 gt2 = new GuavaTut2();
      System.out.println("GuavaTut2");

      Integer x = null;

      Optional<Integer> a = Optional.fromNullable(x);
      Optional<Integer> b = Optional.of(new Integer(5));

      System.out.println(gt2.sum(a, b));
   }

   public Integer sum(Optional<Integer> a, Optional<Integer> b)
   {
      System.out.println("Value a is present " + a.isPresent());
      System.out.println("Value b is present " + b.isPresent());

      return a.or(new Integer(5)) + b.or(new  Integer(10));
   }
}