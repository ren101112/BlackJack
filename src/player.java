public class player {

    public int cardTotal;
    public boolean isBust;
    public boolean isHit;
    public String name;
    public card[] hand;



    public player(){
        cardTotal=0;
        isBust=false;
        isHit=false;
        name="null";
        hand = new card[2];

        hit();
        stand();

    }

    public void calcTotal(){
        cardTotal=0;

        for(int x=0; x<hand.length; x++){

          cardTotal += hand[x].value;;

        }



    }


    public void printInfo() {
        System.out.println("my name is "+ name+" and it is "+ isBust+" that I have busted and I have "+cardTotal+ " points in total");
        System.out.println("my cards are: ");

        for(int x=0;x<hand.length;x++){

            hand[x].printInfo();

        }



    }

    public void hit (){



    }
    public void stand(){


    }
}
