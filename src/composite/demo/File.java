package composite.demo;

import java.util.List;

/**
 * Created by gavin on 2017/6/9.
 */
public class File extends Dir {
    public File(String name) {
        super(name);
    }

    @Override
    public void addDir(Dir dir) {

        throw new UnsupportedOperationException("文件对象不支持该操作");
    }

    @Override
    public void removeDir(Dir dir) {
        throw new UnsupportedOperationException("文件对象不支持该操作");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("文件对象不支持该操作");
    }

    @Override
    public void print() {

        System.out.println(getName());
    }

    @Override
    public List<Dir> getFiles() {
        throw new UnsupportedOperationException("文件对象不支持该操作");
    }
}
