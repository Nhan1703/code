public class MyLinkedListQueue implements IStackQueue {
    public class Node {
        int value;
        Node next;
        
        Node(int value) {
            this.value = value;
        }
    }
    
    Node heaNode;
    Node tailNode;
    
    MyLinkedListQueue() {
        heaNode = tailNode = null;
    }

    @Override
    public boolean push(int value) {
        if (isFull()) {
            return false;
        }
        Node newNode = new Node(value); // Missing semicolon added here
        // Additional logic to link the new node in the queue should follow
        return true;
    }
}
