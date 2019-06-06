package in.ac.sharda;

public class Zoo {
	private Animal a;
	private Dog d;
	private Animal tiger, cat,dog;
	
	public Zoo() {
		this.a=new Animal();
		this.dog=new Dog();
		this.tiger=new Tiger();
		this.cat=new Cat();
		this.d=new Dog(); 
	}
	public void feed() {
		a.eat();
		dog.eat();
		tiger.eat();
		cat.eat();
		d.eat();
		
		
	
	}

}
