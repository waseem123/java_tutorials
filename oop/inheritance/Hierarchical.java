class Vehical{
String Use = "Travel";
public void DisplayVehical(){
System.out.println("Feature of Vehical - "+Use);
}
}

class TwoWheeler extends Vehical{
int TPerson = 2;
public void DisplayTwoWheeler(){
System.out.println("How Many People Travel - ",TPerson);
}
}

class FourWheeler extends Vehical{
int FPerson = 5;
public void DisplayFourWheeler(){
System.out.println("How Many People Travel - ",FPerson);
}
}

class Suzuki extends TwoWheeler{
String[] SFeature ={
"Light Weighted","Budget Friendly","Not best for off road travling"
} ;
public void DisplaySuzuki(){
System.out.println("Suzuki Features - ");
for (String fs :SFeature ) {
System.out.println("-"+fs);
}
}
}

class RoyalEnfield extends TwoWheeler{
String[] RFeature ={
"Heavy Weighted","Costly","Best for off road travling"
} ;
public void DisplayRoyalEnfield(){
System.out.println("RoyalEnfield Features - ");
for (String fr :RFeature ) {
System.out.println("-"+fr);
}
}
}

class Creta extends FourWheeler{
String[] CFeature = {"Average","Sunroof","Ground Clearance"};
public void DisplayCreta(){
System.out.println("Creta Features - ");
for (String fc :CFeature ) {
System.out.println("-"+fc);
}
}
}
class Hierarchical {
public static void main(String[] args) {
Suzuki s = new Suzuki();
s.DisplayVehical();
s.DisplayTwoWheeler();
s.DisplaySuzuki();
RoyalEnfield r = new RoyalEnfield();
r.DisplayVehical();
r.DisplayTwoWheeler();
r.DisplayRoyalEnfield();
Creta c = new Creta();
c.DisplayVehical();
c.DisplayFourWheeler();
c.DisplayCreta();
}
}