class MyCircularQueue {
   // queue<Integer> q = new ArrayLinkedList<>();
    int[] arr;
    int size;
    int f;
    int r ;
   

    public MyCircularQueue(int k) {
        arr= new int[k];
        size = 0;
        f = -1;
        r = -1;
    }
    
    public boolean enQueue(int value) {
        if(size == arr.length ) return false;
        if(f == -1){
            f = r = 0;
        }
        else{
           
            r = (r + 1) % arr.length;
        }
        arr[r] = value;
        size++;
        return true;
        
    }
    
    public boolean deQueue() {
        if(size == 0) return false;
        if(size == 1){
            f = r = -1;
        }
        else{
            f = (f + 1) % arr.length;
        }
        size--;
        return true;
        
    }
    
    public int Front() {
        if(size ==0 ) return -1;
        return arr[f];
        
    }
    
    public int Rear() {
        if(size == 0) return -1;
        return arr[r];
        
    }
    
    public boolean isEmpty() {
        return size == 0;
        
    }
    
    public boolean isFull() {
        return size == arr.length;

        
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */