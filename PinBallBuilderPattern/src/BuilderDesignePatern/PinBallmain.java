package BuilderDesignePatern;

public class PinBallmain {

	public static void main(String[] args) {
		
		DigitalPinBallBuilder builder = new DigitalPinBallBuilder("digital","Aluminium");
		builder.setPinBallBuilder(1,"digital");
		builder.pinaballMaterial();
		builder.setPinBallTypeValue();
		PinBall build = builder.Build();
		
		System.out.println(build.toString());
		
		PhysicalPinBallBuilder physicalBuilder = new PhysicalPinBallBuilder("physical","Wood");
		physicalBuilder.setPinBallBuilder(1,"physical");
		physicalBuilder.pinaballMaterial();
		physicalBuilder.setPinBallTypeValue();
		PinBall physicalBuild = physicalBuilder.Build();
		
		System.out.println(physicalBuild.toString());
		
		
		
	}
}
