public class Tree {
    private Node root;

    public Tree(){
        root = null;
    }
    public void insert(int id, double dd){

    }
    public boolean delete(int id){
        return
    }
    public Node find (int key){

    Node current = root;

    while (key != current.iData){
        if(current.iData < key){
            current = current.leftChild;
        } else {
            current = current.leftChild''
        }
        if (current == null){
            return null;
        }
    }

        return current;
    }
}
