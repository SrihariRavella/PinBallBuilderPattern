package BuilderDesignePatern;

public class DigitalPinBallBuilder extends PinBallBuilder{

	String pinBallType;
	String PinBallMaterial;
	
	DigitalPinBallBuilder(String pinBallType,String PinBallMaterial){
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
		obj.setPinBallTypeValue(pinBallType);
		return this;
	}

}
