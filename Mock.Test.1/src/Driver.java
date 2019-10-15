
public class Driver {
	public static void main(String[] args) {
		Car[] car = new Car[10];
		
		car[0] = new Car("5623AM", 200, "Red", "BRZ");
		car[1] = new Car("5921GT", 700, "Orange", "Supra");
		car[2] = new Car("7484TT", 550, "Yellow", "Mustang");
		car[3] = new Car("6911YH", 400, "Black", "Viper");
		car[4] = new Car("4387GB", 260, "Silver", "Camry");
		car[5] = new Car("7112MN", 240, "Grey", "Tida");
		car[6] = new Car("0198AS", 230, "Pink", "Swift");
		car[7] = new Car("7336BV", 280, "Green", "Hiace");
		car[8] = new Car("6104LS", 220, "Blue", "Accord");
		car[9] = new Car("3987XC", 350, "White", "Carola");
		
		LinearList carList = new LinearList();
		
		carList.show();
		
		for (int i=0; i<10; i++) {
			carList.insert(car[i]);
		}
		
		carList.show();
		
		carList.retrieve("Camry");
		
		carList.show();
		
		carList.remove();
		
		carList.show();
		
		carList.destroy();
		
		carList.show();
		
	}
}
