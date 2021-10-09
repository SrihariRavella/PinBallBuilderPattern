package BuilderDesignePatern;

public class PhysicalPinBallBuilder extends PinBallBuilder{

	String pinBallType;
	String PinBallMaterial;
	
	PhysicalPinBallBuilder(String pinBallType,String PinBallMaterial){
		this.PinBallMaterial = PinBallMaterial;
		this.pinBallType = pinBallType;
	}
	
	@Override
	public PinBallBuilder pinaballMaterial() {
		obj.setMaterial(this.PinBallMaterial);
		return this;
	}

	@Override
	public PinBallBuilder setPinBallTypeValue() {
		obj.setPinBallTypeValue(this.pinBallType);
		return this;
	}

}
