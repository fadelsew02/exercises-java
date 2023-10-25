import java.util.ArrayList;
import java.util.List;

public class cashRegister {
    public static void main(String[] args) {
        List<CurrencyUnit> cashInDrawer = new ArrayList<>();
        cashInDrawer.add(new CurrencyUnit("PENNY", 1.01));
        cashInDrawer.add(new CurrencyUnit("NICKLE", 2.05));
        cashInDrawer.add(new CurrencyUnit("DIME", 3.1));
        cashInDrawer.add(new CurrencyUnit("QUARTER", 4.25));
        cashInDrawer.add(new CurrencyUnit("ONE", 90.0));
        cashInDrawer.add(new CurrencyUnit("FIVE", 55.0));
        cashInDrawer.add(new CurrencyUnit("TEN", 20.0));
        cashInDrawer.add(new CurrencyUnit("TWENTY", 60.0));
        cashInDrawer.add(new CurrencyUnit("ONE HUNDRED", 100.0));

        CashRegisterResult result = checkCashRegister(19.5, 20.0, cashInDrawer);

        if (result.status.equals("CLOSED")) {
            System.out.println("Status: CLOSED");
            System.out.println("Change: " + result.change);
        } else {
            System.out.println("Status: " + result.status);
            System.out.println("Change: " + result.change);
        }
    }

    public static CashRegisterResult checkCashRegister(double price, double cash, List<CurrencyUnit> cashInDrawer) {
        CashRegisterResult output = new CashRegisterResult();
        double change = cash - price;
        double totalInDrawer = 0.0;

        for (CurrencyUnit cu : cashInDrawer) {
            totalInDrawer += cu.amount;
        }

        if (totalInDrawer == change) {
            output.status = "CLOSED";
            output.change = cashInDrawer;
            return output;
        }

        if (totalInDrawer < change) {
            output.status = "INSUFFICIENT_FUNDS";
            return output;
        }

        List<CurrencyUnit> changeList = new ArrayList<>();
        // (Réduisez le changement en utilisant les billets et les pièces du tiroir-caisse ici)

        if (changeList.isEmpty() || change > 0.0) {
            output.status = "INSUFFICIENT_FUNDS";
        } else {
            output.status = "OPEN";
            output.change = changeList;
        }

        return output;
    }
}

class CurrencyUnit {
    String name;
    double amount;

    public CurrencyUnit(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }
}

class CashRegisterResult {
    String status;
    List<CurrencyUnit> change;

    public CashRegisterResult() {
        status = "";
        change = new ArrayList<>();
    }
}
