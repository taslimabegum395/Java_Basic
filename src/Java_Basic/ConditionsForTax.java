package Java_Basic;

public class ConditionsForTax {
    public void getTaxAmount() {
        int income = 75000;
        double tax;
        if (income >= 5000) {
            tax = income * .365;
            System.out.println(tax);

        }
        else{
            tax=income*.2;
            System.out.println(tax);
        }

    }

    public static void main(String[] args) {
        ConditionsForTax tax=new ConditionsForTax();
        tax.getTaxAmount();
    }
    }



