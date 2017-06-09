package composite.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gavin on 2017/6/9.
 * 文件和文件夹的抽象类
 */
public abstract class Dir {
    /*****
     * 用来存储文件夹下所有的元素
     */
    protected List<Dir> dirs = new ArrayList<>();
    /****
     * 当前文件和文件夹的名字
     */
    private String name;

    public Dir(String name) {
        this.name = name;
    }

    /*****
     * 添加一个文件或者文件夹
     */
    public abstract void addDir(Dir dir);

    /*****
     * 移除一个文件或者文件夹
     */
    public abstract void removeDir(Dir dir);

    /*****
     * 清空文件夹所有的元素
     */
    public abstract void clear();

    /*****
     * 输出文件夹目录结构
     */
    public abstract void print();

    /***
     * 获取文件夹下所有的文件或者文件夹
     * @return
     */
    public abstract List<Dir> getFiles();

    public String getName() {

        return name;
    }
}
