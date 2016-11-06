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
  public boolean find(String lname){
    int i;
    for (i=0;i<noOfEle ;i++ ) {
      if(emp[i].getLastName().equals(lname))
        break;
    }
    if(i==noOfEle)
      return false;
    else
      return true;
  }
  public void delete(String lname){
    int i;
    for (i=0;i<noOfEle ;i++ )
      if(emp[i].getLastName().equals(lname))
        break;
      for (int j=i;j<noOfEle-1;j++ ) {
        emp[j] = emp[j+1];
      }
    noOfEle--;
    }
  }
