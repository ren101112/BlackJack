public class card {

public String suit;
public String name;
public int value;

public card(String Psuit, int Pname, int Pvalue){
    suit=Psuit;
    //name=Pname;
    value=Pvalue;
    if (Pname==0){
        name="ace";

    }



printInfo();
}

public void printInfo(){
    System.out.println("this card is the "+name+" of "+suit+" worth "+value+" points");

}






















}


