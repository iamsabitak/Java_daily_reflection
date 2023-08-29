package Execises;

public class prblm6 {
     public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();//--sablai call garxa
    ms.record4KVideo();//--default call
        //ms.greet(); --> Throws an error!
        ms.takeSnap();
        ms.recordVideo();
        //object for Class MyCellPhone
        MyCellPhone mb = new MySmartPhone();
        mb.callNumber(556);
        mb.pickCall();
   // MyWifi my = new MyWifi();--> Throws an error!
MyWifi my = new MySmartPhone();//--MyWifi ko matra call garxa
            my.connectToNetwork("Sabita5G");
            String[] ar = my.getNetworks(); 
        for (String item: ar) {
          System.out.println(item);
  //my.takeSnap();--throws an error coz the obj is just for MyWifi
 //MyCamera mm = new MyCamera();//-not ALLOWED
 MyCamera mm = new MySmartPhone();//MyCamera ko lai matra call garxa
 mm.takeSnap();
 mm.recordVideo();
      }
    }
}

interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning greet()");
    }
    default void record4KVideo(){
        greet();
        System.out.println("record4KVideo() Recording in 4k...");
    }
}

interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("from CLASS callNumber() Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("from CLASS pickCall() Connecting... ");
    }

}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
    public void takeSnap(){
        System.out.println("Taking snap FROM takeSnap()");
    }
    public void recordVideo(){
        System.out.println("Taking snap FROM recordVideo()");
    }
//    public void record4KVideo(){
//        System.out.println("Taking snap and recoding in 4k");
//    }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks from getNetworks() ");
        String[] networkList = {"Harry", "Prashanth", "Anjali5G"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("FROM connectToNetwork() Connecting to " + network);
    }
}



