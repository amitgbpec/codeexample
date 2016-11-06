class EmployeeApp{
  public static void main(String[] args){
    EmployeeData arr;
    arr =new EmployeeData(10);
    arr.insert("Amit","Rawat",1001);
    arr.insert("Ekta","Sharma",1002);
    arr.insert("Pradeep","Goyal",1003);
    arr.insert("John","Doe",1004);
    arr.insert("Niki","Negi",1005);
    arr.insert("Smita","joshi",1006);
    arr.displayEmployeeData();

    //find employee with last name
    //add ignore case later
    System.out.println("Employee with last name - joshi is present "+arr.find("joshi"));
    System.out.println("Employee with last name - doe is present "+arr.find("doe"));
    System.out.println("Employee with last name - Goyal1 is present "+arr.find("Goyal1"));

    //Delete employe and display employee
    arr.delete("Sharma");
    arr.delete("Negi");
    arr.displayEmployeeData();
  }
}
