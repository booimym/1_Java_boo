package boo.thisjava.ch7;

public class Tire {
	
	//필드
	
	private int maxRotation; 			//최대 회전수
	private int accumulatedRotation; 	//누적 회전수
	private String location; 			//타이어의 위치
	
	
	//생성자
	public Tire() {}
	
	//매개변수 생성자
	public Tire(int maxRotation, String location) {
		super();
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	public int getMaxRotation() {
		return maxRotation;
		
	}

	public void setMaxRotation(int maxRotation) {
		this.maxRotation = maxRotation;
	}
	

	public int getAccumulatedRotation() {
		return accumulatedRotation;
	}

	public void setAccumulatedRotation(int accumulatedRotation) {
		this.accumulatedRotation = accumulatedRotation;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	//메서드
	
	public boolean rolling() {
		
		accumulatedRotation++;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "Tire 수명 :");
			return true;
		} else {
			System.out.println("펑크");
			return false;
			
		}
	}
	
	

}
