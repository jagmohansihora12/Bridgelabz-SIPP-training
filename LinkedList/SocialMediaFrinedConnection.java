package LinkedList;

class Friends{
    int fId;
    String Fname;
    Friends next;
    public Friends(int fId, String Fname){
        this.fId = fId;
        this.Fname = Fname;
        this.next = null;
    }
}

class friendsList{
    Friends head;
    
    public void addFriend(Friends newfriend){
        
        if(head == null){
            newfriend.next = head;
            head = newfriend;
        }else{
            Friends friends = head;
            while(friends.next!=null){
                friends = friends.next;
            }
            friends.next = newfriend;
        }

    }
    public void removeFriend(String Fname){
        if(head == null){
            System.out.println("No friend in you friend list");
            return;
        }
        if(head.Fname.equals(Fname)){
            head = head.next;
            return;
        }
        Friends friends = head;
        while(friends.next != null){
            if(friends.next.Fname.equals(Fname)){
                friends.next = friends.next.next;
                return;
            }
            friends = friends.next;
        }
    }

    public void displayFriendList(){
        Friends friends = head;
        while(friends!=null){
            System.out.print(friends.Fname +" ");
            friends = friends.next;
        }
        System.out.println();
        // System.err.println("---END OF THE LIST---");
    }
}


class SocialMedia{
    int id;
    String Uname;
    int age;
    friendsList friends;
    SocialMedia next;

    public SocialMedia(int id, String Uname, int age, friendsList friends){
        this.id = id;
        this.Uname = Uname;
        this.age = age;
        this.friends = friends;
        this.next = null;
    }
}


class SocialMediaList{
    SocialMedia head;
    public void addUser(SocialMedia newuser){
        if(head == null){
            newuser.next = head;
            head = newuser;
        }else{
            SocialMedia user = head;
            while(user.next!=null){
                user = user.next;
            }
            user.next = newuser;
        }
    }

    public void displayUsers(){
        SocialMedia sMedia = head;
        while(sMedia!=null){
            System.out.println(sMedia.Uname);
            System.out.println(sMedia.age);
            System.out.println("Friend List");
            sMedia.friends.displayFriendList();
            sMedia = sMedia.next;
        }
        System.err.println("---END OF THE LIST---");
    }

    public void removeUserFriend(String name){
        SocialMedia sMedia = head;
        while(sMedia != null){
            sMedia.friends.removeFriend(name);
            sMedia = sMedia.next;
        }
    }

}

public class SocialMediaFrinedConnection {
    public static void main(String[] args) {
        friendsList flist = new friendsList();
        flist.addFriend(new Friends(90,"A"));
        flist.addFriend(new Friends(20,"B"));
        flist.addFriend(new Friends(21,"C"));
        flist.addFriend(new Friends(40,"D"));
        // System.out.println("FriendList");
        // flist.displayFriendList();

        SocialMediaList slist = new SocialMediaList();
        slist.addUser(new SocialMedia(0, "Z", 10, flist));


        friendsList flist1 = new friendsList();
        flist1.addFriend(new Friends(10,"E"));
        flist1.addFriend(new Friends(11,"F"));
        flist1.addFriend(new Friends(15,"G"));
        flist1.addFriend(new Friends(20,"B"));
        // System.out.println("FriendList");
        // flist1.displayFriendList();
        // slist.addUser(new SocialMe dia(1, "Y", 11, flist1));
        SocialMediaList slist2 = new SocialMediaList(); 
        slist2.addUser(new SocialMedia(1, "Y", 11, flist1));

        System.out.println("User List");

        slist2.displayUsers();
        System.out.println("------Remove Friend E--------------");
        slist2.removeUserFriend( "F");
        slist2.displayUsers();

    }
}
