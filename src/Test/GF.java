package Test;

public class GF extends PT{
	GF(String name, int energy){
		super(name, energy);
	}
	int energy = 50;
	
	public void walk() {
		System.out.println(this.name + "("+energy+") / �ȴ±��");
	}
	public void run() {
		System.out.println(this.name + "("+energy+")/ �ٴ±��");
	}
	
	
}
