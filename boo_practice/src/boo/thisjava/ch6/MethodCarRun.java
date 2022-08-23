package boo.thisjava.ch6;

public class MethodCarRun {

	public static void main(String[] args) {
		
		MethodCar car = new MethodCar();
		
		car.setGas(5);
		
		boolean flag = car.isLeft();
		//(flag가 true일 때, "달립니다")
		
		if(flag) {
			
			System.out.println("출발합니다");
			
			car.run();
		} 
		
		
		if(car.isLeft()) {
			
			
			System.out.println("gas를 주입할 필요가 없습니다.");
			
		} else {
			
			System.out.println("gas를 주입하세요");
		}
		
		
		
		
	}
	
	
	
}
