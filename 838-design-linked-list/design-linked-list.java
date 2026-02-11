
    class ListNode{
        
            int val;
            ListNode next;
            ListNode(int val){
                this.val=val;
            }
    }
        
    


class MyLinkedList {
    ListNode head;
    int size=0;




    public int get(int index) {
        ListNode temp=head;
        if(head==null || index>=size || index<0){
            return -1;
        }
       
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.val;

        
    }
    
    public void addAtHead(int val) {
        addAtIndex(0,val);

        
    }
    
    public void addAtTail(int val) {
        addAtIndex(size,val);
    }
    
    public void addAtIndex(int index, int val) {
     ListNode newNode=new ListNode(val);
    
   
    
        if(index<0){
            return;
        }
        if(index>size){
            return;
        }
         if(index==0){
        newNode.next=head;
        head=newNode;
          size++;
          return;
    }
      
        ListNode temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
       
        newNode.next=temp.next;
        temp.next = newNode;
        size++;
        
    }
    
    public void deleteAtIndex(int index) {
        
        if(index>=size){
            return;
        }if(index<0){
            return;
        }
          if (index == 0) {
            head = head.next;
            size--;
            return;
        }
        ListNode prev=null;
        ListNode temp=head;

        for(int i=0;i<index;i++){
            prev=temp;
            temp=temp.next;
        }
        if(index==size-1){
            prev.next=null;
        
        }else{
            prev.next=temp.next;

        }
        size--;
    }

        
    }



/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */