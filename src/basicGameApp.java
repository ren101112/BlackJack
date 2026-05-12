import com.sun.jdi.Value;

import javax.xml.namespace.QName;

public class basicGameApp {
//todo: SOMEWHAT STRAIGHTFORWARD: MAKE A CONSTRUCTOR THAT HAS 3 parameters
    public card[] deck;
    public dealer d;
    public player me;



    public static void main(String[] args) {

basicGameApp game =new basicGameApp();

    }

    public basicGameApp(){
        me= new player();

        int counter=0;
        System.out.println("welcome to blackjack");
        player me = new player();
        dealer d = new dealer();
        deck =new card[52];

        for(int y=0; y<4; y++) {



            for (int x = 0; x < 13; x++) {
                deck[counter] = new card(y, x, 10);
                counter++;


                //deck[x].printInfo();
            }
        }

       shuffle();
        printDeck();
    }
    public void compare() {


    }
    public void shuffle(){
        for(int z=0;z<deck.length; z++){
            int randomIndex =  (int)(Math.random()*52);
           card spencer= deck[randomIndex];
           deck[randomIndex]=deck[z];
           deck[z]=spencer;



        }



    }
    public void printDeck(){

       for (int x=0; x< deck.length;x++){


           deck[x].printInfo();
       }
    }

}
