class MyHashMap {
    HashMap <Integer, Integer>myHashMap = new HashMap<>();

    public MyHashMap() {      
    }
    
    public void put(int key, int value) {    
        myHashMap.put(key, value);
        
    }   
    public int get(int key) {
        if(myHashMap.containsKey(key)) {
            return myHashMap.get(key);
        }
        return -1;
    }  
    public void remove(int key) {
        myHashMap.remove(key);
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */