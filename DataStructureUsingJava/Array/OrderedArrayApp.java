class OrderedArrayApp{
  public static void main(String[] args){
    OrderedArray orderArr1 = new OrderedArray(10);
    int itemToFind;
    orderArr1.insert(10);//0
    orderArr1.insert(9);//1
    orderArr1.insert(8);//2
    orderArr1.insert(7);//3
    orderArr1.insert(6);//4
    orderArr1.insert(5);//5
    orderArr1.insert(4);//6
    orderArr1.insert(3);//7
    orderArr1.insert(2);//8
    orderArr1.insert(19);//9
    itemToFind=5;
    System.out.println("Item "+itemToFind+" is present in array:"+orderArr1.find(itemToFind));
    orderArr1.display();

    System.out.println("Item deleted from array: "+orderArr1.delete(8));
    //display array after item deletion
    orderArr1.display();

    System.out.println("Item deleted from array: "+orderArr1.delete(19));
    //display array after item deletion
    orderArr1.display();

    System.out.println("Item deleted from array: "+orderArr1.delete(32));
    //display array after item deletion
    orderArr1.display();

  }
}
