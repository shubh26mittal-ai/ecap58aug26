package interfaceexamples;

public class SmartPhone implements Instagram, FaceBook {

    public void uploadStatus()
    {
        System.out.println("photo uploaded and got 2k likes");
    }

    public void youtube()
    {
        System.out.println("Youtube palying the videos");
    }

    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.uploadStatus();//photo uploaded and got 2k likes
        sp.youtube();//Youtube palying the videos
    }
}
