class SLList {
    public SLList(Object f, SLList r) { }
    public static final SLList NIL = new SLList(0, null);
    
    //sublist 
    public SLList sublist(int start, int end){
  
        if(start > 0) {                     
    
        return rest().sublist(start-1, end-1);
    }

        else if (end > 0) {
        return new SLList(first(),rest().sublist(0, end-1));
    }

        else {
        return NIL;
    }

    }
    public Object first() {
        return null;
    }
    public SLList rest() {
        return null;
    }
    public void setFirst(Object f) {
    }
    public void setRest(SLList r) {
    }

    public Object nth(int i) {
        return null;
    }
    public SLList nthRest(int i) {
        return null;
    }
    // no such thing as `unsigned' in Java
    public int length() {
        return -1;
    }

    public SLList remove(Object o) {
        return null;
    }
    public SLList reverse() {
        return null;
 }
    
    
    
}
