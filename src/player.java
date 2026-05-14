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
        name="ren";

        hit();
        stand();
        printInfo();
    }


    public void printInfo() {
        System.out.println("my name is "+ name+"it is "+ isBust+" that I have busted and I have "+cardTotal+ " cards");



    }

    public void hit (){



    }
    public void stand(){


    }
}
