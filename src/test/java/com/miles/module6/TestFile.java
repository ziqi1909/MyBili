package com.miles.module6;

import com.miles.module6.dto.Video;
import org.assertj.core.util.Arrays;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Wzq
 * @version : 1.0
 * @Project : HeiMa-Project1
 * @Package : com.miles.module6
 * @ClassName : TestFile.java
 * @createTime : 2022/8/6 13:38
 * @Email : zqwang21@163.com
 * @Description :
 */
public class TestFile {
    public static void main(String[] args) throws IOException {
        List<String> data = Files.readAllLines(Path.of("data", "p.csv"));
        for (String line : data) {
            //System.out.println(line);
            String[] s = line.split(",");
            String[] tags = s[7].split("_");
            //new Video(s[0],s[3], LocalDateTime.parse(s[6]),s[4],s[5], Arrays.asList(tags),List.of(),s[1],s[2]);
        }

    }

}
