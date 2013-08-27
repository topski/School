package CMSC335_Project1;

import java.util.ArrayList;
 import java.util.Scanner;
 
 class Party extends Element
 {
   ArrayList<Creature> members = new ArrayList();
 
   public Party(Scanner ss, int pi) {
     this.name = ss.next();
     this.index = pi;
   }
 
   public Party(Scanner ss) {
     this.name = ss.next();
   }
 
   public String toString() {
     String st = String.format("p : %5d : %s", new Object[] { Integer.valueOf(this.index), this.name });
     return st;
   }
 
   public String toAllString() {
     String st = "Party: " + this.name;
     for (Creature c : this.members)
       st = st + "\n   " + c.toAllString();
     return st;
   }
 }
