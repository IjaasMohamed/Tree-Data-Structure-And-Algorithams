public class Tree {
    private Node root;

    public Tree(){
        root = null;
    }
    public void insert(int id, double dd){
        Node newNode = new Node();
        newNode.iData = id;
        newNode.dData = dd;

        if (root == null) {
            newNode = root;
        }
        else{
            Node current = root;
            Node parent;

            while (current != null ){

                parent = current;

                if (current.iData > id){
                    current.leftChild = newNode;

                    if(current == null ){
                        parent.leftChild = newNode;
                    }
                }
                else if (current.iData < id){
                    current.rightChild = newNode;

                    if(current == null ){
                        parent.rightChild = newNode;
                    }
                }
            }
    }
    public boolean delete(int id){
        return;
    }
    public Node find(int key){

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
        private void inOrder(Node localRoot)
        {
            if (localRoot != null)
            {
                inOrder(localRoot.leftChild);
                localRoot.displayNode();
                inOrder(localRoot.rightChild);
            }
        }
        private void preOrder(node localRoot){
            if (localRoot != null ){
                //root left right
                localRoot.displayNode();
                preOrder(localRoot.leftChild);
                preOrder(localRoot.rightChild);
            }
        }

    }

