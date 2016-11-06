class ArrayMainApp{
  public static void main(String[] args){
    ArrayMain arr1 = new ArrayMain(5);
    ArrayMain arr2 = new ArrayMain(5);
    ArrayMain arr3 =new ArrayMain();
    arr1.insert(1);
    arr1.insert(2);
    arr1.insert(3);
    arr1.insert(4);
    arr1.insert(5);
    arr2.insert(6);
    arr2.insert(7);
    arr2.insert(8);
    arr2.insert(9);
    arr2.insert(10);

    arr1.display();
    arr2.display();
    //delete item from array and display the new array
    arr1.delete(2);
    arr1.display();

    //delete item from array and display the new array
    arr2.delete(6);
    arr2.display();

    //NulllPointerException
    //arr3.insert(9);

  }

}
