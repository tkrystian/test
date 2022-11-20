package pl.camp.it;

public class Tree {

    private Node root = null;

    public void add(int value){
        if(this.root == null){
            root = new Node();
            this.root.setValue(value);
        }else {
            addValue(value, this.root);
        }
    }

    public boolean contains(int value){
        return findValue(value, this.root);
    }

    public int max(){
        return findMax(this.root);
    }

    public int min(){
        return findMin(this.root);
    }

    public void addValue(int value, Node node){
        if(value == node.getValue()){
            return;
        }
        if(value > node.getValue()){
            if(node.getRight() == null){
                node.setRight(new Node());
                node.getRight().setValue(value);
            }else{
                addValue(value, node.getRight());
            }

        }else if(value < node.getValue()){
            if(node.getLeft() == null){
                node.setLeft(new Node());
                node.getLeft().setValue(value);
            }else{
                addValue(value, node.getLeft());
            }

        }

    }

    public int findMin(Node node){
        if(node.getLeft() == null){
            return node.getValue();
        }else return findMin(node.getLeft());
    }

    public int findMax(Node node){
        if(node.getRight() == null){
            return node.getValue();
        }else return findMax(node.getRight());
    }

    public boolean findValue(int value, Node node){
        if(node == null){
            return false;
        }
        if(value == node.getValue()){
            return true;
        }else if(value > node.getRight().getValue()){
            return findValue(value, node.getRight());
        }else return findValue(value, node.getLeft());
    }
}
