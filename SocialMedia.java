public class SocialMedia {
    public abstract class SocialMedia {

    //support - whatsapp , facebook , insta
    public abstract void chatWithFriend();

    //support - facebook , insta
    public abstract void publishPost(Object post);

    //support - whatsapp , facebook ,insta
    public abstract void sendPhotoAndVideos();

    // support - whatsapp , insta
    public abstract void groupVideoCall(String... user);

}

    
}
public class FaceBook extends SocialMedia {

    public void chatWithFriend() {}

    public void publishPost(Object post) {}

    public void sendPhotoAndVideos() {}

    public void groupVideoCall(String... user) {}

}

interface PostMediaInterface {

    //support - whatsapp , facebook , insta
    public abstract void chatWithFriend();

    //support - whatsapp , facebook ,insta
    public abstract void sendPhotoAndVideos();

}

interface PublichPostInterface {

    //support - facebook , insta
    public abstract void publishPost(Object post);

}

interface GroupVideoCallInterface {
    // support - whatsapp , insta
    public abstract void groupVideoCall(String... user);
}

public class Insta extends PostMediaInterface , PublishPostInterface , GroupVideoCallInterface {

    public void chatWithFriend() {}

    public void publishPost(Object post) {}

    public void sendPhotoAndVideos() {}

    public void groupVideoCall(String... user) {}
}

public class WhatsApp extends PostMediaInterface , PublishPostInterface , GroupVideoCallInterface {

    public void chatWithFriend() {}

    public void publishPost(Object post) {}

    public void sendPhotoAndVideos() {}

    public void groupVideoCall(String... user) {}

}
public class FaceBook extends PostMediaInterface , PublishPostInterface , GroupVideoCallInterface  {

    public void chatWithFriend() {}

    public void publishPost(Object post) {}

    public void sendPhotoAndVideos() {}

    public void groupVideoCall(String... user) {}

}

    

