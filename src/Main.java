import java.util.Objects;
import java.util.Scanner;
class LimcaShop {
    String name;
    String limcasize;

    int howmany;
    int cashrecieved;
    int cashgiven;
    String Flavour;
    int capacity_ofblueberry = 50;
    int capacity_ofLychee = 50;
    int capacity_ofRedApple = 50;
    int capacity_ofMango = 50;
    int capacity_ofLemonade = 50;
    int rupees;
    String shop_name = "1°C One Degree Centigrade The Liquid Shop";
    String location = " SB 7, Block 2 Gulshan-e-Iqbal, Karachi, Karachi City, Sindh";
}
class Employee1{
     String name;
    private int NIC;
    public void SetNIC(int nic){
        NIC = nic;
    }
    int GetNIC(){
        return  NIC;
    }
    private int Salary;
    public void SetSalary(int monthlyincome){
        Salary = monthlyincome;
    }
    int GetSalary(){
        return  Salary;
    }
}
class Main{
    public static void main(String[] args) {
        System.out.println("***********************************************************");
        System.out.println("==================== 1°C One Degree Menu ==================");
        System.out.println("***********************************************************");
        System.out.println("*** FLAVOURS ******* Small Price **** Jumbo Price *** ");
        System.out.println("    BlueBerry             90               120");
        System.out.println("    Lychee                90               120");
        System.out.println("    Red Apple             90               120");
        System.out.println("    Mango                 90               120");
        System.out.println("    LemonAde              90               120");
        LimcaShop OneD = new LimcaShop();
        Scanner CustomerName = new Scanner(System.in);
        System.out.println("Enter Custumer Name");
        OneD.name = CustomerName.nextLine();
        Scanner SelectFlavour = new Scanner(System.in);
        System.out.println("Enter Flavour");
        OneD.Flavour = SelectFlavour.nextLine();
        Scanner CashRec = new Scanner(System.in);
        System.out.println("Enter Cash Received");
        OneD.cashrecieved = CashRec.nextInt();
        Scanner quantity = new Scanner(System.in);
        System.out.println("Enter Quantity of Soda");
        OneD.howmany = quantity.nextInt();
        Scanner SmallorLarge = new Scanner(System.in);
        System.out.println("Enter LimcaSize");
        OneD.limcasize = SmallorLarge.nextLine();
        if (Objects.equals(OneD.limcasize, "large")){
            OneD.rupees = 120;
        } else if (Objects.equals(OneD.limcasize, "small")) {
            OneD.rupees = 90;
        }else {
            System.out.println("Enter limca Size");
        }
        System.out.println("**************************************************");
        System.out.println("=================Custumer Reciept=================");
        System.out.println("**************************************************");
        System.out.println("Shop name = " + OneD.shop_name);
        System.out.println("Location = " + OneD.location);
        System.out.println("Customer Name is = " + OneD.name);
        System.out.println("LimcaSize is = " + OneD.limcasize);
        System.out.println("Quantity of Soda " + OneD.howmany);
        System.out.println("Flavour of Soda = " + OneD.Flavour);
        System.out.println("Price of soda is = " + OneD.rupees);
        System.out.println("===================");
        System.out.println("Cash Received = " + OneD.cashrecieved);
        System.out.println("===================");
        System.out.println("Cash Given = " + (OneD.cashrecieved - (OneD.rupees * OneD.howmany)));
        Employee1 Eone = new Employee1();
        System.out.println("**************************************************");
        System.out.println("==============Soda Shop Information===============");
        System.out.println("**************************************************");
        Scanner nameofEmp = new Scanner(System.in);
        System.out.println("Enter name of Employee");
        Eone.name = nameofEmp.nextLine();
        System.out.println("Name of Employee is " + Eone.name);
        Scanner nic = new Scanner(System.in);
        System.out.println("Enter NIC of Employee");
        Eone.SetNIC(nic.nextInt());
        System.out.println("NIC of Employee is " + Eone.GetNIC());
        Scanner salarie = new Scanner(System.in);
        System.out.println("Enter Salary of Employee");
        Eone.SetSalary(salarie.nextInt());
        System.out.println("Salary of Employee is " + Eone.GetSalary());
        if (Objects.equals(OneD.Flavour, "BlueBerry")){
            OneD.capacity_ofblueberry = OneD.capacity_ofblueberry - OneD.howmany;
        }else if(Objects.equals(OneD.Flavour, "Lychee")){
            OneD.capacity_ofblueberry = OneD.capacity_ofLychee - OneD.howmany;
        }else if(Objects.equals(OneD.Flavour, "RedApple")) {
            OneD.capacity_ofblueberry = OneD.capacity_ofRedApple - OneD.howmany;
        }else if(Objects.equals(OneD.Flavour, "Mango")){
            OneD.capacity_ofblueberry = OneD.capacity_ofMango - OneD.howmany;
        }else if(Objects.equals(OneD.Flavour, "LemonAde")){
            OneD.capacity_ofblueberry = OneD.capacity_ofLemonade - OneD.howmany;
        }else{
            System.out.println("This one not available");
        }
        System.out.println("******************************************************");
        System.out.println("*** FLAVOURS *******     Stock          Remaining *** ");
        System.out.println("******************************************************");
        System.out.println("    BlueBerry             50               "+ OneD.capacity_ofblueberry);
        System.out.println("    Lychee                50               "+ OneD.capacity_ofLychee);
        System.out.println("    Red Apple             50               "+ OneD.capacity_ofRedApple);
        System.out.println("    Mango                 50               "+ OneD.capacity_ofMango);
        System.out.println("    LemonAde              50               "+ OneD.capacity_ofLemonade);
    }
}