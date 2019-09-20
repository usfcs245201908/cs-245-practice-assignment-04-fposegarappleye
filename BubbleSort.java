class BubbleSort implements SortingAlgorithm {

  //@Override
  public void sort(int [] a) {
    for(int j = 0 ; j < a.length ; j++) {
      for(int i = 0 ; i < a.length - 1 - j ; i++) {
        if(a[i] > a[i+1]) {
          swap(a, i, i+1);
        }
      }
    }
  }
  void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }
}
