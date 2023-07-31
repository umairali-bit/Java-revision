public class PaintJob {


    public static void main(String[] args) {
       System.out.println(getBucketCount(3.4, 2.1, 1.5,2));
       System.out.println(getBucketCount(3.4,2.1,1.5));
       System.out.println(getBucketCount(3.4,1.5));


    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){

        int bucketsNeeded = 0;
        // conditional statement
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        /*
        int bukcetsNeeded = 0;
        double area = width * height; // calculate the area

        int numOfBukcets = (int) (Math.ceil(area/areaPerBucket)); // calculate total number of bukcets for the job

        //number of buckets needed
        numOfBukcets -= extraBuckets;
        bukcetsNeeded = numOfBukcets;

         */

        int numOfBuckets = (int) Math.ceil((width * height) / areaPerBucket);
        numOfBuckets -= extraBuckets;
        bucketsNeeded = numOfBuckets;



        return bucketsNeeded;
    }

    //overloaded getBukcetCount method

    public static int getBucketCount(double width, double height, double areaPerBukcet){

        int numOfBukcets = 0;

        if(width <= 0 || height <= 0 || areaPerBukcet <= 0){
            return -1;
        }

        numOfBukcets = (int) Math.ceil((width * height) / areaPerBukcet);

        return numOfBukcets;
    }

    //overloaded getBucketCount method

    public static int getBucketCount(double area, double areaPerBucket){
        int numOfBuckets = 0;

        if( area <= 0 || areaPerBucket <= 0){
            return -1;
        }

        numOfBuckets = (int) Math.ceil(area/areaPerBucket);
        return numOfBuckets;
    }



}
