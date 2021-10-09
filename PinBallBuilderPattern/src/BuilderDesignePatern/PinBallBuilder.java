package BuilderDesignePatern;

public abstract class PinBallBuilder {

	int id;
	String name;
	PinBall obj = null;
	public void setPinBallBuilder(int id,String name){
		this.id=id;
		this.name=name;
		obj = new PinBall(id,name);
	}
	
	
	
	public abstract PinBallBuilder setPinBallTypeValue();
	
	public abstract PinBallBuilder pinaballMaterial();
	
	public PinBall Build() {
		System.out.println("PinBall Builder Success");
		return obj;
	}
}
