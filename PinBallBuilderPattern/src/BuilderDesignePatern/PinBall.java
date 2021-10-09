package BuilderDesignePatern;

public class PinBall {

	private int id;
	private String name;
	private String material;
	private String pinBallType;
	
	PinBall(int id,String name){
		this.id = id;
		this.name = name;
	}
	
	public PinBall setPinBallTypeValue(String pinBallType) {
		switch(pinBallType) {
		case "physical":this.pinBallType = pinBallType;
			break;
		case "digital":this.pinBallType = pinBallType;
			break;
		}
		return this;
	}
	
	public PinBall setMaterial(String material) {
		this.material = material;
		return this;
	}

	@Override
	public String toString() {
		return "PinBall [id=" + id + ", name=" + name + ", material=" + material + ", pinBallType=" + pinBallType + "]";
	}

}
