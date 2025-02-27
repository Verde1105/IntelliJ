class TestSet {
  private static TestSet aa = null;
  int count = 0;

  public static TestSet testGet() {
    if (aa == null) {
      aa = new TestSet();
    }
    return aa;
  }

  public void count() {
    count++;
  }

  public int getCount() {
    return count;
  }
}

class Test {
  public static void main(String[] args) {
    TestSet count01 = TestSet.testGet();
    count01.count();
    TestSet count02 = TestSet.testGet();
    count02.count();
    System.out.println(count01.getCount());
  }
}

