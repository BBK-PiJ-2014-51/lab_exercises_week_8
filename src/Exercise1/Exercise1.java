package Exercise1;
public class Exercise1{
	public static void main(String[] args) {
		Supermarket store = new Supermarket();
		store.insert(new Person("John"));
		store.insert(new Person("Tom"));
		store.insert(new Person("Beth"));
		store.insert(new Person("Kate"));
		store.retrieve().printName();
		store.retrieve().printName();
		store.retrieve().printName();
		store.retrieve().printName();
	}
}