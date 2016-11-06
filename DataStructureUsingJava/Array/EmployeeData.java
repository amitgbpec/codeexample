class EmployeeData{
  private Employee[] emp;
  int noOfEle;

  EmployeeData(int max){
    emp = new Employee[max];
    noOfEle = 0;
  }

  public void insert(String fname,String lname,long empId){
    emp[noOfEle] = new Employee(fname,lname,empId);
    noOfEle++;
  }

  public void displayEmployeeData(){
    for (int i=0;i<noOfEle ;i++ ) {
      emp[i].display();
    }

  }
}
