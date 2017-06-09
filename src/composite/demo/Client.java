package composite.demo;

/**
 * Created by gavin on 2017/6/9.
 */
public class Client {

    public static void main(String[] args) {

        Dir diskC=new Folder("C");

        diskC.addDir(new File("1.txt"));


        Dir dirwin=new Folder("Windows");

        dirwin.addDir(new File("2.exe"));

        diskC.addDir(dirwin);



        diskC.print();
    }
}
