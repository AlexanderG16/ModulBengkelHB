package view;

import javax.swing.JOptionPane;

public class MainMenu {
    public MainMenu(){
        showMainMenu();
    }
    private void showMainMenu() {
        Boolean menu = true;
        while(menu) {
            int choosen = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Menu: \n1. Add Member (Anggota) \n2. Add Customer (Pelanggan)\n3. Add Transaction (Transaksi)\n4. View Three Most Bought Items\n5. View Customer Transactions\n6. View Total All Transactions\n7. Exit"));
            switch(choosen) {
                case 1: new AddMember();
                    break;
                case 2: new AddCustomer();
                    break;
                case 3: new AddTransaction(); 
                    break;
                case 4: new ViewThreeMostBoughtItems(); 
                    break;
                case 5: new ViewCustomerTransaction();
                    break;
                case 6: new ViewTotalAllTransactions(); 
                    break;
                case 7: menu = false;
                    break;
            }
        }
    }
}
