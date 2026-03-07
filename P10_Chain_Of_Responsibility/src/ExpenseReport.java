package P10_Chain_Of_Responsibility.src;

public class ExpenseReport {
    private double expenses;
    private boolean planned;

    public ExpenseReport(double expenses, boolean planned){
        this.expenses = expenses;
        this.planned = planned;
    }

    public double getExpenses(){
        return this.expenses;
    }

    public boolean isPlanned(){
        return planned;
    }

    
}
