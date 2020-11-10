public class Savings extends Account {
        public Savings() {
            super();
        }

        public Savings(int id, double balance) {
            super(id, balance);
        }

        /**
         * Decrease balance by amount
         */
        public void withdraw(double amount) {
            if (amount < getBalance()) {
                setBalance(getBalance() - amount);
            } else
                System.out.println(
                        "Error! Savings account overdrawn transtaction rejected");
        }
    }

