package Listeners;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Iannotationtransformer implements IAnnotationTransformer {
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
     if(testMethod.getName().equalsIgnoreCase("firstmethod")){
         annotation.setPriority(3);
     }

     if(testMethod.getName().equalsIgnoreCase("secondmethod")){
         annotation.setEnabled(false);
     }
    }
}
