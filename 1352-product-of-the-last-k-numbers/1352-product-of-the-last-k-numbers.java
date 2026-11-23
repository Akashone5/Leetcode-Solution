class ProductOfNumbers {
    ArrayList<Integer> al;
    public ProductOfNumbers() {
      al=new ArrayList<>();
    }
    public void add(int num) {
     al.add(num);
    }
    
    public int getProduct(int k) {
        int p=1;
       int n=al.size();
       for(int i=n-1;i>=n-k;i--){
            p*=al.get(i);
       }
    
       return p;
}
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */