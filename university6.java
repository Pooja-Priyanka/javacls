class University6 {
    double percentile;

    // Constructor to initialize percentile
    University6(double percentile) {
        this.percentile = percentile;
    }

    // Method to check eligibility for UG
    void ug() {
        if (percentile >= 60) {
            System.out.println("Eligible for UG");
        } else {
            System.out.println("Not eligible for UG");
        }
    }

    // Method to check eligibility for PG
    void pg() {
        if (percentile >= 70) {
            System.out.println("Eligible for PG");
        } else {
            System.out.println("Not eligible for PG");
        }
    }
}

// 'Eli' class inherits 'University6'
class Eli extends University6 {
    
    // Constructor calls the superclass constructor
    Eli(double percentile) {
        super(percentile);
    }

    // Override the UG eligibility check
    @Override
    void ug() {
        if (percentile >= 60) {
            System.out.println("Eligible for UG");
        } else {
            System.out.println("Not eligible for UG");
        }
    }

    // Override the PG eligibility check
    @Override
    void pg() {
        if (percentile >= 70) {
            System.out.println("Eligible for PG");
        } else {
            System.out.println("Not eligible for PG");
        }
    }

    public static void main(String[] args) {
        // Create an instance of 'Eli' with a percentile of 60.7
        Eli e1 = new Eli(60.7);
        
        // Check eligibility for UG and PG
        e1.ug();
        e1.pg();
    }
}
