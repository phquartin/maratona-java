package phquartin.maratonajava.javacore.Wnio.test;

import java.nio.file.*;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("dir/file/arquivo.txt");
        Path path2 = Paths.get("dir/file/arquivo.java");
        Path path3 = Paths.get("dir/file/arquivo.bkp");

        matches(path1, "glob:**/*.java");
        matches(path1, "glob:**/*.{java,txt,bkp}");
        matches(path2, "glob:**/*.{java,txt,bkp}");
        matches(path2, "glob:**/*.????");

    }
    private static void matches(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + " matches " + matcher.matches(path));
    }
}
