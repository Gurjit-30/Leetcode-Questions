class Solution {
    static ArrayList<Integer> preGreaterEle(int[] arr) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
         for(int i=0;i<arr.length;i++){
             while(!st.isEmpty() && arr[i]>=st.peek()){
                 st.pop();
                 
             }
             if(st.isEmpty()){
                 res.add(-1);
             }else{
                 res.add(st.peek());
             }
             st.push(arr[i]);
         }
         return res;
    }
}