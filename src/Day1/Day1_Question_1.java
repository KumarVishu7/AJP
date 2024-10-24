package Day1;

public class Day1_Question_1 {
        private double amount;

        // Parameterized constructor to initialize amount
        public Day1_Question_1(double amount) {
            this.amount = amount;
        }

        // Method to withdraw from account
        public void withdraw(double withdrawalAmount) {
            String message = (withdrawalAmount <= amount) ? "Withdraw successful" : "Insufficient funds";
            System.out.println(message);
            if (withdrawalAmount <= amount) {
                amount -= withdrawalAmount;
            }
        }

        // Method to deposit into account
        public void deposit(double depositAmount) {
            amount += depositAmount;
        }

        // Method to display total balance
        public void displayBalance() {
            System.out.println("Total balance: " + amount);
        }

        public static void main(String[] args) {
            // Create Bank object with initial amount 10000
            Day1_Question_1 account = new Day1_Question_1(10000);

            // Withdraw 2000 from account
            account.withdraw(2000);

            // Deposit 5000 into account
            account.deposit(5000);

            // Display total balance
            account.displayBalance();
        }


}
