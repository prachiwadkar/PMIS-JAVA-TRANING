class userAcc {
    private String userName;
    private static int Totalusers = 0;

    userAcc(String userName){
        this.userName = userName;
        Totalusers++;

    }

    public String getUserName() {
        return userName;
    }
    static int getTotalusers(){
        return Totalusers;
    }
}

public class UserAccount_Registration {
    public static void main(String[] args) {
        userAcc a = new userAcc ("prachi");
        userAcc  b = new userAcc ("suraj");
        userAcc  c = new userAcc ("shree");

        System.out.println(a.getUserName ());
        System.out.println(b.getUserName());
        System.out.println(c.getUserName());

        System.out.println(userAcc.getTotalusers());
    }
}