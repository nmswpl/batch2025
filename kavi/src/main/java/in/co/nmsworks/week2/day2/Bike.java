package in.co.nmsworks.week2.day2;

public class Bike extends Vehicle{
    public enum HandBarType{
        RAISED,
        HANDLER;

        private  HandBarType handBarType;

        public HandBarType getHandBarType() {
            return handBarType;
        }

        public void setHandBarType(HandBarType handBarType) {
            this.handBarType = handBarType;
        }


    }
    public String display(){
        return "model" + getModel();
    }

    public static void print(){

        HandBarType type=HandBarType.RAISED;
        HandBarType type2=HandBarType.HANDLER;
        switch(type){
            case RAISED:
                System.out.println("RAISED");
                break;
            case HANDLER:
                System.out.println("HANDLER");
                break;
        }
    }
}
