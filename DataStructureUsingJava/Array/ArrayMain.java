class ArrayMain{
  private long[] a; //integer array variable
  int noOfEle;

 //parameterized costructor
 ArrayMain(int max){
   a = new long[max];
   noOfEle=0;
 }

 //Default constructor
 ArrayMain(){

 }

  public void insert(long item){
    a[noOfEle]=item;
    noOfEle++;
  }

  public boolean find(int searchKey){
    int i;
    for (i=0;i<noOfEle ;i++ ) {
      if(a[i]==searchKey){
        break;
      }
    }
    if(i==noOfEle)
      return false;
    else
      return true;
  }

  public boolean delete(int itemToDelete){
    int i;
    for (i=0;i<noOfEle ;i++ ) {
      if(a[i]==itemToDelete){
        break;
      }
    }
    if(i==noOfEle) //element not found to delete
      return false;
    else{
      for (int j=i;j<(noOfEle-1) ;j++ ) {
        a[j]=a[j+1];
      }
      noOfEle--;
      return true;
    }

  }

  public void display(){
    for (int i=0;i<noOfEle ;i++ ) {
      System.out.print(a[i]+" ");
    }
    System.out.println();
  }



}
