

public class CarFactoryMain {

	public static void main(String[] args) {
		
		/*
		 * 자동차공장
		 */
		Engine audiEngine = new Engine("ㅁ", 1234);

		

		Car audiCar = new Car();
		audiCar.no = 1234;
		audiCar.model = "x6";
		audiCar.engine = audiEngine;

//		System.out.println(audiCar.no+"\t"+ audiCar.model+"\t"+ audiCar.engine.type+"\t"+audiCar.engine.cc);

		audiCar.print();

		System.out.println("--차량엔진검사---");
		Engine returnEngine = audiCar.getEngine();
		returnEngine.print();







//		Engine audiEngine = new Engine();
//		audiEngine.setType("a");
//		audiEngine.setCc(3000);
//
//		Car audiCar = new Car();
//		audiCar.setNo(1234);
//		audiCar.setModel("Audi");
//		audiCar.setEngine(audiEngine);
		
			
		
		
		
		

	}

}
