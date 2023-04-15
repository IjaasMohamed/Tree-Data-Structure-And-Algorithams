public class Node {
    public int iData; //key item
    public double dData; //value of the node, other data / eg :- if IT211 of a student is considered iData,
    // then the dData could be taken as student semester year or any other, any number of data could be stored,
    // here its only ane and its dData only.
    public Node rightChild;
    public Node leftChild;

    public void display(){
        System.out.println("Key is " +iData + " Data would be " +dData+ " \nRight child - " +rightChild + " \nLeft child - " + leftChild);
    }
}
