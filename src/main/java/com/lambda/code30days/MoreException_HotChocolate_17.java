package com.lambda.code30days;

import java.util.concurrent.TimeUnit;

public class MoreException_HotChocolate_17 {

    public static final double tooHot = 185;
    public static final double tooCold = 160;

    public static void drinkHotChocolate(double cocoTemp) throws
            MoreException_TooHotException_17, MoreException_TooColeException_17 {
        if (cocoTemp >= tooHot) {
            throw new MoreException_TooHotException_17();
        } else if (cocoTemp <= tooCold) {
            throw new MoreException_TooColeException_17();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        double currentTemp = 170;
        boolean wrongTemp = true;

        while (wrongTemp){
            try {
                drinkHotChocolate(currentTemp);
                System.out.println("Good");
                wrongTemp=false;
            } catch (MoreException_TooColeException_17 moreException_tooColeException_17) {
//                moreException_tooColeException_17.printStackTrace();
                System.out.println("TooCold");
                currentTemp+=10;
            } catch (MoreException_TooHotException_17 moreException_tooHotException_17) {
//                moreException_tooHotException_17.printStackTrace();
                System.out.println("TooHot");
                currentTemp-=10;
            }
//            finally {
//                System.out.println("Done");
//            }

            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println("Done");



    }

}
