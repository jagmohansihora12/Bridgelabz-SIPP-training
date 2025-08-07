package LinkedList;

class Inventory{
    int itemId;
    int quantity;
    double price;
    String iteName;
    Inventory next;

    public Inventory(int itemId,int quantity,double price, String iteName){
        this.iteName = iteName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class InventoryList{
    Inventory head;

    public void insertAtBeginning(Inventory newInventory){
        newInventory.next = head;
        head = newInventory;
    }

    public void insertAtEnd(Inventory newInventory){
        if(head == null){
            insertAtBeginning(newInventory);
        }else{
            Inventory inventory = head;
            while(inventory.next!= null){
                inventory = inventory.next;
            }
            inventory.next = newInventory;
        }
    }

    public void insertAtKIndex(Inventory newInventory, int k){
        if(k<0){
            System.out.println("Invalid pos.");
            return;
        }else if(k == 0){
            insertAtBeginning(newInventory);
            return;
        }else{
            Inventory temp = head;
            int count = 0;
            while(temp != null && count < k -1){
                temp = temp.next;
                count++;
            }

            if(temp == null){
                System.out.println("Pos out of bound");
                return;
            }
            newInventory.next = temp.next;
            temp.next = newInventory;
        }
    }

    public void display(){
        Inventory  inventory = head;
        while(inventory != null){
            System.out.println("ItemId -> " + inventory.itemId);
            System.out.println("ItemName -> " + inventory.iteName);
            System.out.println("Quantity -> " + inventory.quantity);
            System.out.println("price -> " + inventory.price);
            System.out.println("Total Value -> "+ (inventory.price * inventory.quantity));
            System.out.println("-------------------------");
            inventory = inventory.next;
        }
    }

    public void deletekthposition( int k){
        Inventory inventory = head;
        if(k<0){
            System.out.println("invalid pos");
            return;
        }else if(k == 1){
            head = inventory.next;
            return;
        }else{
            Inventory temp = inventory;
            int count = 0;
            while(temp.next != null && count < (k-1) ){
                temp = temp.next;
                count++;
            }
            temp.next = temp.next.next;
        }
    }

    public void searchById(int id){
        Inventory inventory = head;

        while(inventory.next != null){
            if(inventory.itemId == id){
                System.out.println("ItemId -> " + inventory.itemId);
            System.out.println("ItemName -> " + inventory.iteName);
            System.out.println("Quantity -> " + inventory.quantity);
            System.out.println("price -> " + inventory.price);
            System.out.println("Total Value -> "+ (inventory.price * inventory.quantity));
            break;
            }
            inventory = inventory.next;
        }
    }

    public void searchByName(String name){
        Inventory inventory = head;

        while(inventory.next != null){
            if(inventory.iteName == name){
                System.out.println("ItemName -> " + inventory.iteName);
                System.out.println("ItemId -> " + inventory.itemId);
            System.out.println("Quantity -> " + inventory.quantity);
            System.out.println("price -> " + inventory.price);
            System.out.println("Total Value -> "+ (inventory.price * inventory.quantity));
            break;
            }
            inventory = inventory.next;
        }
    }

    public void sortByPrice(){
        Inventory inventory = head;
        while(inventory.next!= null){
            Inventory inventory2 = inventory;
            while(inventory2.next!=null){
                if(inventory.price > inventory2.price){
                    Inventory temp = inventory2;
                    inventory2.next = inventory.next;
                    inventory.next = temp.next;
                }
                inventory2 = inventory2.next;
            }
            inventory = inventory.next;
        }
        display();
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        InventoryList list = new InventoryList();
        list.insertAtEnd(new Inventory(1, 18,99.99 ,"ABC" ));
        list.insertAtEnd(new Inventory(2, 19, 89.99,"XYZ"));
        list.insertAtBeginning(new Inventory(3, 17,79.99, "KLM"));
        
        // System.out.println("All iteams:");
        // System.out.println("Insert at kth pos");
        list.insertAtKIndex(new Inventory(4, 100, 100, "MNO"), 2);
        // list.display();
        // System.out.println("Delete from kth position");
        // list.deletekthposition(2);
        // list.display();

        // search by ID
        // list.searchById(3);
        // list.searchByName("MNO");

        // sort by price
        list.sortByPrice();
    }
}
