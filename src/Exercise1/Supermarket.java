package Exercise1;

public class Supermarket implements PersonQueue{
	static Person head;
	int queueLength;
	
	
	public Supermarket(){
		head = new Person("Empty Node", -1);
		queueLength = 0;
	}
	
	@Override
	public void insert(Person person) {
		if (head.nextPerson == null) {
			head.nextPerson = person;
			queueLength++;
			return;
		}
		Person next = head.nextPerson;
		while (next.nextPerson != null) {
			next = next.nextPerson;	
		}
		next.nextPerson = person;
		this.queueLength++;
	}

	@Override
	public Person retrieve() {
		Person nextInLine;
		if (head.nextPerson == null){
			System.out.println("Error: no one is in the queue");
			return null;
		} else {
			nextInLine = head.nextPerson;
			if (nextInLine.nextPerson != null){
				head.nextPerson = nextInLine.nextPerson;
			} else {
				head = null;
			}		
		}
		this.queueLength--;
		return nextInLine;
	}
	
	public void addPerson(Person person){
		this.insert(person);
		System.out.println(person.getName() + " is in the queue.");
	}
	
	public Person servePerson(){
		Person person = this.retrieve();
		System.out.println("Serving " + person.getName());
		return person;
	}
	
}