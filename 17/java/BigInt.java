public class BigInt {
    public int ndigits;
    // public for test purposes
    public char data[];

    public BigInt(int _ndgts) {
      this.ndigits = _ndgts;
      data = new char[_ndgts];
    }
    public BigInt(String s) {
      public BigInt(String s)
    }

    public char get(int i) {
      int l = data.length;
      if(i >= l){
        return 0;
      }
      return data[i];
    }
    public BigInt Add(BigInt y) {
      int u = 1, c = 0, narray[];

      if (y.ndigits > this.ndigits){
        u = u + y.ndigits;
      }else{
        u = u + this.ndigits;
      }


      BigInt goal = new BigInt(u);
      narray = new int [u];
      for (int i = 0; i < u; i++) {
        narray[i] = this.get(i) + y.get(i) + c;
        if (narray[i] > 9){
          c = 1;
          narray[i] = narray[i] % 10;
        }else{
          c = 0;
        }
        goal.data[i] = Character.valueOf((char)narray[i]);
      }
        return r;
    }
    public BigInt Sub(BigInt y) {
        return this;
    }
    public BigInt Shift(int n) {
        return this;
    }
    public BigInt MulByDigit(char c) {
        return this;
    }
    public BigInt Mul(BigInt y) {
        return this;
    }
    public BigInt Div(BigInt d) {
	return this;
    }
    public BigInt Rem(BigInt d) {
	return this;
    }
}
