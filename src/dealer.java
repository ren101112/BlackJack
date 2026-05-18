public class dealer {

    public int cardTotal;//creates the variables for the dealer
    public boolean isOver15;
    public boolean isBust;
    public card[] hand;



    public dealer(){//sets all variables to default
        cardTotal=0;
        isOver15=false;
        isBust=false;
        hand=new card[2];//dealer gets 2 cards to start in their hand





    }


    public void printInfo(){
        System.out.println("the dealers cards:");//souts the dealers cards and hand
        for(int x=0;x<hand.length;x++){

            hand[x].printInfo();

        }


    }
    public void Hit(card newCard){
        card[] newHand = new card[hand.length + 1];//same hit method as player, just copy and pasted
        for (int i = 0; i < hand.length; i++) {
            newHand[i] = hand[i];
        }
        newHand[hand.length] = newCard;
        hand = newHand;
        calcTotal();
        if (cardTotal > 21) {//busts
            isBust = true;
        }


    }


    public void calcTotal(){//calcs the total of their cards
        cardTotal=0;

        for(int x=0; x<hand.length; x++){

            cardTotal += hand[x].value;;

        }



    }

    public void stand(){

isOver15=true;


    }
}
