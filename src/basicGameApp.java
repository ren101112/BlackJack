import com.sun.jdi.Value;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class basicGameApp {
//todo: SOMEWHAT STRAIGHTFORWARD: MAKE A CONSTRUCTOR THAT HAS 3 parameters
    public card[] deck;//deck array for the cards
    public dealer d;//dealer object
    public player me;// player object



    public static void main(String[] args) {

basicGameApp game =new basicGameApp();

    }

    public basicGameApp(){
        me= new player();

        int counter=0;//i used this counter to count up to create the card array
        System.out.println("welcome to blackjack");
         me = new player();
         d = new dealer();
        deck =new card[52];//creates a new set of cards

        for(int y=0; y<4; y++) {// 4 suits of cards



            for (int x = 0; x < 13; x++) {//13 cards per suit
                deck[counter] = new card(y, x, 10);
                counter++;


                //deck[x].printInfo();
            }
        }

       shuffle();//shuffles the cards
        me.hand[0]=deck[0];//deals two cards to the player and calcs the total value of those cards
        me.hand[1]=deck[1];
        me.calcTotal();

        d.hand[0]=deck[2];//deals two cards to the dealer and then calcs the total value of those cards
        d.hand[1]=deck[3];
        d.calcTotal();

        int nextCard=4;//the next card to be drawn from the deck will be the fourth from the array



        //todo give the dealer cards
        Scanner s =new Scanner(System.in);//we learned this to ask the person questions
        System.out.println("what is your name?");
        me.name= s.nextLine();//sets the players name
        me.printInfo();//souts cards and the values of them
        playerTurn(s, 4);//runs the players turn with the 5th card in the array as the next to be pulled



    }
    public void compare() {
        if (me.isBust==true){//after either standing or busting, you compare and depending on if you won or lost you get a different end message

            System.out.println("you busted, dealer wins");
            d.printInfo();
        } else if (d.isBust==true) {
            System.out.println("dealer busted, you win");
            d.printInfo();
        } else if (me.cardTotal>d.cardTotal) {
            System.out.println("you win with "+me.cardTotal+" points");
            d.printInfo();


        } else if (d.cardTotal>me.cardTotal) {
            System.out.println("dealer wins with "+d.cardTotal+" points");
            d.printInfo();

        }else{

            System.out.println("it is a tie, you both have "+me.cardTotal+" points");

        }


    }


    public void playerTurn(Scanner s, int Nextcard){
        if(me.isBust==true){//if i busted it compares and the game is over
            compare();

        }else {//if i didnt bust it tells the player the dealers cards
            d.printInfo();


            System.out.println("Hit or stand? (h/s)");//do you want to hit or stand
            String hitChoice = s.nextLine();
            if (hitChoice.equals("h")){//if you type h it is a hit and then it gives you a card to your deck
                me.hit(deck[Nextcard]);
                me.printInfo();//it says what cards you have
                playerTurn(s,Nextcard+1);//makes the next card to be dealt



            }else {
                me.stand();//if you stand nothing happens
                dealerTurn(Nextcard+1);

            }
            }



    }

    public void dealerTurn(int nextCard){
        if(d.isBust||d.cardTotal>=16){//if the dealer has busted or has over 16 they have to stand
            compare();


        }else{
            d.Hit(deck[nextCard]);//otherwise they hit
            dealerTurn(nextCard+1);

        }



    }

    public void shuffle(){
        for(int z=0;z<deck.length; z++){//shuffles the deck and we did this in class so that we give the z card to the random number of the array, and then the one from z goes to spencer
            int randomIndex =  (int)(Math.random()*52);
           card spencer= deck[randomIndex];
           deck[randomIndex]=deck[z];
           deck[z]=spencer;



        }




    }
    public void printDeck(){

       for (int x=0; x< deck.length;x++){


           deck[x].printInfo();//says every card in the deck: i didnt use this because it takes up too much space on the window
       }
    }

}
