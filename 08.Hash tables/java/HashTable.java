public class HashTable {
    // public for testing purposes
    public int buckets[];

    long _a;
    long _c;
    long _m;
    //hash(x) = (ax + c)  % m
    public HashTable(long _a, long _c, long _m) {
      this._a = _a;
      this._c = _c;
      this._m = _m;
      buckets = new int[(int)_m];
    }
    public long hash(int key){
        long hash = 0;
        hash = ((_a * key) + _c) % _m;
        return hash;
      }

    public void insert(int key) {
      int i = (int)hash(key);

      while(i < buckets.length && buckets[i] != 0){
        i++;
      }
      if(i >= buckets.length){
        extend();
      }
      buckets[i] = key;
    }
    public boolean find(int key) {
      for(int i=0; i < buckets.length; i++){
        if (buckets[i] == key){
          return true;
        }
      }

        return false;
    }
    public double loadFactor() {
      return 0.0;
    }
    public void remove(int key){

    }

    private void extend() {

       int lenNew = buckets.length * 2;
       int storageNew [] = new int[lenNew];
    for (int j = 0; j < buckets.length; j++ ){
     storageNew[j] = buckets[j];
    }
    buckets = storageNew;

  }
}
