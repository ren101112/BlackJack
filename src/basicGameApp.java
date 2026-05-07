import javax.xml.namespace.QName;

public class basicGameApp {
//todo: SOMEWHAT STRAIGHTFORWARD: MAKE A CONSTRUCTOR THAT HAS 3 parameters
    public card[] deck;


    public static void main(String[] args) {

basicGameApp game =new basicGameApp();

    }

    public basicGameApp(){
        System.out.println("welcome to blackjack");
        player me = new player();
        dealer d = new dealer();
        deck =new card[52];

        for (int x=0; x<13; x++){
            deck[x]=new card("hearts",x,10);


            deck[x].printInfo();
        }

       compare();
       shuffle();
    }
    public void compare() {


    }
    public void shuffle(){



    }

}
