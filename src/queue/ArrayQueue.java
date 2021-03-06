package queue;

//implement queue with array
public class ArrayQueue {
    private String[] items;
    private int n = 0;

    //indicate the head/tail of queue
    private int head = 0;
    private int tail = 0;

    public ArrayQueue(int capacity){
        items = new String[capacity];
        n = capacity;
    }

    //enqueue
    public boolean enqueue(String item){
        if (tail == n){
            if (head == 0) return false;
            for (int i = head;i<tail;++i){
                items[i-head] = items[i];
            }
            tail-=head;
            head = 0;
        }
        items[tail] = item;
        ++tail;
        return true;
    }

    //dequeue
    public String dequeue(){
        if(head == tail) return null;
        String ret = items[head];
        ++head;
        return ret;
    }
}
