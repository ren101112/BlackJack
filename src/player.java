public class player {

    public int cardTotal;//creates variables for the player class
    public boolean isBust;
    public boolean isHit;
    public String name;
    public card[] hand;



    public player(){
        cardTotal=0;
        isBust=false;
        isHit=false;
        name="null";
        hand = new card[2];//hand starts with 2 cards



    }

    public void calcTotal(){// calcs the total value of your cards
        cardTotal=0;

        for(int x=0; x<hand.length; x++){

          cardTotal += hand[x].value;;

        }



    }


    public void printInfo() {
        System.out.println("my name is "+ name+" and it is "+ isBust+" that I have busted and I have "+cardTotal+ " points in total");//prints the info of plaer and its cards
        System.out.println("my cards are: ");

        for(int x=0;x<hand.length;x++){

            hand[x].printInfo();

        }



    }

    public void hit (card newCard){

        card[] newHand= new card[hand.length+1];
        for (int x=0; x<hand.length; x++){
            newHand[x]=hand[x];//i basically created a new hand for every time you hit so that you get a new expanded array




        }
        newHand[hand.length]=newCard;
        hand=newHand;
        calcTotal();
        if (cardTotal>21){

            isBust= true;//if you busted is bust is true

        }




    }
    public void stand(){
        isHit=false;//if you stand nothing happens


    }
}
