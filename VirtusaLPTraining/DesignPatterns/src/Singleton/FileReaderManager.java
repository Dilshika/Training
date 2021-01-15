package Singleton;
//import dataProviders.ConfigFileReader;

import sun.security.provider.ConfigFile;

public class FileReaderManager {
    private static FileReaderManager fileReaderManager;
    private static ConfigFile configFileReader;

    private FileReaderManager(){
        if(fileReaderManager!=null){
            throw new RuntimeException("please use getInstance");
        }
    }
    public static FileReaderManager getInstance(){
        if(fileReaderManager==null) {
            synchronized (FileReaderManager.class) {
                fileReaderManager = new FileReaderManager();
            }
        }
        return fileReaderManager;
    }

    public ConfigFile getConfigFileReader(){
        if(configFileReader==null){
            synchronized (FileReaderManager.class) {
                if(configFileReader==null) {
                    configFileReader = new ConfigFile();
                }
            }
        }
        return configFileReader;
    }
}
