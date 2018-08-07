package day2.java;

public class ShoppingClient {

	public static void main(String[] args) {

//		ShoppingLogic sl1 = new ShoppingLogic("Harry",6);
//		ShoppingLogic sl2 = new ShoppingLogic("Harry",6);
//		ShoppingLogic sl3 = new ShoppingLogic("Harry",6);

		Thread t1 = new Thread(new ShoppingLogic(), "Vishal");

		t1.setPriority(6);
		t1.start();

		Thread t2 = new Thread(new ShoppingLogic(), "Param");

		t2.setPriority(7);
		t2.start();

		Thread t3 = new Thread(new ShoppingLogic(), "Amie");

		t3.setPriority(8);
		t3.start();

		for (int i = 0; i < 500; i++) {
			System.out.println("I value is " + i + " in thread " + Thread.currentThread().getName() + " with priority "
					+ Thread.currentThread().getPriority());

		}

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Thread :" + Thread.currentThread().getName() + " exiting!!");

	}

}
