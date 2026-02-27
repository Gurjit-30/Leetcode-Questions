class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer>st=new Stack<>();
        ArrayList<Integer> res=new ArrayList<>();
        
        st.push(arr[arr.length -1]);
        res.add(-1);
        for(int i=arr.length-2;i>=0;i--){
        
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
         Collections.reverse(res);
        return res;
    }
}