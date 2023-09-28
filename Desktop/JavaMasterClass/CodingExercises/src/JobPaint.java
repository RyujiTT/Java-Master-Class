public class JobPaint {

    public static void main(String[] args) {
        System.out.println(getBucketCount(4,1.5,13,4));
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if(width <= 0 || height <=0 || areaPerBucket <= 0 || extraBuckets <0) {
            return -1;
        }
        double area = width * height;
        double firstEstimatedArea = areaPerBucket * extraBuckets;
        double buckets = Math.ceil((area - firstEstimatedArea) / areaPerBucket);
        return (int) buckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width,height,areaPerBucket,0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        return getBucketCount(area,1,areaPerBucket,0);
    }
}
