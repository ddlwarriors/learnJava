package Model;

public class Car extends MotoVehicle {
	private String type;//型号

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public Car() {
		
	}
	
	public Car(String vehicleId, String brand, String type, int perRent) {
		super(vehicleId, brand, perRent);//调用父类的有参数构造函数
		this.type = type;
	}
/*
 *重写计算租金 
 * 
 */
	@Override
	public float calRent(int days) {
		float price = this.getPerRent();
		if(days>7&&days<=30) {
			price *= 0.9f;
		}else if(days>30&&days<=150){
			price *= 0.8f;
		}else if(days>150) {
			price *= 0.7f;
		}
		return price*days;
	}
}
