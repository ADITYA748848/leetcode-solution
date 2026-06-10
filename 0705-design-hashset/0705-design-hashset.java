class MyHashSet {
    HashSet MyHashSet = new HashSet();
    public MyHashSet() {   
    }
    public void add(int key) {    
        if(!MyHashSet.contains(key)){
            MyHashSet.add(key);
        }      
    }
    public void remove(int key) {
        MyHashSet.remove(key);   
    }
    public boolean contains(int key) {
        if(MyHashSet.contains(key)) return true;
        else return false;   
    }
}
