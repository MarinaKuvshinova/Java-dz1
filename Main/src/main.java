import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<MyClass> m = new TreeSet<MyClass>(
				((Comparator<MyClass>)(x1,x2) -> {
					return x1.text.charAt(0) - x2.text.charAt(0);
				}).thenComparing((Comparator<MyClass>)(x1,x2) -> {
					return x1.text.length()-x2.text.length();
				})
			);
		m.add(new MyClass("Halo"));
		m.add(new MyClass("Crazy in love"));
		m.add(new MyClass("Drunk in Love"));
		m.add(new MyClass("Single Ladies"));
		m.add(new MyClass("Irreplaceable"));
		m.add(new MyClass("Cry"));
		m.add(new MyClass("Formation"));
		m.add(new MyClass("Partition"));
		m.add(new MyClass("Run the World"));
		m.add(new MyClass("Love on Top"));
		m.add(new MyClass("Baby Boy"));
		m.add(new MyClass("XO"));

		for(MyClass a:m) {
			System.out.println(a);
		}
	}

}

class MyClass{
	String text;
	public MyClass(String text){
		this.text = text;
	}
	@Override
	public String toString() {
		return "MyClass [text=" + text + "]";
	}
	
}
