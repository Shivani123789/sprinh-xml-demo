package com.stackroute.awareInterface;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//bean should be able to read  data of data.txt
public class ResouraceLoaderAwareDemo implements ResourceLoaderAware {

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        Resource data = resourceLoader.getResource("data.txt");
//        InputStream in = null;
//        try {
//            in = data.getInputStream();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
//
//        while (true) {
//            String line = null;
//            try {
//                line = reader.readLine();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            if (line == null)
//                break;
//            System.out.println(line);
//        }
//        try {
//            reader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try{
            InputStream is = data.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
