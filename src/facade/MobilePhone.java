package facade;

/**
 * Created by gavin on 2017/6/14.
 */
public class MobilePhone  {

    private Phone mPhone;

    private Camera mCamera;

    public MobilePhone() {

        mPhone=new PhoneImpl();

        mCamera=new SamsungCamera();
    }





    public void takePicture() {
         mCamera.open();
        mCamera.takePicture();
    }


    public void closeCamera() {
        mCamera.close();
    }


    public void deil() {
        mPhone.deil();
    }

    public void videoChat(){

        System.out.println("视频聊天接通中");
        mCamera.open();

        mPhone.deil();
    }

    public void hangup() {

        mPhone.hangup();
    }
}
