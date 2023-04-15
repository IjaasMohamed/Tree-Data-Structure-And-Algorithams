public class Tree {
    private Node root;

    public Tree(){
        root = null;
    }
    public void insert(int id, double dd){

            Node newNode = new Node();
            newNode.iData = id;
            newNode.dData = dd;

            if (root == null ){
                newNode = root;
            }
            else {
                Node current = root;
                Node parent = current;

                while(current != null){
                    parent = current ;

                    if(id < current.iData){
                        current = current.leftChild;

                        if (current.leftChild == null){
                            parent.leftChild = newNode;
                            return;
                        }
                    }
                    else{
                        current = current.rightChild;
                        if (current.rightChild == null){
                            parent.rightChild = newNode;
                            return;
                        }
                    }
                }
            }
    }
    public boolean delete(int id){
        return;
    }
    public Node find (int key){

    Node current = root;

    while (key != current.iData){
        if(current.iData < key){
            current = current.leftChild;
        } else {
            current = current.leftChild;
        }
        if (current == null){
            return null;
        }
    }

        return current;
    }
}
