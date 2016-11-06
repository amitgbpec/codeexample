class OrderedArray{
  private long[] a;
  int noOfEle;

  OrderedArray(int max){
    a= new long[max];
    noOfEle=0;
  }

  public void insert1(int item){
    if(noOfEle==0)
      a[noOfEle]=item;
    else if(a[noOfEle-1]<item)
      a[noOfEle]=item;
      else{
        int j=noOfEle-1;
        while((j!=-1)&&(a[j]>item)){
          a[j+1]=a[j];
          a[j]=item;
          j--;
        }
      }
  noOfEle++;
  }

  public void insert(int item){
    int i;
    for (i=0;i<noOfEle ;i++ ) {
      if(a[i]>item)
        break;
    }

    for(int k=noOfEle;k>i;k--)
      a[k]=a[k-1];
    a[i]=item;
    noOfEle++;

  }

  public boolean find(int searchKey){
    int lowerBound=0;
    int upperBound=noOfEle-1;
    int currentIndex;
    while(true){
      currentIndex = (upperBound+lowerBound)/2;
      if(a[currentIndex]==searchKey)
        return true;
      else if(lowerBound>upperBound)
          return false;

      else{
        if (a[currentIndex]>searchKey){
          upperBound=currentIndex-1;
            }
      else{
          lowerBound=currentIndex+1;
        }
      }

    }
    //return false;

  }

  public boolean delete(int itemToDelete){
    int i;
    for (i=0;i<noOfEle ;i++ ) {
      if(a[i]==itemToDelete)
        break;
    }
    if(i==noOfEle)
      return false;//item not found in array
    else{
      for (int j=i;j<(noOfEle-1);j++ ) {
        a[j]=a[j+1];
      }
      noOfEle--;
      return true;
    }
  }

  public void display(){
    for (int i=0;i<noOfEle ;i++ ) {
      System.out.print(a[i]+",");
    }
    System.out.println();
  }

}
