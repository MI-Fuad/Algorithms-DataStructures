public class LCG {
    long _a;
    long _c;
    long _m;
    long seed;


    public LCG(long _a, long _c, long _m, long seed) {
      this._a = _a;
      this._c = _c;
      this._m = _m;
      this.seed = seed;
    }
    public long next() {
      long next =(_a*seed + _c) % _m;
        seed = next;
        return next;
    }

    public void seed(long seed) {
    	this.seed = seed;
    }
    public static void main(String[]args){

          long goal = 54596;
          long result = 0;
          long counter = 0;
          while(goal !=result){
              LCG g = new LCG(1664525,1013904223,4294967296L, counter);
              result = g.next();
              if(goal== result){
                  System.out.println("counter =" + counter);
                  System.out.println("result = "+ result);
                  break;
              }
              counter++;
          }
    }
  }
