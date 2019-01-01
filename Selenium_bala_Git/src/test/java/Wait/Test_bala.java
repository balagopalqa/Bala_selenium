package Wait;

import org.testng.annotations.Test;

public class Test_bala {
@Test(priority=2)
	public void b() {
	System.out.println("A");
}

@Test(priority=2)
public void a() {
System.out.println("B");
}

@Test(priority=3)
public void c() {
System.out.println("C");
}
@Test(priority=4)
public void d() {
System.out.println("D");
}
}
