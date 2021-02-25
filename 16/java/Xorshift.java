public class Xorshift {
  long a;
  long b;
  long c;
  long numb;
    public Xorshift(long _a, long _b, long _c, long seed) {
      a = _a;
      b = _b;
      c = _c;
      this.numb = seed;
    }
    public long next() {
      numb ^= (numb << a) % 4294967296L;
      numb ^= (numb >> b) % 4294967296L;
      numb ^= (numb << c) % 4294967296L;

        return numb;
    }
    public void seed(long seed) {
      this.numb = seed;
    }
}
