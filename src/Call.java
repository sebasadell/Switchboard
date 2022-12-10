public class Call {
    private String sourceN;
    private String destinationN;
    private int seconds;
    private int band;
    private boolean local;
    //private double cost;

    public Call(String sourceN, String destinationN, int seconds){
        this.sourceN = sourceN;
        this.destinationN = destinationN;
        this.seconds = seconds;
        local = true;
    }

    public Call(String sourceN, String destinationN, int seconds, int band){
        this.sourceN = sourceN;
        this.destinationN = destinationN;
        this.seconds = seconds;
        this.band = band;
    }

    public double getCost(){
        double cost = 0;
        if(local){
            cost = seconds * 0.15;
        }
        else{
            switch (band){
                case 1:
                    cost = seconds * 0.20;
                    break;
                case 2:
                    cost = seconds * 0.25;
                    break;
                case 3:
                    cost = seconds * 0.30;
                    break;
            }
        }
        return cost;
    }

    public void printCall(){
        System.out.println(sourceN + " | " + destinationN);
    }

    public void printData(){
        if(local){
            //cost = seconds * 0.15;
            System.out.println(sourceN + " | " + destinationN + " | " + seconds + " | local | " + getCost());
        }
        else{
            System.out.println(sourceN + " | " + destinationN + " | " + seconds + " | " + band + " | " + getCost());
        }
    }
}