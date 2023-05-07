package org.example.random;

public class Add2LinkedListAsInt {

// add 2 linked list
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String l1AsStr="";
        while ( l1 != null ){
            l1AsStr =l1.val + l1AsStr;
            l1=l1.next;
        }

        String l2AsStr="";
        while ( l2 != null ){
            l2AsStr=l2.val + l2AsStr;
            l2=l2.next;

        }

        int l1AsInt = Integer.parseInt(l1AsStr);
        int l2AsInt = Integer.parseInt(l2AsStr);

        int l3AsInt = l1AsInt + l2AsInt;
        String str3 = l3AsInt +"";
        String newChar ="";
        for (int i=0; i<str3.length(); i++)
        {
            char ch= str3.charAt(i); //extracts each character
            newChar= ch+newChar; //adds each character in front of the existing string
        }

        ListNode newNode = new ListNode();
        ListNode curr = newNode;
        char [] charArray = newChar.toCharArray();
        for (int i=0; i<newChar.length(); i++) {
            char ch = newChar.charAt(i);
            curr.next = new ListNode(Integer.parseInt(ch+""));
            curr = curr.next;
        }
        return newNode;
    }


    public static class ListNode {
      int val;
      public ListNode next;
      ListNode() {}
      public ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
