class ArrayDemo1{
  public static void main(String[] args){
    //Define integer array
    long[] arr1; //Defines a reference to an array
    arr1 = new long[10]; //creates the array and set arr1 to refer to it
    int noOfEle=0;//defines the no of elemets in array
    int j; //loop counter
    long searchKey; //key of item to search in array
    long itemToDelete; //item to delete from array

    //insert items in array using the index,which starts from 0
    arr1[0]=12;

    //Access the array elements using the index
    System.out.println("First element in array is:"+arr1[0]);
    //Try to access the un-initialized array elements, integers/long are nitialized with 0
    System.out.println("Second elementin array is:"+arr1[1]);

    /*
    Insert elements into array
    */
    arr1[0]=5;
    arr1[1]=15;
    arr1[2]=3;
    arr1[3]=45;
    arr1[4]=67;
    arr1[5]=98;
    arr1[6]=90;
    arr1[7]=75;
    arr1[8]=54;
    arr1[9]=58;
    noOfEle=10;
    /*
    Display array items
    */
    for (j=0;j<noOfEle ;j++ ) {
      System.out.println("Array element at "+j+" position is:"+arr1[j]);
    }
    /*
    Search for item in array
    */
    searchKey=90;
    for (j=0;j<noOfEle ;j++ ) {
      if(searchKey==arr1[j]){
        break;
      }
    }
    if(j==noOfEle)
      System.out.println("Item "+searchKey+" does not exist in array");
      else
      System.out.println("Item "+searchKey+" present at "+j+" position in array");

    /*
    delete an item from array
    */
    itemToDelete=67;
    for (j=0;j<noOfEle ;j++ ) {
      if(itemToDelete==arr1[j]){
        for (int i=j;i<(noOfEle-1) ;i++ ) {
          arr1[i]=arr1[i+1];
        }
        noOfEle--;
        break;
      }
    }
    /*
    Display item in array
    */
    for (j=0;j<noOfEle ;j++ ) {
      System.out.println("Array element at "+j+" position is:"+arr1[j]);
    }
  }

}
