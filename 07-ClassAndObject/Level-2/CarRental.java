class CarRental{
	String customerName;
	String carmodel;
	int rentaldays;
	CarRental(){
		customerName="Customer";
		carmodel="basic";
		rental=1;
	}
	CarRental(String n, String m,String d){
		customerName=n;
		carmodel=m;
		rentaldays=d;
	}
	int totalCost() {
        int pricePerDay = 500;
        return rentaldays * pricePerDay;
    }

    void show() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carmodel);
        System.out.println("Rental Days: " + rentaldays);
        System.out.println("Total Cost: " + totalCost());
    }

    public static void main(String[] args) {

        CarRental r1 = new CarRental();
        CarRental r2 = new CarRental("Khushi", "Swift", 3);

        r1.show();
        r2.show();
    }
}
	