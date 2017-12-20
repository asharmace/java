import com.google.common.base.Optional;

class GuavaTut1{

	public static void main(String args[]){
		GuavaTut1 gt1 = new GuavaTut1();
		System.out.println("Hello World");

		Integer x = null;
		Optional<Integer> a = Optional.of(x);
		Optional<Integer> b = Optional.of(new Integer(5));

		System.out.println(gt1.sum(a,b));
	}

	public Integer sum(Optional<Integer> a, Optional<Integer> b)
	{
		return a.get() + b.get();
	}
}