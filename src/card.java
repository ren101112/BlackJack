public class card {

public String suit;
public String name;
public int value;

public card(int Psuit, int Pname, int Pvalue){
    value=Pvalue;

    if (Psuit==0){
        suit="hearts";


    }else if (Psuit==1){

        suit="diamonds";
    }else if (Psuit==2){

        suit="clubs";
    }else if (Psuit==3){

        suit="spades";
    }
    if (Pname==0){
        name="ace";
        value=11;

    }
    if (Pname == 0) {
        name = "ace";
        value = 11;
    } else if (Pname == 1) {
        name = "two";
        value = 2;
    } else if (Pname == 2) {
        name = "three";
        value = 3;
    } else if (Pname == 3) {
        name = "four";
        value = 4;
    } else if (Pname == 4) {
        name = "five";
        value = 5;
    } else if (Pname == 5) {
        name = "six";
        value = 6;
    } else if (Pname == 6) {
        name = "seven";
        value = 7;
    } else if (Pname == 7) {
        name = "eight";
        value = 8;
    } else if (Pname == 8) {
        name = "nine";
        value = 9;
    } else if (Pname == 9) {
        name = "ten";
        value = 10;
    } else if (Pname == 10) {
        name = "jack";
        value = 10;
    } else if (Pname == 11) {
        name = "queen";
        value = 10;
    } else if (Pname == 12) {
        name = "king";
        value = 10;
    }
}




public void printInfo(){
    System.out.println("this card is the "+name+" of "+suit+" worth "+value+" points");

}






















}


