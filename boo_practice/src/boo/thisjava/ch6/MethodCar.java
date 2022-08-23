package boo.thisjava.ch6;

public class MethodCar {

	private int gas;
	
	public void setGas(int gas) {
		
		
		this.gas = gas;
		
		
	}
	
	
	public boolean isLeft() {
		
		if (gas == 0) {
			
			System.out.println("gas가 없습니다.");
			return false;
		}
		
		System.out.println("gas가 있습니다.");
		return true;
		
		
	}

	public void run() {
		
		while(true) {
			
			if(gas>0) {
				
				System.out.println("달립니다. gas 잔량 :"+ gas );
				gas --;
			} else {
				
				System.out.println("멈춥니다");
				break;
			}
			
			
		}
		
		
		
		
		
	}


}


