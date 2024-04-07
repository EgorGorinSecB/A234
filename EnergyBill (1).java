package assignments;

import java.util.Scanner;



public class EnergyBill {
    private String customerName;

    private String customerAddress;
    private double electricityUsage; 
    private double gasUsage; 




    public EnergyBill(String name, String address, double electricityUsage, double gasUsage) {
        this.customerName = name;

        this.customerAddress = address;
        this.electricityUsage = electricityUsage;
        
        this.gasUsage = gasUsage;
    }

    public double calculateElectricityCharge(double ratePerKWh) {
        return electricityUsage * ratePerKWh;
    }



    public double calculateGasCharge(double ratePerUnit) {
        return gasUsage * ratePerUnit;
    }

    public void displayTotalBill(double electricityCharge, double gasCharge) {
        double totalBill = electricityCharge + gasCharge;

        System.out.println(" Customer Name: " + customerName);

        System.out.println("Customer Address: " + customerAddress );
        System.out.println("Electricity Usage: " + electricityUsage + " kWh" );

        System.out.println("Gas Usage: " + gasUsage + " units");
        System.out.println("Electricity Charge: $" + electricityCharge);
        System.out.println( "Gas Charge: $" + gasCharge);

        System.out.println("Total Bill: $" + totalBill);
    }



    public static void main( String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");

        String name = scanner.nextLine();

        System.out.print("Enter customer address: ");

        String address = scanner.nextLine();

        System.out.print("Enter electricity usage (in kWh): ");

        double electricityUsage = scanner.nextDouble();

        System.out.print("Enter gas usage (in units): ");
        
        double gasUsage = scanner.nextDouble();

        EnergyBill bill = new EnergyBill(name, address, electricityUsage, gasUsage);
        double electricityCharge = bill.calculateElectricityCharge(0.12);
        
        double gasCharge = bill.calculateGasCharge(1.5); 
        bill.displayTotalBill(electricityCharge, gasCharge);

        scanner.close();
    }
}
