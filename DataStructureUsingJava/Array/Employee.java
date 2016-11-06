class Employee{
  private String firstName;
  private String lastName;
  private long employeeId;

  Employee(String fname, String lname, long empId){
    this.firstName = fname;
    this.lastName = lname;
    this.employeeId = empId;
  }

  public void display(){
    System.out.println("First Name:"+this.firstName+"|"+"Last Name:"+this.lastName+"|"+"Employee ID:"+this.employeeId);
    }
}
