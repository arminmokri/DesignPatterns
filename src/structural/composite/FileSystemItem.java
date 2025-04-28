package structural.composite;

import behavioral.iterator.TvStation;

public interface FileSystemItem extends Comparable<FileSystemItem> {
    void display(String indent);
}
