package Seleniumstartup;

import java.io.File;

public class LatestDownload {

    public static class Latestdownloadfile {

        public static void main(String[] args) {
            System.out.println((getLatestFilefromDir("C:\\Users\\Chandra\\Downloads")));
        }

        private static File getLatestFilefromDir(String dirPath) {
            File dir = new File(dirPath);
            File[] files = dir.listFiles();
            if (files == null || files.length == 0) {
                return null;
            }

            File lastModifiedFile = files[0];
            for (int i = 1; i < files.length; i++) {
                if (lastModifiedFile.lastModified() < files[i].lastModified()) {
                    lastModifiedFile = files[i];
                }
            }
            return lastModifiedFile;
        }
    }
}