public class dealer {

    public int cardTotal;
    public boolean isOver15;
    public boolean isBust;
    public card[] hand;



    public dealer(){
        cardTotal=0;
        isOver15=false;
        isBust=false;
        hand=new card[2];




        Hit();
        stand();
        printInfo();
    }


    public void printInfo(){
        System.out.println("the dealer has "+ " cards, and it is "+ " that the dealer has busted, and it is "+ "that the dealer has over 15 cards");


    }
    public void Hit(){



    }
    public void stand(){



    }
}
