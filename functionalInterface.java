package java8feature;
//only contina sinlge metd  static or defult n num of mtd in functilal interface
//staitc and defult se num delcear kr skte he

@FunctionalInterface  //is anotation se hum ek or absrtact mt likhe gee toh complie time eeror dedega
public interface functionalinteface222 {
	
	void show();
	static void print() {
		
		System.out.println("i ame static");
	}
	
	
default void display() {
		
		System.out.println("i am defualt");
	}
	

}
