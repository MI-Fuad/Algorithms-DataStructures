public class BinarySearch {
  int counter = 0;
    public boolean search(int array[], int key, int lo, int hi) {
      int mid = lo +(hi - 1 -lo)/2;

        if (lo == hi)
        {
          return false;
        }
        counter++;
        if(array[mid] == key) {
          return true;
        } else if(key < array[mid]){
            return search(array,key,lo,mid);
        } else {
          return search(array,key,mid+1,hi);
        }
    }
      public int count(int array[], int key, int lo, int hi) {
        counter = 0;
        search(array,key,lo,hi);
        return counter;
      }
}
