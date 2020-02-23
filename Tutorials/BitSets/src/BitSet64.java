public class BitSet64 implements BitSet {

  private long bitSet;

  public BitSet64() {
    this.bitSet = 0;
  }

  public long getBitSet() {
    return bitSet;
  }

  @Override
  public void add(int x) {
    if (isInRange(x)) {
      bitSet |= (1 << x);
    }
  }

  @Override
  public void remove(int x) {
    if (isInRange(x)) {
      bitSet &= (~(1 << x));
    }
  }

  @Override
  public boolean contains(int x) {
    return isInRange(x) && (((1 << x) & bitSet) != 0);
  }

  @Override
  public void intersectWith(BitSet other) {
    if (other instanceof BitSet64) {
      bitSet &= ((BitSet64) other).getBitSet();
      return;
    }

    for (int i = 0; i < maxStorableValue(); i++) {
      if (!other.contains(i)) {
        remove(i);
      }
    }
  }

  @Override
  public int maxStorableValue() {
    return Long.SIZE;
  }

  private boolean isInRange(int x) {
    return x >= 0 && x < maxStorableValue();
  }
}
