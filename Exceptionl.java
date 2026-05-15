public class Exceptionl {

    static class invalidexception extends Exception {
        public invalidexception(String message){
            super(message);
        }


        static class checkaverage extends Exception{

            public checkaverage( String message){
                super(message);
            }
            } 
            
            
        }



    

    public static void main(String[] args){
        try {
            marks(1000);
        } 
        catch (invalidexception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void marks(int marks) throws invalidexception{
        if(marks < 0 || marks > 100){
            throw new invalidexception("marks should be between 0 and 100");
        }
    }


    static void checkaverage(double average) throws checkaverage{
        if(average <40){
            throw new checkaverage("average is less than 40")
        }
    }

}