package Day5;

public class CalculatorSimulator {
    public static void main(String[] args) {
        testCalculateTax("Ron", false, 34000);

        testCalculateTax("Tim", true, 1000);

        testCalculateTax("Jack", true, 55000);

        // Test case 4: Employee name is null/empty
        testCalculateTax("", true, 30000);
    }

    public static void testCalculateTax(String empName, boolean isIndian, double empSal) {
        TaxCalculator calculator = new TaxCalculator();
        try {
            double taxAmount = calculator.calculateTax(empName, isIndian, empSal);
            System.out.println("Tax amount is " + taxAmount);
        } catch (CountryNotValidException e) {
            System.out.println("Country not valid: " + e.getMessage());
        } catch (EmployeeNameInvalidException e) {
            System.out.println("Employee name not valid: " + e.getMessage());
        } catch (TaxNotEligibleException e) {
            System.out.println("Not eligible for Tax calculation: " + e.getMessage());
        }
    }
}

